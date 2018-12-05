package com.offcn.util;

import com.offcn.bean.Mobile;
import org.springframework.web.client.RestTemplate;

public class ClientShow {

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String url = "http://localhost:8080/checkMobile/service/m1/mobile";
        Mobile mobile = template.getForObject(url+"/get/1365920", Mobile.class);
        System.out.println(mobile);
    }
}
