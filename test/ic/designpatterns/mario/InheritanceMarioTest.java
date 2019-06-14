package ic.designpatterns.mario;

import org.junit.Test;

import ic.designpatterns.mario.inheritance.BaseMario;
import ic.designpatterns.mario.inheritance.FireMario;
import ic.designpatterns.mario.inheritance.CapeMario;
import ic.designpatterns.mario.inheritance.SuperMario;

public class InheritanceMarioTest {
	@Test
	public void testBaseMario() {
		Mario mario = new BaseMario();

		MarioTestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new SuperMario();

		MarioTestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireballMario() {
		Mario mario = new FireMario();

		MarioTestHelper.testFireMario(mario);
	}

	@Test
	public void testFlyingSquirrelMario() {
		Mario mario = new CapeMario();

		MarioTestHelper.testCapeMario(mario);
	}
}
