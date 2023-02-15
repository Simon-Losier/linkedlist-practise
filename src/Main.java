class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RecLinkedList list = new RecLinkedList("0");
        list.add("1");
        list.add("2");
        System.out.println(list.getLength());
    }
}