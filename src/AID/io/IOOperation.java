package AID.io;

import java.io.*;
import java.util.HashMap;

/**
 * Created by dima-sv on 2/3/15.
 */
public class IOOperation {

    public HashMap readObjFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objInpStream = new ObjectInputStream(fileStream);
        HashMap<String, String> fileObj = (HashMap<String,String>) objInpStream.readObject();
        objInpStream.close();
        return fileObj;
    }

    public void writeObjFile(String fileName, HashMap hMap) throws IOException {
        File file = new File(fileName);
        FileOutputStream outStream = new FileOutputStream(file);
        ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);
        objOutStream.writeObject(hMap);
        objOutStream.close();
    }
}
