package com.tcs.msventa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MsVentasApplicationTests {

	@Test
	void contextLoads() {
	   String menssage = "Mensaje por defecto de cambio devops";
	   String menssage2 = "Mensaje por defecto de cambio devops................";
	   
		assertNotNull(menssage);
	}

}
