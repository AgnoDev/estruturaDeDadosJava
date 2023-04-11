package hashMap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Joao");
        aluno.put("Idade", "17");
        aluno.put("Nota", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAluno = new ArrayList<>();

        listaAluno.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "16");
        aluno2.put("Nota", "9");
        aluno2.put("Turma", "3a");

        listaAluno.add(aluno2);

        System.out.println(listaAluno);


    }
}