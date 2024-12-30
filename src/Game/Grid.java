package Game;

public class Grid {
    // ATTRIBUTES
    private Tile[][] tiles;
    private int gridSize;

    // CONSTRUCTORS
    public Grid(int size) {
        // Initialisation de la grille des cases vides
        tiles = new Tile[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tiles[i][j] = new Tile(TileState.EMPTY);  // On initialise toutes les cases à EMPTY
            }
        }
    }

    // GETTERS & SETTERS
    // Récupérer une case
    public Tile getTile(int x, int y) {
        return tiles[x][y];
    }
    // Modifier l'état d'une case
    public void setTile(int x, int y, TileState state) {
        tiles[x][y].setState(state);
    }
    // Récupérer la taille de la grille
    public int getSize() {
        return gridSize;
    }

    // METHODS
    // Méthode pour afficher la grille
    public void showGrid() {
        int size = tiles.length;

        // Ligne de bord supérieure
        System.out.println("+" + "---+".repeat(size));

        // Séparateurs pour chaque case de la grille
        for (int i = 0; i < size; i++) {
            // Début de la ligne avec "|"
            System.out.print("| ");

            // Afficher l'état de chaque case de la ligne
            for (int j = 0; j < size; j++) {
                TileState state = tiles[i][j].getState();

                // Utilisation du switch sur l'énumération TileState
                switch (state) {
                    case FILL:
                        System.out.print("█ | ");  // Case remplie
                        break;
                    case EMPTY:
                        System.out.print("  | ");  // Case vide
                        break;
                    case CROSS:
                        System.out.print("X | ");  // Case croisée
                        break;
                    default:
                        System.out.print("  | ");  // Par défaut, si l'état est inconnu
                        break;
                }
            }

            // Fin de la ligne et la ligne de séparation
            System.out.println();
            System.out.println("+" + "---+".repeat(size));
        }
    }
}
