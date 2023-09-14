package financial;

import java.math.BigDecimal;

public class StockExchange {
    private String name;
    private String cod;
    private double valueStock;
    private BigDecimal capitalization;
    private int volume;

    public StockExchange(String name, String cod, double valueStock, BigDecimal capitalization, int volume) {
        this.name = name;
        this.cod = cod;
        this.valueStock = valueStock;
        this.capitalization = capitalization;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getValueStock() {
        return valueStock;
    }

    public void setValueStock(double valueStock) {
        this.valueStock = valueStock;
    }

    public BigDecimal getCapitalization() {
        return capitalization;
    }

    public void setCapitalization(BigDecimal capitalization) {
        this.capitalization = capitalization;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "StockExchange{" +
                "name='" + name + '\'' +
                ", cod='" + cod + '\'' +
                ", valueStock=" + valueStock +
                ", capitalization=" + capitalization +
                ", volume=" + volume +
                '}';
    }
}
