package W9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab9_2 {
    public static void main(String[] args) {
        System.out.print("Enter file name: ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.next();
        Scanner inputStrem = null;

        System.out.println("The file " + fileName + "\n" + "contains the following lines: \n");
        try{
            inputStrem = new Scanner(new File(fileName));
        }catch (FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }while (inputStrem.hasNextLine()){
            String line = inputStrem.nextLine();
            System.out.println(line);
        }
        inputStrem.close();
    }
}
