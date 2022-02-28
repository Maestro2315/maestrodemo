public class ComputerCreator {
    public ComputerCreator(){
    }
    public Computer create(){
        Name name = new Name("");
        MotherBoard mom = new MotherBoard(2011, "2 slots", "Express 4.0 Hardware Design", "H480m");
        VideoAdapter videocard = new VideoAdapter("GTX10160", "3GB");
        Ram ramka = new Ram("vengeance", "2*8GB", "2666Mhz");
        Hdd hddshnik = new Hdd(5400, "1TB");
        Cpu processor = new Cpu("4.2MHz", 2011, 4, 8);
        Computer andrew = new Computer("Aerocool", mom, videocard,ramka, hddshnik, processor);
        return andrew;

    }

}
