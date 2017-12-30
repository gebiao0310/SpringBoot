package cn.et.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.et.dao.MuserDao;
import cn.et.dao.MuserRepository;
import cn.et.entity.Muser;

@Service
public class MuserService {
	@Autowired
	MuserRepository mr;
	@Autowired
	MuserDao md;
	//jdbcTemplate查询所有
	public List<Map<String, Object>> selectMuser(){
		List<Map<String, Object>> list=md.selectMuser();
		return list;
	}
	
	public String saveMuser(){
		Muser mu=new Muser();
		mu.setUname("xia");
		mu.setAge(20);
		mu.setSex(0);
		mr.save(mu);
		return null;
	}
	public Iterable<Muser> queryMuser(){
		Iterable<Muser> mu = mr.findAll();
		return mu;
	}
}
