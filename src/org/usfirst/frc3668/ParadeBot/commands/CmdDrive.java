package org.usfirst.frc3668.ParadeBot.commands;

import org.usfirst.frc3668.ParadeBot.OI;
import org.usfirst.frc3668.ParadeBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CmdDrive extends Command {

    public CmdDrive() {
        requires(Robot.subChassis);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.subChassis.drive(OI.joyDrive);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.subChassis.drive(0, 0);
    }

    protected void interrupted() {
    	Robot.subChassis.drive(0, 0);
    }
}
