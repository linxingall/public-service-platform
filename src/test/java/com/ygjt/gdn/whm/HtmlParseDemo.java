package com.ygjt.gdn.whm;

import com.ygjt.gdn.psp.entity.Order;
import com.ygjt.gdn.psp.entity.OrderGoods;
import org.apache.commons.collections.CollectionUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by linx on 2016-12-13.
 */
public class HtmlParseDemo {
    public static void main(String[] args) {
        try {
            Map<String, String> cookies=login("weijia","67865131");
            Map<String,String> map =new HashMap<String, String>();
            map.put("agent_number","0");
            map.put("endtime","2016-12-13 16:00:00");
            map.put("sort","1");
            map.put("starttime","2016-12-10 16:00:00");
            map.put("type","1");
            Document doc = Jsoup.connect("http://seller.pifa.yunmayi.com/trade/pickingOrders")
                    .data(map)
                    .cookies(cookies)
                    .timeout(3000)           // 设置连接超时时间
                    .post();
            List<Order> orders = convertDoc2Order(doc);
            System.out.println(orders.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Order> convertDoc2Order(Document doc) throws IOException {
        List<Order> orders = new ArrayList<Order>();
        Element singerListDiv = doc.getElementsByAttributeValue("class", "module").first();
        Elements orderCodes = singerListDiv.getElementsByTag("p");
        Elements tables = singerListDiv.getElementsByTag("table");
        if(CollectionUtils.isNotEmpty(orderCodes)){
            for (int i = 0;i<orderCodes.size();i++) {
                Element orderCode =orderCodes.get(i);
                Element table =tables.get(i);
                Order order = new Order();
                order.setMerchantName(orderCode.child(0).text());
                order.setOrderCode(orderCode.textNodes().get(1).text().replace(":",""));
                List<OrderGoods> goods = convertTable2OrderGoods(table);
                order.setGoods(goods);
                orders.add(order);
            }
        }

        return  orders;
    }
    public static List<OrderGoods> convertTable2OrderGoods(Element table) throws IOException{
        List<OrderGoods> goods = new ArrayList<OrderGoods>();
        Elements trs = table.getElementsByTag("tr");
        if(CollectionUtils.isNotEmpty(trs)){
            for (int i = 1;i<trs.size()-1;i++) {
                Element tr =trs.get(i);
                OrderGoods orderGoods = new OrderGoods();
                orderGoods.setBarcode(tr.child(7).text());
                orderGoods.setGoodsName(tr.child(1).text());
                orderGoods.setNum(tr.child(5).text());
                orderGoods.setSpec(tr.child(2).text());
                orderGoods.setTotalSum(tr.child(6).text());
                orderGoods.setUnit(tr.child(3).text());
                orderGoods.setUnitPrice(tr.child(4).text());
                goods.add(orderGoods);
            }
        }
        return  goods;
    }
    public static  Map<String, String> login(String userName,String pwd)throws Exception{

        //第一次请求
        Connection con=Jsoup.connect("http://passport.pifa.yunmayi.com/login");//获取连接
        con.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");//配置模拟浏览器
        Connection.Response rs= con.execute();//获取响应
        Document d1=Jsoup.parse(rs.body());//转换为Dom树
        List<Element> et= d1.getElementsByTag("input");//获取form表单，可以通过查看页面源码代码得知

        //获取，cooking和表单属性，下面map存放post时的数据
        Map<String, String> datas=new HashMap<String, String>();
        for(Element e:et){
            if(e.attr("name").equals("username")){
                e.attr("value", userName);//设置用户名
            }

            if(e.attr("name").equals("password")){
                e.attr("value",pwd); //设置用户密码
            }

            if(e.attr("name").length()>0){//排除空值表单属性
                datas.put(e.attr("name"), e.attr("value"));
            }
        }


        /**
         * 第二次请求，post表单数据，以及cookie信息
         *
         * **/
        Connection con2=Jsoup.connect("http://passport.pifa.yunmayi.com/login");
        con2.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
        //设置cookie和post上面的map数据
        Connection.Response login=con2.ignoreContentType(true).method(Connection.Method.POST)
                .data(datas).cookies(rs.cookies()).execute();
        //打印，登陆成功后的信息
        System.out.println(login.body());

        //登陆成功后的cookie信息，可以保存到本地，以后登陆时，只需一次登陆即可
        Map<String, String> map=login.cookies();
        for(String s:map.keySet()){
            System.out.println(s+"      "+map.get(s));
        }
        //返回cookies
        return rs.cookies();

    }

}
