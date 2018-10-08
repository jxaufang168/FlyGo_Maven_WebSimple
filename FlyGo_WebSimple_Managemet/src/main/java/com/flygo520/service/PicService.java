package com.flygo520.service;

import java.util.List;

import com.flygo520.pojo.Pic;

public interface PicService {

	public int insPic(Pic pic);
	
	public List<Pic> selAll();
	
	public int delById(int id);
	
}
