package com.btc.springboot.microservice.repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.btc.springboot.microservice.model.Coupon;

@Repository
public class CouponRepo {
	
	private Map<String, Coupon> couponData;
	
	@PostConstruct
	public void init() {
		Coupon c1, c2;
		c1=new Coupon("c1001",10,LocalDate.of(2021, 06, 21),80000,5000);
		c2=new Coupon("c1002",15,LocalDate.of(2021, 06, 20),60000,3000);
		couponData=new HashMap<>();
		couponData.put(c1.getCouponCode(), c1);
		couponData.put(c2.getCouponCode(), c2);
		
		
	}
	
	public Coupon getCoupon(String couponCode) {
		return couponData.get(couponCode);
	}

}