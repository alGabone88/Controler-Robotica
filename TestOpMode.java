package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;



@TeleOp(name = "Test Op Mode", group = "Iterative Opmode")
public class TestOpMode extends OpMode {


    DcMotor frontrightmotor = null;
    DcMotor frontrleftmotor = null;
    DcMotor backrightmotor = null;
    DcMotor backleftmotor = null;

    @Override
    public void init() {

        frontrightmotor = hardwareMap.get(DcMotor.class, "motor1");
        frontrleftmotor = hardwareMap.get(DcMotor.class, "motor2");
        backrightmotor  = hardwareMap.get(DcMotor.class, "motor3");
        backleftmotor   = hardwareMap.get(DcMotor.class, "motor4");

    }

    @Override
    public void loop() {

        frontrightmotor.setPower(gamepad1.left_trigger);
        frontrleftmotor.setPower(gamepad1.right_trigger);
        backrightmotor.setPower(gamepad1.left_trigger);
        backleftmotor.setPower(gamepad1.right_trigger);

    }
}
