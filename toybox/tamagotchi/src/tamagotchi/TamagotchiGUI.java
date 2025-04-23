
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TamagotchiGUI {

    private Pet pet;
    private JLabel hungerLabel, happinessLabel, energyLabel;

    public TamagotchiGUI() {
        pet = new Pet();

        // Set up the window
        JFrame frame = new JFrame("Tamagotchi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(6, 1));

        // Labels
        hungerLabel = new JLabel();
        happinessLabel = new JLabel();
        energyLabel = new JLabel();

        updateLabels();

        // Buttons
        JButton feedButton = new JButton("Feed");
        JButton playButton = new JButton("Play");
        JButton sleepButton = new JButton("Sleep");

        feedButton.addActionListener(e -> {
            pet.feed();
            updateLabels();
        });

        playButton.addActionListener(e -> {
            pet.play();
            updateLabels();
        });

        sleepButton.addActionListener(e -> {
            pet.sleep();
            updateLabels();
        });

        // Add components
        frame.add(hungerLabel);
        frame.add(happinessLabel);
        frame.add(energyLabel);
        frame.add(feedButton);
        frame.add(playButton);
        frame.add(sleepButton);

        frame.setVisible(true);

        // Timer for tick
        Timer timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pet.tick();
                updateLabels();
            }
        });
        timer.start();
    }

    private void updateLabels() {
        hungerLabel.setText("Hunger: " + pet.getHunger());
        happinessLabel.setText("Happiness: " + pet.getHappiness());
        energyLabel.setText("Energy: " + pet.getEnergy());
    }

} // End of TamagotchiGUI class
