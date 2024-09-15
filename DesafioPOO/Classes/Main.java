package Classes;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.selecionarMusica("Radioactive");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("99-99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
