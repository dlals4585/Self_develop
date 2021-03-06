package com.self_develop.myproject.mainpage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import com.self_develop.myproject.mainpage.dao.HomeDAO;
import com.self_develop.myproject.mainpage.service.HomeService;
import com.self_develop.myproject.mainpage.vo.HomeVO;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private HomeDAO homedao;
	
	@Override
	public List<HomeVO> selectAddress() {
		// TODO Auto-generated method stub
		return homedao.selectAddress();
	}
}
