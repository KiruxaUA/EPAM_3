package ua.epam3;

class Player {
    private String playerName;
    private String playersChoice;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayersChoice() {
        return playersChoice;
    }

    public void setPlayersChoice(String playersChoice) {
        this.playersChoice = playersChoice;
    }
}
