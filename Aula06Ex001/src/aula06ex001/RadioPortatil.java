
package aula06ex001;


public class RadioPortatil implements Radio{
    
    //Declaracao dos atributos
    private boolean estadoRadio;
    private double estacaoRadio;
    
    //Implementacao dos construtores
    
    //Métodos Getters e Setters
    
    //Implementar os Métodos definidos na interface.
    @Override
    public void play() {
        this.estadoRadio = true;
    }

    @Override
    public void pause() {
        this.estadoRadio = false;
    }

    @Override
    public void estado() {
        //System.out com a informacao atual de todos os atributos definidos nesta classe.
    }

    @Override
    public void dialAumenta() {
          //Limitar a faixa máxima em 108MHz.
        this.estacaoRadio = this.estacaoRadio + 0.3;
    }

    @Override
    public void dialDiminui() {
        //Limitar a faixa mminima em FM 88MHz.
        this.estacaoRadio = this.estacaoRadio - 0.3;
    }

    @Override
    public void volumeAumenta() {
        //Volume limitado ao nivel 0 -> incremento de 5 unidades
    }

    @Override
    public void volumeDiminui() {
    }

    @Override
    public void trocarBanda() {
        //Trocar a faixa do radio
        //Se tiver em AM, trocar para FM
    }
    
}
