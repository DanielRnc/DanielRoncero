package examen;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("numero 1 es mayor que numero 2");
		}else if (num2 > num1) {
			System.out.println("numero 2 es mayor que numero 1");
		}else if (num1 < num2) {
			System.out.println("numero 1 es menor que numero 2");
		}else if (num2 < num1) {
			System.out.println("numero 2 es menor que numero 1");
		}else if (num1 == num2) {
			System.out.println("son iguales");
		}else {
			System.out.println("error");
		}
		
		System.out.println("Escribe tu edad");
		
		int edad = sc.nextInt();
		
		if (edad > 18) {
			System.out.println("eres mayor de edad");
		}else {
			System.out.println("no eres mayor de edad");
		}
	}
	
		

		

}
