package clj.model;

import clj.controller.Coordinate;

public class Rat extends Piece{

    protected Rat(int party){
        super("Rat", 1, party);
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
        if (another.getAnimal().equals("Elephant")){
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
        return true;
    }

    @Override
    public String toString() {
        return "鼠";
    }

    @Override
    protected Coordinate calFinalDest(Coordinate dest, Board baord, int dx, int dy) {
        return dest;
    }
    
}
