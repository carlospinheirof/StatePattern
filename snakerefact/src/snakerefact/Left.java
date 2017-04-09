package snakerefact;

public class Left implements DirectionState {

	@Override
	public DirectionState toRight() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public DirectionState toLeft() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public DirectionState toTop() {
		// TODO Auto-generated method stub
		return new Top();
	}

	@Override
	public DirectionState toBot() {
		// TODO Auto-generated method stub
		return new Bot();
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return 2;
	}

}
