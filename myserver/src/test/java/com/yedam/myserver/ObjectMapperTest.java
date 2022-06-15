package com.yedam.myserver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yedam.myserver.todo.vo.TodoVO;

public class ObjectMapperTest {
	
	@Test 
	public void test2() throws MalformedURLException, IOException {
		ObjectMapper om = new ObjectMapper();
		String url = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20220614";
		//Json형식으로 반환
		JsonNode result = om.readTree(new URL(url));
		//{} = get(""), [] = get(n) 
		  String nm = result.get("boxOfficeResult")
							.get("dailyBoxOfficeList")
							.get(0)
							.get("movieNm")
							.asText();
		System.out.println(nm);
	}

//	@Test
	public void test1() throws JsonProcessingException {
		TodoVO vo = new TodoVO();
		vo.setContents("test");
		vo.setNo("1");
		
		//vo객체를 string객체로 변환
		ObjectMapper om = new ObjectMapper();
		String result = om.writeValueAsString(vo); 		 //@ResponseBody : 자바객체 -> json string으로 변환하여 전달
		System.out.println(result);
		
		//string 객체를 vo객체로 변환
		TodoVO vo2 = om.readValue(result, TodoVO.class); //@RequestBody : json string -> 자바객체로 변환하여 전달
		System.out.println(vo2.getContents());
	}
}