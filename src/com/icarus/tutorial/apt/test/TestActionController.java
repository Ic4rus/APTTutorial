package com.icarus.tutorial.apt.test;

import com.icarus.ann.Action;
import com.icarus.ann.Controller;

@Controller
public class TestActionController {

	@Action
	public String login() {
		return null;
	}
	
}
