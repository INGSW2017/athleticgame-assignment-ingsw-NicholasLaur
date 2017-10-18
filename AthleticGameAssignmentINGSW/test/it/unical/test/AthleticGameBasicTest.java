package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	static AthleticGame game;
	@BeforeClass
	public static void init(){
		game = new AthleticGame("Ciclismo");
	}
	@Test
	public void testAddArrival(){
		game.addArrival("Ciccio", Instant.now());
		//game.addArrival("Cicci", Instant.now());
		Assert.assertEquals(1, game.getArrivals().size());
	}
	@Test(expected =IllegalArgumentException.class)
	public void testGetPartecipant(){
		game.getParecipiantTime("Kikke");
	}
	
	
	
}
