abstract class Estrella extends ObjetoAstronomicoExtraSolar {
    int a = super.getID();
    abstract void explotar();
    
    public void tipoCuerpo1() {
        System.out.println("Simple " + a);
    }
}