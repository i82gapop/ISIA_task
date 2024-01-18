package matrices;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	MultiplicarTest.class,
	CompuestasTest.class,
	TransponerTest.class
})
public class MatrizTest {

}
