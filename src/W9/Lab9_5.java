package W9;

import java.io.*;

public class Lab9_5 {
    public static void main(String[] args) {
        String fileName = "numbers.dat";
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println("Reading All the integers");
            System.out.println("in the file " + fileName);
            try{
                while (true){
                    int anInteger = inputStream.readInt();
                    System.out.println(anInteger);
                }
            }catch (EOFException e){
                System.out.println("End of rading from file.");
            }
            inputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("Cannot find file " + fileName);
        }catch (IOException e){
            System.out.println("Problem with input from file " + fileName);
        }
    }
}
