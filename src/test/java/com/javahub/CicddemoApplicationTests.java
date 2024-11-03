package com.javahub;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@WebMvcTest
class CicddemoApplicationTests {

	@Autowired
	MockMvc  mockMvc;
	
	@Test
	public void testGreet() throws Exception
	{
		String name="vikas";
		mockMvc.perform(MockMvcRequestBuilders.get("welcome/{name}",name))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Hello "+name+"successfulyy deployed!!"));
	} 
	
	
	
}
