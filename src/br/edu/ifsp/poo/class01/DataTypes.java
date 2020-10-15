package br.edu.ifsp.poo.class01;

import java.time.LocalDate;
import java.util.Scanner;

public class DataTypes {

    enum Sexo {MASCULINO, FEMININO, NAO_DECLARADO} // declaracão de um enum

    public static void main(String[] args) {
        int i; // declarei variável mas não o valor
        int j = 10; // declarei variável e o valor
        i = 10; // agora declarei o valor de i
        j = 11; // alterei o valor de j

        double d = i; // um inteiro cabe dentro de um ponto flutuante
        System.out.println("d = " + d);

        d = 1.56;
        int x = (int) d; // mas um ponto flutuante só cabe em um inteiro com cast
        System.out.println("x = " + x);

        //char c = 23; char é na verdade um valor inteiro (em byte) na tabela unicode
        char c = 'p';
        System.out.println(c);


        final int constant = 10; // final é o modificador para declarar um valor como "constante"
        //constant = 11; não pode acontecer

        Sexo meuSexo = Sexo.MASCULINO; // atribuicao de variável do tipo enum. Veja a declaracão do enum no topo do arquivo.
        System.out.println("meuSexo = " + meuSexo);

        // exemplo de operadores unários
        int valor = 99;
        valor = -valor;
        System.out.println(! true );

        //exemplo de promocão explícita de tipo em cálculo
        double div =  10 / (double) 3 ; //sem o cast ocorrerá uma divisão inteira.
        System.out.println("div = " + div);

        int jao = 10;
        jao += 10; // jao = jao + 10;
        System.out.println("jao = " + jao);

        //exemplo de leitura de valores da entrada padrão (console)
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int idade = scanner.nextInt();

        if(idade >= 18) {
            System.out.println(name + " pode beber cerveja");
        }else{
            System.out.println(name + " só bebe leite");
        }

        //Exemplo de if ternário equivalente ao if-else anterior
        System.out.println(idade >= 18 ? name  + " pode beber cerveja" : name  + " só bebe leite");

        // contando letras dos dias da semana com switch convencional
        int numLetters = 0;
        switch (LocalDate.now().getDayOfWeek()){

            case MONDAY: case FRIDAY: case SUNDAY: // o OR funciona com CASE sem break
                numLetters = 6; break;
            case TUESDAY:
                numLetters = 7; break;
            case THURSDAY, SATURDAY: // mas nesse caso é mais legível com apenas ','
                numLetters = 8; break;
            case WEDNESDAY:
                numLetters = 9; break;
        }
        System.out.println(numLetters);

        // contando letras dos dias da semana com switch expression (Java 13)
        System.out.println(
                switch (LocalDate.now().getDayOfWeek()){
                    case MONDAY, FRIDAY, SUNDAY -> {
                        yield 6; // usado quando há um bloco que faz algo além de retornar o valor
                    }
                    case TUESDAY -> 7;
                    case THURSDAY, SATURDAY -> {
                        System.out.println("Uhhaaaa");
                        System.out.println("Uhhaaaa");
                        System.out.println("Uhhaaaa");
                        System.out.println("Uhhaaaa");
                        System.out.println("Uhhaaaa");

                        yield 8;
                    }
                    case WEDNESDAY -> 9;
                }
        );
    }

}
