package com.br.students.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static Scanner scanner;//foi declarado o método que irá ser utilizado no projeto no inicio da classe
    private static List<String> listStudents;//foi mudado o nome da variavel, para o código ser mais legivel
    private static boolean run;
    private static String option,name;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        listStudents = new ArrayList<String>();
        run = true;

        while (run) {
            exibeMenu(); // Quebrando o código em métodos menores
            if (option.equals("1")) {
                cadastraUsuario(); // Quebrando o código em métodos menores
            } else if (option.equals("2")) {
                listaUsuarios(); // Quebrando o código em métodos menores
                run = false;
            } else {
                System.out.println("Digite uma opção válida");
            }
        }
        scanner.close();
    }

    private static void exibeMenu() {
        System.out.println("Menu");
        System.out.println("Digite 1 para inserir o estudante ");
        System.out.println("Digite 2 para imprimir a lista ");

        option = scanner.nextLine();
    }

    private static void listaUsuarios(){
        System.out.println("Listando ...");
        listStudents.forEach(System.out::println); // Trocando loop por lambda Function (arrow function)
    }

    private static void cadastraUsuario(){
        System.out.println("Digite o nome do aluno: ");
        name = scanner.nextLine();
        if (!listStudents.contains(name)) {
            listStudents.add(name);
        } else {
            System.out.println("O aluno já esta cadastrado!");
        }
    }
}
