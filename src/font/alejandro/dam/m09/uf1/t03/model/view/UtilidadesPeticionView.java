package font.alejandro.dam.m09.uf1.t03.model.view;

import java.util.Scanner;

public class UtilidadesPeticionView {
    float getFloat(String mensajePeticion) {
        System.out.println(mensajePeticion);
        Scanner scanner = new Scanner(System.in);
        int valor = (int) scanner.nextFloat();
        return valor;
    }

    String getString(String mensajePeticion) {
        System.out.println(mensajePeticion);
        Scanner scanner = new Scanner(System.in);
        String valor = scanner.next();
        return valor;
    }

    byte getByte(String mensajePeticion) {
        System.out.println(mensajePeticion);
        Scanner scanner = new Scanner(System.in);
        byte valor = scanner.nextByte();
        return valor;
    }
}
