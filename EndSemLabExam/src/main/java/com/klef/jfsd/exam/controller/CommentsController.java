package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.CommentsSerivce;

@RestController
public class CommentsController {
	
	@Autowired
	private CommentsSerivce commentsSerivce;
	
	@GetMapping("/")
	public String home()
	{
		return "<h1>2200031921 - YARRAMSETTI SIVA SANKARA VARA PRASAD</h1>" ;
	}
	
	@GetMapping("/viewallcomments")
	public List<Object> viewallComments() {
		return commentsSerivce.viewallComments();
	}
}
