import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int stage;
    private int[] steps;
    private int turns;
    private boolean done;
   
    public DancingBug (int[] steps) {
        this.steps = steps;
	stage = 0;
	done = false;
	turns = 0;
    }

    public void act() {
        if (done) {
	    move();
	    done = false;
	} else if (turns < steps[stage]) {
	    turn();
	    turns++;
	    if (turns == steps[stage]) {
		done = true;
		turns = 0;
		if (stage == steps.length-1)
		    stage = 0;
		else
		    stage++;
	    }
		
	}
    }
}
	    
