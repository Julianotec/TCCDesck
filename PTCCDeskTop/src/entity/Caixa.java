/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javafx.scene.chart.PieChart;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;



@Entity
public class Caixa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double saldoFinal; 

    private String descricao;
    private double saldoReal;
    private String usuario;
    private Double quebraDeCaixa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldoReal() {
        return saldoReal;
    }

    public void setSaldoReal(double saldoReal) {
        this.saldoReal = saldoReal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getQuebraDeCaixa() {
        return quebraDeCaixa;
    }

    public void setQuebraDeCaixa(Double quebraDeCaixa) {
        this.quebraDeCaixa = quebraDeCaixa;
    }
    
}
