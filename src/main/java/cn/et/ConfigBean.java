package cn.et;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.support.http.StatViewServlet;
@Configuration
public class ConfigBean {
	//生成bean实例
	//阿里云监控
	@Bean
	public ServletRegistrationBean druidStatView(){
		ServletRegistrationBean srb=new ServletRegistrationBean();
		srb.setName("DruidStatView");
		StatViewServlet svs=new StatViewServlet();
		srb.setServlet(svs);
		String url="/druid/*";
		List<String> urls=new ArrayList<String>();
		urls.add(url);
		srb.setUrlMappings(urls);
		LinkedHashMap<String, String> linkedHasjMap=new LinkedHashMap<String, String>();
		linkedHasjMap.put("loginUsername", "admin");
		linkedHasjMap.put("loginPassword","admin");
		srb.setInitParameters(linkedHasjMap);
		return srb;
	}
}
