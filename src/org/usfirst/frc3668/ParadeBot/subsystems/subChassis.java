package org.usfirst.frc3668.ParadeBot.subsystems;

import org.usfirst.frc3668.ParadeBot.Robot;
import org.usfirst.frc3668.ParadeBot.RobotMap;
import org.usfirst.frc3668.ParadeBot.Settings;
import org.usfirst.frc3668.ParadeBot.commands.CmdDrive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class subChassis extends Subsystem {

    private final AnalogGyro gyro = RobotMap.subChassisGyro;
    private final CANTalon right1 = RobotMap.subChassisRight1;
    private final CANTalon right2 = RobotMap.subChassisRight2;
    private final CANTalon left1 = RobotMap.subChassisLeft1;
    private final CANTalon left2 = RobotMap.subChassisLeft2;
    private final RobotDrive robotDrive4 = RobotMap.subChassisRobotDrive4;

    public void initDefaultCommand() {
        setDefaultCommand(new CmdDrive());
    }
    
    public void resetGyro(){
    	gyro.reset();
    }
    
    public void calibrateGyro(){
    	gyro.calibrate();
    }
    
    public void initGyro(){
    	gyro.initGyro();
    }
    
    public void getAngel(){
    	gyro.getAngle();
    }
    
    public void drive(Joystick joy){
    	double joyX = joy.getRawAxis(Settings.joyDriveXaxis) * Settings.driveScalar;
		double joyY = joy.getRawAxis(Settings.joyDriveYaxis) * Settings.driveScalar;
		if(Robot.isDriveInverted){
			robotDrive4.arcadeDrive(-joyY, -joyX, true);
		} if(!Robot.isDriveInverted) {
			robotDrive4.arcadeDrive(joyY,-joyX, true);
		}
    }
    
    public void drive(double right, double left){
    	right1.set(right);
    	right2.set(right);
    	left1.set(left);
    	left2.set(left);
    }
}