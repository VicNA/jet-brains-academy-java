package cinema.converters;

import cinema.dto.PurchasedTicket;
import cinema.dto.SeatDto;
import cinema.model.Seat;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TicketConverter {

    public PurchasedTicket convertToResponse(Map.Entry<String, Seat> entryTicket) {
        return new PurchasedTicket(entryTicket.getKey(), convertToDto(entryTicket.getValue()));
    }

    private SeatDto convertToDto(Seat seat) {
        SeatDto seatDto = new SeatDto();
        seatDto.setRow(seat.getRow());
        seatDto.setColumn(seat.getColumn());
        seatDto.setPrice(seat.getPrice());
        return seatDto;
    }


}
