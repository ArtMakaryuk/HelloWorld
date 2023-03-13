package Stepik.InputOutput;

import java.io.*;
import java.util.Objects;

public class Prodvinutie {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bao.toByteArray());
    }
    public static Animal[] deserializeAnimalArray(byte[] data)  {
        Animal[] animalM2=null;
        try {
            ByteArrayInputStream bai = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bai);
            int animalCount = ois.readInt();
            animalM2 = new Animal[animalCount];
            for (int i = 0; i < animalCount; i++) {
                animalM2[i] = (Animal) ois.readObject();
            }
            ois.close();
        }
        catch (Exception e) {
            throw new IllegalArgumentException();
        }

        return animalM2;
    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
