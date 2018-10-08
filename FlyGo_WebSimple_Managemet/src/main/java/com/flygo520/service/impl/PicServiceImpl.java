package com.flygo520.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.flygo520.mapper.PicMapper;
import com.flygo520.pojo.Pic;
import com.flygo520.service.PicService;

@Service
public class PicServiceImpl implements PicService {

	@Resource
	private PicMapper picMapper;
	
	@Override
	public int insPic(Pic pic) {
		return picMapper.insPic(pic);
	}

	@Override
	public List<Pic> selAll() {
		return picMapper.selAll();
	}

	@Override
	public int delById(int id) {
		return picMapper.delById(id);
	}

}
