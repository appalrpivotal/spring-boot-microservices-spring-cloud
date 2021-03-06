package io.corp.pivotal.controllers;

import io.corp.pivotal.CorpinfoApplication;
import io.corp.pivotal.domain.Company;
import io.corp.pivotal.domain.News;
import io.corp.pivotal.domain.Record;
import io.corp.pivotal.services.FcapiService;
import io.corp.pivotal.services.NewsService;
import io.corp.pivotal.services.StoreService;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UiController {

	@Autowired
	FcapiService fcapiService;
	@Autowired
	NewsService newsService;
	@Autowired
	StoreService storeService;

	private static final Logger log = LoggerFactory
			.getLogger(CorpinfoApplication.class);

	@RequestMapping(value = "/compinfo", method = RequestMethod.POST)
	public String compInfo(@ModelAttribute Record record, Model model) {
		model.addAttribute("companyDomain", record.getCompanyDomain());
		String companyDomain =  record.getCompanyDomain();
		log.info(companyDomain);
		Map<String, Object> response = fcapiService.remoteInfo(companyDomain);
		model.addAttribute("compinfo", response);
		
		News newsResponse = newsService.remoteNews(companyDomain);
		model.addAttribute("news", newsResponse);
		return "compinfo";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getList(Model model) {
		List<Company> response = storeService.remoteList();
		model.addAttribute("record", new Record());
		model.addAttribute("companyList", response);
		return "index";
	}

}
