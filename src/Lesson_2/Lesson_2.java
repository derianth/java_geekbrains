package Lesson_2;

import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {

        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
        //0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int[] mass1 = {1,1,0,0,1,0,1,1,0,0};
//        for ( int i = 0; i < mass1.length; i++){
//            if(mass1[i] == 1){
//                mass1[i] = 0;
//            }
//            else mass1[i] = 1;
//        }
//        System.out.println(mass1[i]);

        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//        int[] mass2 = new int[8];
//        for(int i = 1; i > mass2.length; i++) {
//            mass2[i] = mass2[i - 1] + 3;
//        }
//        System.out.println(Arrays.toString(mass2));

//        int[] mass2 = new int[8];
//        for(int i = 0; i<mass2.length; i++) {
//            mass2[i] = i * 3;
//            System.out.println(mass2[i]);
//        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for(int i = 0; i < mass3.length; i++) {
//            if (mass3[i] < 6) {
//                mass3[i] =  mass3[i] * 2;
//            }
//            System.out.println(mass3[i]);
//        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
//        int[][] mass4 = new int[5][5];
//        int counter = 0;
//        for (int i = 0; i < mass4.length ; i++) {
//            for (int j = 0; j < mass4.length; j++) {
//                mass4[i][j]=counter;
//                System.out.print( mass4[i][j] + " ");
//                counter++;
//            }
//            System.out.println();
//        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        int[][] mass5 = new int[3][3];
//        for (int i = 0; i < mass5.length; i++) {
//            for (int j = 0; j < mass5.length; j++) {
//                if (mass5[i] == mass5[j]) {
//                    mass5[i][j] = 1;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(new String[]{Arrays.toString(mass5[0])}));
//        System.out.println(Arrays.toString(new String[]{Arrays.toString(mass5[1])}));
//        System.out.println(Arrays.toString(new String[]{Arrays.toString(mass5[2])}));


        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] maxl = {1,7,3,9,0,2};
        int tmpmax = -2147483648; // наверное способ так себе :( но в следующем блоке код не будет
        //работать если в массиве не будет  нуля (иначе tmpmin будет равно 0 по
        //умолчанию, а такого значения не будет в массиве)
        int tmpmin = 2147483647;
        for (int i = 0; i <maxl.length ; i++) {
            if (maxl[i] > tmpmax) {
                tmpmax = maxl[i];
            }
        }
        for (int i = 0; i <maxl.length ; i++) {
            if (maxl[i] < tmpmin) {
                tmpmin = maxl[i];
            }
        }
        System.out.println("Max: " + tmpmax);
        System.out.println("Min: " + tmpmin);

        //5
//        int[] maxl = {1,7,3,9,4,2};
//        int tmpmax = 0;
//        int tmpmin = 0;
//        for (int i = 0; i <maxl.length ; i++) {
//            if (maxl[i] > tmpmax) {
//                tmpmax = maxl[i];
//            }
//        }
//        for (int i = 0; i <maxl.length ; i++) {
//            if (maxl[i] < tmpmin) {
//                tmpmin = maxl[i];
//            }
//        }
//        System.out.println("Max: " + tmpmax);
//        System.out.println("Min: " + tmpmin);

        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        //ss





    }
}