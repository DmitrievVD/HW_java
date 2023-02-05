import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

public class HW5 {
    public static void main(String[] args) {

//        1.Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> map = new HashMap<>();


//        2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)

        map.put(0, "White");
        map.put(1, "Green");
        map.put(3, "Black");
        map.putIfAbsent(4, "Blue");

        System.out.println(map);


//        3.Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.

        for (Integer key : map.keySet()) {
            map.put(key, map.get(key) + "!");
        }

        System.out.println(map);

        TreeMap<Integer, String> treemap = new TreeMap<>();

        for (Integer key : map.keySet()) {
            treemap.put(key, map.get(key));
        }
        System.out.println(treemap);

//        4.*Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        Random rnd = new Random();

        for (int i = 0; i < 1000; i++) {
            map.put(rnd.nextInt(1, 1000), "aaa");
            treemap.put(rnd.nextInt(1, 1000), "aaa");
        }


//        5.**Сравнить время прямого и случайного перебора тысячи элементов словарей.
        long begin1 = System.currentTimeMillis();

        Iterator<Integer> iterator = treemap.keySet().iterator(); // Перебор через итератор
        while (iterator.hasNext()) {

            int i = iterator.next();
            System.out.println(treemap.get(i));
        }

        long end1 = System.currentTimeMillis();


        long begin2 = System.currentTimeMillis();

        System.out.println(treemap); // Перебор через println

        long end2 = System.currentTimeMillis();


        long begin3 = System.currentTimeMillis();

        Iterator<Integer> iterator1 = treemap.keySet().iterator(); // Перебор через итератор
        while (iterator1.hasNext()) {

            int i = iterator1.next();
            System.out.println(map.get(i));
        }

        long end3 = System.currentTimeMillis();


        long begin4 = System.currentTimeMillis();

        System.out.println(map); // Перебор через println

        long end4 = System.currentTimeMillis();


        System.out.println("----------------------"); // Просто разделители для красивого вывода
        System.out.println("Перебор словоря HashMap: \nСлучайный: " + (end1 - begin1) + "\nПрямой: " + (end2 - begin2));
        System.out.println("----------------------");

        System.out.println("Перебор словоря TreeMap: \nСлучайный: " + (end3 - begin3) + "\nПрямой: " + (end4 - begin4));
        System.out.println("----------------------");


    }
}
