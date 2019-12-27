import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


class JTableEx {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTable");
        // f.setLayout(null);
        String row[][] = {{"1", "ram", "1000"}, {"2", "lakhan", "1000"}};
        String column[] = {"id", "name", "salary"};
        JTable t =new JTable(row, column);
        JScrollPane s1 = new JScrollPane(t);
        f.add(s1);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}