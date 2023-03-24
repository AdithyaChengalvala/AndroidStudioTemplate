package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Autonomous")
public class AutonomousProgramming extends LinearOpMode {
DcMotor leftWheel;
DcMotor rightWheel;

public void runOpMode() throws InterruptedException{
    leftWheel=hardwareMap.dcMotor.get("left_Wheel");
   rightWheel=hardwareMap.dcMotor.get("right_Wheel");
    leftWheel.setDirection(DcMotor.Direction.REVERSE);
    waitForStart();
}
}
