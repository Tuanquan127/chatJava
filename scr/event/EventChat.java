package event;

import entity.TinNhan;
import java.util.ArrayList;
import entity.TaiKhoan;

public interface EventChat {
    public void sendMessage(TinNhan mess);
    
    public void receiveMessage(TinNhan mess);
    
    public void setChatData(ArrayList<TinNhan> messages);
    
    public void setUser(TaiKhoan user);
    
    public void updateUser(TaiKhoan user);
    
    public void requestData(TaiKhoan chatter);
}
