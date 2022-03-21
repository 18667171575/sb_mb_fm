<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>开始使用 layui</title>
    <link rel="stylesheet" href="./layui-v2.6.8/css/layui.css">
    <link rel="stylesheet" href="./css/home-page.css">
</head>
<body>


<div class="layui-container" style="width: 100%">
    <div class="layui-row">
        <div class="layui-col-md2">
            <div class="layui-panel">
                <i class="layui-icon layui-icon-face-smile" style="font-size: 30px; color: #1E9FFF;"></i>
            </div>
        </div>
        <div class="layui-col-md10">
            <div class="layui-panel">
                <ul class="layui-nav main-nav">
                    <li class="layui-nav-item">
                        <a href="">控制台<span class="layui-badge">9</span></a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="">个人中心<span class="layui-badge-dot"></span></a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="">我</a>
                        <dl class="layui-nav-child">
                            <dd><a href="javascript:;">修改信息</a></dd>
                            <dd><a href="javascript:;">安全管理</a></dd>
                            <dd><a href="javascript:;">退了</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="layui-row">
        <div class="layui-col-md2">
            <div class="layui-panel">
                <ul class="layui-menu" id="docDemoMenu1">
                    <li lay-options="{id: 100}">
                        <div class="layui-menu-body-title">menu item 1</div>
                    </li>
                    <li lay-options="{id: 101}">
                        <div class="layui-menu-body-title">
                            <a href="#">menu item 2 <span class="layui-badge-dot"></span></a>
                        </div>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li class="layui-menu-item-group layui-menu-item-down" lay-options="{type: 'group'}">
                        <div class="layui-menu-body-title">
                            menu item 3 group <i class="layui-icon layui-icon-up"></i>
                        </div>
                        <ul>
                            <li lay-options="{id: 1031}">menu item 3-1</li>
                            <li lay-options="{id: 1032}">
                                <div class="layui-menu-body-title">menu item 3-2</div>
                            </li>
                        </ul>
                    </li>
                    <li class="layui-menu-item-divider"></li>
                    <li lay-options="{id: 104}">
                        <div class="layui-menu-body-title">menu item 4</div>
                    </li>
                    <li class="layui-menu-item-parent" lay-options="{type: 'parent'}">
                        <div class="layui-menu-body-title">
                            menu item 5
                            <i class="layui-icon layui-icon-right"></i>
                        </div>
                        <div class="layui-panel layui-menu-body-panel">
                            <ul>
                                <li lay-options="{id: 1051}">
                                    <div class="layui-menu-body-title">menu item 5-1</div>
                                </li>
                                <li lay-options="{id: 1051}">
                                    <div class="layui-menu-body-title">menu item 5-2</div>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li lay-options="{id: 106}">
                        <div class="layui-menu-body-title">menu item 6</div>
                    </li>
                </ul>
            </div>
        </div>
        <div class="layui-col-md10">
            <div class="layui-panel">
                <table id="demo" lay-filter="test"></table>
            </div>
        </div>
    </div>

</div>

<!-- 你的 HTML 代码 -->

<script src="./layui-v2.6.8/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: './user/list' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'name', title: '姓名', width:80}
                ,{field: 'age', title: '年龄', width:80, sort: true}
            ]]
        });

    });
</script>
</body>
</html>