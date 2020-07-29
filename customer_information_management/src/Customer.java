public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;
//    public Customer(String name,char gender;)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setAge(1);
        c1.setEmail("12@12.com");
        c1.setGender('M');
        c1.setName("AA");
        c1.setPhone("123456");
        System.out.println(c1.getAge()+c1.getEmail()+c1.getGender()+c1.getName()+c1.getPhone());
    }
}
