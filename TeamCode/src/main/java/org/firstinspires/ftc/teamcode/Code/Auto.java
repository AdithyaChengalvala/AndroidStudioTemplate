package org.firstinspires.ftc.teamcode.Code;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.VergeTools.*;
public class Auto {

    Motor motor;

    public void Init(HardwareMap hardwareMap){
        motor = new Motor("motor", hardwareMap);
    }
    public void run() throws InterruptedException {
        motor.move(1);
    }
}
