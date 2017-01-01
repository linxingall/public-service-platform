// JavaScript Document
$(function(){
	//左侧菜单显示隐藏
	$('#sidebar').click(function(){
		if($('.viewFramework-body').hasClass('viewFramework-sidebar-full')){
			$('.viewFramework-body').removeClass('viewFramework-sidebar-full').addClass('viewFramework-sidebar-mini')
		}else{
			$('.viewFramework-body').removeClass('viewFramework-sidebar-mini').addClass('viewFramework-sidebar-full')
		}		
	})	
	//左侧菜单2级菜单
	$('.sidebar-nav-title').click(function(){
		if($(this).find('span').hasClass('glyphicon-triangle-bottom')){
			$(this).find('span').removeClass('glyphicon-triangle-bottom').addClass('glyphicon-triangle-right');
			$(this).next('.sidebar-trans').hide();
			$(this).css('background','none');
			$(this).css('border','1px solid #414d5c')
		}else{
			$(this).find('span').removeClass('glyphicon-triangle-right').addClass('glyphicon-triangle-bottom');
			$(this).next('.sidebar-trans').show();
			$(this).css('background','#000');
			$(this).css('border','0px solid #414d5c')
		}
	})
	
	//主题产品菜单显示隐藏
	$('.viewFramework-product-navbar-collapse').hover(function(){
		$(this).find('.product-navbar-collapse-bg').addClass('on')
	},function(){
		$(this).find('.product-navbar-collapse-bg').removeClass('on')
	})
	$('.viewFramework-product-navbar-collapse').click(function(){
		if($(this).find('.glyphicon').hasClass('glyphicon-chevron-left')){
			$('.viewFramework-product').removeClass('viewFramework-product-col-1');
			$(this).find('.glyphicon').removeClass('glyphicon-chevron-left').addClass('glyphicon-chevron-right')	
		}else{
			$('.viewFramework-product').addClass('viewFramework-product-col-1')	;
			$(this).find('.glyphicon').removeClass('glyphicon-chevron-right').addClass('glyphicon-chevron-left')		
		}
	})
	//添加快捷菜单
	$('.sidebar-addNav-list').find('.list').append(" <b></b>");
	$('#sidebar-item-list .list').click(function(){	
		var myId = $(this).attr('id');
		$(this).addClass('ng-hide');
		$('.sidebar-item-list-picked').find('#'+myId).addClass('ng-hide');
	})
	$('.sidebar-item-list-picked .list').click(function(){
		var myId = $(this).attr('id');
		$(this).removeClass('ng-hide');
		$('#sidebar-item-list').find('#'+myId).removeClass('ng-hide');
		
	})
	
	$('.showcol').hover(function(){
		$('[data-toggle="tooltip"]').tooltip()
	})
	
	//时间插件调用
    $('.form_datetime').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });
	$('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	$('.form_time').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 1,
		minView: 0,
		maxView: 1,
		forceParse: 0
    });
	
	//清除输入框内容
	$('.control-box').on("click",'.clearText',function(){
		$(this).parents('.control-box').find('.form-control').val('')	;
		$(this).remove(); 	
	})
	
	$('.form-control').blur(function(){
           if($(this).val() == ""){
				$(this).parents('.control-box').find('.clearText').remove();   
		    }else{
				$(this).parents('.control-box').append('<span class="glyphicon glyphicon-remove clearText"></span>'); 	
			}
    });
	
	//模糊输入
	 $("#arrcity").suggest(citys,{hot_list:commoncitys,dataContainer:'#arrcity_3word',onSelect:function(){$("#city2").click();}, attachObject:'#suggest'});
    //激活所有提示框
	$("[data-toggle='tooltip']").tooltip(); 
	
	//入库操作点击变换颜色
	$('.s-g-list').click(function(){
		$(this).addClass('s-g-active').siblings('.s-g-list').removeClass('s-g-active')	
	});	
	//打包管理
	$('.Scan-in').click(function(){
		$(this).addClass('Scan-in-hover')	
		$('.Scan-goods').fadeIn();
	})
	//出库操作
	$('.company').click(function(){
		$(this).next('.cards').toggle();
	})	
	$('.cargo-list .list').click(function(){
		if($(this).find('input').attr("checked")){
			$(this).removeClass('active');
			$(this).find('input').attr("checked",false);
		}else{
			$(this).addClass('active');
			$(this).find('input').attr("checked",true);
		}	
	})
	//随机加背景
	$('.modal-body').addClass('bg-style-'+Math.floor(Math.random()*6) );
	setTimeout( function(){$('.dataTables_scrollBody').addClass('bg-style-'+Math.floor(Math.random()*6) );},500) ;
})