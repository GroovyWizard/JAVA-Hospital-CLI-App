package com.hospital;
import com.hospital.model.*;
import com.hospital.menu.*;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		MenuGeral menu = new MenuGeral();
		
		System.out.println("Deseja acessar o menu do medico ou da secretaria?");
		System.out.println("1- Secretaria");
		System.out.println("2- Medico");

		

		int opcao = leitor.nextInt();
		
		if(opcao == 1) {
			menu.menuSecretaria();
		} else {
			menu.menuMedico();
		}
		
	}

}
