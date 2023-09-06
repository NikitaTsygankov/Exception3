import Exception.EmptyStoreException;
import Exception.ProductNotFoundException;
import Viewer.UserGUI;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException, EmptyStoreException {
        UserGUI gui = new UserGUI();
        gui.show();
    }


}