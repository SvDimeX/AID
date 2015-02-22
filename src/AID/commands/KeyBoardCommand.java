package AID.commands;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by dima-sv on 2/22/15.
 */
public class KeyBoardCommand {
    public static void keyboardCommand(String recString){
        if (recString.contains("next tab")) {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
        if (recString.contains("page down")) {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
        if (recString.contains("page up")) {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_PAGE_UP);
                robot.keyRelease(KeyEvent.VK_PAGE_UP);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
// не працює linux
        if (recString.contains("switch window")) {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_ALT);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
// не працює linux
        if (recString.contains("show menu")) {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyRelease(KeyEvent.VK_WINDOWS);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
            
        if (recString.contains("reload page")) {
            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_F5);
                robot.keyRelease(KeyEvent.VK_F5);
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}
