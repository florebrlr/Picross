package Test;

import Game.Grid;
import Game.Puzzle;
import Game.TileState;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isResolved = false;

        // Création du puzzle à résoudre (test size = 5x5)
        Puzzle puzzleGrid = new Puzzle(5);
        puzzleGrid.addTile(0, 0, TileState.FILL);
        puzzleGrid.addTile(1, 1, TileState.CROSS);
        puzzleGrid.addTile(2, 2, TileState.FILL);
        puzzleGrid.addTile(3, 3, TileState.CROSS);
        puzzleGrid.addTile(4, 4, TileState.FILL);

        System.out.println("[DEBUG] test affichage grille puzzleGrid :");
        puzzleGrid.showGrid();

        // Création de la grille du joueur (vide)
        Grid playerGrid = new Grid(5);

        // Programme du jeu
        // while (!isResolved) {

        // }
    }
}
