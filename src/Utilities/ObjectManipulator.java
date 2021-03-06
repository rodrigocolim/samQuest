/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class ObjectManipulator {

    private static final ObjectManipulator objectManipulator = new ObjectManipulator();

    private ObjectManipulator() {

    }

    public static ObjectManipulator getInstance() {
        return objectManipulator;
    }

    public Object deserialize(byte[] bytes) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (Exception ec) {
            System.out.println("Erro na deserialização: " + ec.getMessage());
        }
        return null;
    }

    public byte[] serialize(Object obj) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        objectOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();

    }

    public void saveObjectInPersistence(String path, Object object) {
        try {
            FileOutputStream arq = new FileOutputStream(path);
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(object);
            obj.flush();
            //JOptionPane.showMessageDialog(null, "gravado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu errado: "+e.getMessage());
        }
    }

    public Object getObjectFromPersistence(String path) {
        try {
            FileInputStream arq = new FileInputStream(path);
            ObjectInputStream obj = new ObjectInputStream(arq);
            return (Object) obj.readObject();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Deu errado: "+e.getMessage());
        }
        return null;
    }

    private void saveObject(String path, byte[] object) {
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path, true));
            buffWrite.append(new String(object));
            buffWrite.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no final do arquivo: " + e.getMessage());
        }
    }

    private byte[] getObject(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        ByteArrayOutputStream object = new ByteArrayOutputStream();
        return object.toByteArray();
    }
}
