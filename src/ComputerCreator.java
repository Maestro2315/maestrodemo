import java.util.Scanner;
public class ComputerCreator {
    private Cpu cpu;

    public ComputerCreator(){
    }
    public Computer create(){
        Name name = new Name("");
        MotherBoard mom = new MotherBoard(2011, "2 slots", "Express 4.0 Hardware Design", "H480m");
        VideoAdapter videocard = new VideoAdapter("GTX10160", "3GB");
        Ram ramka = new Ram("vengeance", "2*8GB", "2666Mhz");
        Hdd hddshnik = new Hdd(5400, "1TB");
        //Cpu processor = new Cpu("4.2MHz", 2011, 4, 8);
        Scanner sc = new Scanner(System.in);
        System.out.println("Частота процессора: ");
        String cpuFrequency = sc.nextLine();
        System.out.println("Название сокета: ");
        int cpuSocket = sc.nextInt();
        System.out.println("Колличество ядер: ");
        int cpuCores = sc.nextInt();
        System.out.println("Колличество потоков: ");
        int cpuStreams = sc.nextInt();


        Cpu cpu1 = new Cpu(cpuFrequency, cpuSocket, cpuCores, cpuStreams);

        Computer andrew = new Computer("Aerocool", mom, videocard,ramka, hddshnik, cpu1);
        return andrew;
    }

}
