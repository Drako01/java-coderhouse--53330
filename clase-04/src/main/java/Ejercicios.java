
public class Ejercicios {

	public void ejercicio19() {
		int[][] matriz = { { 21, 2, 3 }, { 4, 25, 6 }, { 47, 8, 39 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}

	public void ejercicio14() {
		/*
		 * Ejercicio 14: Listas y Arrays Declara un array de cadenas de tamaño 4,
		 * inicialízalo con nombres y luego imprime cada elemento del array en una línea
		 * separada.
		 */

		String[] nombres = { "Alejandro", "Daniel", "Victor", "Maxi" };

		for (String string : nombres) {
			System.out.println(string);
		}
	}

	public void ejercicio14b() {
		String[] nombres = new String[4];

		nombres[0] = "Luis";
		nombres[1] = "Alejandro";
		nombres[2] = "Maxi";
		nombres[3] = "Victor";

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

	}
}
