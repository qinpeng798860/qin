<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <%@include file="head.jsp" %>
    <%@include file="/common/head.jsp" %>
    <%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
    <meta charset="utf-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="edit-Type" edit="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css">


    <title>航班管理后台</title>
</head>
<script type="text/javascript">
    $(function(){
        $("#t1").bootstrapTable({
            url:'menu/queryMenu',
            dataType:'json',
            /*queryParams: oTableInit.queryParams,//传递参数（*）*/
            method: 'post', //请求方式（*）
            toolbar: '#toolbar', //工具按钮用哪个容器
            striped: true, //是否显示行间隔色
       /*     cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）*/
            pagination: true, //是否显示分页（*）
            switchable:true,
            sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
            strictSearch: true,
            clickToSelect   : true, //是否启用点击选中行
            height: 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            /*uniqueId: "ID", //每一行的唯一标识，一般为主键列*/
            pageNumber:1, //初始化加载第一页，默认第一页
            pageSize: 10, //每页的记录行数（*）
            pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
            smartDisplay:false,
            columns:[
                    {
                        checkbox:true,
                        align:'center',
                        width:'100px',

                    },
                    {
                        title:"编号",
                        field:"fid",
                        align:'center',
                    }, {
                    title:"父编号",
                    field:"fpid",
                    align:'center',
                }, {
                    title:"模块名",
                    field:"fname",
                    align:'center',
                }

                ]
        });
    })


</script>

<body>



        <div class="container-fluid">
        <div class="row">
        <div class="col-md-2" style="margin-left: -20px">
            <div id="accordion">
                <div class="card">
                    <div>
                        <a class="card-link list-group-item menu" data-toggle="collapse" href="#collapseOne">
                            选项一
                        </a>
                    </div>
                    <div id="collapseOne" class="collapse show" data-parent="#accordion">
                        <a href="#" class="list-group-item menuPadding">#1 内容：梦想！！！</a>
                        <a href="#" class="list-group-item menuPadding">#1 更是梦想！！！</a>
                    </div>

                </div>

            </div>
        </div>

                    <div class="col-md-10">
                        <table id="t1">


                        </table>
                        <div id="toolbar">
                            <button type="button" class="btn btn-default">按钮 1</button>
                            <button type="button" class="btn btn-default">按钮 2</button>
                            <button type="button" class="btn btn-default">按钮 3</button>
                         </div>
                    </div>
                </div>
            </div>

    </body>
    </html>
