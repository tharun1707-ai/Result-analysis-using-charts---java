import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResultAnalysisSystem extends JFrame implements ActionListener {

    JLabel title, l1, l2, l3, l4, l5;
    JTextField tName, tRoll, tMark1, tMark2, tMark3;
    JButton bAdd, bShowChart, bClear;
    JTextArea outputArea;

    StudentManager manager = new StudentManager();
    ChartGenerator chartGen = new ChartGenerator();

    public ResultAnalysisSystem() {
        setTitle("Result Analysis System with Charts");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 240, 255));

        title = new JLabel("RESULT ANALYSIS SYSTEM", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 22));
        title.setBounds(100, 20, 400, 30);
        add(title);

        l1 = new JLabel("Student Name:");
        l1.setBounds(100, 80, 150, 25);
        add(l1);
        tName = new JTextField();
        tName.setBounds(250, 80, 200, 25);
        add(tName);

        l2 = new JLabel("Roll No:");
        l2.setBounds(100, 120, 150, 25);
        add(l2);
        tRoll = new JTextField();
        tRoll.setBounds(250, 120, 200, 25);
        add(tRoll);
        l3 = new JLabel("Mark 1:");
        l3.setBounds(100, 160, 150, 25);
        add(l3);
        tMark1 = new JTextField();
        tMark1.setBounds(250, 160, 200, 25);
        add(tMark1);
        l4 = new JLabel("Mark 2:");
        l4.setBounds(100, 200, 150, 25);
        add(l4);
        tMark2 = new JTextField();
        tMark2.setBounds(250, 200, 200, 25);
        add(tMark2);
        l5 = new JLabel("Mark 3:");
        l5.setBounds(100, 240, 150, 25);
        add(l5);
        tMark3 = new JTextField();
        tMark3.setBounds(250, 240, 200, 25);
        add(tMark3);
        bAdd = new JButton("Add Result");
        bAdd.setBounds(100, 290, 120, 30);
        bAdd.addActionListener(this);
        add(bAdd);
        bShowChart = new JButton("Show Chart");
        bShowChart.setBounds(240, 290, 120, 30);
        bShowChart.addActionListener(this);
        add(bShowChart);
        bClear = new JButton("Clear");
        bClear.setBounds(380, 290, 120, 30);
        bClear.addActionListener(this);
        add(bClear);

        outputArea = new JTextArea();
        outputArea.setBounds(100, 340, 400, 180);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setEditable(false);
        outputArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(outputArea);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bAdd) addStudent();
        else if (e.getSource() == bShowChart) chartGen.showChart(manager.getStudents());
        else if (e.getSource() == bClear) clearFields();
    }
    private void addStudent() {
        try {
            String name = tName.getText();
            int roll = Integer.parseInt(tRoll.getText());
            int m1 = Integer.parseInt(tMark1.getText());
            int m2 = Integer.parseInt(tMark2.getText());
            int m3 = Integer.parseInt(tMark3.getText());
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter all details!");
                return;
            }
            Student s = new Student(name, roll, m1, m2, m3);
            manager.addStudent(s);
            outputArea.append(s.toString() + "\n\n");
            JOptionPane.showMessageDialog(this, "Student Result Added Successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.");
        }
    }
    private void clearFields() {
        tName.setText("");
        tRoll.setText("");
        tMark1.setText("");
        tMark2.setText("");
        tMark3.setText("");
        outputArea.setText("");
        manager.clearStudents();
    }

    public static void main(String[] args) {
        new ResultAnalysisSystem();
    }}
