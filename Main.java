class Main {
  public static void main(String[] args) {
    
  Calendario calendario2021 = new Calendario();
    calendario2021.setMaterial("Plástico");
    calendario2021.setFolhas(12);
    calendario2021.setCapa("Calendario 2021");

    Calendario calendario2022 = new Calendario();
    calendario2022.setMaterial("Papel");
    calendario2022.setFolhas(6);
    calendario2022.setCapa("Calendario 2022");


    System.out.println("Capa: " + calendario2021.getCapa() + "\t" + "Material: " + calendario2021.getMaterial());
    System.out.println("Capa: " + calendario2022.getCapa()  + "\t" + " Material: " + calendario2022.getMaterial());
    
  }
}