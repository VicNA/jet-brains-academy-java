package cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int total_rows;
    private int total_columns;
    private List<Seat> available_seats;

    public Room(int total_rows, int total_columns) {
        this.total_rows = total_rows;
        this.total_columns = total_columns;
        initRoom();
    }

    private void initRoom() {
        available_seats = new ArrayList<>();
        for (int i = 0; i < total_rows; i++) {
            for (int j = 0; j < total_columns; j++) {
                available_seats.add(new Seat(i + 1, j + 1));
            }
        }
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public void setTotal_rows(int total_rows) {
        this.total_rows = total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public void setTotal_columns(int total_columns) {
        this.total_columns = total_columns;
    }

    public List<Seat> getAvailable_seats() {
        return available_seats;
    }
}
