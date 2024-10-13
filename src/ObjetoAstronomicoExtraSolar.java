abstract class ObjetoAstronomicoExtraSolar {
    private int ID;
    
    abstract void tipoCuerpo1();
    abstract void descripcion();
    
    public void tipoCuerpo2() {
        System.out.println("Extrasolar");
    }
    
    public int getID() {
        return this.ID;
    }
}