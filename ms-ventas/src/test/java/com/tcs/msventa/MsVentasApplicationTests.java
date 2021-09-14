package com.tcs.msventa;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MsVentasApplicationTests {

	@Test
	void contextLoads() {
	   String menssage1 = "Mensaje por defecto de cambio test devops................";
	   Assert.assertNotNull(menssage1);
	}

}
