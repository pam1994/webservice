package com.pam.serivce;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService //标记为WS服务类
@SOAPBinding(style=Style.RPC) //声明访问规范
public class MyService {
	//把数据放在本地，使用Map安装
	private Map<String, String> weather = new HashMap<String,String>();
	//初始化两条数据
	public MyService(){
		weather.put("cd", "6~12");
		weather.put("gz", "17~22");
	}
	
	@WebMethod //标记为需要暴露的WS服务方法
	public String getWeather(String city){
		if(city!=null){
			String we = weather.get(city);
			if(we!=null){
				return we ; 
			}
			return "unknown!";
		}
		return "error!";
	}
}