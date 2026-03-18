package com.spjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spjpa.entity.*;

@SpringBootApplication
public class SpringbootjpaApplication {

    

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootjpaApplication.class, args);
	    DBoperations dbops=context.getBean(DBoperations.class);
	    //UserDataService s1=context.getBean(UserDataService.class);
	    //dbops.addusers();
//	    dbops.getusersbyid(1001);
//	    dbops.alldata();
	   // dbops.findByCityname("mumbai");
	    //dbops.findByCitnamesAndGender("Hyd", "Female");
//	    UserDataService usds=context.getBean(UserDataService.class);
//	    usds.deleteByAge(28);
	   // s1.deleteByAge(25);
	    //s1.findById(1001);
	    //service1.loadDataByCitnamesAndGender();
	    dbops.getloadgetcitynamesAndgender();
	    UserDataService service1 = context.getBean(UserDataService.class);
	    //service1.deleteByAge(23);
	    
	    service1.loadDataBynameStartswith("P");
	}

}
