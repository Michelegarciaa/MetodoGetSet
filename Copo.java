public class Copo{
  
   private String material ; // vidro, plastico, metal
   private String formato; // cilindrico, oval, quadrado
   private int volume; // 180ml, 200ml
   private String tamanho; // pequeno, médio, grande

  public String getMaterial(){
    return material;
  }
  
  public void setMaterial(String material){
    this.material = material;
  }
  
  public String getFormato(){
    return formato;
  }
  
  public void setFormato(String capa){
    this.formato = formato;
  }
 
  public int getVolume(){
    return volume;
  }
  
  public void setVolume(int volume){
    this.volume = volume;
  }
  
  public String getTamanho(){
    return tamanho;
  }
  
  public void setTamanho(String tamanho){
    this.tamanho = tamanho;
  }
  
  
}