package matrices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrasponerTest {

	@Test
	void testTrasponer() {
		
		int[][] valoresA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] valoresB = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

		Matriz a = new Matriz(valoresA);
		Matriz b = new Matriz(valoresB);

		Matriz c = Matriz.transponer(a);

		assertEquals(b.toString(), c.toString());
	}

}
