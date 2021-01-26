package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wkk
 * @create 2020/08/25
 * @desc
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/test1")
	public String test1() {
		List<String> list = new ArrayList();
		return "hhhhh + 版本5";
	}

	public static String aa() {
		System.out.println("111111111");

		return "123";
	}
}
