package entities;

import java.time.LocalDate;
import java.util.Locale;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Order order;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }

    public void makeOrder(Order or){
        this.order = or;
    }
    
}
