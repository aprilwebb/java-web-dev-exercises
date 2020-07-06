package exercises.technology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Program {
    @Test
    public void saveTest(){
        assertEquals("file saved successfully.", Computer.save("file"));
        assertEquals("file saved successfully.", Laptop.save("file"));
        assertEquals("file saved successfully.", Smartphone.save("file"));

    }

    @Test
    public void powerOnTest(){
        assertEquals("Power on", Computer.powerOn());
        assertEquals("Power on", Laptop.powerOn());
        assertEquals("Power on", Smartphone.powerOn());

    }

    @Test
    public void processDataTest(){
        assertEquals("Data processed", Computer.processData());
        assertEquals("Data processed", Laptop.processData());

    }

    @Test
    public void takePicTest(){
        assertEquals("*Selfie taken!*", Smartphone.takePic("selfie"));
        assertEquals("*Portrait taken!*", Smartphone.takePic("portrait"));
        assertEquals("*Picture taken!*", Smartphone.takePic(""));

    }

    @Test
    public void printTest(){
        assertEquals("File sent to printer.", Laptop.print("image"));

    }

}
