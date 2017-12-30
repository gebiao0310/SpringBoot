package cn.et.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbController {
	@Autowired
	DataSource data;
	@RequestMapping("/sysSource")
	public String sysSource(){
		return data.toString();
	}
}
