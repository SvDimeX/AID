package AID.io.database;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dima-sv on 24.02.15.
 */
public class DictGenerator {
    private static final Logger logger = Logger.getLogger(DictGenerator.class);

    public static void generateUADict(String inputFile, String outputFile) {
        inputFile="../out/UAmainAID.buf";
        outputFile="src/resources/dict/cmudict_UA.0.6d";
        String transcription = null, slowo = null;
        Scanner scannerFile = null;
        try {
            scannerFile = new Scanner(new File(inputFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            File file = new File(outputFile);
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
            logger.info("Generatig into"+ file +" file");
            while (scannerFile.hasNextLine()) {
                Scanner scannerWord = new Scanner(scannerFile.nextLine());
                boolean b;
                while (b = scannerWord.hasNext()) {
                    slowo = scannerWord.next();
                    slowo = slowo.toUpperCase();
                    char[] c_arr = slowo.toCharArray();
                    String[] s_arr_buf = new String[c_arr.length];
                    for (int i = 0; i < c_arr.length; i++) {
                        if (c_arr[i] == 'А') {
                            s_arr_buf[i] = "AH ";
                        } else if (c_arr[i] == 'Б') {
                            s_arr_buf[i] = "B ";
                        } else if (c_arr[i] == 'В') {
                            s_arr_buf[i] = "W ";
                        } else if (c_arr[i] == 'Г') {
                            s_arr_buf[i] = "HH ";
                        } else if (c_arr[i] == 'Ґ') {
                            s_arr_buf[i] = "G ";
                        } else if (c_arr[i] == 'Д') {
                            s_arr_buf[i] = "D ";
                        } else if (c_arr[i] == 'Е') {
                            s_arr_buf[i] = "EH ";
                        } else if (c_arr[i] == 'Є') {
                            s_arr_buf[i] = "Y EH ";
                        } else if (c_arr[i] == 'Ж') {
                            s_arr_buf[i] = "JH ";
                        } else if (c_arr[i] == 'З') {
                            s_arr_buf[i] = "Z ";
                        } else if (c_arr[i] == 'И') {
                            s_arr_buf[i] = "IH ";
                        } else if (c_arr[i] == 'І') {
                            s_arr_buf[i] = "IH ";
                        } else if (c_arr[i] == 'Ї') {
                            s_arr_buf[i] = "Y IH ";
                        } else if (c_arr[i] == 'Й') {
                            s_arr_buf[i] = "Y IH ";
                        } else if (c_arr[i] == 'К') {
                            s_arr_buf[i] = "K ";
                        } else if (c_arr[i] == 'Л') {
                            s_arr_buf[i] = "L ";
                        } else if (c_arr[i] == 'М') {
                            s_arr_buf[i] = "M ";
                        } else if (c_arr[i] == 'Н') {
                            s_arr_buf[i] = "N ";
                        } else if (c_arr[i] == 'О') {
                            s_arr_buf[i] = "OW ";
                        } else if (c_arr[i] == 'П') {
                            s_arr_buf[i] = "P ";
                        } else if (c_arr[i] == 'Р') {
                            s_arr_buf[i] = "R ";
                        } else if (c_arr[i] == 'С') {
                            s_arr_buf[i] = "S ";
                        } else if (c_arr[i] == 'Т') {
                            s_arr_buf[i] = "T ";
                        } else if (c_arr[i] == 'У') {
                            s_arr_buf[i] = "UW ";
                        } else if (c_arr[i] == 'Ф') {
                            s_arr_buf[i] = "F ";
                        } else if (c_arr[i] == 'Х') {
                            s_arr_buf[i] = "HH ";
                        } else if (c_arr[i] == 'Ц') {
                            s_arr_buf[i] = "T S ";
                        } else if (c_arr[i] == 'Ч') {
                            s_arr_buf[i] = "CH ";
                        } else if (c_arr[i] == 'Ш') {
                            s_arr_buf[i] = "SH ";
                        } else if (c_arr[i] == 'Щ') {
                            s_arr_buf[i] = "SH CH ";
                        } else if (c_arr[i] == 'Ь') {
                            s_arr_buf[i] = "";
                        } else if (c_arr[i] == 'Ю') {
                            s_arr_buf[i] = "J UH ";
                        } else if (c_arr[i] == 'Я') {
                            s_arr_buf[i] = "J AH ";
                        }
                    }
                    StringBuilder builder = new StringBuilder();
                    for (String s : s_arr_buf) {
                        if (s != null)
                            builder.append(s);
                    }
                    transcription = builder.toString();

                    bw.write(slowo + "            " + transcription);
                    bw.newLine();
                }
            }
            bw.close();

            logger.info("Dictionary generate finish.");

        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }

    public static void prepareForGenerate(HashMap<String, List<String>> map) {
        HashMap mapListType = new HashMap();
        HashMap mapListBuf = new HashMap();
        HashMap mapListCommand = new HashMap();

        for (String key : map.keySet()) {
            mapListType.put(map.get(key).get(0).toString(), map.get(key).get(0).toString());
        }
        for (String key : map.keySet()) {
            mapListCommand.put(key, map.get(key).get(1).toString());
        }
        for (String key : map.keySet()) {
            mapListBuf.put(key, map.get(key).get(0).toString());
        }
        try {
            File file = new File("../out/UAmainAID.buf");
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
            int i = 0;
                for (Object commandKey : mapListCommand.keySet()) {
                        bw.write(mapListCommand.get(commandKey).toString());
                    bw.newLine();
                    System.out.println(mapListCommand.get(commandKey).toString());
                    }
            bw.close();

            logger.info("Grammar generate finish.");

        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }
}
