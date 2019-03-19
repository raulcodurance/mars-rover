import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MarsRoverShould {


    @Test
    public void
    have_an_initial_position_and_heading() {

        Rover rover = new Rover(new Position("1 2 N"));
        assertThat(rover.positionAndHeading(), is("1 2 N"));
    }

    @Test
    public void
    receive_commands_and_move_to_new_position() {

        Rover rover = new Rover(new Position("1 2 N"));

        rover.followCommands("M");
        assertThat(rover.positionAndHeading(), is("1 3 N"));

    }
}
