import Services.Navegador;
import Services.Celular;
import Services.ReprodutorMusical;

public class iPhone implements Celular, ReprodutorMusical,Navegador {

    private String Numero;
    private String Nome;
    private String Rede;

    public iPhone(String AparelhoNome ,String numero, String Rede)
    {
        this.Nome = AparelhoNome;
        this.Numero = numero;
        this.Rede = Rede;
    }


    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender(String numero) {

    }

    @Override
    public void iniciarCorreioVoz(String msg, String dest) {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {

    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba(String url) {

    }

    @Override
    public void atualizarPagina() {

    }
}
