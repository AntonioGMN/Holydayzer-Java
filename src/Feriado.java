public class Feriado {
  private String nome;
  private String data;
  
  public Feriado(String nome, String data) {
    this.nome = nome;
    this.data = data;
  }

  public String getData(){
    return data;
  }

  public String getNome(){
    return nome;
  }

  public String getString(){
    return data + " => "+ nome;
  }
}
