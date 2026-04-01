package W9;

import java.io.*;

public class Lab9_6 {
    public static void main(String[] args) {

        Species[] oneArray = new  Species[2];
        oneArray[0] = new Species("Calif condor", 27, 0.02);
        oneArray[1] = new Species("Black Rhino", 100, 1.0);
        String fileName = "array.dat";

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(oneArray);
            outputStream.close();
        }catch (IOException e){
            System.out.println("Error writing to file " + fileName + ".");
            System.exit(0);
        }
        System.out.println("Array written to file " + fileName + " and file is closed.");

        Species[] anotherArray = null;
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            anotherArray = (Species[]) inputStream.readObject();//readObject의 반환 타입은 오브젝트라서 반드시 다운캐스팅 필요!!!!
            System.out.println(anotherArray[0]);
            System.out.println(anotherArray[1]);
            inputStream.close();
        }catch (EOFException e){
            System.out.println("End of file Exception.");
        }catch (FileNotFoundException e){
            System.out.println("File not found Excption.");
        }catch (IOException e){
            System.out.println("IOException.");
        }catch (Exception e){
            System.out.println("Excption");
        }
        System.out.println("End of program");
    }

}

class Species implements Serializable{
    private String name;
    private int population;
    private  double growthRate;

    public  Species(){
        name = null;
        population = 0;
        growthRate = 0;
    }
    public Species(String initialName, int initialPopulation, double initialGrowthRate){
        name = initialName;
        if(initialPopulation >= 0)
            population = initialPopulation;
        else {
            System.out.println("Error: Negative population.");
            System.exit(0);
        }
        growthRate = initialGrowthRate;
    }
    public String toSting(){
        return ("Name = " + name + "\n" + "Polulation = " + "\n" + "Growth rate = " + growthRate + "%");
    }
}
