<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="edit-Type" edit="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="BootstrapVue/jquery.min.js"></script>
    <script src="BootstrapVue/bootstrap.min.js"></script>
    <!-- Add this to <head> -->
    <link type="text/css" rel="stylesheet" href="BootstrapVue/bootstrap-vue.css">
    <link type="text/css" rel="stylesheet" href="BootstrapVue/bootstrap.min.css">
    <!-- Add this after vue.js -->
    <script src="BootstrapVue/vue.min.js"></script>

    <%--&lt;%&ndash;添加到vue.js之后&nd  ash;%&gt;--%>
    <script src="BootstrapVue/polyfill.min.js"></script>
    <script src="BootstrapVue/bootstrap-vue.js"></script>

    <link type="text/css" rel="stylesheet" href="css/index.css"><%--首页的样式--%>



    <title>航班管理后台</title>

</head>
<script type="text/javascript">
    window.onload = function() {
        var vm = new Vue({
            el: '#bodyapp',
            data: {
                msg: 'Hello World!',
            },
            methods: {
                get: function () {
                    //发送get请求
                    this.$http.get('/try/ajax/ajax_info.txt').then(function (res) {
                        document.write(res.body);
                    }, function () {
                        console.log('请求失败处理');
                    });
                }
            }
        });

    }


</script>

<body>
   <b-navbar toggleable="md" type="dark" variant="info" id="bodyapp">

        <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

        <b-navbar-brand href="#">NavBar</b-navbar-brand>

        <b-collapse is-nav id="nav_collapse">

            <b-navbar-nav>
                <b-nav-item href="#">Link</b-nav-item>
                <b-nav-item href="#" disabled>Disabled</b-nav-item>
            </b-navbar-nav>

            <!-- Right aligned nav items -->
            <b-navbar-nav class="ml-auto">

                <b-nav-form>
                    <b-form-input size="sm" class="mr-sm-2" type="text" placeholder="Search"/>
                    <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
                </b-nav-form>

                <b-nav-item-dropdown text="Lang" right>
                </b-nav-item-dropdown>

                <b-nav-item-dropdown right>
                    <!-- Using button-content slot -->
                    <template slot="button-content">
                        <em>User</em>
                    </template>
                </b-nav-item-dropdown>
            </b-navbar-nav>

        </b-collapse>
    </b-navbar>

   <div class="container-fluid">
       <div class="row">
           <div class="col-md-2" style="margin-left: -20px">
               <div id="accordion">
                   <div class="card" >
                       <div>
                           <a class="card-link list-group-item menu" data-toggle="collapse" href="#collapseOne">
                               选项一
                           </a>
                       </div>
                       <div id="collapseOne" class="collapse show" data-parent="#accordion">
                           <a href="#" class="list-group-item menuPadding" >#1 内容：梦想！！！</a>
                           <a href="#" class="list-group-item menuPadding">#1 更是梦想！！！</a>
                       </div>

                   </div>

               </div>


           </div>
       </div>
   </div>
</body>
</html>
