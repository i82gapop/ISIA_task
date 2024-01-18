package matrices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompuestasTest {

	@Test
	void testTraspuestaDoble() {
		
		int[][] valoresA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		Matriz a = new Matriz(valoresA);
		Matriz b = Matriz.transponer(a);
		b = Matriz.transponer(b);
		
		assertEquals(a.toString(), b.toString());
	}

	@Test
	void testTraspuestaProducto() throws DimensionesIncompatibles {
		
		int [][] valoresA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][] valoresB = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
		
		Matriz a = new Matriz(valoresA);
		Matriz b = new Matriz(valoresB);
		
		assertEquals(Matriz.transponer(Matriz.multiplicarDosMatrices(a, b)).toString(), Matriz.multiplicarDosMatrices(Matriz.transponer(b), Matriz.transponer(a)).toString());
	}
}
