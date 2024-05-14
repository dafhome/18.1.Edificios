public class Casa extends Edificios {

    private boolean esAdosada;

    public Casa(int superficie, double precio, String ubicacion, String tipo, boolean esAdosada) {
        super(superficie, precio, ubicacion, tipo);
        this.esAdosada = esAdosada;
    }

    public Casa() {
        
    }
    public boolean isEsAdosada() {
        return esAdosada;
    }

    public void setEsAdosada(boolean esAdosada) {
        this.esAdosada = esAdosada;
    }

    @Override
    public String toString() {
        String adosada;
        if (esAdosada) {
            adosada="adosada";
        }
        else 
            adosada="no adosada";
        return "Es una "+tipo+" "+adosada+" en "+ubicacion+" con "+superficie+" m2 que cuesta "+precio+"€";
        
    }



    

}
