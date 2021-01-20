package com.example.muumi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.muumi.web.MuumiController;

@RunWith(SpringRunner.class)
@SpringBootTest
class MuumiApplicationTests {
@Autowired 
MuumiController mcontroller;
	//Testing that the context is creating the MuumiController
	@Test
	void contextLoads() throws Exception {
		
	}

}
