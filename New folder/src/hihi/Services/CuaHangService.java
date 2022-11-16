
package hihi.Services;

import hihi.DomainModels.CuaHang;
import hihi.ViewModels.QLCuaHang;
import java.util.ArrayList;


public interface CuaHangService {
    public ArrayList<QLCuaHang> getList();
    
    public ArrayList<CuaHang> getListtb();
    
    public ArrayList<QLCuaHang> tim(String diaChi);
    
    public Boolean them(CuaHang cuaHang);
    
    public Boolean sua(String ma, CuaHang cuaHang);
    
    public Boolean xoa(String ma);
    
    public ArrayList<CuaHang> getListcb();
}
