package com.klef.jfsd.exam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommentsImpl implements CommentsSerivce {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<Object> viewallComments() {
		
		Object[] comments = restTemplate.getForObject("https://jsonplaceholder.typicode.com/comments", Object[].class);
		return Arrays.asList(comments);
	}

}