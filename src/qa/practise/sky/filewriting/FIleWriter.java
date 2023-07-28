package qa.practise.sky.filewriting;
import java.io.*;
import java.util.Scanner;

public class FIleWriter {

    public static void read(){
        try{
            File poem = new File("/Users/trm08/Desktop/SkyCamp/SkyWeekTwoMonday/src/qa/practise/sky/filewriting/poem");
            Scanner scanner = new Scanner(poem);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void write(){
        try {
            FileWriter writer = new FileWriter("/Users/trm08/Desktop/SkyCamp/SkyWeekTwoMonday/src/qa/practise/sky/filewriting/poem");
            writer.write("I wrote this using Java");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

