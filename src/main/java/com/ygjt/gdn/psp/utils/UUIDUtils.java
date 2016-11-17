package com.ygjt.gdn.psp.utils;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UUIDUtils
{
	private static final String DATE_FORMAT = "yyyyMMddHHmmss";
	
	private static Logger logger = LoggerFactory.getLogger(UUIDUtils.class);
	/**
	 * 
	 * @Title: getSerialNumber
	 * @Description: TODO(生成唯一流水号规则为 coCode（7 位）+YYYYMMDDHHMMSS(14 位)+5 位流水号)
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public static String getPkid()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(DateUtils.format(DATE_FORMAT));
		int millis = DateTime.now().getMillisOfSecond();
		if(millis<10){
			sb.append("00").append(DateTime.now().getMillisOfSecond());
		}else if(millis<100 && millis>9){
			sb.append("0").append(DateTime.now().getMillisOfSecond());
		}else{
			sb.append(DateTime.now().getMillisOfSecond());
		}
		int hashCode = UUID.randomUUID().toString().hashCode();
		if (hashCode < 0)
		{
			hashCode = -hashCode;
		}
		String str = String.format("%05d", hashCode);
		sb.append(str.substring(0,5));
		return sb.toString();
	}
	public static String getCharAndNumr(int length)
	{
		String val = "";

		Random random = new Random();
		for(int i = 0; i < length; i++)
		{
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字

			if("char".equalsIgnoreCase(charOrNum)) // 字符串
			{
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; //取得大写字母还是小写字母
				val += (char) (choice + random.nextInt(26));
			}
			else if("num".equalsIgnoreCase(charOrNum)) // 数字
			{
				val += String.valueOf(random.nextInt(10));
			}
		}

		return val;
	}
	public static void main(String[] arg)
	{
		ExecutorService executor = Executors.newFixedThreadPool(100);
		try {
			for (int i = 0; i < 1000; i++) {
				executor.execute(new Runnable() {
					@Override
					public void run() {
						System.out.println(getCharAndNumr(10));
					}
				});
			}		
		} catch (Exception e) {
			logger.error("定时发送通知异常：" + e);
		}finally{
			executor.shutdown();
			while(!executor.isTerminated()){
				
			}
		}
	}
}
