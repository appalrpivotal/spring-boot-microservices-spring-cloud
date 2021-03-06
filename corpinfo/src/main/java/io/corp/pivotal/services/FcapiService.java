package io.corp.pivotal.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FcapiService {

	public Map<String,Object> remoteInfo(String companydomain)  {

		RestTemplate restt = new RestTemplate();
		return restt.getForObject("http://localhost:8080/info/"+companydomain, HashMap.class);

		
		/*HttpClient client = new HttpClient();
		GetMethod method = new GetMethod(
				"http://localhost:8080/info");

		client.executeMethod(method);

		byte[] responsebody = method.getResponseBody();
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(responsebody, Company.class);*/
		
		/*return restTemplate.getForObject("http://fcapi/info",
				Company.class);*/

	}
}
