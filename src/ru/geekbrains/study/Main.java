package ru.geekbrains.study;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    public static void main(String[] args) {
        byte bit = 32;
        short sh = 122;
        int in = 93215;
        long loong = 4329470432343L;
        float flow = 55.1f;
        double dbl = 30.44;
        boolean bul = true;
        char chr = 'x';
        String str = "fdfdf";
        int a = 10;
        int b  = 12;
        int c = 6;
        int d = 8;
        math3(a, b, c, d);
        System.out.println("Введите первое число");
        int proove1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int proove2 = scanner.nextInt();
        math4(proove1, proove2);
        math5();
        boolean bz = math6();
        helloName();
        highYear();
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int math3 (int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        System.out.println("Ответ: " +result);
        return result;
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean math4 (int proove1, int proove2){
        int sum = proove1+proove2;
        if (sum < 10){
            System.out.println("Число меньше 10");
            return false;
        }
        else if (sum > 20){
            System.out.println("Число больше 20");
            return false;
        }
        else {
            System.out.println("Число в пределах от 10 до 20 включительно");
            return true;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
    //ноль считаем положительным числом.
    public static void math5() {
        System.out.println("Определим является ли отрицательным или положительным веденное число. Введите число:");
        int zeros = scanner.nextInt();
        if(zeros < 0) {
            System.out.println("Число отрицательное");
        }
        else System.out.println("Число положительное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    public static boolean math6 (){
        System.out.println("Определим является ли отрицательным или положительным веденное число. Введите число:");
        int bzeros = scanner.nextInt();
        if (bzeros < 0) {
            System.out.println("Число отрицательное");
            return false;
        }
        else {
            System.out.println("Число положительное");
            return true;
        }
    }

    // 7.Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void helloName(){
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        System.out.println("Привет, "+ name);
    }

    //8. *Написать метод, который определяет является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный.
    public static void highYear(){
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if((year % 4 == 0 ) && (year % 100 != 0)) {
            System.out.println("Год високосный");
        }
        else if (year % 400 == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год не является високосным");
        }
    }
}

