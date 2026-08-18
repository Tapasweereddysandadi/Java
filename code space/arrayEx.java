class arrayEx {
    public static void main(String args[]) {
        String[] name=new String[5];
        name[0]="Sirimalli";
        name[1]="Tapaswee";
        name[2]="Sindhu";
        System.out.println("Size of array : " +name.length);
        for (int i=0;i<name.length;i++) {
               System.out.println(name[i]);
        }
    }
}