package ic.designpatterns.mario;

import ic.designpatterns.mario.decorator.BaseMario;
import ic.designpatterns.mario.decorator.FireDecorator;
import ic.designpatterns.mario.decorator.CapeDecorator;
import ic.designpatterns.mario.decorator.SuperDecorator;
import org.junit.Test;

public class DecoratorMarioTest {
	@Test
	public void testBaseMario() {
		Mario mario = new BaseMario();

		MarioTestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);

		MarioTestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireballMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new FireDecorator(mario);

		MarioTestHelper.testFireMario(mario);
	}

	@Test
	public void testFlyingSquirrelMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new CapeDecorator(mario);

		MarioTestHelper.testCapeMario(mario);
	}
}
