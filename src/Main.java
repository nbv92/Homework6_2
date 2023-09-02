// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void methodYear(int year){
        if(year%4==0) {
            if(year%400==0) {
                System.out.println(year+" год является високосным.\n");
            }else if(year%100==0);
            System.out.println(year+" год не является високосным.\n");
        }else if (year%4==0){
            System.out.println(year+" год является високосным.\n");
        }
        else{
            System.out.println(year+" год не является високосным.\n");
        }
    }

    static void deviceOS(int clientOS,int clientDeviceYear){
        if(clientOS ==1) {
            if (clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке."+"\n");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке"+"\n");
            }
        }else {
            if(clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке"+"\n");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке"+"\n");
            }
        }
    }

    static void distance(int eliveryDistance, int day){
        if (eliveryDistance<=20) {
            System.out.println("Потребуется дней: "+day+"\n");
        }else if(eliveryDistance<60) {
            day+=1;
            System.out.println("Потребуется дней: "+day+"\n");
        }else if(eliveryDistance<100) {
            day+=2;
            System.out.println("Потребуется дней: "+day+"\n");
        }else {
            System.out.println("Свыше 100 км доставки нет.\n");
        }
    }

    public static void task1(){
        System.out.println("task1");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        methodYear(year);
    }

    public static void task2(){
        System.out.println("task2");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a your phone OS: 1 - for Android, 2 - for iOS ");
        System.out.println("Your phone: ");
        int clientOS = in.nextInt();
        int clientDeviceYear = 2023;
        deviceOS(clientOS,clientDeviceYear);
    }

   public static void task3(){
        System.out.println("task3");
        Scanner in = new Scanner(System.in);
        System.out.print("Input distance: ");
        int eliveryDistance = in.nextInt();
        int day = 1;
        distance(eliveryDistance, day);
        in.close();
    }//
}