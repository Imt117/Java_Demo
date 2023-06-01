package chapter18;

import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {
        User u1 = new User("张大文",new Address("太原","上兰街道","041600"));
        User u2 = new User("张大文",new Address("太原","上兰街道","041600"));
        System.out.println(u1.equals(u2));
    }
}
class User {
    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof User)) return false;
        if (this == obj) return true;
        User u = (User)obj;
        if (this.name.equals(u.name) && this.addr.equals(u.addr)){
            return true;
        }
        return false;
    }
}
class Address{
    String city;
    String street;
    String zipcode;
    public Address(){

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipcode, address.zipcode);
    }

}
