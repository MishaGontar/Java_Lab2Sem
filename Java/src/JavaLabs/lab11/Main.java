package JavaLabs.lab11;

import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args)  {

    /** Конструктор створений завдяки посиланню і функціонального інтерфейсу */
    VoidInterface comd = ComD::new;

    comd.accept();

    comd = ComT::new;

    comd.accept();
    List<Medicine> list = new ArrayList<>(List.of());
    }
}