package content06;

import java.util.ArrayList;
import java.util.List;

public class GoodNaming {
    int elapsedTimeInDays;

    public List<String> getFlaggedCells(String[] gameBoard) {
        List<String> flaggedCells = new ArrayList<>();
        for (String cell : gameBoard)
            if (isFlagged(cell))
                flaggedCells.add(cell);
        return flaggedCells;
    }

    private boolean isFlagged(String cell) {
        return true;
    }
}
