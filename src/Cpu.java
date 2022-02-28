public class Cpu {
    private String frequency;
    private int socket;
    private int core;
    private int streams;

    public Cpu(String frequency, int socket, int core, int streams){
        this.frequency = frequency;
        this.socket = socket;
        this.core = core;
        this.streams = streams;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nfrequency: ");
        stringBuilder.append(this.frequency);
        stringBuilder.append("\nsocket: ");
        stringBuilder.append(this.socket);
        stringBuilder.append("\ncore: ");
        stringBuilder.append(this.core);
        stringBuilder.append("\nstreams: ");
        stringBuilder.append(this.streams);
        return stringBuilder.toString();
        //return "\nfrequency: " + this.frequency + "\nsocket: " + this.socket + "\ncore: " + this.core + "\nstreams: " + this.streams;

    }
}
