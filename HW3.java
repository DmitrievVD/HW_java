import java.util.*;

public class HW3 {
    public static void main(String[] args) {

//        1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        ArrayList <String> str_arr = new ArrayList<>();
        str_arr.add("Hi");
        str_arr.add("Blue");
        str_arr.add("World");
        str_arr.add("Black");
        str_arr.add("1234");
        str_arr.add("White");

        System.out.println(str_arr);

//        2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        ArrayList<String> tmp_arr = new ArrayList<>();

        Iterator<String> iterator = str_arr.iterator();
        while (iterator.hasNext()){
            String str = iterator.next() + "!";
            tmp_arr.add(str);
        }

        str_arr.clear();
        str_arr.addAll(tmp_arr);

        System.out.println(str_arr);



//        3.Вставить элемент в список в первой позиции.

        str_arr.add(1, "Add el");
        System.out.println(str_arr);

//        4.Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(str_arr.get(4));


//        5.Обновить определенный элемент списка по заданному индексу.

        str_arr.set(5, "neww");
        System.out.println(str_arr);



//        6.Удалить третий элемент из списка.

        str_arr.remove(2);
        System.out.println(str_arr);




//        7.Поиска элемента в списке по строке.

        System.out.println(str_arr.contains("Black!"));




//        8.Создать новый список и добавить в него несколько елементов первого списка.

        ArrayList<String> new_arr = new ArrayList<>();

        for (int i = 0; i < str_arr.size(); i += 2 ) {
            new_arr.add(str_arr.get(i));
        }

        System.out.println(new_arr);


//        9.Удалить из первого списка все элементы отсутствующие во втором списке.

        tmp_arr.clear();
        tmp_arr.addAll(str_arr);
        tmp_arr.removeAll(new_arr);
        str_arr.removeAll(tmp_arr);
        System.out.println(str_arr);



//        10.*Сортировка списка.

        ArrayList<Integer> int_arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            int_arr.add(rnd.nextInt(8));
        }

        System.out.println(int_arr);

        Collections.sort(int_arr);
        System.out.println(int_arr);


    }
}
