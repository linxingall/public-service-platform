/**
 * Created by wuji on 2016/8/26.
 */
$(function(){
    $('#test').diyUpload({
        success:function( data ) {
            console.info( data );
        },
        error:function( err ) {
            console.info( err );
        }
    });
    //添加标签
    $('.KeyWord-add .KeyWord-btn').click(function(){
        var mykey =$('.KeyWord-input').val();
        if(mykey !== ''){
            $('.KeyWord-box').append("<span class='iteam'>"+mykey+"<i class='glyphicon glyphicon-remove'></i></span>")
        }
    })
    $(document).on('click', '.KeyWord-box i', function() {
        $(this).parent('.iteam').remove();
    });
    //添加sku属性
    $('.attribute-alert .add').click(function () {
        var mykey2 =$(this).parents('.attribute-alert').find('.attribute-input').val();
        if(mykey2 !== ''){
            $('.attribute-list').append("<span class='iteam'><span class='abs'>"+mykey2+"</span><i class='glyphicon glyphicon-remove'></i></span>");
        }
    });
    $(document).on('click', '.attribute-alert i', function() {
        $(this).parent('.iteam').remove();
    });
    $('.attribute-upload').click(function () {
       var attribute = [];
      $(".attribute-list .iteam").each(function () {
          attribute.push( $(this).find('.abs').text());
      });
      var tableThHtml = '';
      var tableTdHtml = '';
      tableThHtml += '<th>sku</th><th>重量</th>';
      tableTdHtml += '<td><input/></td><td><input/></td>';
      $.each(attribute,function(index){
          tableThHtml += "<th>"+this+"</th>";
          tableTdHtml += "<td><input/></td>";
      });
      $('.sku-table thead').find('tr').html(tableThHtml);
      $('.sku-table tbody').find('tr').html(tableTdHtml);
    });
    //添加SKU
    $('.sku-add-sku').click(function () {
        var tableTbodyHtml = '';
        tableTbodyHtml += '<tr>';
        var ms = $('.sku-table th').length;
        for (var i = 0; i < ms; i++) {
            tableTbodyHtml += "<td><input/></td>"
        }
        tableTbodyHtml += '</tr>';
        $('.sku-table tbody').append(tableTbodyHtml)
    })

});