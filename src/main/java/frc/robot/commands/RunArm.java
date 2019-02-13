package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class RunArm extends Command {
     double motorSpeed;
     public RunArm(double speed) {
        requires(Robot.m_Arm);
        motorSpeed = speed;
     
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.m_Arm.arm(motorSpeed);

    }

    protected boolean isFinished() {
        //return the value of the limit switch (or the status that says we want to end it)
        if (Robot.m_Arm.getHallEffect()){
            return false;     
        }
         else {
             return true;
         }
    }
    protected void end() {
       Robot.m_Arm.arm(0);
    }
//end turn off the motor
}