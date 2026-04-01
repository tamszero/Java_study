package W9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab9_1 {
    public static void main(String[] args) {
        String fileName = "test.txt";
        PrintWriter outStream = null;
        String line;

        try {
            outStream = new PrintWriter(fileName);
        } catch (IOException e) {
            System.out.println("Exception occurs");
            System.exit(1);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Input three lines");
        for(int i = 0; i<3; i ++){
            line = sc.nextLine();
            outStream.print(line + "\n");
        }
        outStream.close();
    }
}

//기존 파일 존재 -> 덮어씀