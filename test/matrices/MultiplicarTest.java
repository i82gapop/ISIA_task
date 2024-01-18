package matrices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicarTest {

	@Test
	void testDimensionIncompatible() {
		
		Matriz a = new Matriz(3, 3, true);
		Matriz b = new Matriz(2, 3, true);
		
		assertThrows(DimensionesIncompatibles.class, () -> Matriz.multiplicarDosMatrices(a, b));
	}
	
	@Test
	void testMultiplicar() throws DimensionesIncompatibles {

		int [][] valoresA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][] valoresB = {{30, 36, 42}, {66, 81, 96}, {102, 126, 150}};
		
		Matriz a = new Matriz(valoresA);
		Matriz b = new Matriz(valoresB);
		
		Matriz c = Matriz.multiplicarDosMatrices(a, a);
		
		assertEquals(b.toString(), c.toString());
	}
}
