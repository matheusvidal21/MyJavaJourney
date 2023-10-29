package exercicio01.entities;

public class Invoice {

    private Double basicPayament;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicPayament, Double tax) {
        this.basicPayament = basicPayament;
        this.tax = tax;
    }

    public Double getBasicPayament() {
        return basicPayament;
    }

    public void setBasicPayament(Double basicPayament) {
        this.basicPayament = basicPayament;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayament(){
        return getBasicPayament() + getTax();
    }

}
