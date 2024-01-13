package task2;

import task2.components.keyboard.Keyboard;
import task2.components.keyboard.TypeKeyboard;
import task2.components.monitor.Monitor;
import task2.components.monitor.TypeDiagonal;
import task2.components.processor.NameManufacturer;
import task2.components.processor.Processor;
import task2.components.ram.RAM;
import task2.components.ram.TypeRam;
import task2.components.storagedevice.StorageDevice;
import task2.components.storagedevice.TypeStorageDevice;

public class Main {
    public static void main(String[] args) {
        Computer computer = createComputer();

        //использование сетеров
        Processor newProcessor = new Processor(4.9, 24, NameManufacturer.INTEL, 24);
        Monitor newMonitor = new Monitor(32.5, TypeDiagonal.OLED, 10000);

        computer.setProcessor(newProcessor);
        computer.setMonitor(newMonitor);

        double totalWeight = computer.calculateWeight();

        System.out.println(computer);
        System.out.println("--------------------------------");
        System.out.println("Общий вес компьютера: " + totalWeight + " гр.");
    }

    private static Computer createComputer() {
        Processor processor = new Processor(3.6, 12, NameManufacturer.INTEL, 12.67);
        RAM ram = new RAM(TypeRam.DRAM, 2300, 500);
        StorageDevice storageDevice = new StorageDevice(TypeStorageDevice.SSD, 2000, 300.78);
        Monitor monitor = new Monitor(27, TypeDiagonal.IPS, 8000);
        Keyboard keyboard = new Keyboard(TypeKeyboard.MECHANICS, true, 1200.09);

        return new Computer("HYPER PC", "Calamity",
                processor, ram, storageDevice, monitor, keyboard);
    }
}
