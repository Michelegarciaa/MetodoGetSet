public  class  Caderno {
 private String modelo;
 private String capa;
 private int folhas; 
 private float espessura;// 22,5 mm,30,0mm
 private boolean possuiArame;

  public String getModelo(){
    return modelo;
  }
  
  public void setModelo(String modelo){
    this.modelo = modelo;
  }
  
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
  
  public float getEspessura(){
    return espessura;
  }

  public void setEspessura(float espessura){
    this.espessura = espessura;
  }
 
  public boolean getPossuiArame(){
    return possuiArame;
  }

  public void setPossuiArame(boolean possuiArame){
    this.possuiArame = possuiArame;
  }
}