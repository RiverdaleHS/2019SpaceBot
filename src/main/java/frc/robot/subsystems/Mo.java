
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Mo extends Subsystem {
    
    public DoubleSolenoid mo = new DoubleSolenoid(3,4);

    
    public Mo(){}

    public void extend(){
        mo.set(DoubleSolenoid.Value.kForward);
    }

    public void retract(){
        mo.set(DoubleSolenoid.Value.kReverse);
    }
   
    public void initDefaultCommand() {}

}