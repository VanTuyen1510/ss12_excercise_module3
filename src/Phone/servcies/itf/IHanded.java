package Phone.servcies.itf;

import Phone.models.Handed;


import java.io.IOException;
import java.util.List;

public interface IHanded extends IService {
    List<Handed> displayPhone() throws IOException;
    List<Handed> addPhone(Handed handed) throws IOException;
    List<Handed> removePhone(String id) throws IOException;
    void searchPhone(String id) throws IOException;
}
