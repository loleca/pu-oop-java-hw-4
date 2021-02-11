package Tiles;

import java.awt.*;

public class BasicTile extends Tile{

    public BasicTile(int row, int col) {
        super(row, col);
    }

    @Override
    public void renderBoard(Graphics g) {

        int coordX = (this.col * TILE_SIZE)+100;
        int coordY = (this.row * TILE_SIZE)+100;

        g.setColor(Color.red);
        g.fillRect(coordX,coordY,TILE_SIZE,TILE_SIZE);

        g.setColor(Color.black);
        g.drawRect(coordX,coordY,TILE_SIZE,TILE_SIZE);
    }
}
