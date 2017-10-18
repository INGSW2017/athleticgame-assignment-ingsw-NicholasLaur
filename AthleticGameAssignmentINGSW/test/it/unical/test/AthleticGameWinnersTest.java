package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	static AthleticGame game;

	@BeforeClass
	public static void init() {
		game = new AthleticGame("Ciclismo");
	}

	@After
	public void after() {
		game.reset();
	}

	@Before
	public void before() {
		game.start();
	}

	@Test
	public void test1GetWinner() {
		game.addArrival("Kikke", Instant.now());
		game.addArrival("Nicholas", Instant.now().plusMillis(1000));
		Assert.assertEquals("Kikke", game.getWinner());
	}

	@Test(timeout = 1000)
	public void test2GetWinner() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		game.addArrival("Kikke", Instant.now());
		game.addArrival("Nicholas", Instant.now().plusMillis(1000));
		Assert.assertEquals("Kikke", game.getWinner());
	}
}
