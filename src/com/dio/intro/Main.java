package com.dio.intro;

public class Main {
    public static void main(String[] args) {
        int i;
        int I;
        //int 1a; nao pode comecar com numero
        //int _1a; nao eh recomendado usar underline
        //int $aq; nao eh recomendado usar $

        i = 2;
        I = 54;

        final int j = 20;
        //j = 15; erro pq marcamos como constante antes e nao pode ser mudado

        int quantidadeProduto = 50;
        //int QuantidadeProduto; nao recomendado comecar com maiusculo
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; nao recomendado
        int QUANTIDADE_OPCOES = 25; // nao recomendado
        //int qtdProd; nao eh expressivo

        System.out.println(i);
        System.out.println(I);
        System.out.println(j);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

        // Aula 2: criar variaveis com os tipos de dados apresentados

        byte b1 = 10;
        byte b2 = 25;

        short s1 = 2458;
        short s2 = 9546;

        int i1 = -468452444;
        int i2 = 584554;

        long l1 = 4111112222L;
        long l2 = 51444441213333L;

        //float f1 = 4.265; seria um double
        float f2 = 22.55F;

        double d1 = 85.51;
        double d2 = 41.4;

        char c1 = 'a';
        //char c2 = 'te'; serve para apenas um caracter
        char c3 = '\u0057';

        String st1 = "fulano";
        String st2 = "Bruaca";
        String st3 = "A bee seed 111";

        // String dt1 = "09/10/2222"; nao recomendado

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

        // Aula 3: Usar operadores aritmeticos
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmetico");
        aritmetico();
        System.out.println("Atribuicao");
        atribuicao();
        System.out.println("Precedencia");
        precedencia();

        // Exercise: calculate area of quadrilaterals
        System.out.println("Area of quadrilaterals");
        QuadArea.area(d2);
        QuadArea.area(d1,d2);
        QuadArea.area(3,7,5);
        QuadArea.area(f2,22f);

    }

    private static void prePos() {
       int k = 10;
       int i = ++k;
       int j = k--;
       int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b " + r1);
        System.out.println("c-a " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);
    }

    private static void atribuicao() {
        int i = 1500;
        short j = 15;
        long k = 500L;
        int l = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 7;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);


    }

    private static void precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30

        System.out.println("i++ + --j * k " + a);

        System.out.println("i: " + i);

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1

        System.out.println("k / --i % 3 + 1 " + b);

        System.out.println("i: " + i);

        int c = 2;

        c *= i +=5; // c = 2 * i; i = i + 5

        System.out.println("c *= i +=5: " + c);
    }
}
