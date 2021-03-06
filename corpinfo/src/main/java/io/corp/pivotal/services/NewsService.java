package io.corp.pivotal.services;

import io.corp.pivotal.domain.News;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

	public News remoteNews(String companyDomain)  {

		RestTemplate restt = new RestTemplate();
		return restt.getForObject("http://localhost:8086/news/"+companyDomain, News.class);
	}
}

