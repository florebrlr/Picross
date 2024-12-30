package Game;

public class Tile {
    //ATTRIBUTES
    private TileState  state;

    // CONSTRUCTORS
    public Tile(TileState state) {
        this.state = state;
    }

    // GETTERS & SETTERS

    public TileState getState() {
        return state;
    }

    public void setState(TileState state) {
        this.state = state;
    }


    // METHODS

}
