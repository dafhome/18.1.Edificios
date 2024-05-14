public class Edificios {
    
    protected int superficie;
    protected double precio;
    protected String ubicacion;
    protected String tipo;
    public Edificios(int superficie, double precio, String ubicacion, String tipo) {
        this.superficie = superficie;
        this.precio = precio;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
    }
    public Edificios() {
    }
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Es un/a "+tipo+" en "+ubicacion+" con "+superficie+" m2 que cuesta "+precio+"€";
    }

    public String toString2(){
        return tipo+" en "+ubicacion;
    }


}
