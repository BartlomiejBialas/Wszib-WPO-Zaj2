package com.resoures;
import java.util.Scanner;

public class Worker {
    public String Name;
    public String Surname;
    private String Email;
    public int Repetition = 0;
    private Scanner Odczyt;

    public Worker(){ }
    public Worker (String name, String surname){
        Name = name;
        Surname = surname;
        Email = Name.toLowerCase() + "." + Surname.toLowerCase() + "@mex.com";
    }
    public void Dodaj(){
        System.out.print("Podaj imiÄ™ nowego pracownika: " );
        Odczyt = new Scanner(System.in);
        this.Name = Odczyt.next();
        System.out.print("Podaj nazwisko nowego pracownika: " );
        Odczyt = new Scanner(System.in);
        this.Surname = Odczyt.next();
        Email = Surname.toLowerCase() + "." + Name.toLowerCase() + "@mex.com";
    }
    public void ChangeEmail(){
        Email = Surname.toLowerCase() + "." + Name.toLowerCase() + Repetition + "@mex.com";
    }
    public void Print(){
        System.out.println("ImiÄ™: " + Name + ", Nazwisko: " + Surname + ", eMail: " + Email);
    }
}
