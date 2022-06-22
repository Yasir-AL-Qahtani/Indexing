import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        FirstLevel fl=new  FirstLevel();
        File f1=new File("q2_data.txt");

        Scanner sc=new Scanner(f1);
        while (sc.hasNextInt()){
            fl.insertFl(sc.nextInt());

        }

        for (int i = 1; i < 1000; i++) {
            fl.LookUp(i);

        }




    }
}
