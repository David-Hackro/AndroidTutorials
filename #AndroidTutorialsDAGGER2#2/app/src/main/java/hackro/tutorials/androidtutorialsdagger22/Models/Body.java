package hackro.tutorials.androidtutorialsdagger22.Models;

/**
 * Created by david on 3/10/16.
 */

public class Body {

    private Head head;
    private Arm arm;
    private Leg led;


    public Body(Head head, Arm arm, Leg led) {
        this.head = head;
        this.arm = arm;
        this.led = led;
    }

    public Body() {
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Arm getArm() {
        return arm;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public Leg getLed() {
        return led;
    }

    public void setLed(Leg led) {
        this.led = led;
    }
}
