package Game;

public class Puzzle extends Grid{
    // ATTRIBUTES
    private Grid grid;

    // CONSTRUCTORS
    public Puzzle(int size) {
        super(size);
        grid = new Grid(size);
    }

    // METHODS
    public void showGrid() {
        grid.showGrid();
    }

    public void addTile(int x, int y, TileState state) {
        grid.setTile(x, y, state);
    }
}
