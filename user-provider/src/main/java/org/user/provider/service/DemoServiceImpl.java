package org.user.provider.service;

import org.user.restapi.service.DemoService;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		System.out.println("服务端调用 -------------------------------------------------------------------------");
		return "Hello " + name;
	}

}
