
package hihi.Services.impl;

import hihi.DomainModels.CuaHang;
import hihi.Repositorys.CuaHangRepository;
import hihi.Services.CuaHangService;
import hihi.ViewModels.QLCuaHang;
import java.util.ArrayList;


public class CuaHangServiceImpl implements CuaHangService{

    private CuaHangRepository cuaHangRepository = new CuaHangRepository();
    
    @Override
    public ArrayList<QLCuaHang> getList() {
        return cuaHangRepository.getListFromDB();
    }

    @Override
    public Boolean them(CuaHang cuaHang) {
        return cuaHangRepository.them(cuaHang);
    }

    @Override
    public Boolean sua(String ma, CuaHang cuaHang) {
        return cuaHangRepository.sua(ma, cuaHang);
    }

    @Override
    public Boolean xoa(String ma) {
        return cuaHangRepository.xoa(ma);
    }

    @Override
    public ArrayList<CuaHang> getListcb() {
        return cuaHangRepository.getListcb();
    }

    @Override
    public ArrayList<CuaHang> getListtb() {
        return cuaHangRepository.getListtb();
    }

    @Override
    public ArrayList<QLCuaHang> tim(String diaChi) {
        
        return cuaHangRepository.tim(diaChi);
        
    }
    
}
