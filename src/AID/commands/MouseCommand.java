package AID.commands;

import AID.voice.Synthesizer;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by dima-sv on 2/7/15.
 */
public class MouseCommand {

    public static void mouseCommand(String recString) throws Exception {
        Robot robot = new Robot();

        if (recString.contains("left click")) {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
        if (recString.contains("middle click")) {
            robot.mousePress(InputEvent.BUTTON2_MASK);
            robot.mouseRelease(InputEvent.BUTTON2_MASK);
        }
        if (recString.contains("right click")) {
            robot.mousePress(InputEvent.BUTTON3_MASK);
            robot.mouseRelease(InputEvent.BUTTON2_MASK);
        }
    }

}
