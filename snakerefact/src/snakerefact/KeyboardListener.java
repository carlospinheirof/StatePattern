package snakerefact;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class KeyboardListener extends KeyAdapter{
 	
 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	// -> Right 
		    					ThreadsController.toRight();
		    			  	break;
		    	case 38:	// -> Top
								ThreadsController.toTop();
		    				break;
		    				
		    	case 37: 	// -> Left 
								ThreadsController.toLeft();
		    				break;
		    				
		    	case 40:	// -> Bottom
								ThreadsController.toBot();
		    				break;
		    	default: 	break;
 		    }
 		}
 	
 }