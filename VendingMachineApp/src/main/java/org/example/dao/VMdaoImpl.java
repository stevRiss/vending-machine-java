package org.example.dao;

import org.example.dto.Item;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VMdaoImpl implements VMdao{
    private Map<String, Item>items = new HashMap<>();
    private final String INV_FILE;
    private final String DELIMETER = "::";

    public VMdaoImpl(){
        INV_FILE = "/Users/stevenrisso/Development/java-practice/VendingMachine/vending-machine-java/VendingMachineApp/src/main/java/org/example/INVENTORY.txt";
    }
    public VMdaoImpl(String testFile){
        INV_FILE = testFile;
    }

    int itemNum =1;

    private Item unmarshall(String text){
        String[] itemLib = text.split(DELIMETER);
        String itemName = itemLib[0];
        BigDecimal price = new BigDecimal(itemLib[1]);
        int inv = Integer.parseInt(itemLib[2]);
        Item readItem = new Item(itemName);

        readItem.setPrice(price);
        readItem.setInvNum(inv);

        return readItem;
    }

    private String marshall(Item loadedItems){
        String itemInfo = loadedItems.getItemName() + DELIMETER;
        itemInfo += loadedItems.getPrice() + DELIMETER;
        itemInfo += loadedItems.getInvNum() + DELIMETER;

        return itemInfo;
    }

    private void loadLibrary(){
        Scanner scanner = null;

        try{
             scanner = new Scanner(new BufferedReader(new FileReader(INV_FILE)));
        }catch(FileNotFoundException e){
            System.out.println(e);
        }

        String line;
        Item currentItem;

        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            currentItem = unmarshall(line);
            items.put(currentItem.getItemName(), currentItem);

        }
        scanner.close();
    }

    private void writeLibrary(){
        PrintWriter out;
        try{
            out = new PrintWriter(new FileWriter(INV_FILE));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String itemInfo;
        List <Item> inv = this.getAllItems();

        for(Item current : inv){
            itemInfo = marshall(current);
            out.println(itemInfo);
            itemNum++;
            out.flush();
        }
        out.close();
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public double getMoney() {
        return 0;
    }

    @Override
    public void removeOneInv(String name) {

    }

    @Override
    public int getInv(String name) {
        return 0;
    }

    @Override
    public Item gettItem(String name) {
        return null;
    }

    @Override
    public Map<String, BigDecimal> getSttockItemNames() {
        return null;
    }
}
