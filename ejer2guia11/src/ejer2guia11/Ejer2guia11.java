package ejer2guia11;

public class Ejer2guia11 {

    public static void main(String[] args) {
        try {
            int[] lista = new int[5];
            for (int i = 0; i < 10; i++) {
                System.out.println(lista[i]);
            }
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
    }

}
