class ScopeEx {
    public static void main(String args[]) {
        String name = "Tapaswee";
        int age = 18;
        System.out.println(name);
        System.out.println(age+ "years old");
        if (age>=18) {
             String status = "Allowed";
             System.out.println(status);
         } else {
             String status = "Not Allowed";
             System.out.println(status);
        }
    }
}