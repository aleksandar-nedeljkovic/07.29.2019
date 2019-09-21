package petipaket;

import java.util.Scanner;

public class PetiDomaciZadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cena = 0, zbir = 0, kusur, novac = 0, kolicina, cenaProizvoda;
		int brojac = 1;

		while (brojac >= 1) {
			if (brojac == 1) {
				System.out.printf("Unesite cenu %d. proizvoda: ", brojac);
			} else if (brojac > 1) {
				System.out.printf("Unesite cenu %d. proizvoda ili (-1) ako nema vise proizvoda: ", brojac);
			}
			cenaProizvoda = sc.nextDouble();
			if (cenaProizvoda == -1) {
				break;
			} else {
				System.out.printf("Unesite kolicinu %d. proizvoda: ", brojac);
				kolicina = sc.nextDouble();
				cena += cenaProizvoda * kolicina;
				brojac++;
			}
		}

		System.out.printf("Ukupna cena proizvoda: %.0f\n", cena);
		System.out.println("Koliko vam je novca dao kupac? ");
		novac += sc.nextDouble();
		if (novac < cena) {
			System.out.println(":(");
		} else {
			kusur = Math.round(novac - cena);
			System.out.println("Kusur je: " + kusur + " dinara");
			int b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0;
			while (kusur > 0) {
				if (kusur >= 20) {
					kusur -= 20;
					b20++;
				} else if (kusur >= 10) {
					kusur -= 10;
					b10++;
				} else if (kusur >= 5) {
					kusur -= 5;
					b5++;
				} else if (kusur >= 2) {
					kusur -= 2;
					b2++;
				} else if (kusur >= 1) {
					kusur -= 1;
					b1++;
				}
			}

			System.out.println(b20 + " od 20 din");
			System.out.println(b10 + " od 10 din");
			System.out.println(b5 + " od 5 din");
			System.out.println(b2 + " od 2 din");
			System.out.println(b1 + " od 1 din");

		}
	}

}
