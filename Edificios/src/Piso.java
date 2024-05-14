public class Piso extends Edificios {

    private int numPlanta;
    private boolean ascensor;
    public Piso(int superficie, double precio, String ubicacion, String tipo, int numPlanta, boolean ascensor) {
        super(superficie, precio, ubicacion, tipo);
        this.numPlanta = numPlanta;
        this.ascensor = ascensor;
    }
    public Piso() {
  
    }
    public int getNumPlanta() {
        return numPlanta;
    }
    public void setNumPlanta(int numPlanta) {
        this.numPlanta = numPlanta;
    }
    public boolean isAscensor() {
        return ascensor;
    }
    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }
    @Override
    public String toString() {
        return "Es un "+tipo+" en la planta "+numPlanta+" en "+ubicacion+" con "+superficie+" m2 que cuesta "+precio+"€";
    }

    
    
}
