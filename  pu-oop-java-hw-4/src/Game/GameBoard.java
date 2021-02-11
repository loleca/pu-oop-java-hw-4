package Game;

import Tiles.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class GameBoard extends JFrame implements MouseListener {

    public static int randRow;
    public static int randCol;
    public Object[][] tileCollection;

    public GameBoard() {

        this.setSize(1000, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.tileCollection = new Object[8][8];
        renderYellow();
        renderGreen();
        renderBlue();
        renderRed();
    }


    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                this.renderTiles(g, row, col);
            }
        }
    }
    /**
     * Method for rendering the game
     * @param g
     */
    public void renderTiles(Graphics g, int row, int col) {

        if (!this.hasTile(row, col)) {
            Tile tile = (Tile) this.getTile(row, col);
            tile.renderBoard(g);
        }
    }

    /**
     * Method for getting the tile's row/col
     */
    public Object getTile(int row, int col) {
        return this.tileCollection[row][col];
    }

    /**
     * checking if the tile is already occupied
     */
    public boolean hasTile(int row, int col) {
        return this.tileCollection[row][col] == null;
    }

    /**
     * Method for getting a random number method, if it wasn't made obvious by the name of it.
     */
    public static void getRandomNumber() {

        Random random = new Random();
        randRow = random.nextInt(8);
        randCol = random.nextInt(8);

    }
    /**
     *  Method for filling the game board with the starting tiles.
     *  Despite there being only one of those I used plural, to signify that the methods below are connected.
     */
    public void renderYellow() {
        this.tileCollection[randRow][randCol] = new YellowTile(randRow, randCol);
    }
    /**
     *  Method for filling the game board with the GreenTile tiles.
     */
    public void renderGreen() {

        for(int i = 0; i < 8;) {
            getRandomNumber();
            if(this.hasTile(randRow, randCol)) {
                this.tileCollection[randRow][randCol] = new GreenTile(randRow, randCol);
                i++;
            }
        }
    }
    /**
     *  Method for filling the game board with the Blue tiles.
     */
    public void renderBlue() {
        for(int i = 0; i < 5;) {
            getRandomNumber();
            if(this.hasTile(randRow, randCol)) {
                this.tileCollection[randRow][randCol] = new BlueTile(randRow, randCol);
                i++;
            }
        }
    }
    /**
     *  Method for filling the game board with the Red tiles.
     */
    public void renderRed() {
        for(int i = 0; i < 50;) {
            getRandomNumber();
            if(this.hasTile(randRow, randCol)) {
                this.tileCollection[randRow][randCol] = new BasicTile(randRow, randCol);
                i++;
            }
        }
    }

    /**
     *  Method made to tease us what we could of done if we made it further into the project.
     *  ...and yes by "we" I am referring to myself.
     */

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
