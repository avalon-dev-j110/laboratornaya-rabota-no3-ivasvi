/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 *
 * @author Meerkat
 */
public class InsertionSort implements Sort{

    @Override
    public void sort(int[] array) {
        int tmp;
        int j;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            j = i;
            while (j > 0 && array[ j ] < array[j - 1]){
                swap(array, j, j - 1);
                j--;
            }
        }
    }   
}
