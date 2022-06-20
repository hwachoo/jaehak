package com.yedam.myserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.myserver.todo.service.TodoService;
import com.yedam.myserver.todo.vo.TodoVO;

@RunWith(SpringJUnit4ClassRunner.class)
//spring 환경설정 파일 load
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/*-context.xml")

public class AopTest {
	
	@Autowired
	TodoService todoService;
	
	@Test
	public void test() {
		TodoVO vo = new TodoVO();
		vo.setContents("확인");
		todoService.persist(vo);
		System.out.println("=============" + vo.getNo());
//		todoService.findAll();
	}
}
