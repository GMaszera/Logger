package org.example.entities;

import java.util.Scanner;

public class Mechanism {

    public void menuLogin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Usuário: ");
        String name = in.next();
        System.out.print("Senha: ");
        Integer passwd = in.nextInt();
        Aut a = new Aut(name, passwd);

    }
}
