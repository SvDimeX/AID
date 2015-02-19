package AID.form;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CommandTreeForm {
    public CommandTreeForm() {
        OnlyTextTreeExample frame = new OnlyTextTreeExample();
        frame.setSize(600, 800);
        frame.setLocation(300, 200);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

 class OnlyTextTreeExample extends JFrame{
    protected OnlyTextTreeExample() {
        super("OnlyTextTreeExample");
        String[] strs = { "AID come back", // 0
        "AID off transmitter", // 1
        "Close aid system ", // 2
        "yes", // 3
        "no",//4
        "show command tree", // 5
        "Open music control", //6
            "play music",
            "stop music",
            "pause music",
            "next music",
            "music back",
            "close music player",
            "Close music control", //13
        "Open video control", //14
            "play video",
            "stop video",
            "pause video",
            "next video",
            "video back",
            "close video player",
            "Close video control", //21

        "Open mouse control", //22
            "left click",
            "right click",
            "middle click",
            "set position", //26
                "Set one",
                "Set two",
                "Set three",
                "Set four",
                "Set five",
                "Set six",
                "Set seven",
                "Set eight",
                "Set nine",
            "Close mouse control" }; // 36

        DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nodes[i] = new DefaultMutableTreeNode(strs[i]);
        }
        nodes[2].add(nodes[3]);
        nodes[2].add(nodes[4]);

        nodes[0].add(nodes[5]);
        nodes[0].add(nodes[6]);
        nodes[6].add(nodes[7]);
        nodes[6].add(nodes[8]);
        nodes[6].add(nodes[9]);
        nodes[6].add(nodes[10]);
        nodes[6].add(nodes[11]);
        nodes[6].add(nodes[12]);
        nodes[6].add(nodes[13]);

        nodes[0].add(nodes[14]);
        nodes[14].add(nodes[15]);
        nodes[14].add(nodes[16]);
        nodes[14].add(nodes[17]);
        nodes[14].add(nodes[18]);
        nodes[14].add(nodes[19]);
        nodes[14].add(nodes[20]);
        nodes[14].add(nodes[21]);

        nodes[0].add(nodes[22]);
        nodes[22].add(nodes[23]);
        nodes[22].add(nodes[24]);
        nodes[22].add(nodes[25]);
        nodes[22].add(nodes[26]);
        nodes[26].add(nodes[27]);
        nodes[26].add(nodes[28]);
        nodes[26].add(nodes[29]);
        nodes[26].add(nodes[30]);
        nodes[26].add(nodes[31]);
        nodes[26].add(nodes[32]);
        nodes[26].add(nodes[33]);
        nodes[26].add(nodes[34]);
        nodes[26].add(nodes[35]);
        nodes[22].add(nodes[36]);

        nodes[0].add(nodes[1]);
        nodes[0].add(nodes[2]);
//        nodes[1].add(nodes[3]);
//        nodes[0].add(nodes[4]);
        JTree tree = new JTree(nodes[0]);
        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree
        .getCellRenderer();
        renderer.setOpenIcon(null);
        renderer.setClosedIcon(null);
        renderer.setLeafIcon(null);
        BasicTreeUI ui = (BasicTreeUI) tree.getUI();
        ui.setExpandedIcon(null);
        ui.setCollapsedIcon(null);
        JScrollPane sp = new JScrollPane(tree);
        getContentPane().add(sp, BorderLayout.CENTER);
        for (int i = 0; i < strs.length; i++) {
            tree.expandRow(i);
        }

    }
}