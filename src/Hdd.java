public class Hdd {
    private int frequency;
    private int quantitymemory;

    public Hdd(int frequency, String quantityMemory){
        this.frequency = frequency;
        this.quantitymemory = quantitymemory;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nquantityMemory: ");
        stringBuilder.append(this.quantitymemory);
        return stringBuilder.toString();
        //return "\nfrequency: " + this.frequency + "\nquantityMemory: " + this.quantitymemory;

    }

}
