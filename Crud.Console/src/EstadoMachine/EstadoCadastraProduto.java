/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import comuns.vos.Produto;
import crud.console.CrudConsole;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EstadoCadastraProduto extends EstadoMachine{
    Scanner scan = new Scanner(System.in);
    @Override
    public boolean Executa() {
        Produto produto = new Produto();
        
        System.out.println("Digite o nome do produto: ");
        produto.setCategoria(scan.nextLine());
        System.out.println("Digite a categoria: ");
        produto.setCategoria(scan.nextLine());
        System.out.println("Digite o valor: ");
        produto.setValor(Double.parseDouble(scan.nextLine()));
        CrudConsole.estadoConsole = EnumEstado.MenuGerente.getEstadoMaquina();
        return false;
    }
}
