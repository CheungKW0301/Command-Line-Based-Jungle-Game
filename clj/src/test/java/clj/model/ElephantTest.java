package clj.model;

import clj.controller.Coordinate;

public class ElephantTest extends PieceTest{
    
    protected ElephantTest(int party){
        super("Elephant", 8, party);
    }

    @Override
    protected boolean canCapture(PieceTest another){
        
        /* 
        // if there is no enemy piece
        // then this is always true
        if (another == null){
            return true;
        }

        // if another piece is trapped
        // then this is always true
        if (another.isTrapped()){
            return true;
        }

        // if the piece's party is the same as you
        // then this is always false
        if (another.getParty() == this.getParty()){
            return false;
        }
        
        // Since Elephant has the highest rank among all animal
        // no further rank comparison is needed
        */
        return true;
    }

    @Override
    protected boolean canMoveTo(BoardObjTest dest){
        
        /*
        // if the destination is water
        // then this is always false
        if (dest.getType().equals("Water")){
            return false;
        }

        // if the destination is a den and the den's party is the same as you
        // then this is always false
        if (dest.getType().equals("Den") && dest.getParty() == this.getParty()){
            return false;
        }
        */

        return true;
    }

    @Override
    protected Coordinate calFinalDest(Coordinate dest){
        /*
        // since this is Elephant, no jump operation
        return dest;
        */
        return null;
    }
}
