package hashSet;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Set<Carro> carroHashSet = new HashSet<>();

        carroHashSet.add(new Carro("Carro 1"));
        carroHashSet.add(new Carro("Carro 2"));
        carroHashSet.add(new Carro("Carro 3"));
        carroHashSet.add(new Carro("Alfa"));
        carroHashSet.add(new Carro("Zip"));

        System.out.println(carroHashSet);


        Set<Carro> treeSetCarro = new TreeSet<>();

        treeSetCarro.add(new Carro("Carro a"));
        treeSetCarro.add(new Carro("Carro zx"));
        treeSetCarro.add(new Carro("Carro qwe"));
        treeSetCarro.add(new Carro("Alfa"));
        treeSetCarro.add(new Carro("Zip"));

        System.out.println(treeSetCarro);
//        System.out.println(setCarro.contains("Carro 4"));
//        System.out.println(setCarro.get(2));
//        System.out.println(setCarro.indexOf(new Carro("Carro 3")));
//        System.out.println(setCarro.remove(2));
//        System.out.println(setCarro);
    }
}
