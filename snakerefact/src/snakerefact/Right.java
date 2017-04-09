package snakerefact;

public class Right implements DirectionState {

	@Override
	public DirectionState toRight() {	
		return this;
	}

	@Override
	public DirectionState toLeft() {	
		return this;
	}

	@Override
	public DirectionState toTop() {
		return new Top();
	}

	@Override
	public DirectionState toBot() {
		return new Bot();
	}

	@Override
	public int getState() {
		return 1;
	}

}
