package patterns.command;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverShould {

    @Test
    public void
    have_an_initial_location() {

        Rover rover = new Rover("1 2 N");
        assertThat(rover.location(),is("1 2 N"));
    }

    @Test
    public void
    execute_commands() {

        Rover rover = new Rover("1 2 N");

        rover.commands("M");
        rover.executeCommands();
        assertThat(rover.location(),is("1 3 N"));

    }
}
