package exemplo_interface.equipamentos.multifuncional;

import exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interface.equipamentos.impressora.Impressora;

// JAVA não permite herança multipla, portanto, utiliza-se Interfaces
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");
    }
}
