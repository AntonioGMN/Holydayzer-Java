import java.util.ArrayList;
import java.util.List;

public class Feriados {
  List<Feriado> feris = new ArrayList<>();

  public Feriados() {}

  public Feriados(List<Feriado> f) {
    this.feris = f;
  }

  public void adicione(Feriado f){
    this.feris.add(f);
  }

  public void findFeriado(String data){
    for(int i=0; i<this.feris.size(); i++){
        if(this.feris.get(i).getData() == data) {
          System.out.println(data+"é feriado de "+ this.feris.get(i).getNome());
          return;
        }
    }
    System.out.println("Não existe feriado nesse dia");
  }

  public void getAllOnString(){
    for(int i=0; i<this.feris.size(); i++){
      System.out.println( this.feris.get(i).getString());
    }
  }
}
