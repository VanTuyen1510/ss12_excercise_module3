package Phone.servcies.itf;

import Phone.models.Genuine;

import java.io.IOException;
import java.util.List;

public interface IGenuie extends IService{
    List<Genuine> displayPhone() throws IOException;
    List<Genuine> addPhone(Genuine genuine) throws IOException;
    List<Genuine> removePhone(String id) throws IOException;
    void searchPhone(String id) throws IOException;
}
