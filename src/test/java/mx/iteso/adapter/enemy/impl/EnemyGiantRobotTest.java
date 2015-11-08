package mx.iteso.adapter.enemy.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import junit.framework.Assert;
import mx.iteso.adapter.enemy.EnemyRobot;

import org.junit.Before;
import org.junit.Test;

public class EnemyGiantRobotTest {
	
	EnemyRobot robot;
	String output;
	
	@Before
	public void setup() {
		robot= new EnemyGiantRobot();
		output= new String();
		
		System.setOut(new PrintStream(new OutputStream() {
			public void write(int b) throws IOException {
				output+= (char)b;
				this.flush();
			}
		}));
	}
	
	@Test
	public void smashWithHands() {
		robot.smashWithHands();
		Assert.assertTrue(output.toLowerCase().contains("hands"));
	}

	@Test
    public void walkForward() {
		robot.walkForward();
		Assert.assertTrue(output.toLowerCase().contains("forward"));
    }

	@Test
    public void reactToHuman() {
		String driverName = "test driver";
		robot.reactToHuman(driverName);
		Assert.assertTrue(output.contains(driverName));
    }
	
	@Test
    public void reactToNullHuman() {
		String driverName = null;
		robot.reactToHuman(driverName);
		Assert.assertTrue(output.contains("null"));
    }
	
}
