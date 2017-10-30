
public class Labs
{
        public static void main (String[] args)
        {
            makeHeader();
            makeDataTitles();
            makeRows();
        } public static void makeHeader() {
            System.out.println("------------------------------------------------------------------");
            System.out.println("\t\t\tStudent Data");
            System.out.println("------------------------------------------------------------------");
        } public static void makeDataTitles() {
            System.out.println("Name\t\tLab\tBonus\tTotal");
            System.out.println("----\t\t---\t-----\t-----");
        } public static void makeRows() {
            makeOneRow("Joe\t", 43, 7);
            makeOneRow("William\t", 50, 8);
            makeOneRow("Mary Sue", 10, 49);
            makeOneRow("Drew\t", 2, 0);
            makeOneRow("Colby\t", 100, 100);
            
        }public static void makeOneRow(String name, int lab, int bonus) {
            System.out.println(name + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
        }
}