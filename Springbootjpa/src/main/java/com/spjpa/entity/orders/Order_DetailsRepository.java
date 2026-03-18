package com.spjpa.entity.orders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface Order_DetailsRepository extends JpaRepository<Ordersinfo ,Integer>{
List<Ordersinfo> findByCityname(String cities);
//List<Ordersinfo>findByCity
}
