package ru.geekbrains.lesson1;

import java.util.Arrays;

public class HomeWorkApp3 {

  public static void main(String[] args) {
    System.out.println("Задание 1:");
    inverseArray ();
    System.out.println("Задание 2:");
    hundredSymbolsArray();
    System.out.println("Задание 3:");
    multiplyMoreThanSix();
    System.out.println("Задание 4:");
    squareArray();
    System.out.println("Задание 5:");
    stringElementsInArray(4,"Значение");
  }
  /* Задание 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
  С помощью цикла и условия заменить 0 на 1, 1 на 0;
   */
  public static void inverseArray (){
    int [] arr=  {1,0,0,1,0,1,0,1};
    System.out.println("Исходный массив\n"+ Arrays.toString(arr));
    for (int i=0; i<arr.length; i++){
      if (arr[i]==1){
        arr [i]=0;
      }
      else {
        arr[i]=1;
      }
    }
    System.out.println("Инверсный массив\n"+ Arrays.toString(arr));
  }

  /* Задание 2. Задать пустой целочисленный массив длиной 100.
   С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/
  public static void hundredSymbolsArray(){
    int [] arr = new int [100];
    for (int i=0; i<arr.length;i++){
      arr[i]=i+1;
    }
    System.out.println(Arrays.toString(arr));
  }
/* Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа
меньшие 6 умножить на 2*/
  public static void multiplyMoreThanSix(){
    int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println("Исходный массив\n"+ Arrays.toString(arr));
    for (int i=0;i<arr.length;i++){
      if (arr[i]<6){
        arr[i]*=2;
      }
    }
    System.out.println("Массив(если arr[i]<6, то arr[i]*2)\n"+ Arrays.toString(arr));
  }

  /* Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
   и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
    диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
    принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
   */
  public static void squareArray(){
    int [] [] arr = new int [5] [5];
    for (int i=0; i<arr.length; i++){
      for (int j=0; j<arr[i].length; j++){
        if (i==j || (i+j==arr.length-1)){
          arr [i] [j] = 1;
        }
        System.out.print(arr [i] [j] + " ");
      }
      System.out.println();
    }
  }

  /* Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
   массив типа int длиной len, каждая ячейка которого равна initialValue;
   */
public static void stringElementsInArray(int len, String initialValue){
  String [] arr = new String [len];
  for (int i=0; i<len; i++){
    arr [i]= initialValue;
    System.out.print(arr[i]+" ");
    }
  }
}