package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;
import mx.iteso.adapter.enemy.EnemyRobot;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class EnemyRobotAdapterTest {
	EnemyRobot robot;
	EnemyAttacker attacker;
	
	@Before
	public void setup() {
		robot= Mockito.mock(EnemyRobot.class);
		attacker= new EnemyRobotAdapter(robot);
		
		/*System.setOut(new PrintStream(new OutputStream() {
			public void write(int b) throws IOException {
				output+= (char)b;
				this.flush();
			}
		}));*/
	}
	
	@Test
	public void fireWeapon() {
		attacker.fireWeapon();
	}

	@Test
    public void driveForward() {
		attacker.driveForward();
    }

	@Test
    public void assignDriver() {
		String driverName = "test driver";
		attacker.assignDriver(driverName);
    }
	
	@Test
    public void assignNullDriver() {
		String driverName = null;
		attacker.assignDriver(driverName);
    }
}
