package com.offcn.util;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientShow02 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        MobileService service = context.getBean(MobileService.class);
        Mobile mobile = service.getMobile("1597800");
        System.out.println(mobile);
    }
}
