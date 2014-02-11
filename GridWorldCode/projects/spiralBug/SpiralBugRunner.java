import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class SpiralBugRunner {
    public static void main( String[] args ) {
        ActorWorld world = new ActorWorld();
        world.add(new SpiralBug(4));
        world.show();
    }
}
