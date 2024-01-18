package matrices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransponerTest {

	@Test
	public void testTransponerMatriz() {
		int[][] datos1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Matriz de 2x3
		Matriz m1 = new Matriz(datos1);
		
		// La matriz resultante debe ser de 3x2
		int[][] datos2 = { { 1, 4 }, { 2, 5 }, { 3, 6 } };
		Matriz m2 = new Matriz(datos2);
		
		Matriz m3 = Matriz.transponer(m1);
		
		Assertions.assertEquals(3, m3.getDimension().height, "La matriz resultante debe tener 3 filas");
		Assertions.assertEquals(2, m3.getDimension().width, "La matriz resultante debe tener 2 columnas");
		
		Assertions.assertEquals(m2.toString(), m3.toString(), "La matriz resultante no es la esperada");
	}

}
