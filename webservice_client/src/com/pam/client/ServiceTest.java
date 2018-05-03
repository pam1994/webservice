package com.pam.client;

import org.junit.Test;

public class ServiceTest {

	MyService service = new MyServiceService().getMyServicePort();
	@Test
	public void testService() throws Exception {
		String string = service.getWeather("cd");
		System.out.println(string);
	}
}
