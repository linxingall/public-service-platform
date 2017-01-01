<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<#macro head>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>${title}</title>
<#include "common.ftl" >
    <#nested />
</head>
</#macro>
<#macro body>
    <body>
    <!-- top -->

    <#include "top.ftl" >

    
    <div class="mainGray ">
    <div class="row center">
    <#include "left.ftl" >
         <#nested />
     </div>
      <div class="center">
          <div class="heigtBOX30"></div>
     </div>
    </div>
    <#--footer-->
    <#include "foot.ftl" >

    <div class="right-bar">
      <a href="http://wpa.qq.com/msgrd?v=3&uin=157269566&site=qq&menu=yes" class="iteam">
         <span class="iconfont">&#xe60d;</span>
         <span class="name">客服中心</span>
      </a>
    </div>

    </body>
</#macro>
</html>
