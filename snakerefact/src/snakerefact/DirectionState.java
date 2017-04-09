package snakerefact;

public interface DirectionState {
	
	DirectionState toRight();
	DirectionState toLeft();
	DirectionState toTop();
	DirectionState toBot();
	int getState();
}
