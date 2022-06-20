package com.yedam.myserver.users.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.myserver.users.mapper.UserMapper;
import com.yedam.myserver.users.vo.UserVO;
//{"*"} = 모든 도메인 허용
@CrossOrigin(origins = {"*"}, maxAge = 3600)
@RestController
public class UserController {

	@Autowired UserMapper mapper;
	//url은 같지만 method로 구분
	//단건 전체 구분 - 변수로 id값 부여
	//목록
	@GetMapping("/users")
	public List<UserVO> userSelect() {
		return mapper.find();
	}
	//한건
	@GetMapping("/users/{id}")
	public UserVO userSelectList(@PathVariable String id, UserVO vo) {
		//parameter 추출하여 vo에 담아줘야함
		vo.setId(id);
		return mapper.findById(vo);
	}
	//등록(query string)
	@PostMapping("/users")
	public UserVO userInsert(UserVO vo) {
		 mapper.persist(vo);
		 return vo;
	}
	//수정 - put = json string으로만 가능
	@PutMapping("/users")
	public UserVO userUpdate(@RequestBody UserVO vo) {
		 mapper.merge(vo);
		 return vo;
	}	
	//삭제
	@DeleteMapping("/users/{id}")
	public UserVO userDelete(@PathVariable String id, UserVO vo) {
		 vo.setId(id);
		 mapper.remove(vo);
		 return vo;
	}		
}
