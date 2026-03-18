package com.spjpa.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDataService {
	int count=0;
@Autowired
UserdetailsRepository userdetailsrepository;


//get data based on city and gender

public void loadDataByCitnamesAndGender() {
	List<User_info>userdetailscityandgender=userdetailsrepository.findByCitnamesAndGender("Hyd", "Female");
	userdetailscityandgender.forEach(System.out::println);
}
public void deleteByAge(int age) {
	userdetailsrepository.deleteByAge(age);
	//System.out.println(count);
}

public void loadDataBynameStartswith(String letter) {
	List<User_info>namesofusers=userdetailsrepository.findByNameStarts(letter);
	namesofusers.forEach(System.out::println);
}
}
