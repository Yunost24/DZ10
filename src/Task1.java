import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1 extends JFrame {
    private int scoreMilan = 0;
    private int scoreMadrid = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public Task1() {
        // Настройка окна
        setTitle("Football Match Score");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Компоненты
        JButton acMilanButton = new JButton("AC Milan");
        JButton realMadridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        // Добавление действий для кнопок
        acMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMilan++;
                updateScore("AC Milan");
            }
        });

        realMadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreMadrid++;
                updateScore("Real Madrid");
            }
        });

        // Добавление компонентов в окно
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(acMilanButton);
        buttonPanel.add(realMadridButton);
        add(buttonPanel);

        // Отображение окна
        setVisible(true);
    }

    private void updateScore(String lastScorer) {
        // Обновление текста результата
        resultLabel.setText("Result: " + scoreMilan + " X " + scoreMadrid);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        // Определение победителя
        if (scoreMilan > scoreMadrid) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (scoreMadrid > scoreMilan) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
       
        new Task1();
    }
}
