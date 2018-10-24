package com.resoures;
import java.util.Scanner;

public class EmailGen {

final static int ArryLenght = 10;

    public static void main(String[] args) {
        Scanner Odczyt;
        Worker[] ArrOfWorkers;
        ArrOfWorkers = new Worker[ArryLenght];
        char Petla = 't';
        boolean AddWorker = true;
        int i = 0;

        while (AddWorker){
            System.out.print("Czy chcesz dopisać nowego pracownika do listy? [t/n]?");
            Odczyt = new Scanner(System.in);
            Petla = Odczyt.next().charAt(0);
            if (Petla == 'n')
                AddWorker = false;
            else {
                ArrOfWorkers[i] = new Worker();
                ArrOfWorkers[i].Dodaj();
                for (int k = 0; k < i; k++){
                    if((ArrOfWorkers[i].Name.equals(ArrOfWorkers[k].Name)) && (ArrOfWorkers[i].Surname.equals(ArrOfWorkers[k].Surname))) {
                        ArrOfWorkers[i].Repetition = ArrOfWorkers[k].Repetition + 1;
                        ArrOfWorkers[i].ChangeEmail();
                    }
                }
                i++;
                if (i == ArryLenght) AddWorker = false;
            }
        }
        for (int j = 0; j < i; j++){
            ArrOfWorkers[j].Print();
        }
    }
}
