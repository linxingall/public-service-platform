<#macro pager page>
<#if page??>
    <#if (page.records >0) >
		<#assign next= page.pageNo + 1/>
		<#assign pre= page.pageNo - 1/>
   		 <div class="pageBox">
             <ul class="pagination">
				 <#-- 当前页小于4且总数小于6 显示12345-->
				 <#if (page.pageNo <=4) >
                	 <#if (page.pageNo == 1)>
                         <li class="disabled"><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">上一页</span></a></li>
					 <#else>
                          <li ><a href="#" aria-label="Previous"><span aria-hidden="true">上一页</span></a></li>
                	 </#if>
                	 <#list 1..page.total as n>
							<#if n==6>
								<#break>
							</#if>
                         	<#if (page.pageNo == n)>
                                <li class="active"><a href="javascript:void(0)">${n}<span class="sr-only">(current)</span></a></li>
                         	<#else>
                                <li><a href="javascript:void(0)">${n}</a></li>
                        	 </#if>
                	 </#list>
				 <#-- 当前页小于4且总数大于6 -->
					<#if (page.total>6) >
                   		 <li><a href="javascript:void(0)" aria-label="Next"><span aria-hidden="true">下一页</span></a></li>
					<#else >
						<#if page.pageNo == page.total>
                            <li class="disabled"><a href="javascript:void(0)" aria-label="Next" ><span aria-hidden="true">下一页</span></a></li>
						<#else >
                            <li><a href="javascript:void(0)" aria-label="Next" ><span aria-hidden="true">下一页</span></a></li>
						</#if>
					</#if>
				 <#-- 当前页大于4-->
				 <#else>
					 <#if (page.pageNo == 1)>
                         <li class="disabled"><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">上一页</span></a></li>
					 <#else>
                         <li ><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">上一页</span></a></li>
					 </#if>
					 <#assign start= page.pageNo - 1/>
                     <#if (page.pageNo+1) < page.total>
						 <#assign end= page.pageNo + 1/>
					 <#else>
						 <#assign end= page.total />
                     </#if>
				     <#list start..end as n>
					 		<#if page.pageNo==n>
                                <li class="active"><a href="javascript:void(0)">${n}<span class="sr-only">(current)</span></a></li>
							<#else>
                                <li><a href="javascript:void(0)">${n}</a></li>
					 		</#if>
                     </#list>
				 		<#if end<page.total>
                            <li><a href="#" aria-label="Next" ><span aria-hidden="true">下一页</span></a></li>
						<#else >
						    <#if page.pageNo == page.total>
                                <li class="disabled" ><a href="javascript:void(0)" aria-label="Next" class="disabled"><span aria-hidden="true">下一页</span></a></li>
							<#else >
                                <li><a href="javascript:void(0)" aria-label="Next" ><span aria-hidden="true">下一页</span></a></li>
							</#if>
						</#if>
				 </#if>
				 <li><span aria-hidden="true">共${page.total}页&nbsp&nbsp&nbsp共${page.records}条记录</span></li>
			</ul>
		 </div>
	</#if>
<input id='pageNo' name='pageNo' type='hidden' value='1' />
</#if>
<script>
    $(function() {

			$(".pagination li:not(.disabled):not(.active) a").click(function (){
				var i = $(this).html()+'';
                var pageNo = 0;
                var currPage = ${page.pageNo};
                var totalPages = ${page.total};
				if(i=='<span aria-hidden="true">上一页</span>'){
                    pageNo = currPage -1;
                    if(pageNo <= 0)
                    {
                        return;
                    }
				}else if(i=='<span aria-hidden="true">下一页</span>'){
                    pageNo = currPage +1;
				}else{
                    pageNo=i;
				}
                $("#pageNo").val(pageNo);
                $("#searchForm").submit();
                $("#btn_search").click();
			});
	});
</script>
</#macro>


