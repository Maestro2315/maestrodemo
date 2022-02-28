public class VideoAdapter {
    private String name;
    private String videoRam;

    public VideoAdapter(String name, String videoRam) {
        this.name = name;
        this.videoRam = videoRam;

    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\nname: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\nvideoRam: ");
        stringBuilder.append(this.videoRam);
        return stringBuilder.toString();
        //return "\nname: " + this.name + "\nvideoRam: " + this.videoRam;
    }

}


