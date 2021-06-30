public  class  Calendario {
  private String capa;
  private int folhas;
  private String material; // Papel, Plástico
  private boolean possuiArame;
  private String tipo; // Romano, Gregoriano, Chinês, Lunar

public String getCapa(){
    return capa;
  }
  
  public void setCapa(String capa){
    this.capa = capa;
  }
  
  public int getFolhas(){
    return folhas;
  }
  
  public void setFolhas(int folhas){
    this.folhas = folhas;
  }
  
  public String getMaterial(){
    return material;
  }
  
  public void setMaterial(String material){
    this.material = material;
  }

  public boolean getPossuiArame(){
    return possuiArame;
  }
  
  public void setPossuiArame(boolean possuiArame){
    this.possuiArame = possuiArame;
  }
 
  public String getTipo(){
    return tipo;
  }
  
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  
}