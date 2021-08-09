package ru.geekbrains.lesson1;

public class HomeWorkApp2 {
  public static void main(String[] args) {
    System.out.println("Задание 1");
    System.out.println(sumComparison(1, 6));
    System.out.println("Задание 2");
    positiveOrNegative(-10);
    System.out.println("Задание 3");
    System.out.println(positiveOrNegativeBool(-3));
    System.out.println("Задание 4");
    numberAndString("Вывод строки i раз", 5);
    System.out.println("Задание 5");
    System.out.println(leapOrNotLeapYear(1992));
  }

  /* Задание 1. Написать метод, принимающий на вход два целых числа и проверяющий,
  что их сумма лежит в пределах от 10 до 20 (включительно),если да – вернуть
  true, в противном случае – false.*/
  public static boolean sumComparison(int a, int b) {
    int sum = a + b;
    return sum > 10 && sum < 20;
  }

  /* Задание 2. Написать метод, которому в качестве параметра передается целое число,
   метод должен напечатать в консоль, положительное ли число передали
   или отрицательное. Замечание: ноль считаем положительным числом.*/
  public static void positiveOrNegative(int a) {
    if (a >= 0) {
      System.out.println("Число положительное");
    } else {
      System.out.println("Число отрицательное");
    }
  }

  /* Задание 3. Написать метод, которому в качестве параметра передается целое число.
  Метод должен вернуть true, если число отрицательное, и вернуть false если
  положительное.
   */
  public static boolean positiveOrNegativeBool(int a) {
    return a < 0;
  }

  /* Задание 4. Написать метод, которому в качестве аргументов передается строка
   и число, метод должен отпечатать в консоль указанную строку,
   указанное количество раз;*/
  public static void numberAndString(String str, int i) {
    int j;
    for (j = 0; j < i; j++) {
      System.out.println(str);
    }
  }

  /* Задание 5.* Написать метод, который определяет, является ли год високосным,
  и возвращает boolean (високосный - true, не високосный - false).
   Каждый 4-й год является високосным, кроме каждого 100-го, при этом
   каждый 400-й – високосный. */
  public static boolean leapOrNotLeapYear(int year) {
    return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
  }
}
