package ic.designpatterns.mario;

import org.junit.Test;

import ic.designpatterns.mario.state.BaseState;
import ic.designpatterns.mario.state.FireState;
import ic.designpatterns.mario.state.CapeState;
import ic.designpatterns.mario.state.StatefulMario;
import ic.designpatterns.mario.state.SuperState;

public class StatefulMarioTest {
	@Test
	public void testBaseMario() {
		Mario mario = new StatefulMario(new BaseState());

		MarioTestHelper.testBaseMario(mario);
	}

	@Test
	public void testSuperMario() {
		Mario mario = new StatefulMario(new SuperState());

		MarioTestHelper.testSuperMario(mario);
	}

	@Test
	public void testFireballMario() {
		Mario mario = new StatefulMario(new FireState());

		MarioTestHelper.testFireMario(mario);
	}

	@Test
	public void testFlyingSquirrelMario() {
		Mario mario = new StatefulMario(new CapeState());

		MarioTestHelper.testCapeMario(mario);
	}
}
