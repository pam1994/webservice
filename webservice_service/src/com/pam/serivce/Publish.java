package com.pam.serivce;

import javax.xml.ws.Endpoint;

public class Publish {
	public static void main(String[] args) {
		//声明服务访问地址
		String address ="http://192.168.8.23:9527/weather";
		//初始化服务类，指打了WebService标签的类
		Object implementor = new MyService();
		Endpoint.publish(address, implementor);
		System.err.println("服务发布成功 ...");
	}
}