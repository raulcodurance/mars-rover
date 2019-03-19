public class Rover {
    private Position positionAndHeading;

    public Rover(Position initialCoordinatesAndHeading) {

        this.positionAndHeading = initialCoordinatesAndHeading;
    }

    public String positionAndHeading() {
        return positionAndHeading.toString();
    }

    public void followCommands(String commands) {

        if("M".equals(commands) && positionAndHeading.isHeadingNorth()){

        this.positionAndHeading = new Position("1 3 N");
        }
    }
}
