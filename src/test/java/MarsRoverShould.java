import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MarsRoverShould {


    @Test
    public void
    have_an_initial_location() {

        Rover rover = new Rover(new Location("1 2 N"));
        assertThat(rover.location(), is("1 2 N"));
    }

    @Test
    @Parameters(
            {
             "1 2 N, M, 1 3 N"
            ,"1 2 S, M, 1 1 S"
            ,"2 2 W, M, 1 2 W"
       //     ,"2 2 W, L, 2 2 S"
            }
    )
    public void
    follow_commands(String initialLocation, String commands, String finalLocation) {

        Rover rover = new Rover(new Location(initialLocation));

        rover.followCommands(commands);
        assertThat(rover.location(), is(finalLocation));

    }

}
