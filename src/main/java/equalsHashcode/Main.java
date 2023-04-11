package equalsHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("carro 1"));
        listaCarros.add(new Carro("carro 2"));
        listaCarros.add(new Carro("carro 3"));

        System.out.println(listaCarros.contains(new Carro("carro 1")));
        System.out.println(new Carro("carro 1").hashCode());
        System.out.println(listaCarros);

        Carro carro1 = new Carro("abc");
        Carro carro2 = new Carro("xyz");
        System.out.println(carro1.equals(carro2));
    }
}
