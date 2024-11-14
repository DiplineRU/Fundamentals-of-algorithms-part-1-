ru text

#  **Основы алгоритмов (часть 2)**

> На связи домашнее задание основ алгоритмов, часть 2.
В сегодняшней работе требуется написать еще одну реализацию интерфейса из прошлого домашнего задания, но с дополнительными методами.

Необходимо:

1. Написать вторую реализацию интерфейса списка (скопировать и скорректировать первую) из прошлого домашнего задания, но «подогнать» под работу с целыми числами, используя ссылочный тип Integer.
2. Добавить в реализацию приватный метод с самой быстрой из рассмотренных сортировок.
   
Для выявления самой быстрой сортировки следует сравнить сортировки по времени выполнения на случайно сгенерированном массиве со 100 000 элементов.

Замерить можно следующим кодом:

```
long start = System.currentTimeMillis();
ваш_метод_сортировки(arr);
System.out.println(System.currentTimeMillis() - start);
```

Учесть, что для сравнения сортировок нужно использовать 3 разные копии массива, т. к. сортировать уже отсортированный ранее массив некорректно.

Код самого сравнения прикладывать по желанию.

3. Добавить в реализацию приватный метод бинарного поиска.
Учесть, что метод contains уже был реализован в прошлом ДЗ.

Его следует переработать, осуществив сортировку (реализованную в шаге 2) и вызвав метод бинарного поиска.


eng text

#  **Fundamentals of algorithms (part 2)**

> In touch with the homework of the basics of algorithms, part 2.
In today's work, it is required to write another implementation of the interface from the previous homework, but with additional methods.

Necessary:

1. Write a second implementation of the list interface (copy and correct the first one) from the previous homework, but "adjust" it to work with integers using the Integer reference type.
2. Add a private method to the implementation with the fastest of the considered sorts.
   
To identify the fastest sort, you should compare the run-time sort on a randomly generated array with 100,000 elements.

You can measure it with the following code:

```
long start = System.currentTimeMillis();
your_sorting_method(arr);
System.out.println(System.currentTimeMillis() - start);
```
Note that to compare the sorts, you need to use 3 different copies of the array, because it is incorrect to sort the previously sorted array.

The code of the comparison itself can be applied at will.

3. Add a private binary search method to the implementation.
Note that the contains method has already been implemented in the past.

It should be reworked by performing the sorting (implemented in step 2) and calling the binary search method.
