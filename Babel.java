
import java.awt.FlowLayout;
import javax.swing.*;

public class Babel extends JFrame {
    private JLabel babel3;
    
    public Babel(){
        super("Testando Babel");
        setLayout(new FlowLayout());
        Icon torre = new ImageIcon(getClass().getResource("IFMT.png"));
        
        babel3 = new JLabel();
        babel3.setText(" INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        babel3.setIcon(torre);
        babel3.setHorizontalTextPosition(SwingConstants.CENTER);
        babel3.setVerticalTextPosition(SwingConstants.BOTTOM);
        babel3.setToolTipText("IFMT");
        add(babel3);
        
        
    }
    
    
}
