package cn.et;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface QueryMuserAll {
	@Select("select * from muser")
	public List<Map<String, Object>> queryMuserAll();
}
