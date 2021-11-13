import java.awt.event.*;


import ui.PlayerWindow;
import ui.AddSongWindow;


public class Player {


    private final PlayerWindow window;

    public Player() {
        String windowTitle = "Music Player";


        ActionListener buttonListenerPlayNow = e -> {};
        ActionListener buttonListenerRemove = e -> {};
        ActionListener buttonListenerAddSong = e -> {};
        ActionListener buttonListenerPlayPause = e -> {};
        ActionListener buttonListenerStop = e -> {};
        ActionListener buttonListenerNext = e -> {};
        ActionListener buttonListenerPrevious = e -> {};
        ActionListener buttonListenerShuffle = e -> {};
        ActionListener buttonListenerRepeat = e -> {};

        MouseListener scrubberListenerClick = new MouseListener() {
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
        MouseMotionListener scrubberListenerMotion = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        };

        String[][] queueArray = new String[1][1];
        this.window = new PlayerWindow(
                buttonListenerPlayNow, buttonListenerRemove,
                buttonListenerAddSong, buttonListenerPlayPause,
                buttonListenerStop, buttonListenerNext,
                buttonListenerPrevious, buttonListenerShuffle,
                buttonListenerRepeat, scrubberListenerClick,
                scrubberListenerMotion, windowTitle, queueArray
        );
    }
}

