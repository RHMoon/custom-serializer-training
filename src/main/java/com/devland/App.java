package com.devland;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hllo");
        Item myItem = new Item(1, "theItem", new User(2, "theUser"));
        try {
            String serialized = new ObjectMapper().writeValueAsString(myItem);
            System.out.println(serialized);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Item myItemCustom = new Item(1, "theItem", new User(2, "theUser"));
        ObjectMapper mapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(Item.class, new ItemSerializer());
        mapper.registerModule(module);

        try {
            String serialized = mapper.writeValueAsString(myItemCustom);
            System.out.println(serialized);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
