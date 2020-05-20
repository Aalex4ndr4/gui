import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {

    public static JTextField text = new JTextField();

    private Font font = new Font("System", Font.BOLD, 20);

    public static Button guzik;

    protected static JMenuBar menuBar = new JMenuBar();
    protected static JMenu menu;
    protected static JMenuItem  mWatek,mOprogramie;


    public Gui(){

        mWatek = new JMenuItem("Uruchom wątek");
        mOprogramie = new JMenuItem("o programie");
        menu = new JMenu("Menu");
        setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(mWatek);
        menu.add(mOprogramie);

        mWatek.addActionListener(this);
        mOprogramie.addActionListener(this);

        setSize(400, 400);
        setTitle("Watki");
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text.setBounds(50,30,280,40);
        text.setFont(font);
        text.setEditable(false);
        add(text);


        guzik = new Button("kliknij mnie");
        guzik.setBounds(110,130,150,60);
        guzik.setBackground(Color.green);
        guzik.setFont(font);
        add(guzik);
        guzik.addActionListener(this);
    }

    Watki watki1 = new Watki();

    public void wykonuj(){
        watki1.start();
        guzik.setEnabled(false);
        mWatek.setEnabled(false);
        text.setText("Usypiam sie na " + watki1.t + " s");
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == mWatek || source == guzik)
            wykonuj();

        if(source == mOprogramie)
            JOptionPane.showMessageDialog(null,"Jest to program do uruchamiania wątków \n Autor: Aleksandra Harasimik");

    }


    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.getContentPane().setBackground(Color.BLUE);
    }
}