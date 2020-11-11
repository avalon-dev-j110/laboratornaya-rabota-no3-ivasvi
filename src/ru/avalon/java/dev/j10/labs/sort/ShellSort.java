package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
        //Разбиваем массив на подмассивы, которые состоят из элементов, находящихся 
        //на фиксированном "расстоянии" друг от друга. 
        //На каждой итерации сортируем подмассивы, затем уменьшаем "расстояние" вдвое.
        for (int distance = array.length / 2; distance > 0; distance /= 2) {
            insertionDistanceSort(array, distance);
        }
    }

    //Сортировка вставками в подмассивах, которые получаются если рассматривать 
    //элементы только на фиксированном "расстоянии" друг от друга.
    private void insertionDistanceSort(int[] array, int distance) {
        int tmp;
        int j;
        for (int i = distance; i < array.length; i++) {
            tmp = array[i];
            j = i;
            while ((j > distance - 1) && array[j] < array[j - distance]) {
                swap(array, j, j - distance);
                j = i - distance;
            }
        }
    }
}
