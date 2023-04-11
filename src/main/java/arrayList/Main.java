package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Carro 1"));
        listaCarro.add(new Carro("Carro 2"));
        listaCarro.add(new Carro("Carro 3"));
        System.out.println(listaCarro);
        System.out.println(listaCarro.contains("Carro 4"));
        System.out.println(listaCarro.get(2));
        System.out.println(listaCarro.indexOf(new Carro("Carro 3")));
        System.out.println(listaCarro.remove(2));
        System.out.println(listaCarro);
    }
}
