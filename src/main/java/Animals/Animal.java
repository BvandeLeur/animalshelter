package Animals;

import java.util.Date;

@SuppressWarnings("SpellCheckingInspection")
public abstract class Animal implements ISellable {
    private String Name;
    private Gender Gender;
    private Reservor ReservedBy;

    public Animal(String name, Gender gender) {
        Name = name;
        Gender = gender;
    }

    Reservor getReservor() {
        return ReservedBy;
    }

    Gender getGender() {
        return Gender;
    }

    @Override
    public String getName() {
        return Name;
    }

    public boolean Reserve(String reservedBy) {
        if (ReservedBy == null) {
            ReservedBy = new Reservor(reservedBy, new Date());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String reserved = "not reserved";
        if (ReservedBy != null) {
            reserved = "reserved by " + ReservedBy.getName();
        }
        return String.format("%s, %s, %s, € %s", Name, Gender, reserved, getPrice());
    }

}
