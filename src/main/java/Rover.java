public class Rover {
    private Location location;

    public Rover(Location initialCoordinatesAndHeading) {

        this.location = initialCoordinatesAndHeading;
    }

    public String location() {
        return location.toString();
    }

    public void followCommands(String commands) {

        if("M".equals(commands) && location.isHeadingNorth()){

        this.location = location.moveNorth();
        }

        if("M".equals(commands) && location.isHeadingSouth()){

            this.location = location.moveSouth();
        }

        if("M".equals(commands) && location.isHeadingWest()){

            this.location = location.moveWest();
        }

        if("L".equals(commands) && location.isHeadingNorth()){

                this.location = location.rotateLeft();
        }
    }
}
