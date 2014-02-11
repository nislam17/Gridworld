import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class ZBugRunner {
    public static void main( String[] args ) {
        ActorWorld world = new ActorWorld();
        world.add(new ZBug(4));
        world.show();
    }
}
