package com.careerit.lcj.day9;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReadAndWrite {

    public static void main(String[] args) {
        ObjectMapper objMapper = new ObjectMapper();
        String jsonStr = """
                    {
                        "id": 1012,
                        "name": "Google Pixel 4a",
                        "brand": "Google",
                        "price": 30000
                    }
                    """;
        try {
            Product product = objMapper.readValue(jsonStr, Product.class);
            System.out.println(product);
            String jsonProductStr = objMapper.writeValueAsString(product);
            System.out.println(jsonProductStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
