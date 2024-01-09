package cristinapalmisani.U2W1L1.entities;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class Table {
    private final int numberTable;
    private final int seats;
    private boolean isAvailable;

    public Table(int numberTable, int seats) {
        this.numberTable = numberTable;
        this.seats = seats;
        this.isAvailable = true;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
