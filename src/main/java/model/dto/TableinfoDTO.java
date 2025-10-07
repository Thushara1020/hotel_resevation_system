package model.dto;

public class TableinfoDTO {

    private String room;
    private String name;
    private String description;
    private double price;

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }


    public void setRoom(String room) {
        this.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TableinfoDTO(String room, String name, String description, double price) {
        this.room = room;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TableinfoDTO{" +
                "room='" + room + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

