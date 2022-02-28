public class Computer {
    private Socket socket;
    private String name;
    private MotherBoard motherboard;
    private VideoAdapter videoadapter;
    private Ram ram;
    private Hdd hdd;
    private Cpu cpu;

    public Computer(String name, MotherBoard motherboard, VideoAdapter videoadapter, Ram ram, Hdd hdd, Cpu cpu) {
        this.name = name;
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.videoadapter = videoadapter;

    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Computer name: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\n\nMotherBoard: ");
        stringBuilder.append(this.motherboard);
        stringBuilder.append("\n\nRam: ");
        stringBuilder.append(this.ram);
        stringBuilder.append("\n\nHdd: ");
        stringBuilder.append(this.hdd);
        stringBuilder.append("\n\nCPU: ");
        stringBuilder.append("\nType socket: ");
        stringBuilder.append(socket.LGA);
        stringBuilder.append(this.cpu);
        stringBuilder.append("\n\nVideoAdapter: ");
        stringBuilder.append(this.videoadapter);
        //return "Computer name: " + this.name + "\nMotherBoard: " + this.motherboard + "\nRam: " + this.ram + "\nHdd: " + this.hdd + "\nCPU: " + this.cpu + "\nVideoAdapter: " + this.videoadapter;
        return stringBuilder.toString();

        }
}
