package aula.dois;

/*Esse programa foi feito só para ilustrar diferentes formas
de declaração de tipos em java. Mostrando o que não fazer
assim como padrões e boas práticas.
 */

public class Tipos {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;


        short s1 = 20000;
        //Valor de s2 está fora dos valores possiveis para um short
        //short s2 = 40000; x

        //Valor de i1 está fora dos valores possiveis para um int
        //int i1 = -1000000000000; x
        int i2 = 28500;

        //Ao se declarar um long, deve-se colocar um L no final do valor
        //, se não ele é detectado como um int
        //long l1 = 100000000000000; x
        long l2 = 2040050050505550L;

        //Ao se declarar um float, deve se colocar um f no final do valor
        //, se não, ele é detectado como um double
        //float f1 = 4.5; x
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04d;

        char c1 = 'W';
        //Char devem conter apenas um caracterer
        //char c2 = 'Tw'; x
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Fulana";
        String st3 = "lorem ipsum iiasidsa KSA 8784212";

        //Por mais que seja possivei colocar uma data como string, deve-se
        //buscar tipos de dados mais adequados em aplicações reais
        String dt1 = "21/12/2012";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
