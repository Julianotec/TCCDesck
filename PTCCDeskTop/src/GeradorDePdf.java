
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import dao.FuncionarioDAO;
import dao.caixaDAO;
import entity.Caixa;
import entity.Funcionario;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo_jose_santana
 */
public class GeradorDePdf {

    Funcionario f = new Funcionario();
    FuncionarioDAO dao = new FuncionarioDAO();
    
    public static void main(String[] args) {
        
        
        // criação do documento 
        Document document = new Document();
        
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\ricardo_jose_santana\\DownloadsPDF_DevMedia.pdf"));
            document.open();
            // adicionando um parágrafo no documento 
           
            document.add(new Paragraph("Relatorio de Vales"));
            document.add(new Paragraph("Relatorio de Vales"));
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        document.close();
    }

}

