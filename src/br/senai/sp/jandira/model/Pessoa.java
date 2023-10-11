package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Pessoa {

    Scanner scanner = new Scanner(System.in);

    String nome;
    String email;
    double telefone;
    int idade;



    public void cadastro(){
        System.out.println("//********** Cadastro **********//");
        System.out.println("Digite seu o nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe seu email: ");
        email = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = scanner.nextDouble();
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
    }



}
