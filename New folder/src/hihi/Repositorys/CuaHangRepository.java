
package hihi.Repositorys;

import hihi.DomainModels.CuaHang;
import hihi.Utiltes.DBConnection;
import hihi.ViewModels.QLCuaHang;
import java.util.ArrayList;
import java.sql.*;


public class CuaHangRepository {
    DBConnection connection;
    
    public ArrayList<QLCuaHang> getListFromDB(){
        ArrayList<QLCuaHang> list = new ArrayList<>();
        String sql = "select Ma,Ten,DiaChi,ThanhPho,QuocGia from CuaHang";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                QLCuaHang cuaHang = new QLCuaHang();
                cuaHang.setMa(rs.getString(1));
                cuaHang.setTen(rs.getString(2));
                cuaHang.setDiaChi(rs.getString(3));
                cuaHang.setThanhPho(rs.getString(4));
                cuaHang.setQuocGia(rs.getString(5));
                list.add(cuaHang);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
    
    public Boolean them(CuaHang cuaHang){
        String query = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) values(?,?,?,?,?)";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)){
            ps.setObject(1, cuaHang.getMa());
            ps.setObject(2, cuaHang.getTen());
            ps.setObject(3, cuaHang.getDiaChi());
            ps.setObject(4, cuaHang.getThanhPho());
            ps.setObject(5, cuaHang.getQuocGia());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Boolean xoa(String ma){
        String query = "delete CuaHang where Ma = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)){
            ps.setObject(1, ma);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Boolean sua(String ma, CuaHang cuaHang){
        String query = "update CuaHang set Ma = ?, Ten = ?, DiaChi = ?, ThanhPho = ?, QuocGia = ? where Ma = ?";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)){
            ps.setObject(1, cuaHang.getMa());
            ps.setObject(2, cuaHang.getTen());
            ps.setObject(3, cuaHang.getDiaChi());
            ps.setObject(4, cuaHang.getThanhPho());
            ps.setObject(5, cuaHang.getQuocGia());
            ps.setObject(6, ma);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<CuaHang> getListcb(){
        ArrayList<CuaHang> list = new ArrayList<>();
        String sql = "select Ten from CuaHang";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                CuaHang ch = new CuaHang();
                ch.setTen(rs.getString(1));
                list.add(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<CuaHang> getListtb(){
        ArrayList<CuaHang> list = new ArrayList<>();
        String sql = "select Id,Ma,Ten,DiaChi,ThanhPho,QuocGia from CuaHang";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                CuaHang cuaHang = new CuaHang();
                cuaHang.setId(rs.getString(1));
                cuaHang.setMa(rs.getString(2));
                cuaHang.setTen(rs.getString(3));
                cuaHang.setDiaChi(rs.getString(4));
                cuaHang.setThanhPho(rs.getString(5));
                cuaHang.setQuocGia(rs.getString(6));
                list.add(cuaHang);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
    
    public ArrayList<QLCuaHang> tim(String diaChi){
        ArrayList<QLCuaHang> list = new ArrayList<>();
        String sql = "select Ma,Ten,DiaChi,ThanhPho,QuocGia from CuaHang where DiaChi like N'%"+diaChi+"%'";
        try (Connection con = connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                QLCuaHang cuaHang = new QLCuaHang();
                cuaHang.setMa(rs.getString(1));
                cuaHang.setTen(rs.getString(2));
                cuaHang.setDiaChi(rs.getString(3));
                cuaHang.setThanhPho(rs.getString(4));
                cuaHang.setQuocGia(rs.getString(5));
                list.add(cuaHang);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }
        
}
