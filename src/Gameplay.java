import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    // menetukan panjang ular
    private int[] snakexLength = new int[750];
    private int[] snakeyLength = new int[750];

    // arah ular
    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    // buat gambar kepala
    private ImageIcon snakeHead;

    private int lengthOfSnake = 3;
    private int moves = 0;

    private Timer timer;
    private int delay = 100;
    private ImageIcon snakeBody;

    private ImageIcon titleImage;

    public Gameplay() {

        // buat pas mulai gamenya
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // cek jika game udah dimulai
        if (moves == 0) {
            snakexLength[2] = 50;
            snakexLength[1] = 75;
            snakexLength[0] = 100;

            snakeyLength[2] = 100;
            snakeyLength[1] = 100;
            snakeyLength[0] = 100;
        }

        // border judul
        g.setColor(Color.WHITE);
        g.drawRect(24, 10, 851, 55);

        // judul
        titleImage = new ImageIcon("images/title.png");
        titleImage.paintIcon(this, g, 25, 11);

        // border untuk gameplay
        g.setColor(Color.WHITE);
        g.fillRect(24, 74, 851, 577);

        // background gameplay
        g.setColor(Color.black);
        g.fillRect(25, 75, 850, 575);

        // instansiasi gambar buat kepala ular
        snakeHead = new ImageIcon("images/snakeHead.png");
        snakeHead.paintIcon(this, g, snakexLength[0], snakeyLength[0]);

        for (int i = 0; i < lengthOfSnake; i++) {
            if (i == 0 && (right || left || up || down)) {
                snakeHead = new ImageIcon("images/snakeHead.png");
                snakeHead.paintIcon(this, g, snakexLength[i], snakeyLength[i]);
            }
            if (i != 0) {
                snakeBody = new ImageIcon("images/snakeimage.png");
                snakeBody.paintIcon(this, g, snakexLength[i], snakeyLength[i]);
            }
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
