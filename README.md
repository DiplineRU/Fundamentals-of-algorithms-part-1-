ru text

#  **Основы алгоритмов (часть 1)**

> Ваша задача: написать свою реализацию ArrayList. В данной задаче он должен работать только со строками.

Дан интерфейс:

```
public interface StringList {

  String add(String item);
// Добавление элемента.
// Вернуть добавленный элемент
// в качестве результата выполнения.

  String add(int index, String item);
// Добавление элемента
// на определенную позицию списка.
// Если выходит за пределы фактического
// количества элементов или массива,
// выбросить исключение.
// Вернуть добавленный элемент
// в качестве результата выполнения.

  String set(int index, String item);
// Установить элемент
// на определенную позицию,
// затерев существующий.
// Выбросить исключение,
// если индекс больше
// фактического количества элементов
// или выходит за пределы массива.

  String remove(String item);
// Удаление элемента.
// Вернуть удаленный элемент
// или исключение, если подобный
// элемент отсутствует в списке.

  String remove(int index);
// Удаление элемента по индексу.
// Вернуть удаленный элемент
// или исключение, если подобный
// элемент отсутствует в списке.

  boolean contains(String item);
// Проверка на существование элемента.
// Вернуть true/false;

  int indexOf(String item);
// Поиск элемента.
// Вернуть индекс элемента
// или -1 в случае отсутствия.

  int lastIndexOf(String item);
// Поиск элемента с конца.
// Вернуть индекс элемента
// или -1 в случае отсутствия.

  String get(int index);
// Получить элемент по индексу.
// Вернуть элемент или исключение,
// если выходит за рамки фактического
// количества элементов.

  boolean equals(StringList otherList);
// Сравнить текущий список с другим.
// Вернуть true/false или исключение,
// если передан null.

  int size();
// Вернуть фактическое количество элементов.

  boolean isEmpty();
// Вернуть true,
// если элементов в списке нет,
// иначе false.

  void clear();
// Удалить все элементы из списка.

  String[] toArray();
// Создать новый массив
// из строк в списке
// и вернуть его.
}
```
Напишите реализацию этого интерфейса, выполнив все его методы. В качестве хранилища используйте массив.

В конструкторе должен задаваться размер массива внутри.

Список не должен добавлять или хранить в себе null. Т. е. в случае удаления элемента нужно смещать все элементы на ячейку влево, а при добавлении в середину или начало — на ячейку вправо.

По желанию можно реализовать расширение массива.

Рекомендуется написать свои исключения и выбрасывать их в тех ситуациях, которые описаны в интерфейсе. Если в какой-то из методов в качестве параметра приходит null, выбросить исключение.





eng text

#  **Fundamentals of algorithms (part 1)**

> Your task is to write your own ArrayList implementation. In this task, it should only work with strings.

The interface is given:

```
public interface StringList {

  String add(String item);
// Adding an element.
// Return the added element
// as the result of execution.

  String add(int index, String item);
// Adding an item
// to a specific position in the list.
// If it goes beyond the actual
// number of elements or array,
// throw an exception.
// Return the added element
// as the result of execution.

  String set(int index, String item);
// Set the element
// to a certain position,
// erasing the existing one.
// Throw an exception
// if the index is greater
// than the actual number of elements
// or goes beyond the array.

  String remove(String item);
// Deleting an item.
// Return a deleted item
// or an exception if a similar
// item is missing from the list.

  String remove(int index);
// Deleting an element by index.
// Return a deleted element
// or an exception if a similar
// element is missing from the list.

  boolean contains(String item);
// Checking for the existence of an element.
// Return true/false;

  int indexOf(String item);
// Searching for an item.
// Return the index of the item
// or -1 if missing.

  int lastIndexOf(String item);
// Searching for an item from the end.
// Return the index of the item
// or -1 if missing.

  String get(int index);
// Get an element by index.
// Return an element or an exception,
// if it goes beyond the actual
// number of elements.

  boolean equals(StringList otherList);
// Compare the current list with another.
// Return true/false or an exception,
// if null is passed.

  int size();
// Return the actual number of items.

  boolean isEmpty();
// Return true,
// if there are no items in the list,
// otherwise false.

  void clear();
// Remove all items from the list.

  String[] toArray();
// Create a new array
// from the strings in the list
// and return it.
}
```
Write an implementation of this interface by executing all its methods. Use an array as storage.

The constructor must specify the size of the array inside.

The list should not add or store null in itself. That is, in case of deleting an element, you need to shift all the elements by a cell to the left, and when adding to the middle or beginning, by a cell to the right.

Optionally, you can implement an array extension.

It is recommended to write your own exceptions and throw them in the situations described in the interface. If null comes as a parameter in any of the methods, throw an exception.
