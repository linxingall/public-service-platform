<div class="topNav">
    <div class="center row">
        <div class="col-xs-12 text-right topNav-right ">
            <div class="iteam">
                <a href="#" class="iteam"><span class="iconfont">&#xe609;</span>客服热线：<strong class="red">4006-501-615</strong></a>
                <input type="hidden" id="baseUrl" value="${base}">
            </div>
            <#--<div class="iteam navsecond">-->
                <#--<a href="#"><span class="iconfont">&#xe728;</span>帮助中心<i class="iconfont">&#xe629;</i></a>-->
                <#--<div class="iteam_second">-->
                    <#--<span><a href="#" target="_blank">招商流程</a></span>-->
                    <#--<span><a href="#" target="_blank">购买流程</a></span>-->
                    <#--<span><a href="#" target="_blank">在线帮助</a></span>-->
                <#--</div>-->
            <#--</div>-->
            <#if Session.USER_AGENT_IN_REQUEST ? exists>
            <div class="iteam navsecond">
                <a href="#" class=" "><span class="iconfont">&#xe688;</span>
                个人中心<i class="iconfont">&#xe629;</i>
                </a>
                <div class="iteam_second">
                    <span><a href="${base}/user/userDetail.htm" target="_blank">个人资料</a></span>
                    <span><a href="${base}/user/loginPwd.htm" target="_blank">修改密码</a></span>
                    <span><a href="${base}/logout.htm" target="_blank">安全退出</a></span>
                    <#--<span><a href="#" target="_blank">我的收藏</a></span>-->
                    <#--<span><a href="#" target="_blank">我的评价</a></span>-->
                </div>
            </div>
            <#else>
            <div class="iteam navsecond">
                <a href="http://www.gdn360.com/epp-cda/index.htm" target="_blank">大数据分析</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="http://www.gdn360.com/cas/login?service=http%3A%2F%2Fwww.gdn360.com%2Fepp-web%2Fwork%2FuserSrv%2FmyService.htm" target="_blank">服务商登录</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${base}/u/login.htm" target="_blank">电商登录</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${base}/u/register.htm">注册</a>
            </div>
            </#if>
        </div>
    </div>
</div>
<div class="head">
    <div class="center row">
        <a href="${base}/index.htm" class=" logo"><img src="${base}/static/styles/images/logo.png" /></a>
        <div class="col-xs-12 text-right">
            <div class="top-mune">
                <div class="iteam">跨境物流产品
                    <div class="list">
                        <a href="${base}/b2c.htm">跨境直发</a>
                        <a href="${base}/b2s2c.htm">海外仓</a>
                    </div>
                </div>
                <div class="iteam">
                跨境园区服务
                    <div class="list">
                        <a href="${base}/kjzf.htm">跨境小包集货</a>
                        <a href="${base}/hwjh.htm">海外仓集货</a>
                        <a href="${base}/ggck.htm">公共仓集货</a>
                    </div>
                </div>
                <div class="iteam"><a href="${base}/finance.htm">外贸金融服务</a></div>
                <div class="iteam"><a href="${base}/distribution.htm" >跨境商品分销</a></div>
                <div class="iteam"><a href="${base}/news.htm?newsType=1&&category=1" >新闻动态</a></div>
                <div class="iteam"><a href="${base}/about.htm">关于我们</a></div>
            </div>
        </div>
    </div>
</div>