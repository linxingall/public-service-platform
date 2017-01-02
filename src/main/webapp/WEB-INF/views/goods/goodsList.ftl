<#include "../common/layout.ftl">
<#assign menu="goodsList" >
<#assign title="商品查询">
<@head>

    <script>
        function list(orderStatus) {
            window.location ='${base}/goods/list.htm';
        }
    </script>
</@head>
<@body>
<div class="col-xs-10 userMain">
    <div class=" borderBox ">
        <div class="user-title">商品</div>
        <form  id="searchForm"  method="post" action="list.htm">
        <div class="u-oder-search">
            <button type="submit" class="btn btn-default">查询</button>
        </div>

        <div class="heigtBOX30"></div>
        <table class="table table-striped">
            <tr>
                <th>商品名称</th>
                <th>商品编号</th>
                <th>商品排序</th>
                <th>创建时间</th>
            </tr>
               <#list page.result as goods>
            <tr>

                <td>${goods.name!''}</td>
                <td>${goods.code!''}</td>
                <td>${goods.goodsSort!''}</td>
                <td>${goods.createdDt!''}</td>
            </tr>
               </#list>
        </table>
            <@p.pager page/>
        </form>
    </div>
</div>
</div>
<div class="center">
    <div class="heigtBOX30"></div>
</div>
</div>

</@body>

