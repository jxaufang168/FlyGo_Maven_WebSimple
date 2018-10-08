package com.flygo520.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.flygo520.pojo.Pic;

public interface PicMapper {

	@Select("select * from pic ")
	public List<Pic> selAll();
}
