public class Auto {
    private String marca;
    private String modelo;
    private int year;
    private Double precio;

    public Auto(String marca, String modelo, int year, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
