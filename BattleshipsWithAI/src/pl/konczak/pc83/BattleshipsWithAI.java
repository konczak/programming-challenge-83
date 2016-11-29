/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.konczak.pc83;

/**
 *
 * @author Piotr.Konczak
 */
public class BattleshipsWithAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();

        board.putShip(ShipType.CRUISER, new Coordinate(Letter.A, 1), true);
        board.putShip(ShipType.DEESTROYER, new Coordinate(Letter.C, 5), false);

        print(board);
        board.shoot(new Coordinate(Letter.A, 10));

        print(board);
        board.shoot(new Coordinate(Letter.C, 5));

        print(board);
        board.shoot(new Coordinate(Letter.H, 3));

        print(board);
        board.shoot(new Coordinate(Letter.A, 1));

        print(board);
        board.shoot(new Coordinate(Letter.B, 1));

        print(board);
    }

    private static void print(Board board) {
        Field[][] map = board.print();
        System.out.print(' ');
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
        System.out.println();
        Letter letter = Letter.A;
        for (Field[] row : map) {
            System.out.print(letter);
            for (Field field : row) {
                System.out.print(field.getFlag());
            }
            System.out.println();
            if (letter != Letter.J) {
                letter = letter.next();
            }
        }
        System.out.println();
    }

}
