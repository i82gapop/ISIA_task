package matrices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompuestasTest {

	@Test
	public void testTransponerTranspuesta() {
		// Verificar que la traspuesta de una matriz traspuesta (por ejemplo de 3x3) es la matriz original
		int[][] datos1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}; // Matriz de 3x3
		Matriz m1 = new Matriz(datos1);
		
		Matriz m2 = Matriz.transponer(m1);
		Matriz m3 = Matriz.transponer(m2);
		
		Assertions.assertEquals(m1.toString(), m3.toString(), "La matriz resultante no es la esperada");
	}
	
	@Test
	public void testMultiplicarTranspuesta() throws DimensionesIncompatibles {
		// Con dos matrices de 3x3, verificar que la traspuesta de su producto es igual al producto de sus traspuestas
		int[][] datos1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}; // Matriz de 3x3
		Matriz m1 = new Matriz(datos1);
		
		int[][] datos2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 }}; // Matriz de 3x3
		Matriz m2 = new Matriz(datos2);
		
		// (Z·Q)^t
		Matriz m3 = Matriz.multiplicarDosMatrices(m1, m2);
		m3 = Matriz.transponer(m3);
		
		// Q^t·Z^t
		Matriz m4 = Matriz.transponer(m2);
		Matriz m5 = Matriz.transponer(m1);
		Matriz m6 = Matriz.multiplicarDosMatrices(m4, m5);
		
		Assertions.assertEquals(m3.toString(), m6.toString(), "La matriz resultante no es la esperada");
	}

}
