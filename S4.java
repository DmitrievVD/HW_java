import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class S4 {
    public static void main(String[] args) {

//        try {
//            FileWriter fw = new FileWriter("first.sql");
//            fw.append("HelloWorld!");
//            fw.flush();
//        } catch (IOException e) {
//            System.out.println("Ошибка! ");
//        }


        String str = "";
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> sex = new ArrayList<>();

        try {
            FileReader fr = new FileReader("first.sql");
            while (fr.ready()){
                str += (char) fr.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] tmp;

        tmp = str.split("\r\n");

        System.out.println(str);
        System.out.println(Arrays.toString(tmp));


        for (int i = 0; i < tmp.length; i+=5) {
            surname.add(tmp[i]);
            name.add(tmp[i+1]);
            lastname.add(tmp[i+2]);
            age.add(Integer.valueOf(tmp[i+3]));
            sex.add(tmp[i+4].contains("м"));
        }



        System.out.println(surname);
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(sex);


        int[] id = new int[name.size()];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        for(Integer i: id){
            System.out.printf("%s %s %s %d %s \n",  surname.get(i), name.get(i),  lastname.get(i), age.get(i), sex.get(i).equals(true) ? "М":"Ж");
        }


        for (int i = 0; i < age.size() - 1; i++) {
            for(int j = 0; j < age.size() - i - 1; j++) {
                if(age.get(id[j+1]) < age.get(id[j])) {
                    int swap = id[j];
                    id[j] = id[j + 1];
                    id[j + 1] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(id));

        for(Integer i: id){
            System.out.printf("%s %s %s %d %s \n",  surname.get(i), name.get(i),  lastname.get(i), age.get(i), sex.get(i).equals(true) ? "М":"Ж");
        }

    }
}
