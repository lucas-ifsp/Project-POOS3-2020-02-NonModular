package br.edu.ifsp.poo.class02;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0] = 20;
        ages[1] = 29;
        ages[2] = 1;

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            System.out.println("ages[" + i + "] = " + age);
        }

        int[] qtsCats = {1, 0, 3};

        for (int i = 0; i < qtsCats.length; i++) {
            int qtd = qtsCats[i];
            System.out.println("qtdCats[" + i + "] = " + qtd);
        }

        String[] names = new String[3];
        int qtdNames = 0;

        names[0] = "Lucas";
        qtdNames++;

        names[1] = "Jayme";
        qtdNames++;

        for (int i = 0; i < qtdNames; i++) {
            System.out.println("name = " + names[i]);
        }

        for (String name : names) {
            if (name == null) {
                System.out.println("name = " + name.replace("a", "A"));
            }
        }
    }

}
