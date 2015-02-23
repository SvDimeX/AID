package AID.io;

import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 23.02.15.
 */
public class GenerateJSGF {
    static String version="V1.0";
    static String name="mainAID";
    static String annotate="automatic generating by AID-Systems";
    private static final Logger logger = Logger.getLogger(GenerateJSGF.class);

    public static void generate(HashMap<String, List<String>> map){
        HashMap mapListType = new HashMap();
        HashMap mapListBuf = new HashMap();
        HashMap mapListCommand = new HashMap();

        for (String key : map.keySet()) {
            mapListType.put(map.get(key).get(0).toString(),map.get(key).get(0).toString());
        }
        for (String key : map.keySet()) {
            mapListCommand.put(key,map.get(key).get(1).toString());
        }
        for (String key : map.keySet()) {
            mapListBuf.put(key, map.get(key).get(0).toString());
        }
        try {
            File file = new File("src/resources/mainAID.gram");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.error(e);
                }
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("#JSGF "+version+";");
            bw.newLine();
            bw.write("grammar "+name+";");
            bw.newLine();
            bw.write("/* "+annotate+" */");
            bw.newLine();
            for (Object typeKey : mapListType.keySet()) {
                bw.write("public <" + mapListType.get(typeKey).toString() + "> = ");
                    for (Object commandKey : mapListCommand.keySet()) {
                    if (typeKey==mapListBuf.get(commandKey)) {
                        bw.write(mapListCommand.get(commandKey).toString());
                        bw.write(" | ");
                    }
                }
                bw.write("END of definition line");
                bw.write(";");
                bw.newLine();
            }

            bw.close();

            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }
}
