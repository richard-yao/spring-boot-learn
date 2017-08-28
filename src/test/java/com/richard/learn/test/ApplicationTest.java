package com.richard.learn.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.richard.learn.controller.SampleController;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2017年8月28日 下午3:32:14
*/
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTest {

	private MockMvc mvc;
	
	@Before
	public void initTest() {
		mvc = MockMvcBuilders.standaloneSetup(new SampleController()).build();
	}
	
	@Test
	public void testIndex() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.APPLICATION_JSON))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Hello world"));
	}
}
