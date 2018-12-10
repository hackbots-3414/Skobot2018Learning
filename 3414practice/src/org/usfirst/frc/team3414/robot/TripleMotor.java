
package org.usfirst.frc.team3414.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class TripleMotor {
	TalonSRX front;
	TalonSRX middle;
	TalonSRX back;
	public TripleMotor(int front_channel, int middle_channel, int back_channel) {
		front = new TalonSRX(front_channel);
		middle = new TalonSRX(middle_channel);
		back = new TalonSRX(back_channel);
		
	}
	public void set(double speed) {
		front.set(ControlMode.PercentOutput, speed);
		middle.set(ControlMode.PercentOutput, speed);
		back.set(ControlMode.PercentOutput, speed);

	}
}
