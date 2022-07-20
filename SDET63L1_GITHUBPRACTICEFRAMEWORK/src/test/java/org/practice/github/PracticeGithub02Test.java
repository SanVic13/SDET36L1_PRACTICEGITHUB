package org.practice.github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeGithub02Test {

	@Test
	public void practiceGithub01() {
		Reporter.log("practiceGithub01", true);
	}
	
	@Test
	public void practiceGithub02() {
		Reporter.log("practiceGithub02", true);
	}
	public void practiceGithub03() {
		System.out.println("hi");
		System.out.println("hello");
	}
}
