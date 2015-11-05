package com.icarus.tutorial.apt.test;

import com.icarus.ann.Action;
import com.icarus.ann.Controller;

@Controller
public class TestActionController_01 {
	
	@Action
	public String exit() {
		return null;
	}
	
	@Action
	public void print() {
		
	}
	
	@Action
	public int error() {
		return 0;
	}

}
