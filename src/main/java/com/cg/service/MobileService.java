package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dao.MobileInterface;
import com.cg.entity.Mobile;

@Service
public class MobileService implements MobileInterface{
	
	List<Mobile> mobileList=new ArrayList<>();

	@Override
	public String addLaptop(Mobile mobile) {
		mobileList.add(mobile);
		return "Mobile added successfully";
	}

	@Override
	public List<Mobile> getallMobiles() {
		
		return mobileList;
	}
	


}
