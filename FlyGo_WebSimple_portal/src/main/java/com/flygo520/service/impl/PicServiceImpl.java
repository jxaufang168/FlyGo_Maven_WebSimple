package com.flygo520.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.flygo520.mapper.PicMapper;
import com.flygo520.pojo.Pic;
import com.flygo520.service.PicService;

@Service
public class PicServiceImpl implements PicService {

	@Value("${management.pic.url.host}")
	private String picUrlHost;
	
	@Resource
	private PicMapper picMapper;

	@Override
	public List<Pic> selAll() {
		List<Pic> picList = picMapper.selAll();
		for (Pic pic : picList) {
			pic.setPath(picUrlHost + pic.getPath());
		}
		return picMapper.selAll();
	}

}
