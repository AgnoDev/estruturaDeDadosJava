package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("Carro 1"));
        stackCarro.push(new Carro("Carro 2"));
        stackCarro.push(new Carro("Carro 3"));
        System.out.println(stackCarro);

        stackCarro.pop();
        System.out.println(stackCarro);

        System.out.println(stackCarro.peek());
        System.out.println(stackCarro.empty());

    }
}
