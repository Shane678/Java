package com.flc.controller.weixinuserinfo;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class WeiXinUtils {
	/**
	 * 用户获取access_token,众号调用各接口时都需使用access_token
	 * @param url
	 * @return
	 */
	  public static JSONObject doGetStr(String url){
	        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
	        HttpGet httpGet = new HttpGet(url);
	        JSONObject jsonObject = null;
	        try{
	            HttpResponse response = defaultHttpClient.execute(httpGet);
	            HttpEntity entity = response.getEntity();
	            if(entity != null){
	                String result = EntityUtils.toString(entity, "UTF-8");
	                jsonObject = JSONObject.fromObject(result);
	            }
	        } catch (ClientProtocolException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return jsonObject;
	  }
	  
}
