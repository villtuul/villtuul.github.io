package com.villtuul.weddingsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class AppController {
	
	@RequestMapping(value = { "/", "/{x:[\\w\\-]+}",
			"/{x:^(?!api$).*$}/**/{y:[\\w\\-]+}",
			"/{x:^(?!perform_login$).*$}/**/{y:[\\w\\-]+}" })
	public String loadUI() {
		log.info("loading UIssdd");
		return "forward:/index.html";
	}

}
