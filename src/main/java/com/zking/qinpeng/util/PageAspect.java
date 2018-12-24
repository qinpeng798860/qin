package com.zking.qinpeng.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//仅仅表示spring中的一个组件（Bean），可以作用在任何层次
@Aspect//aop功能
public class PageAspect {

    @Around("execution(* *..*Service.*Pager(..))")
    public Object incoke(ProceedingJoinPoint args) throws Throwable {
        Object[] params = args.getArgs();
        PageBean bean=null;
        for (Object param: params) {
            if(param instanceof PageBean){
                bean=(PageBean)param;
                break;
            }
        }
        if(null!=bean && bean.isPagination()){
            PageHelper.startPage(bean.getPage(), bean.getRows());

        }

        Object result = args.proceed(params);
        if (null!=bean && bean.isPagination()) {
            List list = (List)result;
            PageInfo pageInfo = new PageInfo(list);
            System.out.println("当前页码：" + pageInfo.getPageNum());
            System.out.println("当前行数 "+pageInfo.getPageSize());
            System.out.println("总行数"+pageInfo.getTotal());

        }
        return result;

    }




}
