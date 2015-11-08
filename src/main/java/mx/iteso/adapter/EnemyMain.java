package mx.iteso.adapter;

import mx.iteso.adapter.enemy.EnemyAttacker;
import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import mx.iteso.adapter.enemy.impl.EnemyRobotAdapter;
import mx.iteso.adapter.enemy.impl.EnemyTank;

public class EnemyMain {

    public static void main(String[] args){

        EnemyTank rx7Tank = new EnemyTank();

        EnemyRobot fredTheRobot = new EnemyGiantRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }

}
