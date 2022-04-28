package aula.um;

/*Esse programa foi feito só para ilustrar diferentes formas
de declaração de variaveis em java. Mostrando o que não fazer
assim como padrões e boas práticas.
 */


public class Variaveis {
    public static void main(String[] args) {
        int i;
        //int i;
        int I;
        //int 1a;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        //Deve-se evitar iniciar variaveis com _ ou $
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //Váriavel final não pode ser atribuída um novo valor
        //j = 15;

        int asrn24678md = 0;
        //Não se pode usar espaço em variaveis
        //int asrn246 78md;
        //Embora permitido, deve-se evitar usar $ e _ em declaração de variaveis normais
        int asrn2$4678_md = 10;
        //Não se pode usar o caractere especial para declaração de variavies
        //int asrn2$46%78_md;

        int quantidadeProduto = 50;
        int QuantidadeProduto;
        //Padrão para variaveis final é UPPERCASE_NAME
        final int NUMERO_TENTATIVAS = 5;
        final int numeroTentativas = 5;
        //Padrão para variaveis não final, deve seguir o camelCase
        int QUANTIDADE_OPCOES = 25;
        //Deve-se evitar nomes poucos descritivos ou ambíguos
        int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}