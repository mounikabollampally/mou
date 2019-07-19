package cucd1;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculator {
calc c= new calc();
	@Test
	public void test() {
		assertEquals(6, c.mul(2,3));
	}

}
