package hussamsherif.com.tictactoe.BusEvents;

import hussamsherif.com.tictactoe.CustomViews.Boards.Board;

public class PlayerNameChangedEvent {

    private @Board.Player int playerPreference;
    private String newPlayerName ;

    public PlayerNameChangedEvent(@Board.Player int playerPreference, String newPlayerName) {
        this.playerPreference = playerPreference;
        this.newPlayerName = newPlayerName;
    }

    public String getNewPlayerName() {
        return newPlayerName;
    }

    @Board.Player
    public int getPlayer() {
        return playerPreference;
    }
}
