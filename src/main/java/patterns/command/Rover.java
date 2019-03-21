package patterns.command;

public class Rover {
    private final Integer positionX;
    private Integer positionY;
    private final String headingTo;
    private String commands;

    public Rover(String initialLocation) {

        String[] location = initialLocation.split(" ");
        this.positionX = Integer.valueOf(location[0]);
        this.positionY = Integer.valueOf(location[1]);
        this.headingTo = location[2];
    }

    public String location() {
        return positionX + " " + positionY + " " + headingTo;
    }

    public void commands(String commands){
        this.commands = commands;
    }
    public void executeCommands() {

        if ("M".equals(commands)) {

            if ("N".equals(headingTo)) {
                this.positionY++;
            }

        }

    }
}
