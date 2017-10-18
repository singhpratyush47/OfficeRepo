package com.controller;

import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;


public class JsonUtil {
	ObjectMapper mapper;

	public String convertToJson(ArrayList<Persons> al) {
		mapper = new ObjectMapper();
		String json="";
		try {
			 json=mapper.writeValueAsString(al);
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
}
