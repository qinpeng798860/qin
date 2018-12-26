package com.zking.qinpeng.test;

import com.zking.qinpeng.model.New;
import com.zking.qinpeng.service.INewService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MenuServiceImplTest extends  ServiceTestCase {
    @Autowired
    private INewService iNewService;

  public void setUp(){
      super.setUp();
  }
    @Test
    public void queryMenu() {
        List<New> news = iNewService.queryNew(1);
        for (New aNew : news) {
            System.out.println(aNew);

        }
    }
}