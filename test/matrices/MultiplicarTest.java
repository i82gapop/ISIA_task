package matrices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplicarTest {

	@Test
	public void testDimensionesCompatibles() {
		Assertions.assertThrows(DimensionesIncompatibles.class, () -> {
			Matriz m1 = new Matriz(3, 4, false); // Matriz de 3x4
			Matriz m2 = new Matriz(3, 4, false); // Matriz de 3x4
			
			// No coincide el número de columnas de la primera con el número de filas de la segunda
			Matriz.multiplicarDosMatrices(m1, m2);
		}, "Excepción DimensionesIncompatibles esperada");
	}
	
	@Test
	public void testMultiplicarMatrices() throws DimensionesIncompatibles {
		int[][] datos1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Matriz de 2x3
		Matriz m1 = new Matriz(datos1);
		
		int[][] datos2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // Matriz de 3x2
		Matriz m2 = new Matriz(datos2);
		
		// La matriz resultante debe ser de 2x2
		int[][] datos3 = { { 22, 28 }, { 49, 64 } };

		Matriz m3 = Matriz.multiplicarDosMatrices(m1, m2);

		Assertions.assertEquals(2, m3.getDimension().height, "La matriz resultante debe tener 3 filas");
		Assertions.assertEquals(2, m3.getDimension().width, "La matriz resultante debe tener 3 columnas");
		
		Assertions.assertEquals(new Matriz(datos3).toString(), m3.toString(), "La matriz resultante no es la esperada");
	}

}
