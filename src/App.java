import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Feriados feriados = new Feriados();

        Feriado confraMundial = new Feriado("Confraternização mundial", "01/01/2023");
        feriados.adicione(confraMundial);

        Feriado carnaval = new Feriado("Carnaval", "21/02/2023");
        feriados.adicione(carnaval);

        Feriado pascoa = new Feriado("Pascoa", "17/04/2023");
        feriados.adicione(pascoa);

        Feriado tiradentes = new Feriado("Tiradentes", "21/04/2023");
        feriados.adicione(tiradentes);

        feriados.findFeriado("21/02/2023");

        feriados.getAllOnString(); 
    }
}
