package ru.geekbrains.lesson1;

// Пункт 1. Создать класс HomeWorkApp
public class HomeWorkApp {
  public static void main (String[] args){
    // Пункт 6. Вызвать методы из п.2-5 в методе main()
    printThreeWords();
    checkSumSign ();
    printColor();
    compareNumbers();
  }

// Пункт 2. Создать метод printThreeWords()
  public static void printThreeWords(){
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

// Пункт 3. Создать метод checkSumSign()
  public static void checkSumSign(){
    int a,b;
    a=5;
    b=3;
    if (a+b>=0){
      System.out.println("Сумма положительная");
    }
    else {
      System.out.println("Сумма отрицательная");
    }

  }

// Пункт 4. Создать метод printColor()
  public static void printColor(){
    int value;
    value=101;
    if (value <=0){
      System.out.println("Красный");
    }
    if(value>0 && value<=100){
      System.out.println("Желтый");
    }
    if (value >100){
      System.out.println("Зеленый");
    }
  }

  // Пункт 5. Создать метод compareNumbers()
  public static void compareNumbers(){
    int a,b;
    a=1;
    b=1;
    if (a>=b){
      System.out.println("a >= b");
    }
    else {
      System.out.println("a<b");
    }
  }

}
