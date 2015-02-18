package AID.io;

import java.io.*;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/3/15.
 */
public class IOOperation {

    public enum Configuration{
        BasicConf,
        DefaultConf,
        UserConf
    }

    public static HashMap readObjFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objInpStream = new ObjectInputStream(fileStream);
        HashMap<String, String> fileObj = (HashMap<String,String>) objInpStream.readObject();
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

    public HashMap loadConfiguration(Configuration conf, String Lang) throws IOException, ClassNotFoundException {
        File file = null;
        if (Configuration.BasicConf == conf) {
            file = new File("src/resources/"+Lang+"/BasicConf" + Lang + ".conf");
            System.out.println("Load Basic Question Configuration.");
        } else if (Configuration.DefaultConf == conf) {
            file = new File("src/resources/"+Lang+"/DefaultConf" + Lang + ".conf");
            System.out.println("Load Basic Answer Configuration.");
        }else if (Configuration.UserConf == conf) {
            file = new File("src/resources/"+Lang+"/UserConf"+Lang+".conf");
            System.out.println("Load Basic Function Configuration.");
        } else {
            System.out.println("Error! Can't load configuration file!");
            return null;
        }
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objInpStream = new ObjectInputStream(fileStream);
        HashMap<String, Object> fileObj = (HashMap<String,Object>) objInpStream.readObject();
        objInpStream.close();
        return fileObj;
    }

    public HashMap<String, HashMap<String, List<String>>> loadAllConfiguration() throws IOException, ClassNotFoundException{
        System.out.println("Load properties...");
        HashMap systemProperties = readObjFile("src/resources/SystemProperties.properties"); //Читання безпосередньо з файлу
        HashMap userProperties = readObjFile("src/resources/UserProperties.properties"); //Читання безпосередньо з файлу

        viewMap(systemProperties);
        viewMap(userProperties);

//        System.out.println("Load All Configuration...");
        HashMap<String, List<String>> basicConf = loadConfiguration(Configuration.BasicConf, userProperties.get("lang").toString());
        HashMap<String, List<String>> defaultConf = loadConfiguration(Configuration.DefaultConf, userProperties.get("lang").toString());
        HashMap<String, List<String>> userConf = loadConfiguration(Configuration.UserConf, userProperties.get("lang").toString());

        HashMap<String, HashMap<String, List<String>>> allConfig = new HashMap<String, HashMap<String, List<String>>>();
        allConfig.put("systemProperties", systemProperties);
        allConfig.put("userProperties", userProperties);
        allConfig.put("basicAsk", basicConf);
        allConfig.put("defaultAsk", defaultConf);
        allConfig.put("userAsk", userConf);

        return allConfig;
    }

    public void viewMap(HashMap <String, String> map){
        for (String key : map.keySet()) {
            System.out.print(key);
            System.out.println(": " + map.get(key));
        }
    }

}
