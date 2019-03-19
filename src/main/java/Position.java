public class Position {
    private final int positionX;
    private final int positionY;
    private final String headingTo;

    public Position(String rawPosition) {
        String[] position = rawPosition.split(" ");

        this.positionX = Integer.valueOf(position[0]);
        this.positionY = Integer.valueOf(position[1]);
        this.headingTo = position[2];
    }

    @Override
    public String toString() {
        return positionX + " " + positionY + " " + headingTo;
    }

    public boolean isHeadingNorth() {
        return "N".equals(headingTo);
    }
}
