package com.toy.project.temp.test;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TempDAO {
	public void test(String tempdata) throws DataAccessException;
	

}
