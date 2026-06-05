package com.telusuko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapesTest {
	Shapes shape=new Shapes();

	@Test
	public void testcomputeSquareArea() {
	    Shapes shape = new Shapes();

	    assertEquals(576.0,
	                 shape.computeSquareArea(24),
	                 0.001);
	}

}
