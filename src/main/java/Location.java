public class Location {
    private final int positionX;
    private final int positionY;
    private final String headingTo;

    public Location(String rawPosition) {
        String[] position = rawPosition.split(" ");

        this.positionX = Integer.valueOf(position[0]);
        this.positionY = Integer.valueOf(position[1]);
        this.headingTo = position[2];
    }

    public Location(int positionX, int positionY, String headingTo) {

        this.positionX = positionX;
        this.positionY = positionY;
        this.headingTo = headingTo;
    }

    @Override
    public String toString() {
        return positionX + " " + positionY + " " + headingTo;
    }


    public Location moveNorth() {

        return new Location(positionX, positionY + 1, "N");
    }

    public Location rotateLeft() {

        if("N".equals(headingTo)){

            return new Location(positionX, positionY, "W");
        }

        if("W".equals(headingTo)){

            return new Location(positionX, positionY, "S");
        }

        if("S".equals(headingTo)){

            return new Location(positionX, positionY, "E");
        }

        if("E".equals(headingTo)){

            return new Location(positionX, positionY, "N");
        }

        return this;
    }

    public boolean isHeadingNorth() {
        return "N".equals(headingTo);
    }
    public boolean isHeadingSouth() {
        return "S".equals(headingTo);
    }

    public Location moveSouth() {
        return new Location(positionX, positionY - 1, "S");
    }

    public boolean isHeadingWest() {
        return "W".equals(headingTo);
    }

    public Location moveWest() {
        return new Location(positionX-1, positionY, "W");
    }
}
