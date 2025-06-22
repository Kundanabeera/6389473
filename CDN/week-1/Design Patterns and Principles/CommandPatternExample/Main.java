import command.*;
import device.Light;
import invoker.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Living Room light is ON

        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Living Room light is OFF
    }
}
