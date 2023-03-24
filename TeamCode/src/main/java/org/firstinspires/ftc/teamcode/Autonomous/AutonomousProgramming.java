package org.firstinspires.ftc.teamcode.Autonomous;
import org.firstinspires.ftc.teamcode.Code.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

@Autonomous(name = "Autonomous")
public class AutonomousProgramming extends LinearOpMode {
    Auto auto;

@Override
public void runOpMode() throws InterruptedException {
    auto.Init(hardwareMap);
    waitForStart();
    auto.run();

}
}
