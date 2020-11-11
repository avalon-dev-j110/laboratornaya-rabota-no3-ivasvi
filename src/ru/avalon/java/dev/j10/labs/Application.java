package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.InsertionSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    public static void main(String[] args) 
    {
        int[] array;

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
        
        //0. Инициализировать переменную array массивом из 20 целых чисел.
        array = new int[20];
        
        //1. Проинициализировать массив значениями
	//   последовательности чисел Фибоначчи.        
        FibonacciInitializer fibIni = new FibonacciInitializer();        
        printArray(array);
        System.out.println("\n\nИнициализация числами Фибоначчи");          
        fibIni.initialize(array);
        printArray(array);
        
        //2. Найти сумму элементов массива.
        System.out.println("Сумма чисел Фибоначчи = " + sumArray(array));
        
        //3. Проинициализировать массив последовательностью
        //   случайных чисел в диапазоне от -50 до 50.
        System.out.println("\n\nИнициализация случайными числами");        
        RandomInitializer ranIni = new RandomInitializer(-50,50);
        ranIni.initialize(array);
        printArray(array);
        
        //4. Отсортировать массив с использованием
	//   пузырьковой сортировки.
        System.out.println("\n\nСортировка пузырьками");
        BubbleSort bubSrt = new BubbleSort();
        bubSrt.sort(array);
        printArray(array);
        
        //5. Проинициализировать массив последовательностью
        //   случайных чисел в диапазоне от -50 до 50.
        System.out.println("\n\nИнициализация случайными числами");
        ranIni.initialize(array);
        printArray(array);   
        
        //6. Отсортировать массив с использованием
        //   сортировки выбором.    
        System.out.println("\n\nСортировка выбором");    
        SelectionSort selSrt = new SelectionSort();       
        selSrt.sort(array);
        printArray(array);
        
        // 7. Проинициализировать массив последовательностью
        // случайных чисел в диапазоне от -50 до 50.
        System.out.println("\n\nИнициализация случайными числами");   
        ranIni.initialize(array);     
        printArray(array);           
              
        // 8. Отсортировать массив с использованием
        // сортировки Шелла.
        System.out.println("\n\nСортировка Шелла");    
        ShellSort shellSrt = new ShellSort();       
        shellSrt.sort(array);
        printArray(array);         
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("\n==========================");
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
