package config;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {

    @DataProvider
    public Iterator<Object[]> validLoginData() {

        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"skelon+204@bk.ru", "Qwerty$4"});
        list.add(new Object[]{"skelon+211@bk.ru", "Qwerty$4"});
        list.add(new Object[]{"skelon+210@bk.ru", "Qwerty$4"});

        return list.iterator();
    }
}