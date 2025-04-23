
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TamagotchiGUI {

    private Pet pet;
    private JLabel hungerLabel, happinessLabel, energyLabel;
    private JLabel moodLabel;
    private JLabel reactionLabel;
    private boolean blink = false;

    // Declare the buttons
    private JButton feedButton, playButton, sleepButton;

    public TamagotchiGUI() {
        pet = new Pet();

        // Set up the window (Must go first)
        JFrame frame = new JFrame("Tamagotchi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(7, 1));

        // Pet naming
        String name = JOptionPane.showInputDialog("Name your Tamagotchi:");
        if (name == null || name.trim().isEmpty()) {
            name = "Tama";
        }
        JLabel nameLabel = new JLabel("🐾 " + name + "'s Status", SwingConstants.CENTER);
        frame.add(nameLabel);

        // Labels
        hungerLabel = new JLabel();
        happinessLabel = new JLabel();
        energyLabel = new JLabel();

        // Create the Buttons
        feedButton = new JButton("Feed");
        playButton = new JButton("Play");
        sleepButton = new JButton("Sleep");

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

        moodLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(moodLabel);

        reactionLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(reactionLabel);

        frame.add(feedButton);
        frame.add(playButton);
        frame.add(sleepButton);

        updateLabels();

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

        // Calculate mood
        int avg = (pet.getHunger() + pet.getHappiness() + pet.getEnergy()) / 3;
        String face;
        if (avg >= 80) {
            face = blink ? "(ᵔᴥᵔ)" : "(•ᴥ•)";
        } else if (avg >= 50) {
            face = blink ? "(•‿•)" : "(•_•)";
        } else if (avg >= 20) {
            face = blink ? "(ಥ﹏ಥ)" : "(ಥ_ಥ)";
        } else {
            face = "(×_×)";
        }
        moodLabel.setText(face);
        blink = !blink;

        // Reactions
        String[] reactions = {
                "I'm sleepy...", "Yay! Play time!", "Feed me!", "Let's be friends!",
                "Zzz...", "Can we play?", "Tummy rumble..."
        };
        reactionLabel.setText(reactions[(int) (Math.random() * reactions.length)]);

        // Game over dude
        if (pet.getHunger() >= 100 && pet.getEnergy() <= 0 && pet.getHappiness() <= 0) {
            moodLabel.setText("(×_×)");
            reactionLabel.setText("Your Tamagotchi ran away... 😢");
            feedButton.setEnabled(false);
            playButton.setEnabled(false);
            sleepButton.setEnabled(false);
        }

    } // End of updateLabels method

} // End of TamagotchiGUI class
