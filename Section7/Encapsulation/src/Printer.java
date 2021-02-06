public class Printer {
    private int incAmount = 100;
    private boolean isDuplxe;
    private int printedPages;

    public Printer(int incAmount, boolean isDuplxe, int printedPages) {
        if (incAmount >= 0 && incAmount <= 100){
            this.incAmount = incAmount;
        }
        this.isDuplxe = isDuplxe;
        this.printedPages = printedPages;
        print();
    }
    public void fillPrinter(int amountFiller){
        if(this.incAmount + amountFiller > 100){
            this.incAmount = 100;
            int rest = this.incAmount - amountFiller;
            System.out.println("You filled up the printer and has " + rest + " aka full");
        } else {
            int total = this.incAmount + amountFiller;
            this.incAmount = total;
            System.out.println("Your printer now has " + total + " inc left");
        }
    }
    public void print(){
        int rest = this.incAmount - this.printedPages;
        if (rest <=0){
            System.out.println("You are unable to print due to lack of inc, please refill inc");
        } else {
            System.out.println("You successfully printed " + this.printedPages + " pages and have "+
                    rest + " inc left");
            this.incAmount = rest;
        }

    }
}
