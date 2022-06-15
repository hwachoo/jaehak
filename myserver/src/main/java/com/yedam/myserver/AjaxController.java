package com.yedam.myserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.myserver.emp.vo.Employee;

@RestController
public class AjaxController {
	
	@GetMapping("req")
	public String regGet() {
		return "get";
	}

	@PostMapping("req")
	@ResponseBody //자바 객체를 json string 값으로 parsing
	//requestbody = json string으로 넘어온 값을 parsing하여 vo객체 변화
	public String regPost(@RequestBody Employee vo) throws InterruptedException {
		//Thread.sleep(3000); 출력지연
		System.out.println(vo.getFirst_name());
		return "post";
	}
}
