
package dao;

import java.util.List;
import models.ChiSoDien;


public interface ChiSoDienDAO {
    public List<ChiSoDien> getList();
    // Lấy danh sách chỉ số điện chưa lập hoá đơn
    public List<ChiSoDien> getListExcludedInHoaDon();
    public ChiSoDien getChiSoDien(int maKH, int thangID);
    public ChiSoDien getLastChiSoDien(int maKH);
    public ChiSoDien getFirstChiSoDien(int maKH);
    public int createORUpdate(ChiSoDien chiSoDien);
}
