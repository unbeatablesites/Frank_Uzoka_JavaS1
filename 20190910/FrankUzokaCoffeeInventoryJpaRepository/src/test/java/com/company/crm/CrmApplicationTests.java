package com.company.crm;

import com.company.crm.dao.CoffeeRepository;
import com.company.crm.dao.Roasters;
import com.company.crm.dto.Coffee;
import com.company.crm.dto.Roaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmApplicationTests {

	@Autowired
	CoffeeRepository coffeeRepo;

	@Autowired
	Roasters roasterRepo;

	@Test
	public void contextLoads() {
	}



	@Test
	public void findByFirstName(){

		Coffee coffee = new Coffee();
		coffee.setFirstName("Joe");

		coffeeRepo.save(coffee);

		List<Coffee> coffeeList = coffeeRepo.findByFirstName("Joe" );
		assertEquals(1, coffeeList.size() );

	}


	@Test
	public void testAddCustomer(){

		coffeeRepo.deleteAll();
		Coffee coffee = new Coffee();
		coffee.setFirstName("Joe");
		Set<Roaster> roasters = new HashSet<Roaster>();
		coffee.setRoasters(roasters);
		coffeeRepo.save(coffee);

		System.out.println("Here========>"+ coffee.toString());

		List<Coffee> coffeeList = coffeeRepo.findAll();
		System.out.println("Here========>"+ coffeeList.get(0).toString());
//		assertEquals(1, coffeeList.size() );
//		assertTrue(coffeeList.get(0).equals(coffee));
	}

	@Test
	public void testDeleteCustomer(){

		coffeeRepo.deleteAll();
		Coffee coffee = new Coffee();
		coffee.setFirstName("Joe");
		Set<Roaster> roasters = new HashSet<Roaster>();
		coffee.setRoasters(roasters);
		coffeeRepo.save(coffee);

		coffeeRepo.delete(coffee);

		List<Coffee> coffeeList = coffeeRepo.findAll();
		assertEquals(0, coffeeList.size() );
//		assertTrue(coffeeList.get(0).equals(coffee));
	}



	@Test
	public void testUpdateCustomer(){

		coffeeRepo.deleteAll();
		Coffee coffee = new Coffee();
		coffee.setFirstName("Joe");

//		Set<Roaster> notes = new HashSet<Roaster>();
//		coffee.setRoasters(notes);
		coffeeRepo.save(coffee);

		coffee.setFirstName("wJoe");

//		Set<Roaster> notes = new HashSet<Roaster>();
//		coffee.setRoasters(notes);
		coffeeRepo.save(coffee);

		//coffeeRepo.save(coffee);

		List<Coffee> coffeeList = coffeeRepo.findAll();
		assertEquals(1, coffeeList.size() );
	}



}
