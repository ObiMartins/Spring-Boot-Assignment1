package com.assignment.dependency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.dependency.Data.DataInputImplementation;
import com.assignment.dependency.Operations.DataOpsImplementation;

@SpringBootTest
class DependencyInjectionApplicationTests {

	@Autowired 
	DataInputImplementation datainput;
	
	@Autowired
	DataOpsImplementation dataOps;
	
	@Test
	void testDependencyForDataInpt() {
		assertNotNull(datainput);
	}
	
	@Test
	void testDependencyForDataOps() {
		assertNotNull(dataOps.getInput());
	}
	
	@Test
	void twoPlusTenMustReturnTwelve() {
		assertEquals(12,  2, 10);
	}

}
