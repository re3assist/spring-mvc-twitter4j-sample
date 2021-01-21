package com.ksd.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Controller
public class TweetController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "tweet";
	}

	@RequestMapping(value = "/tweet", method = RequestMethod.POST)
	public String tweet(@RequestParam("message") String message) throws TwitterException {
        TwitterFactory.getSingleton().updateStatus(message);
		return "tweet-compleat";
	}
}
