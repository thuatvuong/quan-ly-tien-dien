
package services;

import java.util.List;
import models.HoaDon;


public interface HoaDonService {
    public List<HoaDon> getList();
    public boolean deleteData(long maHoaDon);
    public int createHoaDon(HoaDon hoaDon);
    public int updateBillStatus(int maHD);
}
