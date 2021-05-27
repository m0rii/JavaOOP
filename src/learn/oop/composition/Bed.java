package learn.oop.composition;

public class Bed {
    private String style;
    private int pillows;
    private int sheets;
    private int quits;

    public Bed(String style, int pillows, int sheets, int quits) {
        this.style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quits = quits;
    }
    public void make(){
        System.out.println("Bed -> making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuits() {
        return quits;
    }
}
