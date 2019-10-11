public class Printer {
/* emulation of working office printer */

    private String manufacturer, model, type;
    private boolean isColor, isDuplex;
    private int tonerLevelBlack, tonerLevelMagenta, tonerLevelYellow, tonerLevelBlue, printedPages; //indicates levels of toner


    public Printer(boolean isColor, boolean isDuplex, String manufacturer, String model, String type, int printedPages, int tonerLevelBlack, int tonerLevelBlue, int tonerLevelMagenta, int tonerLevelYellow) {
        this.isColor = isColor; this.isDuplex = isDuplex;
        this.manufacturer = manufacturer; this.model = model; this.type = type;
        this.printedPages = printedPages;
        this.tonerLevelBlack = tonerLevelBlack; this.tonerLevelBlue = tonerLevelBlue;
        this.tonerLevelMagenta = tonerLevelMagenta; this.tonerLevelYellow = tonerLevelYellow;
    }

    public static void main(String[] args) {

    Printer pr1 = new Printer(false,true,"Canon","mf244","Laser",200,50,5,0,80);
        int a = 9;
        String b="yellow";
        System.out.println(pr1.type + " " + pr1.manufacturer + " " + pr1.model + ", " + "Pages were printed " + pr1.printedPages); System.out.println("");
        System.out.println("Volume of colors in each catridge:" );
        System.out.print("Black: " + pr1.tonerLevelBlack + "   ");
        System.out.print("Blue: " + pr1.tonerLevelBlue + "   ");
        System.out.print("Magenta: " + pr1.tonerLevelMagenta + "   ");
        System.out.println("Yellow: " + pr1.tonerLevelYellow);
        a = pr1.tonerLevelBlack; b = "Black"; pr1.fillUp(a,b);
        a = pr1.tonerLevelBlue;  b = "Blue";  pr1.fillUp(a,b);
        a = pr1.tonerLevelMagenta; b = "Magenta"; pr1.fillUp(a,b);
        a = pr1.tonerLevelYellow; b = "Yellow"; pr1.fillUp(a,b);
    }

// Блок геттеров и сеттеров
    public boolean getisColor() { return isColor; }
    public void setisColor(boolean isColor) { this.isColor = isColor; }

    public boolean getisDuplex() { return isDuplex; }
    public void setisDuplex(boolean isDuplex) { this.isDuplex = isDuplex; }

    public String getmanufacturer() { return manufacturer; }
    public void setmanufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public String getmodel() { return model; }
    public void setmodel(String model) { this.model = model; }

    public String gettype() { return type; }
    public void settype(String type) { this.type = type; }

    public int getprintedPages() {return printedPages; }
    public void setprintedPages(int printedPages) { this.printedPages = printedPages; }

    public int gettonerLevelBlack() {return tonerLevelBlack; }
    public void settonerLevelBlack(int tonerLevelBlack) { this.tonerLevelBlack = tonerLevelBlack; }

    public int gettonerLevelBlue() {return tonerLevelBlue; }
    public void settonerLevelBlue(int tonerLevelBlue) { this.tonerLevelBlue = tonerLevelBlue; }

    public int gettonerLevelMagenta() {return tonerLevelMagenta; }
    public void settonerLevelMagenta(int tonerLevelMagenta) { this.tonerLevelMagenta = tonerLevelMagenta; }

    public int gettonerLevelYellow() {return tonerLevelYellow; }
    public void settonerLevelYellow(int tonerLevelYellow) { this.tonerLevelYellow = tonerLevelYellow; }

    private void fillUp(int tonerVolume, String color) {
        if (tonerVolume <= 0) {
            System.out.println("Replace " + color + " cartridge");
        } else {
            if (tonerVolume < 10) {
                System.out.println(color + " cartridge will be empty soon");
            }
        }
    }
}