package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int menu = 100;
        Scanner in = new Scanner(System.in);
        try {
            while (menu != 0) {
                System.out.print("[0] - Завершение работы" + '\n' + "[1] - Задание 1" + '\n' +
                        "[2] - Задание 2" + '\n' + "[3] - Задание 3" + '\n' + "Выберите задание: ");
                menu = in.nextInt();
                switch (menu) {
                    case 0:
                        System.out.print("Работа завершена");
                        break;
                    case 1:
                        qvest1(in);
                        break;
                    case 2:
                        qvest2(in);
                        break;
                    case 3:
                        qvest3(in);
                        break;
                }
            }
        } catch(Exception ignored){

        }
    }
    private static void qvest1(Scanner in){
        Qvest1 obj = new Qvest1();
        int menu = 100;
        try {
            while (menu != 0) {
                System.out.print("[0] - Главное меню" + '\n' + "[1] - Ввести текст" + '\n' +
                        "[2] - Узнать количество абзацев, время разговора в каждом абзаце и разделить первый абзац" + '\n' +
                        "Выберете задание: ");
                menu = in.nextInt();
                switch (menu) {
                    case 0:
                        System.out.println("Возвращение в главное меню...");
                        break;
                    case 1:
                        System.out.println("Введите текст: ");
                        in.nextLine();
                        String str = in.nextLine();
                        obj.Input(str);
                        break;
                    case 2:
                        System.out.println("Абзацев: " + obj.CountAbz());
                        break;
                }
            }
        } catch(Exception ignored){

        }
    }
    private static void qvest2(Scanner in){
        Qvest2 obj = new Qvest2();
        int menu = 100;
        try {
            while (menu != 0) {
                System.out.print("[0] - Главное меню" + '\n' + "[1] - Ввести текст" + '\n' +
                        "[2] - Удалить самый длинный абзац, представить числа в форме с плавающей точкой и выполнить модификацию текста" + '\n' +
                        "Выберете задание: ");
                menu = in.nextInt();
                switch (menu) {
                    case 0:
                        System.out.println("Возвращение в главное меню...");
                        break;
                    case 1:
                        System.out.println("Введите текст: ");
                        in.nextLine();
                        String str = in.nextLine();
                        obj.Input(str);
                        break;
                    case 2:
                        obj.CountAbz();
                        break;
                }
            }
        } catch(Exception ignored){

        }
    }
    private static void qvest3(Scanner in){
        Qvest3 obj = new Qvest3();
        int menu = 100;
        try {
            while (menu != 0) {
                System.out.print("[0] - Главное меню" + '\n' + "[1] - Ввести текст" + '\n' +
                        "[2] - Поверить соответствие строки формату IP-адреса v4" + '\n' +
                        "[3] - Второе задание" + '\n' +
                        "Выберете задание: ");
                menu = in.nextInt();
                switch (menu) {
                    case 0:
                        System.out.println("Возвращение в главное меню...");
                        break;
                    case 1:
                        System.out.println("Введите текст: ");
                        in.nextLine();
                        String str = in.nextLine();
                        obj.Input(str);
                        break;
                    case 2:
                        if(obj.IPv4())
                            System.out.println("IP соответствует формату IPv4\n");
                        else
                            System.out.println("IP не соответствует формату IPv4\n");
                        break;
                    case 3:
                        obj.IPv6();
                        break;
                }
            }
        } catch(Exception ignored){

        }
    }
}
