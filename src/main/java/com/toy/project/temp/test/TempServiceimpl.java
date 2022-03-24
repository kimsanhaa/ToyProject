package com.toy.project.temp.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempServiceimpl implements TempService {
	
	@Autowired 
	private TempDAO tempDAO;
	
	public TempServiceimpl() {
		
	}
	
	
	@Override
	public void test(String tempdata) throws Exception {
		tempDAO.test(tempdata);
		
	}

}
