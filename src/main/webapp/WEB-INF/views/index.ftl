<html>
<head>
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type">
    <title>测试</title>
    <link rel="stylesheet" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/bootstrap-datetimepicker.min.css">
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <script src="static/js/bootstrap-datetimepicker.min.js"></script>
    <script>
//        $("#downloadbtn").on("click",function () {
//            console.info("12222222");
//            window.location.href="downOrdes?startDate="+$('#startDate').val()+"&endDate="+$('#endDate').val();
//        });
        function downOrders(){
            window.open("downOrdes.htm?startDate="+$('#startDate').val()+"&endDate="+$('#endDate').val());
        }
    </script>
</head>
<body>
<div>您好 ${user},</div>
<div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="开始时间" id="startDate" name="startDate"/>
    </div>
<div class="form-group">
        <input type="text" class="form-control input-lg" placeholder="结束时间"id="endDate" name="endDate"/>
    </div>
        <button class="btn btn-primary btn-lg btn-block" id="downloadbtn" onclick="downOrders()">下载订单</button>
</body>
</html>
