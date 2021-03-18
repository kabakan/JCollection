package com.example.algoritm.quicksort;

import java.util.Arrays;

public class QuickSort {

  public static void quickSort(int[] array, int low, int high) {
    if (array.length == 0)  return;//завершить выполнение если длина массива равна 0
    if (low >= high)        return;//завершить выполнение если уже нечего делить

    // выбрать опорный элемент
    int middle = low + (high - low) / 2;
    int opora = array[middle];

    // разделить на подмассивы, который больше и меньше опорного элемента
    int i = low, j = high;

    while (i <= j) {
      while (array[i] < opora) {
        i++;
      }
      while (array[j] > opora) {
          j--;
      }
      if (i <= j) {//меняем местами
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    }

    // вызов рекурсии для сортировки левой и правой части
    if (low < j)  quickSort(array, low, j);
    if (high > i) quickSort(array, i, high);
  }


  public static void main(String[] args) {
    int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
    System.out.println("Было");
    System.out.println(Arrays.toString(x));

    int low = 0;
    int high = x.length - 1;

    quickSort(x, low, high);
    System.out.println("Стало");
    System.out.println(Arrays.toString(x));

    int[] array = {6};
    int i = array[0];
    System.out.println("opora "+i);

    //------------z-----------
    int[] z = {20,5,100,98,-2,0};
    System.out.println("Было z");
    System.out.println(Arrays.toString(z));

    low = 0;
    high = z.length - 1;
    quickSort(z, low, high);
    System.out.println("Стало z");
    System.out.println(Arrays.toString(z));

    changeArray(z);
    System.out.println("Измененный z");
    System.out.println(Arrays.toString(z));
  }

  public static void changeArray(int[] array) {
     for (int i=0; i < array.length; i++) {
       array[i] = array[i]+1;
     }
  }

}

