package org.Project.car.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 실행시 DAO가 빈으로 만들어 진다.
@Repository
public class HumanDao {
	@Autowired
	private SqlSessionTemplate session;
	private String ns = "org.Lirodek.Human.HumanMapper.";

	public List<HumanDto> selectAll(){
		List<HumanDto> humanList = session.selectList(ns+"selectAll");
		return humanList;

	}

	public HumanDto selectOneTest(int no){
		HumanDto human = session.selectOne(ns+"selectHuman", no);
		return human;

	}

	public void insert(HumanDto dto){
		session.selectOne(ns+"insertHuman", dto);
	}

	public void delete(int no){
		session.selectOne(ns+"deleteHuman", no);
	}

	public void update(HumanDto dto){
		session.selectOne(ns+"updateHuman", dto);
	}
}
