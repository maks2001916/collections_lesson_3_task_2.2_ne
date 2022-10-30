public class Main {
    public static void main(String[] args) {
        Storage storage0 = new Storage();
        String storage = "Объект - ";
        String storageOne = "";
        int key = 0;
        for (int i = 0; i < 10; i++) {
            String storageTwo = String.valueOf(key);
            storageOne = storage + storageTwo;
            storage0.storages.put(key, storageOne);
            key++;
        }
        System.out.println(storage0);
    }
}