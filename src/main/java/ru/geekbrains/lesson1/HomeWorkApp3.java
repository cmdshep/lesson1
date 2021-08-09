package ru.geekbrains.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp3 {

  public static void main(String[] args) {
    System.out.println("Задание 1:");
    inverseArray();
    System.out.println("Задание 2:");
    hundredSymbolsArray();
    System.out.println("Задание 3:");
    multiplyMoreThanSix();
    System.out.println("Задание 4:");
    squareArray();
    System.out.println("Задание 5:");
    stringElementsInArray(4, "Значение");
    System.out.println("Задание 6*:");
    minAndMaxInArray();
    //System.out.println("Задание 6* (улучшенный вариант: вводим длину массива и границы значений в консоли):");
    //searchMinAndMaxInArrayMethod2();
    System.out.println("Задание 7**:");
    System.out.println(arraysSumEquals(new int[]{2, 2, 2, 1, 2, 2, 10, 1})); // результат true
    System.out.println("Задание 8***:");


  }

  /* Задание 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
  С помощью цикла и условия заменить 0 на 1, 1 на 0;
   */
  public static void inverseArray() {
    int[] arr = {1, 0, 0, 1, 0, 1, 0, 1};
    System.out.println("Исходный массив\n" + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }
    System.out.println("Инверсный массив\n" + Arrays.toString(arr));
  }

  /* Задание 2. Задать пустой целочисленный массив длиной 100.
   С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
  public static void hundredSymbolsArray() {
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    System.out.println(Arrays.toString(arr));
  }

  /* Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа
  меньшие 6 умножить на 2*/
  public static void multiplyMoreThanSix() {
    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("Исходный массив\n" + Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 6) {
        arr[i] *= 2;
      }
    }
    System.out.println("Массив(если arr[i]<6, то arr[i]*2)\n" + Arrays.toString(arr));
  }

  /* Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
   и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
    диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
    принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
   */
  public static void squareArray() {
    int[][] arr = new int[5][5];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i == j || (i + j == arr.length - 1)) {
          arr[i][j] = 1;
        }
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  /* Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
   массив типа int длиной len, каждая ячейка которого равна initialValue;
   */
  public static void stringElementsInArray(int len, String initialValue) {
    String[] arr = new String[len];
    for (int i = 0; i < len; i++) {
      arr[i] = initialValue;
    }
    System.out.println(Arrays.toString(arr));
  }

  /* Задание 6.* Задать одномерный массив и найти в нем минимальный и максимальный элементы */

  public static void minAndMaxInArray() {
    int[] arr = {-3, -1, -5, -6, -7, -5, -12, -5};
    int min = arr[0]; // min!= 0, а min = arr[0] для того, чтобы исключить случай, когда в массиве отсутствуют значения <=0
    int max = arr[0]; // max!= 0, а max = arr[0] для того, чтобы исключить случай, когда в массиве отсутствуют значения =>0
    System.out.println("Исходный массив\n" + Arrays.toString(arr));
    for (int j : arr) {
      if (j < min) {
        min = j;
      }
      if (j > max) {
        max = j;
      }
    }
    System.out.println("min=" + min + " max=" + max);
  }

  /*Задание 6. Боллее универсальный способ. С использованием инструментов классов Scanner и Math*/
  public static void searchMinAndMaxInArrayMethod2() {

    // Ввод длины массива
    Scanner elements = new Scanner(System.in);
    System.out.println("Введите длину массива:");
    int i = elements.nextInt();

    int[] arr = new int[i]; // Объявление массива длины i

    // Ввод нижней границы значений массива
    Scanner minVal = new Scanner(System.in);
    System.out.println("Введите нижнюю границу значений массива:");
    int minBorder = minVal.nextInt();

    // Ввод верхней границы значений массива
    Scanner maxVal = new Scanner(System.in);
    System.out.println("Введите верхнюю границу значений массива:");
    int maxBorder = maxVal.nextInt();

    // Заполнение массива рандомными значениями с учетом указанных границ.
    for (int j = 0; j < arr.length; j++) {
      arr[j] = (int) (Math.random() * (maxBorder - minBorder) + (minBorder)); // смысл формулы описан на сайте https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
    }

    // Вывод сформированного массива
    System.out.println("Сформированный массив:\n" + Arrays.toString(arr));

    //Объявление переменных min и max и присвоения им значений arr[0]
    int min = arr[0];
    int max = arr[0];

    // Вычисление минимума и максимума
    for (int k : arr) {
      if (k < min) {
        min = k;
      }
      if (k > max) {
        max = k;
      }
    }
    System.out.println("min=" + min + " max=" + max);
  }
  /* Задание 7**. Написать метод, в который передается не пустой одномерный целочисленный массив,
  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
  Примеры:
  checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
  checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
  */
  public static boolean arraysSumEquals(int[] arr) {
    int leftSum = 0;
    int rightSum = 0;
    for (int j : arr) {
      rightSum += j;
    }
    for (int j : arr) {
      if (leftSum == rightSum) {
        return true;
      }
      leftSum += j;
      rightSum -= j;
    }
    return false;
  }
}