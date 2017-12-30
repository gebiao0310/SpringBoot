package cn.et.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class MuserDao {
	@Autowired
	JdbcTemplate jdbc;
	public List<Map<String, Object>> selectMuser(){
		String sql="select * from Muser";
		List<Map<String, Object>> list=jdbc.queryForList(sql);
		return list;
	}
}
