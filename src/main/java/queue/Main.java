package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Queue<Carro> queueCarro = new LinkedList<>();

        queueCarro.add(new Carro("carro 1"));
        queueCarro.add(new Carro("carro 2"));
        queueCarro.add(new Carro("carro 3"));
        queueCarro.add(new Carro("carro 4"));

        System.out.println(queueCarro.add(new Carro("carro 5")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.offer(new Carro("carro 6")));
        System.out.println(queueCarro);

        System.out.println(queueCarro.peek());
        System.out.println(queueCarro);

        System.out.println(queueCarro.poll());
        System.out.println(queueCarro);

        System.out.println(queueCarro.isEmpty());

    }
}
