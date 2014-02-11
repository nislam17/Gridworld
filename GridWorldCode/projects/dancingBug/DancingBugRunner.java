import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class DancingBugRunner {
    public static void main(String[] args) {
	ActorWorld world = new ActorWorld();
	int[] nums = {1,2,1,2,1,5};
	world.add(new DancingBug(nums));
	world.show();
    }
}
