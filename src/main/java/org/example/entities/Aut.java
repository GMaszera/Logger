package org.example.entities;

public class Aut {
    private String name;
    private Integer passwd;

    public Aut(String name, Integer passwd) {
        this.name = name;
        this.passwd = passwd;
        letsLogin();
    }

    void letsLogin() {
        Users a = new Users();
        Passwords ab = new Passwords();
        Mechanism ac = new Mechanism();
        if (name.equals(a.getUser1()) && passwd.equals(ab.getPasswd1())) {
            System.out.println("Logando..");
        } else if (name.equals(a.getUser2()) && passwd.equals(ab.getPasswd2())) {
            System.out.println("Logando..");
        } else if (name.equals(a.getUser3()) && passwd.equals(ab.getPasswd3())) {
            System.out.println("Logando..");
        } else if (name.equals(a.getUser4()) && passwd.equals(ab.getPasswd4())) {
            System.out.println("Logando..");
        } else {
            System.out.println("Usuário ou senha incorreto.");
            ac.menuLogin();
        }
    }
}
