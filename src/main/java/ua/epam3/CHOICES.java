package ua.epam3;

public enum CHOICES {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private String choice;

    CHOICES(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }
}
