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

        for (int i = 0; i < set1.mySize(); i++) {
            System.out.println(set1.myGet(i));
        }



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

    public Integer myGet(Integer u){ // получение элемента по индексу
        return (Integer) set.keySet().toArray()[u];
    }

    public Integer mySize(){ // Возвращает кол-во элементов
        return set.keySet().size();
    }


}






















