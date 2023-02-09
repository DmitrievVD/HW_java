import java.util.*;

public class S6 {


    public static void main(String[] args) {

        MySet1 set1 = new MySet1();

        set1.myAdd(5);
        set1.myAdd(1);
        set1.myAdd(9);
        set1.myAdd(64);
        set1.myAdd(32);
        set1.myAdd(16);
        set1.myAdd(8);
        System.out.println(set1);

        System.out.println("Кол-во элементов: " + set1.mySize());

        System.out.println("Элемент по индексу 3: " + set1.myGet(3));

    }


}

class MySet1 {
    public Map<Integer, Object> set = new HashMap<>(); // Мой Set
    public static final Object OBJ = new Object(); // Создаем обьект

    public boolean myAdd(Integer o){ // Добавление элементов
        return set.put(o, OBJ) != null;
    }

    @Override
    public String toString() { // Перевод в строку
        return set.keySet().toString();
    }

    public Integer myGet(Integer i){ // получение элемента по индексу
        ArrayList<Integer> tmp = new ArrayList<>(set.keySet());
        return (Integer) tmp.get(i);
    }

    public Integer mySize(){ // Возвращает кол-во элементов
        return set.keySet().size();
    }


}






















