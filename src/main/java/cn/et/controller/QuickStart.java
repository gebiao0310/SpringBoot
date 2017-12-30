package cn.et.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.entity.Muser;
import cn.et.service.MuserService;

@RestController
public class QuickStart {
	@Autowired
	MuserService ms;
	
	//jdbc查询所有
	@RequestMapping(value="selectMuser")
	public List<Map<String, Object>> selectMuser(){
		List<Map<String, Object>> list=ms.selectMuser();
		return list;
	}
	//Habernate查询
	@RequestMapping(value="saveMuser")
	public String saveMuser(){
		ms.saveMuser();
		return "添加成功";
	}
	@RequestMapping(value="queryMuser")
	public Iterable<Muser> queryMuser(){
		Iterable<Muser> mu = ms.queryMuser();
		return mu;
	}
}
