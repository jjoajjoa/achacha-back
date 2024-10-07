package com.achacha.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.achacha.vo.GpsDataVO;

@Component
public class GpsDataDAO {
	
	@Autowired
	SqlSession session;
	
	//단말기에서 받아온 GPS 데이터 테이블에 집어넣기
	public void insertGpsData(GpsDataVO vo) {
		session.insert("insertGpsData", vo);
	}
	
}
