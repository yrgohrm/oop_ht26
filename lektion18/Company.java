import java.util.*;

public record Company(String name, String orgNumber, String streetAddress) {
 
    public Company {
        Objects.requireNonNull(name, "name can't be null");
        Objects.requireNonNull(orgNumber, "orgNumber can't be null");
        Objects.requireNonNull(streetAddress, "streetAddress can't be null");
    }

    public Company(String name) {
        this(name, "", "");
    }

    @Override 
    public String toString() {
        return String.format("%s (%s)%n%s", name, orgNumber, streetAddress);
    }
}
