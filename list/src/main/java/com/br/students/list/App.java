package com.br.students.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static Scanner scanner;//foi declarado o método que irá ser utilizado no projeto no inicio da classe
    private static List<String> listaUsuarios;//foi mudado o nome da variavel, para o código ser mais legivel
    private static boolean run;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        listaUsuarios = new ArrayList<String>();
        run = true;

        while (run) {
            System.out.println("Menu");
            System.out.println("Digite 1 para inserir o estudante ");
            System.out.println("Digite 2 para imprimir a lista ");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Digite o nome do aluno: ");

                String name = scanner.nextLine();
                if (!listaUsuarios.contains(name)) {
                    listaUsuarios.add(name);
                } else {
                    System.out.println("O aluno já esta cadastrado!");
                }

            } else if (option.equals("2")) {
                System.out.println("Listando ...");
                for (String student : listaUsuarios) {
                    System.out.println(student);
                }
                run = false;
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
        scanner.close();
    }
}
