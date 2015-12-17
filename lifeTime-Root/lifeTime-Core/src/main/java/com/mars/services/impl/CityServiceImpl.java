package com.mars.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mars.dao.CityDao;
import com.mars.models.CityModel;
import com.mars.services.CityServiceI;

@Service("cityService")
public class CityServiceImpl implements CityServiceI {

	private CityDao cityDao;

	@Autowired
	public void BannerMapper(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	
	public CityModel getCity() {
		System.out.println("selectCity Model");
		return this.cityDao.selectCity();
	}

}
