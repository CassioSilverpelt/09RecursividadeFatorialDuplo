package view;

import controller.FatorialDuploController;
import javax.swing.JOptionPane;

public class FatorialDuploPrincipal {
	public static void main (String[] args) {
		FatorialDuploController fatCon = new FatorialDuploController();
		int n = -2;
		while (n < 0 || n%2 == 0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número ímpar e positivo: "));
			if (n < 0 || n%2 == 0) {
				JOptionPane.showMessageDialog(null, "Número inválido. Tente novamente!");
			}
		}
		
		System.out.println(fatCon.fatorialDuplo(n));
		
	}
}
