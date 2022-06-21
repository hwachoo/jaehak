package com.yedam.myserver;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTest {

	@Test
	public void test() {
		//BCryptPasswordEncoder(스트레스강도) - 해커의 신속한 해킹 방지하기 위해(1(빠름)~32(느림))
		//PASSWORD 암호화로 인해 == 비교 불가, matches 사용하여 비교해야함
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
		String result = encoder.encode("1111");
		System.out.println(result);
		assertTrue(encoder.matches("1234", result));
	}
}
