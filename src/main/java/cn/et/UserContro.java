package cn.et;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserContro {
	@Autowired
	QueryMuserAll qma;
	@ResponseBody
	@RequestMapping(value="/queryMuserAll")
	public List<Map<String, Object>> queryMuserAll(){
		List<Map<String, Object>> list=qma.queryMuserAll();
		return list;
	}
}
