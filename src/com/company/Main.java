package com.company;
import java.io.*;

public class Main {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Figuras shape = new Figuras() {
            @Override
            public double area() {
                return 0;
            }
            @Override
            public double perimeter() {
                return 0;
            }
        };
        System.out.println("¡¡BIENVENIDO!!");
        System.out.println("¿Que propiedad deseas calcular?");
        System.out.println("1.Area");
        System.out.println("2.Perimetro");
        int op = Integer.parseInt(entrada.readLine());
        switch (op) {
            case 1:
                System.out.println("Selecciona la figura que deseas utilizar");
                System.out.println("1.Circulo");
                System.out.println("2.Triangulo");
                System.out.println("3.Cuadrado");
                int opc = Integer.parseInt(entrada.readLine());
                switch (opc) {
                    case 1:
                        System.out.println("Calcular el area del Circulo");
                        System.out.println("Introduce su radio");
                        double radius = Integer.parseInt(entrada.readLine());
                        Cirulo circle = new Cirulo(radius);
                        System.out.println("El area del circulo es: " + (circle.area()));
                        break;

                    case 2:
                        System.out.println("Calcular el area del cuadrado");
                        System.out.println("Introduce su lado");
                        double lado = Integer.parseInt(entrada.readLine());
                        Square square = new Square(lado);
                        System.out.println("El area del cuadrado es: " + (square.area()));
                        break;

                    case 3:
                        System.out.println("Calcular el area del triangulo");
                        System.out.println("Introduce su lado");
                        double lado1 = Integer.parseInt(entrada.readLine());
                        Triangulo triangle = new Triangulo(lado1);
                        System.out.println("El area del cuadrado es: " + (triangle.area()));
                        break;
                        default:
                            System.out.println("Opcion no valida");
                }break;
            case 2:
                System.out.println("Selecciona la figura que deseas utilizar");
                System.out.println("1.Circulo");
                System.out.println("2.Triangulo");
                System.out.println("3.Cuadrado");
                int opci = Integer.parseInt(entrada.readLine());
                switch (opci) {
                    case 1:
                        System.out.println("Calcular el perimetro del Circulo");
                        System.out.println("Introduce su radio");
                        double radius = Integer.parseInt(entrada.readLine());
                        Cirulo circle = new Cirulo(radius);
                        System.out.println("El area del circulo es: " + (circle.perimeter()));
                        break;

                    case 2:
                        System.out.println("Calcular el perimetro del cuadrado");
                        System.out.println("Introduce su lado");
                        double lado = Integer.parseInt(entrada.readLine());
                        Square square = new Square(lado);
                        System.out.println("El area del cuadrado es: " + (square.perimeter()));
                        break;

                    case 3:
                        System.out.println("Calcular el perimetro del triangulo");
                        System.out.println("Introduce su lado");
                        double lado1 = Integer.parseInt(entrada.readLine());
                        Triangulo triangle = new Triangulo(lado1);
                        System.out.println("El area del cuadrado es: " + (triangle.perimeter()));
                        break;
                        default:
                            System.out.println("Opcion no valida");
                }break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}

