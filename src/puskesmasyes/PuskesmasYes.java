package puskesmasyes;

import database.Koneksi;
import VIEW.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PuskesmasYes {
    
    public static void main(String[] args) throws SQLException {
        new MenuView().show();
    }
}
