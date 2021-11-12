import java.awt.event.*;


import ui.PlayerWindow;
import ui.AddSongWindow;


public class Player {


    private final PlayerWindow window;

    public Player() {
        String windowTitle = "Music Player";


        ActionListener buttonPlayNow = e -> {};
        ActionListener buttonRemove = e -> {};
        ActionListener buttonAddMusic = e -> {};
        ActionListener buttonPlayPause = e -> {};
        ActionListener buttonStop = e -> {};
        ActionListener buttonNext = e -> {};
        ActionListener buttonPrevious = e -> {};
        ActionListener buttonShuffle = e -> {};
        ActionListener buttonRepeat = e -> {};
        MouseListener Click = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        MouseMotionListener Motion = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        };

        String[][] queueArray = new String[1][1];
        this.window = new PlayerWindow(
                buttonPlayNow, buttonRemove,
                buttonAddMusic, buttonPlayPause,
                buttonStop, buttonNext,
                buttonPrevious, buttonShuffle,
                buttonRepeat, Click,
                Motion, windowTitle, queueArray
        );
    }
}

