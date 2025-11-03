import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.*;

public class ChartGenerator {

    public void showChart(List<Student> students) {
        if (students.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "No data to display!");
            return;
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Student s : students) {
            dataset.addValue(s.total, "Total Marks", s.name);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Student Performance Chart",
                "Student Name",
                "Total Marks",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartFrame frame = new ChartFrame("Result Chart", chart);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
