class Student {
	public static String name;
	public static int id;

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public static String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static void showData()
    {
        System.out.println ("name : "+getName()+" id : "+getId());
    }

    public static void main(String args[]) {
        System.out.println("Hello This is java Getset code....");
        System.out.println("Before Set");
        showData();
        setId(1);
        setName("Naruto");
        System.out.println("After Set");
        showData();
    }

}
