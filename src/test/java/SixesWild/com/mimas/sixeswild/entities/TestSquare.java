package SixesWild.com.mimas.sixeswild.entities;

import junit.framework.TestCase;

/**
 * This test case handles testing the Square methods.
 *
 * @author Aditya Nivarthi
 */
public class TestSquare extends TestCase {

	Square square;

	/*
	 * (non-Javadoc)
	 *
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	public void setUp() {
		square = new Square(new NumberTile(1, 1), 0, 0, false);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	public void tearDown() {

	}

	/**
	 * Tests all the Square methods.
	 */
	public void testSquareMethods() {
		assertEquals(square.getX(), 0);
		assertEquals(square.getY(), 0);
		assertEquals(square.getTile().getType(), TileType.NUMBER);
		assertEquals(square.getMarked(), false);
	}

	/**
	 * Tests all the Square's tile methods
	 */
	public void testSquareTileMethods() {
		square.removeTile();
		assertNull(square.getTile());
		square.addTile(new NumberTile(2, 1));
		assertEquals(square.getTile().getNumber(), 2);
		assertEquals(square.getTile().getMultiplier(), 1);
		assertFalse(square.addTile(null));
	}

	/**
	 * Tests all the Square marked methods.
	 */
	public void testSquareMarkedMethods() {
		assertEquals(square.getMarked(), false);
		square.setMarked(true);
		assertEquals(square.getMarked(), true);
	}

	/**
	 * Tests the selected attribute of the Square.
	 */
	public void testSelected() {
		assertTrue(square.setSelected(true));
	}

	/**
	 * Tests the equals method on Square.
	 */
	public void testEquals() {
		Square square2 = new Square(new NumberTile(1, 1), 0, 1, false);
		assertFalse(square.equals(square2));

		String name = "hi";
		assertFalse(square.equals(name));

		assertFalse(square.equals(null));
	}
}
