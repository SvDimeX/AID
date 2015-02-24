package AID.io;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/3/15.
 */
public class IOOperation {

    public enum Configuration {
        BasicConf,
        DefaultConf,
        UserConf
    }

    public static HashMap readObjFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objInpStream = new ObjectInputStream(fileStream);
        HashMap<String, String> fileObj = (HashMap<String, String>) objInpStream.readObject();
        objInpStream.close();
        return fileObj;
    }

    public static void writeObjFile(String fileName, HashMap<String, List<String>> hMap) throws IOException {
        File file = new File(fileName);
        FileOutputStream outStream = new FileOutputStream(file);
        ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);
        objOutStream.writeObject(hMap);
        objOutStream.close();
    }

    public static HashMap loadProperties(String file) throws IOException, ClassNotFoundException {
        HashMap<String, Object> fileObj = readObjFile(file);
        return fileObj;
    }

    public HashMap loadConfiguration(String file) throws IOException, ClassNotFoundException {

//        if (Configuration.BasicConf == conf) {
//            file = new File("src/resources/Basic.config");
//            System.out.println("Load Basic Question Configuration.");
//        } else if (Configuration.DefaultConf == conf) {
//            file = new File("src/resources/DefaultConf.conf");
//            System.out.println("Load Basic Answer Configuration.");
//        }else if (Configuration.UserConf == conf) {
//            file = new File("src/resources/UserConf.conf");
//            System.out.println("Load Basic Function Configuration.");
//        } else {
//            System.out.println("Error! Can't load configuration file!");
//            return null;
//        }
        HashMap<String, Object> fileObj = readObjFile(file);
        return fileObj;
    }

//    public HashMap<String, HashMap<String, List<String>>> loadAllConfiguration() throws IOException, ClassNotFoundException{
//        System.out.println("Load properties...");
//        HashMap systemProperties = readObjFile("src/resources/SystemProperties.properties"); //Читання безпосередньо з файлу
//
//        viewMap(systemProperties);

//        System.out.println("Load All Configuration...");
//        HashMap<String, List<String>> basicConf = loadConfiguration(Configuration.BasicConf, userProperties.get("lang").toString());
//        HashMap<String, List<String>> defaultConf = loadConfiguration(Configuration.DefaultConf, userProperties.get("lang").toString());
//        HashMap<String, List<String>> userConf = loadConfiguration(Configuration.UserConf, userProperties.get("lang").toString());

//        HashMap<String, HashMap<String, List<String>>> allConfig = new HashMap<String, HashMap<String, List<String>>>();
//        allConfig.put("systemProperties", systemProperties);
//        allConfig.put("basicAsk", basicConf);
//        allConfig.put("defaultAsk", defaultConf);
//        allConfig.put("userAsk", userConf);

//        return allConfig;
//    }

    public void viewMap(HashMap<String, List<String>> map) {
        for (String key : map.keySet()) {
            System.out.print(key);
            System.out.println(": " + map.get(key));
        }
    }

}
