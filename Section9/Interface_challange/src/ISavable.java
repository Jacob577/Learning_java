import java.awt.*;
import java.util.ArrayList;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
    ArrayList populate();

}
