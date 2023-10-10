import java.util.ArrayList;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    private long numero;
    private ArrayList<String> abas = new ArrayList<>();

    public Iphone(long numero){
        this.numero = numero;
    }
    public long getNumero(){
        return this.numero;
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando " + musica + "!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public String selecionarMusica(String musica) {
        return musica;
    }

    @Override
    public void ligar(Iphone iphone) {
        System.out.println("Ligando para o número: " + iphone.getNumero());
    }

    @Override
    public void atender() {
        System.out.println("Atendeu o telefone!");
    }

    @Override
    public void iniciarCorreioDeVoz(Iphone iphone) {
        System.out.println("Enviando correio de voz para o número: " + iphone.getNumero());
    }

    @Override
    public void exibirPagina(String url) {
        for(String urls : this.abas){
            if(urls.equalsIgnoreCase(url)){
                System.out.println("Abrindo página: " + url);
                break;
            }
            else{
                System.out.println("Aba não está aberta!");
            }
        }
    }

    @Override
    public void adicionarNovaAba(String url) {
        this.abas.add(url);
        System.out.println("Abas abertas: " + abas);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página!");
    }

    
}
