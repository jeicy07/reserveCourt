/**
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.order.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.Calendar;

/**
 *
 * @author ian
 */
@Singleton
@Startup
public class ConfigBean {

    @EJB
    private RequestBean request;

    @PostConstruct
    public void createData() {
        request.createCourt(1111, 1, 1, 1);
        request.createCourt(2222, 1, 1, 2);
        request.createCourt(3333, 1, 2, 1);
        request.createCourt(4444, 1, 2, 2);
        request.createCourt(5555, 1, 3, 1);
        request.createCourt(6666, 2, 2, 1);
        request.createCourt(7777, 2, 2, 2);
        request.createCourt(8888, 2, 2, 3);
        request.createCourt(9999, 2, 4, 1);
        request.createCourt(1010, 2, 4, 2);
        request.createCourt(1212, 3, 3, 1);
        request.createCourt(1313, 3, 3, 2);
        request.createCourt(1414, 3, 3, 3);
        
        request.createUser("renminbibi", "ren", "12345678", "18800000000");
        request.createUser("meiyuan","mei","1111111111","18712345678");
        request.createUser("zhenpiaoliang","zhen","zpl666666","13333333333");
        request.createUser("jiatianwang","jia","jtw23333","17105555555");
        request.createUser("bairap","baibai","iamcool","00054749110");
        
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2018,10,10);
        request.createReserve(1111,calendar,10,"renminbi");
        calendar.set(2018,10,10);
        request.createReserve(8888,calendar,10,"bairap");
        calendar.set(2018,10,20);
        request.createReserve(5555,calendar,10,"zhenpiaoliang");
        calendar.set(2018,10,10);
        request.createReserve(1414,calendar,10,"renminbi");
        calendar.set(2018,10,15);
        request.createReserve(3333,calendar,8,"jiatianwang");
        calendar.set(2018,10,17);
        request.createReserve(4444,calendar,12,"renminbi");calendar.set(2018,11,10);
        request.createReserve(1010,calendar,14,"meiyuan");
        calendar.set(2018,10,14);
        request.createReserve(1212,calendar,9,"jiatianwang");
        calendar.set(2018,11,10);
        request.createReserve(1313,calendar,11,"renminbi");
        calendar.set(2018,11,20);
        request.createReserve(1111,calendar,9,"meiyuan");
        calendar.set(2018,11,19);
        request.createReserve(8888,calendar,20,"bairap");
        
        
        
           
 
    }
    
    @PreDestroy
    public void deleteData() {
        
    
    }
}
