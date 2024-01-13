package task2;

import task2.components.keyboard.Keyboard;
import task2.components.monitor.Monitor;
import task2.components.processor.Processor;
import task2.components.ram.RAM;
import task2.components.storagedevice.StorageDevice;

public class Computer {
    private Processor processor;
    private RAM ram;
    private StorageDevice storageDevice;
    private Monitor monitor;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(String vendor, String name,
                    Processor processor,
                    RAM ram,
                    StorageDevice storageDevice,
                    Monitor monitor,
                    Keyboard keyboard
    ) {
        this.processor = processor;
        this.ram = ram;
        this.storageDevice = storageDevice;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public double calculateWeight() {
        double processorWeight = processor.weight();
        double ramWeight = ram.weight();
        double storageDeviceWeight = storageDevice.weight();
        double monitorWeight = monitor.weight();
        double keyboardWeight = keyboard.weight();
        return processorWeight + ramWeight + storageDeviceWeight + monitorWeight + keyboardWeight;
    }

    @Override
    public String toString() {
        return "Имя компьютера: " + name + "\n" +
                "Производитель: " + vendor + "\n" +
                " " + "\n" +
                "--------------------------------" + "\n" +
                "Комплектующие: " + "\n" +
                " " + "\n" +
                "Процессор: " + "\n" +
                "Частота процессора: " + processor.frequency() + " гц." + "\n" +
                "Кол-во ядер: " + processor.core() + "\n" +
                "Производитель: " + processor.nameManufacturer() + "\n" +
                "--------------------------------" + "\n" +
                "RAM: " + "\n" +
                "Тип RAM: " + ram.type() + "\n" +
                "Объем: " + ram.volume() + "\n" +
                "--------------------------------" + "\n" +
                "Накопитель: " + "\n" +
                "Тип: " + storageDevice.type() + "\n" +
                "Объем память: " + storageDevice.volumeMemory() + "\n" +
                "--------------------------------" + "\n" +
                "Монитор: " + "\n" +
                "Диагональ: " + monitor.diagonal() + " д." + "\n" +
                "Тип матрицы: " + monitor.type() + "\n" +
                "--------------------------------" + "\n" +
                "Клавиатура: " + "\n" +
                "Тип клавиатуры: " + keyboard.type() + "\n" +
                "Наличие подсветки: " + (keyboard.isBacklight() ? "есть" : "нет");
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.storageDevice = storageDevice;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
