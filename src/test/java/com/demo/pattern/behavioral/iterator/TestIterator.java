package com.demo.pattern.behavioral.iterator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIterator {

    @Test
    public void iterator() {
        String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
        NameRepository namesRepository = new NameRepository(names);

        int pos = 0;
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext(); pos++){
            String name = (String)iter.next();
            assertEquals(names[pos], name);
        }

    }
}
