package exemplo_interface.estabelecimento;

import exemplo_interface.equipamentos.copiadora.Copiadora;
import exemplo_interface.equipamentos.copiadora.Xerox;
import exemplo_interface.equipamentos.digitalizadora.Digitalizadora;
import exemplo_interface.equipamentos.digitalizadora.Scanner;
import exemplo_interface.equipamentos.impressora.DeskJet;
import exemplo_interface.equipamentos.impressora.Impressora;
import exemplo_interface.equipamentos.impressora.LaserJet;
import exemplo_interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        DeskJet deskJet = new DeskJet();
        Scanner scanner = new Scanner();
        Xerox xerox = new Xerox();


        Impressora impressora = deskJet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = xerox;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
