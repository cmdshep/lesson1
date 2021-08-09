package ru.geekbrains.lesson1;



public class HomeWork2 {
  public static void main(String[] args) {
    chessSymbols();
    diagonalSymbols();
    squareDiagonalSymbol();
    twoSquaresSymbol();
    insideSquareSymbol();
    triangleSymbol();
    simpleSquareSymbol();
  }

  // Вывести в шахматном порядке
  public static void chessSymbols() {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("0");
        } else {
          System.out.print("x");
        }
      }
      System.out.println();
    }

  }

  // Вывести символы, разделенные дивагональю
  public static void diagonalSymbols() {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i > j) {
          System.out.print("x");
        } else if (i < j) {
          System.out.print("0");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  //Вывести квадрат и диагональ
  public static void squareDiagonalSymbol() {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i == 0 || i == 5 || j == 0 || j == 5 || i == j) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  //Вывести 2 квадрата
  public static void twoSquaresSymbol(){
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i<=1&&j>=4||i>=4&&j<=1) {
          System.out.print(" ");
        } else {
          System.out.print("x");
        }
      }
      System.out.println();
    }
  }
  //Вывести пустой квадрат внутри
  public static void insideSquareSymbol(){
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i>=2 && i<=3 && j>=2 && j<=3) {
          System.out.print(" ");
        } else {
          System.out.print("x");
        }
      }
      System.out.println();
    }
  }
  //Вывести реугольник из символов
  public static void triangleSymbol(){
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i==5||j==0||i==j) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  // Вывести квадрат из символов
  public static void simpleSquareSymbol(){
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i==0||i==5||j==0||j==5) {
          System.out.print("x");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
