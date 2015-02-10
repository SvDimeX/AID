package AID.commands;

import AID.form.CursorGrid;
import AID.voice.Synthesizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created by dima-sv on 2/7/15.
 */
public class MouseCommand {
    static boolean setPosition=false;
    static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    static int maxW=dim.width;
    static int maxH=dim.height;
    static int minW=0;
    static int minH=0;
    static int setW;
    static int setH;
    static CursorGrid cursorGrid;
    public static void mouseCommand(String recString) throws Exception {
        Robot robot = new Robot();

        if (recString.contains("left click")) {
            if (setPosition){
                Window window = SwingUtilities.getWindowAncestor(cursorGrid);
                window.dispose();
            }
            minW=0;
            minH=0;
            maxW=dim.width;
            maxH=dim.height;
            setPosition=false;
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
            if (recString.contains("middle click")) {
                if (setPosition){
                Window window = SwingUtilities.getWindowAncestor(cursorGrid);
                window.dispose();}
                minW=0;
                minH=0;
                maxW=dim.width;
                maxH=dim.height;
                setPosition=false;
                robot.mousePress(InputEvent.BUTTON2_MASK);
                robot.mouseRelease(InputEvent.BUTTON2_MASK);
            }
            if (recString.contains("right click")) {
                if (setPosition){
                    Window window = SwingUtilities.getWindowAncestor(cursorGrid);
                    window.dispose();
                }
                minW=0;
                minH=0;
                maxW=dim.width;
                maxH=dim.height;
                setPosition=false;
                robot.mousePress(InputEvent.BUTTON3_MASK);
                robot.mouseRelease(InputEvent.BUTTON2_MASK);
            }

            if (recString.contains("set position")) {
                Synthesizer.speak("select sector, please");
                if (setPosition==false){
                    cursorGrid = new CursorGrid();
                }
                minW=0;
                minH=0;
                maxW=dim.width;
                maxH=dim.height;
                setPosition = true;
            }
            if ((setPosition == true) && (recString.contains("set one"))) {
                maxW=(maxW-minW)/3+minW;
                maxH=(maxH-minH)/3+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set two"))) {
                minW=(maxW-minW)/3+minW;
                maxW=(maxW-minW)/2+minW;
                maxH=(maxH-minH)/3+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set three"))) {
                minW=(maxW-minW)/3*2+minW;
                maxH=(maxH-minH)/3+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set four"))) {
                minH=(maxH-minH)/3+minH;
                maxW=(maxW-minW)/3+minW;
                maxH=(maxH-minH)/3+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set five"))) {
                minW=(maxW-minW)/3+minW;
                minH=(maxH-minH)/3+minH;
                maxW=(maxW-minW)/2+minW;
                maxH=(maxH-minH)/2+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set six"))) {
                minW=(maxW-minW)/3*2+minW;
                minH=(maxH-minH)/3+minH;
                maxH=(maxH-minH)/2+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set seven"))) {
                minH=(maxH-minH)/3*2+minH;
                maxW=(maxW-minW)/3+minW;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set eight"))) {
                minW=(maxW-minW)/3+minW;
                minH=(maxH-minH)/3*2+minH;
                maxW=(maxW-minW)/2+minW;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);
            }
            if ((setPosition == true) && (recString.contains("set nine"))) {
                minW=(maxW-minW)/3*2+minW;
                minH=(maxH-minH)/3*2+minH;
                setW=(maxW-minW)/2+minW;
                setH=(maxH-minH)/2+minH;
                robot.mouseMove(setW, setH);

            }
        }

}
