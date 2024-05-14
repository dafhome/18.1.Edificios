public class Trastero extends Edificios {
    private boolean seguridad;

    public Trastero(int superficie, double precio, String ubicacion, String tipo, boolean seguridad) {
        super(superficie, precio, ubicacion, tipo);
        this.seguridad = seguridad;
    }


    public Trastero() {

    }
    public boolean isSeguridad() {
        return seguridad;
    }

    public void setSeguridad(boolean seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public String toString() {
        String conSeguridad;
        if (seguridad) {
            conSeguridad="con";
        }
        else
            conSeguridad="sin";
        return "Es un "+tipo+" "+conSeguridad+" seguridad en "+ubicacion+" con "+superficie+" m2 que cuesta "+precio+"€";
    }

 
  


}
