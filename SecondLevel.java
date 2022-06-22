import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondLevel {
    int[][] secondLevel;
    int[] counter;


    public SecondLevel() {
        secondLevel = new int[100][];
        for (int i = 0; i < 100; i++) {
            secondLevel[i] = new int[10];

        }
        counter = new int[100];
    }

    public void insert(int number, int index) { //num 215  idex 21
        for (int i = index; i < index + 10; i++) {
            if (number >= i * 10 && number < i * 10 + 10) {
                if (!(Search(number, secondLevel[i], counter[i]))) {
                    secondLevel[i][counter[i]++] = number;
                }
                break;

            }
        }
    }

    private boolean Search(int number, int a[], int counter) {
        for (int i = 0; i < counter; i++) {
            if (a[i] == number)
                return true;
        }
        return false;
    }

    public void Delete(int number, int index) {
        for (int i = index; i < index + 10; i++) {
            if (number >= i * 10 && number < i * 10 + 10) {
                for (int j = 0; j < counter[i]; j++) {
                    if (number == secondLevel[i][j]) {

                        shift(counter[i], j, secondLevel[i]);
                        counter[i]--;
                        break;
                    }

                }
                break;
            }

        }

    }

    private void shift(int counter, int index, int a[]) {
        for (int i = index; i < counter; i++) {
            a[i] = a[i + 1];


        }
    }

    public void Lookup(int number, int index) {


        for (int i = index; i < index + 10; i++) {
            if (number >= i * 10 && number < i * 10 + 10) {
                if (Search(number, secondLevel[i], counter[i])) {
                    System.out.print("points "+index*10+",");
                    System.out.print(i * 10 + ",");

                    for (int j = 0; j < counter[i]; j++) {
                        if (secondLevel[i][j] == number) {
                            System.out.println(secondLevel[i][j]);
                            return;
                        }
                        System.out.print(secondLevel[i][j] + ",");


                    }

                }else {
                    System.out.println("does not exist");
                    return;
            }
            }
        }
    }

}























