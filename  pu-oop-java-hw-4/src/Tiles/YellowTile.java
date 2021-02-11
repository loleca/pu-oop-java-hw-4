package Tiles;

import java.awt.*;

public class YellowTile extends Tile{

    public YellowTile(int row, int col) {
        super(row, col);
    }

    /**
     * It's called a yellow tile, despite the fact that it is clearly orange.
     * Quite extraordinary.
     */

    @Override
    public void renderBoard(Graphics g) {

        int coordX = (this.col * TILE_SIZE)+100;
        int coordY = (this.row * TILE_SIZE)+100;

        g.setColor(Color.orange);
        g.fillRect(coordX, coordY, TILE_SIZE, TILE_SIZE);

        g.setColor(Color.black);
        g.drawRect(coordX, coordY,TILE_SIZE,TILE_SIZE);
    }

}
