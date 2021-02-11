package Tiles;

import java.awt.*;

public abstract class Tile {

    protected int row;
    protected int col;
    public static final int TILE_SIZE = 100;

    /**
     *  The constructor, which would of helped us manage the tiles if I got further into the project.
     *  Too bad! I didn't.
     */
    public Tile (int row, int col) {
        this.row = row;
        this.col = col;
    }
    public abstract void renderBoard(Graphics g);
}

