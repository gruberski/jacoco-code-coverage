package pl.gruberski;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FoobarTest {

	private Foobar foobar;
	
	@Before
    public void setUp() {
		foobar = new Foobar();
    }
	
	@Test
	public void getWordIfNumberIsOne() {
		assertEquals(foobar.getWord(1), "Foo");
	}
	
	@Test
	public void getWordIfNumberIsTwo() {
		assertEquals(foobar.getWord(2), "Bar");
	}
}
