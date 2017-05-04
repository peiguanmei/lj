package com.p.io;

import java.io.*;

/**
 * Created by p on 2017/4/25.
 */
public class SerializableObjectStreamTest implements Serializable {

    private static final long serialVersionUID = 7827863437931135333L;

    private transient String name;
    private int age;
    private final static String sex = "man";

    public SerializableObjectStreamTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "姓名：" + this.name + "， 年龄：" + this.age + ", 性别：" + sex;
    }

    public static void serializable(File file) throws IOException {
        OutputStream outputFile = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(outputFile);
        oos.writeObject(new SerializableObjectStreamTest("张三", 25));
        oos.close();
    }

    public static void deserializable(File file) throws IOException, ClassNotFoundException {
        InputStream inputFile = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(inputFile);
        SerializableObjectStreamTest p = (SerializableObjectStreamTest) ois.readObject();
        System.out.println(p);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("D:/project/serializable");
        serializable(file);
        deserializable(file);
        Writer fw = new FileWriter(file);
        Writer out = new OutputStreamWriter(new FileOutputStream(file));
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
    }
}
