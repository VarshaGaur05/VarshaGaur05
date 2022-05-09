
import java.io.*;
import java.util.Scanner;

public class Runner {

    // public static void printAnimal(Animal someAnimal){
    //     System.out.println("Animal Height: " + someAnimal.height);
    //     System.out.println("Animal Weight: " + someAnimal.weight);
    //     someAnimal.weight = 30;
    // }

    public static void main (String[] args){
        //Animal firstAnimal = new Animal();
        //firstAnimal.height = 7;
        //firstAnimal.weight = 20;
        //firstAnimal.MakeNoise();

        //Animal secondAnimal = new Animal();
        //secondAnimal.height = 15;
        //secondAnimal.weight = 100;

        //firstAnimal = secondAnimal;

        //firstAnimal.height = 0;
        //firstAnimal.weight = 0;

        //printAnimal(firstAnimal);

        //System.out.println(firstAnimal.getHeight());

        //firstAnimal.setHeight(20);

        //Dog myDog = new Dog(13, 24);
        //myDog.MakeNoise();
        //myDog.guard();

        //Cat myCat = new Cat();
        //myCat.MakeNoise();

        //Vet myVet = new Vet();
        //myVet.giveShot(myDog);
        //myVet.giveShot(myCat);

        //Animal a = new Dog();
        //a.guard();

        // Animal b = new Animal();

        //Animal someAnimal = new Animal();
        //Animal anotherAnimal = new Animal(5, 10);


        //int[] arr = new int[5];
        
        //Animal[] animalArray = new Animal[8];

        // for (int i = 0; i < arr.length; i++){ // i=5
        //     arr[i] = i+1;
        // }


        //arr[0] = 1
        //arr[1] = 2
        // arr[2] = 3
        //arr[3] = 4
        //arr[4] = 5

        // boolean[] arrBoolean = new boolean[10];

        // Exception Handling
        // try {
        //     System.out.println(arr[7]);
        //     System.out.println("Try: Code Execution Complete");
        // } catch (Exception e) {
        //     System.out.println("Something went wrong!");
        //     System.out.println(e.getMessage());
        // } finally {
        //     System.out.println("Finally: Code Execution Complete");
        // }

        // File I/O
        try {
            File myFile = new File("somefile3.txt");
            boolean fileCreated = myFile.createNewFile();
            if (fileCreated){
                System.out.println("File Created");
            } else {
                System.out.println("Some Isseus in creating the file");
            }
        } catch (IOException e){
            System.out.println("An exception Occured!");
        }

        try {
            FileWriter myWriter = new FileWriter("somefile3.txt");
            myWriter.write("Writing something inside a file");
            myWriter.close();
            System.out.println("Successfully wrote into the file");
        } catch (IOException e){
            System.out.println("An Error occured");
        }

        try {
            File myFileObj = new File("somefile3.txt");
            Scanner myReader = new Scanner(myFileObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An Error Occured");
        }


    }
}

// firstAnimal[0x5678]  -->XXX    [(int)height:7, (int)weight:20]     <-- [0x2345]someAnimal
// seconAnimal[0x5678]  -->    [(int)height:15, (int)weight:100]   <--- firstAnimal;