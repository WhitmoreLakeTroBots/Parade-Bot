package org.usfirst.frc3668.ParadeBot;

import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
    public static AnalogGyro subChassisGyro;
    public static CANTalon subChassisRight1;
    public static CANTalon subChassisRight2;
    public static CANTalon subChassisLeft1;
    public static CANTalon subChassisLeft2;
    public static RobotDrive subChassisRobotDrive4;

    public static void init() {
        subChassisGyro = new AnalogGyro(Settings.gyroPort);
        LiveWindow.addSensor("subChassis", "Gyro", subChassisGyro);
        subChassisGyro.setSensitivity(Settings.gyroSensitivity);
        
        subChassisRight1 = new CANTalon(Settings.subChassisRight1CANid);
        LiveWindow.addActuator("subChassis", "Right1", subChassisRight1);
        
        subChassisRight2 = new CANTalon(Settings.subChassisRight2CANid);
        LiveWindow.addActuator("subChassis", "Right2", subChassisRight2);
        
        subChassisLeft1 = new CANTalon(Settings.subChassisLeft1CANid);
        LiveWindow.addActuator("subChassis", "Left1", subChassisLeft1);
        
        subChassisLeft2 = new CANTalon(Settings.subCHassisLeft2CANid);
        LiveWindow.addActuator("subChassis", "Left2", subChassisLeft2);
        
        subChassisRobotDrive4 = new RobotDrive(subChassisLeft1, subChassisLeft2,
              subChassisRight1, subChassisRight2);
        
        subChassisRobotDrive4.setSafetyEnabled(true);
        subChassisRobotDrive4.setExpiration(Settings.robotDriveExpiration);
        subChassisRobotDrive4.setSensitivity(Settings.robotDriveSensitivity);
        subChassisRobotDrive4.setMaxOutput(Settings.robotDriveMaxOutput);
    }
}
