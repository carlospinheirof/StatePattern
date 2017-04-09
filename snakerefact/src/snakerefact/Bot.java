package snakerefact;

public class Bot implements DirectionState {

	@Override
	public DirectionState toRight() {
		return new Right();
	}

	@Override
	public DirectionState toLeft() {
		return new Left();
	}

	@Override
	public DirectionState toTop() {
		return this;
	}

	@Override
	public DirectionState toBot() {
		return this;
	}

	@Override
	public int getState() {
		return 4;
	}

}
