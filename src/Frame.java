import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Obrazek obrazek = new Obrazek();
    HlPanel hlpanel = new HlPanel(obrazek);
    LeftPanel lfpanel = new LeftPanel();


    public Frame() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.white);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);





        add(hlpanel,BorderLayout.CENTER);
        add(lfpanel,BorderLayout.WEST);
        setVisible(true);



        //vytvořit JTable
        //pomocí add ji někam přidat
        //vytvořeit table model
        //např. new EmptytableModel()
        //přidat model do tabulky
        //pomocí setModel

    }
}
