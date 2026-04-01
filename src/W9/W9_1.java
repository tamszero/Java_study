package W9;

import java.io.*;
import java.util.Scanner;

public class W9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name for input: ");
        String inputfileName = sc.nextLine();
        System.out.println("File name for output: ");
        String outputfileName = sc.nextLine();

        //읽어들이기
        System.out.println("The numbers in File, " + inputfileName);

        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputfileName));
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputfileName));

            try{
                while (true) {
                    int anInteger = inputStream.readInt();
                    System.out.println(anInteger);

                    int outInteger = anInteger * 2;
                    outputStream.writeInt(outInteger);
                }

            }catch (EOFException e){
                System.out.println("End of reading from File, numbers.dat");
            }

            outputStream.close();
            inputStream.close();


        }catch (FileNotFoundException e){
            System.out.println("There's not such file.");
        }catch (IOException e){
            System.out.println("There's some problem with this file");
        }

        System.out.println("End of reading from 2nd File, " + outputfileName);

        //2배해서 출력하기
        System.out.println("doublenumbers.dat is generated.");
        System.out.println("The numbers in new File, " + outputfileName);

        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputfileName));

            try{
                while(true){
                    int newinInteger = inputStream.readInt();
                    System.out.println(newinInteger);
                }
            }catch (EOFException e){
                System.out.println("End of file");
            }

            inputStream.close();

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("There is an Error");
        }


    }
}
