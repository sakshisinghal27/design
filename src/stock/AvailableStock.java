package stock;

public class AvailableStock implements Comparable {
    public Float pricePerUnit;
    public Float quantity;
    public String time;

    public AvailableStock(Float ppu, Float quantity, String time) {
        this.pricePerUnit = ppu;
        this.quantity = quantity;
        this.time = time;
    }

    @Override
    public int compareTo(Object inc) {
        return pricePerUnit.compareTo(((AvailableStock) inc).pricePerUnit);
    }

    @Override
    public String toString() {
        return "AvailableStock{" +
                "pricePerUnit=" + pricePerUnit +
                ", quantity=" + quantity +
                ", time='" + time + '\'' +
                '}';
    }
}

