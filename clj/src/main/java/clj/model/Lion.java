package clj.model;

import clj.controller.Coordinate;

public class Lion extends Piece{

    protected Lion(int party){
        super("Lion", 7, party);
    }

    @Override
    protected Coordinate calFinalDest(Coordinate dest, Board board, int dx, int dy) {
        while (board.at(dest).equals("Water")){
            if (!board.pick(dest).getAnimal().equals(null)){
                return dest;
            }
            dest = new Coordinate(dest.getX()+dx, dest.getY()+dy);
        }
        return dest;
    }

    @Override
    protected boolean canCapture(Piece another) {
        if (another == null){
            return true;
        }
        if (another.getParty() == this.getParty()){
            return false;
        }
        if (another.isTrapped()){
            return true;
        }
        if (this.getRank() >= another.getRank()){
            return true;
        }

        return false;
    }

    @Override
    protected boolean canMoveTo(BoardObj dest) {
        if (dest.getType().equals("Den") &&
            dest.getParty() == this.getParty()){
                return false;
        }
        if (dest.getType().equals("Water")){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "獅";
    }
}
