package com.codegym.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/* 
Number algorithms

*/
public class Solution {

    public static long[] getNumbers(long N) {
        long[] result = null;
        TreeSet<Long> numbers = new TreeSet<>();

        //Массив степеней
        final int SIZE = 12;
        long[][] powLst = new long[SIZE][SIZE];

        //Здесь лежит нарезка цифр
        int[] lst = new int[20];


        label:
        for (long i = 1; i < N; i++) {
            // 1.Отбраковываем числа у которых сумма цифр одинаковая (сокращаем до 200 000 тыс варинтов и менее)
            // 2.Получаем нарезку цифр в виде массива
            long x = i;
            int lenCount = 0;
            int current;
            int last = Integer.MAX_VALUE;
            while (x != 0) {
                current = (int) (x % 10);
                if ((current != 0 && last != 0) && last < current)
                    continue label;
                last = current;
                lst[lenCount] = current;
                x = x / 10;
                lenCount++;
            }

            //3. Считаем степень, и заполняем таблицу степеней
            //Находим сумму степеней цифр числа, например сюда поступило 037 с пункта 2
            long summa1 = 0;
            for (int j = 0; j < lenCount; j++) {
                if (powLst[lst[j]][lenCount] == 0) { //Если в массиве степеней еще нет значения
                    long a1 = lst[j];
                    if (a1 != 0 && a1 != 1) {          //Если цифра 0 или 1, то смысла считать степень нет
                        long a2 = lst[j];
                        for (int jj = 1; jj < lenCount; jj++) //Считаем степень
                            a1 *= a2;
                    }
                    powLst[lst[j]][lenCount] = a1;//Добавляем в массив степеней новое значение
                }
                summa1 += powLst[lst[j]][lenCount];
            }
            //Например, Сумма степеней получилось = 370

            //4. Получаем нарезку цифр
            long xx = summa1;
            lenCount = 0;
            while (xx != 0) {
                lst[lenCount] = (int) (xx % 10);
                lenCount++;
                xx = xx / 10;
            }

            //5. Из полученной суммы берем сумму степеней, для проверки на  число амстронга
            long summa2 = 0;
            for (int j = 0; j < lenCount; j++) {
                if (powLst[lst[j]][lenCount] == 0) { //Если в массиве степеней еще нет значения
                    long a1 = lst[j];
                    if (a1 != 0 && a1 != 1) {          //Если цифра 0 или 1, то смысла считать степень нет
                        long a2 = lst[j];
                        for (int jj = 1; jj < lenCount; jj++) //Считаем степень
                            a1 *= a2;
                    }
                    powLst[lst[j]][lenCount] = a1;//Добавляем в массив степеней новое значение
                }
                summa2 += powLst[lst[j]][lenCount];
            }

            //6. Добавляем результат
            if (summa1 == summa2 && summa1 < N)
                numbers.add(summa1);
        }
        result = new long[numbers.size()];

        int count = 0;
        for (Long l : numbers) {
            result[count] = l;
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
