package Animals;

import java.util.Date;

@SuppressWarnings("SpellCheckingInspection")
class Reservor {
    private String Name;
    private Date ReservedAt;

    Date getReservationDate() {
        return ReservedAt;
    }


    String getName() {
        return Name;
    }

    Reservor(String name, Date reservedAt) {
        Name = name;
        ReservedAt = reservedAt;
    }
}
