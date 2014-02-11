import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    private int steps;
    private int sideLength;
    private int stage;

    public ZBug(int length) {
        steps = 0;
        sideLength = length;
	stage = 0;
	setDirection(90);
    }

    public void act()  {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else if (stage == 0) {
	    for (int i=0; i<3; i++)
		turn();
	    stage++;
	    steps = 0;
	} else if (stage == 1) {
	    for (int i=0; i<5; i++)
		turn();
	    stage++;
	    steps = 0;
        } else {
        }
    }
}
