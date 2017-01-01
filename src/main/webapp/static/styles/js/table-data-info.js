Date.prototype.format = function (format) {
    var o = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S": this.getMilliseconds()
    };
    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
};
// JavaScript Documen
//表格数据
    table=null;
    num = 0
	$(function () {
		  var windowH = $(window).height() - 300
          table = $('#example').DataTable({
               "dom": '<"top"f >rt<"bottom"ilp><"clear">',//dom定位
               "dom": 'tiprl',//自定义显示项
               //"dom":'<"domab"f>',
               "scrollY": windowH,//dt高度
               "lengthMenu": [
                   [10, 20, 50,-1],
                   [10, 20, 50,"All"]
               ],//每页显示条数设置
              bServerSide: true,
              sAjaxSource: 'quoteData.htm',
               "lengthChange": true,//是否允许用户自定义显示数量
               "bPaginate": true, //翻页功能
               "bFilter": false, //列筛序功能
               "searching": true,//本地搜索
               "ordering": false, //排序功能
               "Info": true,//页脚信息
               "autoWidth": true,//自动宽度
               "oLanguage": {//国际语言转化
                   "oAria": {
                       "sSortAscending": " - click/return to sort ascending",
                       "sSortDescending": " - click/return to sort descending"
                   },
                   "sLengthMenu": "显示 _MENU_ 记录",
                   "sZeroRecords": "对不起，查询不到任何相关数据",
                   "sEmptyTable": "未有相关数据",
                   "sLoadingRecords": "正在加载数据-请等待...",
                   "sInfo": "当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录。",
                   "sInfoEmpty": "当前显示0到0条，共0条记录",
                   "sInfoFiltered": "（数据库中共为 _MAX_ 条记录）",
                   "sProcessing": "<img src='../resources/user_share/row_details/select2-spinner.gif'/> 正在加载数据...",
                   "sSearch": "模糊查询：",
                   "sUrl": "",
                   //多语言配置文件，可将oLanguage的设置放在一个txt文件中，例：Javascript/datatable/dtCH.txt
                   "oPaginate": {
                       "sFirst": "首页",
                       "sPrevious": " 上一页 ",
                       "sNext": " 下一页 ",
                       "sLast": " 尾页 "
                   }
               },
              columns: [
                  { data:null,"targets": 0, 'searchable': false,'orderable': false},
                  { data: null, "targets": 1 },
                  { data: "code" },
                  { data:"enterpriseInfoDo.name"},
                  { data:"submitDt"},
                  { data:"reviewDt"},
                  { data:"reviewResult"},
                  { data:"stat",},
                  {data:null,'searchable': false,'orderable': false}
              ],
              columnDefs:[
                  {
                      targets: [1], // 目标列位置，下标从0开始
                      data:null,
                      'searchable': false,
                      'orderable': false,
                      render: function(data, type, full) { // 返回自定义内容
                          return " <td><input type='checkbox' name='checkList' ></td>";
                      }
                  },{
                      targets:[2],
                      data:"code",
                      render: function (data,type,full) {
                          return "<a href='#' onclick='getQuitemId("+full.id+",0)'  data-toggle='modal' data-target='#Addform'>"+data+"</a>";
                      }
                  },{
                      targets:[3],
                      data:"enterpriseInfoDo.name",
                      render:function (data,type,full) {
                          return "<a href='#' onclick='detailEnterPrise("+full.enterpriseInfoDo.id+")' data-toggle='modal' data-target='#enterPrise'>"+data+"</a>";
                      }
                  },{
                      targets: [4], // 目标列位置，下标从0开始
                      data:"submitDt",
                      render:function (data,type,full) {
                          if(null!=data&&data!=''){
                              return new Date(data).format("yyyy-MM-dd hh:mm:ss")
                          }else{
                              return '';
                          }
                      }
                  },{
                      targets: [5], // 目标列位置，下标从0开始
                      data:"reviewDt",
                      render:function (data,type,full) {
                          if(null!=data&&data!=''){
                              return new Date(data).format("yyyy-MM-dd hh:mm:ss")
                          }else{
                              return '';
                          }
                      }
                  },{
                      targets:[7],
                      data:"stat",
                      render:function (data,type,full) {
                          if(data ==0){
                              return "作废";
                          }else if(data ==1){
                              return "待审核 ";
                          }else if(data==2){
                              return "已审核";
                          }else if(data==3){
                              return "新建";
                          }else{
                              return ""
                          }
                      }
                  },{
                      targets:[8],
                      render:function (data,type,full) {
                          if(full.stat!=3){//已审核新建不能再次审核
                              return "<a class='btn btn-primary ' href='javascript:;' onclick='getQuitemId("+full.id+",1)' data-toggle='modal' data-target='#Addform'>" +
                                  "<span class=''></span> 审核 </a>"
                          }else {
                              return "";
                          }
                      }
                  }
              ],
 
               "order": [
                   [0, null]
               ],//第一列排序图标改为默认
              fnDrawCallback: function () {//列筛选
                   var api = this.api();
                  var startIndex= api.context[0]._iDisplayStart;//获取到本页开始的条数
                  api.column(0).nodes().each(function(cell, i) {
                      cell.innerHTML = startIndex + i + 1;
                  });
                   api.columns().indexes().flatten().each(function (i) {
                       if (i != 0 && i != 1&& i != 8 &&i!=2) {//删除第一列与第二列与第三列的筛选框
                           var column = api.column(i);
                           var $span = null;
                           if(num==0){
                               $span = $('<span class="addselect">(<b>全部</b>)▾</span>').appendTo($(column.header()));
                           }else{
                               $span =  $($(column.header()).find(".addselect"));
                               $span.find("select").remove();
                           }
                           var b = $span.find("b").html();
                           var select = $('<select ><option value="">全部</option></select>')
                                   .appendTo($span)
                                   .on('change', function (evt) {
                                       evt.stopPropagation();
                                       var val = $.fn.dataTable.util.escapeRegex(
                                               $(this).val()
                                       );
                                       column
                                               .search(val ? '^' + val + '$' : '', true, false)
                                               .draw();
                                       if(val&&val == ''){
                                           $(this).parents('.addselect').find('b').text('全部')
                                       }else{
                                           var text = $(this).find("option:selected").text();
                                           $(this).parents('.addselect').find('b').text(text)
                                       }
                                   });
                           column.data().unique().sort().each(function (d, j) {
                               function delHtmlTag(str,index) {
                                   if(str==null||str==""){
                                       return null;
                                   }
                                   if(index ==4||index==5){
                                       return new Date(str).format("yyyy-MM-dd hh:mm:ss");
                                   }else if(index==7){
                                       if(str ==0){
                                           return "作废";
                                       }else if(str ==1){
                                           return "待审核 ";
                                       }else if(str==2){
                                           return "已审核";
                                       }else if(str==3){
                                           return "新建";
                                       }else{
                                           return null;
                                       }
                                   }else{
                                       str = str.replace(/<[^>]+>/g, "");//去掉html标签
                                       return str;
                                   }
                               }
 
                               var dv= delHtmlTag(d,i);
                               if(dv!=null){
                                   if(dv==b){
                                       select.append('<option value="' + d + '" selected>' + dv + '</option>') ;
                                   }else{
                                       select.append('<option value="' + d + '">' + dv + '</option>');
                                   }
                               }
                           });
                       }
                   });
                  num++;
				}
 
           });
 		   
          /* //添加索引列
           table.on('draw.dt',
                   function () {
                       table.column(0, {
                           search: 'applied',
                           order: 'applied'
                       }).nodes().each(function (cell, i) {
                           cell.innerHTML = i + 1;
                       });
                   }).draw();*/
 
           //自定义搜索
           $('#mSearch').on('click', function () {
               var tsval = $(".dsearch").val()
               table.search(tsval, false, false).draw();
           });
		   

			
           //checkbox全选
           $("#checkAll").on("click", function () {
               if ($(this).prop("checked") === true) {
                   $("input[name='checkList']").prop("checked", $(this).prop("checked"));
                   $('#example tbody tr').addClass('selected');
               } else {
                   $("input[name='checkList']").prop("checked", false);
                   $('#example tbody tr').removeClass('selected');
               }
           });
 
           //显示隐藏列
           $('.toggle-vis').on('change', function (e) {
               e.preventDefault();
               console.log($(this).attr('data-column'));
               var column = table.column($(this).attr('data-column'));
               column.visible(!column.visible());
           });
 
           //删除选中行
           $('#example tbody').on('click', 'tr input[name="checkList"]', function () {
               var $tr = $(this).parents('tr');
               $tr.toggleClass('selected');
               var $tmp = $('[name=checkList]:checkbox');
               $('#checkAll').prop('checked', $tmp.length == $tmp.filter(':checked').length);
 
           });
 



         
           //获取表格宽度赋值给右侧弹出层
           wt = $('.wt100').width();
           $('.showslider').css('right', -wt);
 
           //关闭右侧弹出层
           $('.closediv').click(function () {
               $(this).parent('.showslider').animate({
                   right: -wt,opacity:0
               }, 200)
               $('.clickdom').attr('isclick', true);
			   $('.viewFramework-product-body').removeClass('blur')
           });


 
       })
 
       //右侧弹出详情层
        var flag=false;
        function clickDom(obj){
        var  $par=$(obj).parents('body').find('.showslider')
        var  isattr=$(obj).attr('isclick');
        if(isattr=="true"){
        if(flag){
        $par.animate({
        right:-wt,opacity:0
        },200)
        flag=!flag
        }
        else{
        $par.animate({
        right:0,opacity:1
        },400)
        flag=!flag
 
        }
        }
        $('.clickdom').attr('isclick',false);
        $(obj).attr('isclick',true);
 		setTimeout(function (){
		   $('.viewFramework-product-body').addClass('blur')
	    }, 700);
		
 
        }
        
       function clickDom(obj) {
           var $par = $(obj).parents('body').find('.showslider')
           var isattr = $(obj).attr('isclick');
           if (isattr == "false") {
 
           } else {
               $par.animate({
                   right: -wt,opacity:0
               }, 200)
               $par.animate({
                   right: 0,opacity:1
               }, 400)
               $('.clickdom').attr('isclick', true)
               $(obj).attr('isclick', false);
			   setTimeout(function (){
   				   $('.viewFramework-product-body').addClass('blur')
   			   }, 700);
           }
 
       }


	   
	   