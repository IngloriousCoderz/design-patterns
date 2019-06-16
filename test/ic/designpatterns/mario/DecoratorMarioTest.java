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
	public void testFireMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new FireDecorator(mario);

		MarioTestHelper.testFireMario(mario);
	}

	@Test
	public void testCapeMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new CapeDecorator(mario);

		MarioTestHelper.testCapeMario(mario);
	}
	
	@Test
	public void testFireCapeMario() {
		Mario mario = new BaseMario();
		mario = new SuperDecorator(mario);
		mario = new CapeDecorator(mario);
		mario = new FireDecorator(mario);

		MarioTestHelper.testFireCapeMario(mario);
	}
}
