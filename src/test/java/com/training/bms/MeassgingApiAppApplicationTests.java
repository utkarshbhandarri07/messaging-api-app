package com.training.bms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MeassgingApiAppApplicationTests {

	@Test
	void contextLoads() {
		
		assertEquals(190,200);
	}

}
