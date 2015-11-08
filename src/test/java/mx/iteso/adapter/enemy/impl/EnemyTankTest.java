package mx.iteso.adapter.enemy.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import junit.framework.Assert;
import mx.iteso.adapter.enemy.EnemyAttacker;

import org.junit.Before;
import org.junit.Test;

public class EnemyTankTest {
	
	EnemyAttacker attacker;
	String output;
	
	@Before
	public void setup() {
		attacker= new EnemyTank();
		output= new String();
		
		System.setOut(new PrintStream(new OutputStream() {
			public void write(int b) throws IOException {
				output+= (char)b;
				this.flush();
			}
		}));
	}
	
	@Test
	public void fireWeapon() {
		attacker.fireWeapon();
		Assert.assertTrue(output.toLowerCase().contains("fires weapon"));
	}

	@Test
    public void driveForward() {
		attacker.driveForward();
		Assert.assertTrue(output.toLowerCase().contains("forward"));
    }

	@Test
    public void assignDriver() {
		String driverName = "test driver";
		attacker.assignDriver(driverName);
		Assert.assertTrue(output.contains(driverName));
    }
	
	@Test
    public void assignNullDriver() {
		String driverName = null;
		attacker.assignDriver(driverName);
		Assert.assertTrue(output.contains("null"));
    }
}
