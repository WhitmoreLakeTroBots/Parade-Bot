package org.usfirst.frc3668.ParadeBot.commands;

import org.usfirst.frc3668.ParadeBot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CmdInvertDrive extends Command {

	private boolean _isFinished = false;
	
    public CmdInvertDrive() {
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.isDriveInverted = !Robot.isDriveInverted;
    	_isFinished = true;
    }

    protected boolean isFinished() {
        return _isFinished;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
