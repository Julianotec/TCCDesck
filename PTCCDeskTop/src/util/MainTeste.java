/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.ExtratoDAO;
import entity.Extrato;
import entity.RelatorioPdf;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo_jose_santana
 */
public class MainTeste {

    public static void main(String[] args) throws Exception {
        Date hoje = new Date();
        ExtratoDAO dao = new ExtratoDAO();
        List<Extrato> lista = dao.getAllByData(hoje);
//        for (Extrato extrato : lista) {
//            System.out.println(extrato.getDescricao() + " - " + extrato.getData());
//            System.out.println(extrato.getNomeFuncionario());
//        }
        RelatorioPdf relatorioPdf = new RelatorioPdf();
        relatorioPdf.gerarRelatorio(lista);
    }
}
