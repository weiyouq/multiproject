package org.user.consumer.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.user.consumer.BaseTest;
	
public class InvorkServiceTest extends BaseTest{

	@Autowired
    private InvorkService invorkService;
	
	@Test
	public void test() {
		invorkService.sayHello("张三");
	}

}
