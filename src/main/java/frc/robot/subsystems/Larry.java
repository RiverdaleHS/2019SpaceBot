
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Larry extends Subsystem {
    
    public DoubleSolenoid larry = new DoubleSolenoid(1,2);

    public Larry() {

    }

    public void extend(){
        larry.set(DoubleSolenoid.Value.kForward);
    }

    public void retract(){
        larry.set(DoubleSolenoid.Value.kReverse);
    }
   
    public void initDefaultCommand() {}

}