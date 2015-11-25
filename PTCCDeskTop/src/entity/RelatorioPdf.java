/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.lowagie.text.Document;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author ricardo_jose_santana
 */
public class RelatorioPdf {

    public void gerarRelatorio(List<Extrato> extratos) throws Exception {
        Document d = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter.getInstance(d, baos);
        d.open();
        d.setMargins(20, 20, 20, 20);

        PdfPTable cabecario = new PdfPTable(5);
        cabecario.setWidthPercentage(100);
        cabecario.setSpacingBefore(5f);
        cabecario.setSpacingAfter(5f);
        String data;
        
        PdfPCell celulas = new PdfPCell(
                new Phrase("DATA"));
        celulas.setColspan(1);
        cabecario.addCell(celulas);

        PdfPTable tabela = new PdfPTable(5);
        tabela.setWidthPercentage(100);
        tabela.setSpacingBefore(5f);
        tabela.setSpacingAfter(5f);

        for (Extrato umExtrato : extratos) {
            PdfPCell celula = new PdfPCell(
                    new Phrase(umExtrato.getData() + ""));
            celula.setColspan(1);
            tabela.addCell(celula);

            celula = new PdfPCell(
                    new Phrase(umExtrato.getNomeFuncionario()));
            celula.setColspan(1);
            tabela.addCell(celula);

            celula = new PdfPCell(
                    new Phrase(umExtrato.getTipo()));
            celula.setColspan(1);
            tabela.addCell(celula);

            celula = new PdfPCell(
                    new Phrase(umExtrato.getDescricao()));
            celula.setColspan(1);
            tabela.addCell(celula);

            celula = new PdfPCell(
                    new Phrase(umExtrato.getValor() + ""));
            celula.setColspan(1);
            tabela.addCell(celula);

        }
        d.add(tabela);
        d.close();
        FileOutputStream fos = new FileOutputStream("c:/tmp/relatorio.pdf");
        fos.write(baos.toByteArray());
        // byte[] ttt = baos.toByteArray();
        fos.close();

    }

}
