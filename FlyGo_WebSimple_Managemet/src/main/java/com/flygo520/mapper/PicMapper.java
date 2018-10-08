package com.flygo520.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.flygo520.pojo.Pic;

public interface PicMapper {

	public int insPic(Pic pic);
	
	@Select("select * from pic ")
	public List<Pic> selAll();
	
	@Delete("delete from pic where id = #{0}")
	public int delById(int id);
	
}
