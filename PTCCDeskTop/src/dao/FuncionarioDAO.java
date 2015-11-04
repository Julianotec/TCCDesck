/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entity.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo_jose_santana
 */
public class FuncionarioDAO extends MySQL {

    public boolean insert(Funcionario funcionario) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("INSERT INTO Funcionario "
                            + "( nome, cpf, senha, endereço, telefone, celular,  cidade,"
                            + " estado, adm, salario, vales)  "
                            + "VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,? )");
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setInt(3, funcionario.getSenha());
            ps.setString(4, funcionario.getEndereço());
            ps.setString(5, funcionario.getTelefone());
            ps.setString(6, funcionario.getCelular());
            ps.setString(7, funcionario.getCidade());
            ps.setString(8, funcionario.getEstado());
            ps.setInt(9, funcionario.getAdm());
            ps.setDouble(10, funcionario.getSalario());
            ps.setDouble(11, funcionario.getVales());
            
            ps.execute();
            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean update(Funcionario funcionario) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE funcionario "
                    + "(SET = nome = ?, cpf = ?, senha = ?, endereco = ?, telefone = ?, celular = ?, cidade = ?,"
                    + " estado = ?, adm = ?, salario = ?, vales = ?)  "
                    + " WHERE idFuncionario = ?");
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setInt(3, funcionario.getSenha());
            ps.setString(4, funcionario.getEndereço());
            ps.setString(5, funcionario.getTelefone());
            ps.setString(6, funcionario.getCelular());
            ps.setString(8, funcionario.getCidade());
            ps.setString(9, funcionario.getEstado());
            ps.setInt(10, funcionario.getAdm());
            ps.setDouble(11, funcionario.getSalario());
            ps.setDouble(12, funcionario.getVales());
            ps.setInt(12, funcionario.getIdFuncionario());
            ps.execute();

            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public boolean delete(int id) {
        Connection c = this.getConnection();
        try {
            PreparedStatement ps
                    = c.prepareStatement("DELETE FROM Funcionario "
                            + "WHERE idFuncionario = ?");
            ps.setInt(1, id);

            ps.execute();

            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public Funcionario getFuncionarioById(int id) {
        Connection c = this.getConnection();
        Funcionario funcionario = null;
        try {
            PreparedStatement ps = c.prepareStatement("SELECT idFuncionario, "
                    + " nome, cpf, senha, endereco, telefone, celular, cidade,"
                    + " estado, adm, salario)  "
                    + "FROM funcionario WHERE idFuncionario = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSenha(rs.getInt("senha"));
                funcionario.setEndereço(rs.getString("endereco"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setEstado(rs.getString("estado"));
                funcionario.setAdm(rs.getInt("adm"));
                funcionario.setSalario(rs.getDouble("salario"));

            }
            rs.close();
            ps.close();
            return funcionario;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public List<Funcionario> listarFuncionario() {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        Connection I = this.getConnection();
        try {
            PreparedStatement ps
                    = I.prepareStatement("SELECT idFuncionario,"
                            + " nome, cpf, senha, endereço, telefone, celular, cidade,"
                            + " estado, adm, salario)  "
                            + "FROM funcionario");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setIdFuncionario(rs.getInt("idFuncionario"));
                objFuncionario.setNome(rs.getString("nome"));
                objFuncionario.setCpf(rs.getString("cpf"));
                objFuncionario.setSenha(rs.getInt("senha"));
                objFuncionario.setEndereço(rs.getString("endereço"));
                objFuncionario.setTelefone(rs.getString("telefone"));
                objFuncionario.setCelular(rs.getString("celular"));
                objFuncionario.setCidade(rs.getString("cidade"));
                objFuncionario.setEstado(rs.getString("estado"));
                objFuncionario.setAdm(rs.getInt("adm"));
                objFuncionario.setSalario(rs.getDouble("salario"));
                lista.add(objFuncionario);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                I.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return lista;
    }

}
