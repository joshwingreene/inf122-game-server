package app.model;

import app.model.BoardIndex;
import java.io.Serializable;


/**
 *
 * @author Jiahao Chen
 *
 */

public class Move implements Serializable {

    private final BoardIndex dest;

    public Move(BoardIndex index) {
        this.dest = index;
    }

	public BoardIndex getdDest() {
		return dest;
	}
}
