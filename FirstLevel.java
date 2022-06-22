import java.io.FileNotFoundException;

public class FirstLevel {
    int fl[]={0,100,200,300,400,500,600,700,800,900};
    SecondLevel sl=new SecondLevel();






    public void insertFl(int number){
        if (number>999||number<0) {
            System.out.println("does not exist");
            return;
        }

        for (int i = 0; i < 9; i++) {
            if (number>=fl[i]&&number<fl[i+1]){
                sl.insert(number, i*10);
            }

        }
        if (number>=fl[9]&&number<1000){
            sl.insert(number, 90);
        }


    }


    public  void DeleteFl(int number){
        for (int i = 0; i < 9; i++) {
            if (number>=fl[i]&&number<fl[i+1]){
                sl.Delete(number,i*10);
            }

        }
        if (number>=fl[9]&&number<1000){
            sl.Delete(number, 90);
        }
    }

    public void LookUp(int number){
        for (int i = 0; i < 9; i++) {
        if (number>=fl[i]&&number<fl[i+1]){
            sl.Lookup(number,i*10);



    }}
        if (number>=900&&number<1000){
            sl.Lookup(number,90);
        }


    }


//




}

