package javacore.basic.lesson14.lab1;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab01_Main {

    static String file = "C:\\JavaCore\\Bai14\\Lab01\\diemthi_input.csv";
    static List<ThiSinh> list = null;

    static void ReadCSV() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            CsvToBean<ThiSinh> csvToBean = new CsvToBeanBuilder<ThiSinh>(fileReader)
                    .withType(ThiSinh.class)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            list = csvToBean.parse();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    static void WriteToCSV(List<ThiSinh> list) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            CSVWriter csvWrite = new CSVWriter(fileWriter,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            String[] header = {"SDB", "Ho ten", "Gioi Tinh", "Tinh", "Tong diem"};
            csvWrite.writeNext(header);
            for (ThiSinh item : list) {
                csvWrite.writeNext(new String[]{String.valueOf(item.getSBD()), item.getHoTen(), item.getGioiTinh(), item.getTinh(), String.valueOf(item.getTongDiem())});
            }
        } catch (IOException ex) {
            Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(Lab01_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j, y;
        String input;
        String[] str;
        sc.nextLine();
        ReadCSV();
        list.sort(new NameComparator());
        for (i = 1; i <= N; i++) {
            input = sc.nextLine();
            str = input.split(" ");
            switch (Integer.parseInt(str[0])) {
                case 1:
                    for (ThiSinh item : list) {
                        if (item.getGioiTinh().equals(str[1])) {
                            System.out.println(item.toString());
                        }
                    }
                    break;
                case 2:
                    for (ThiSinh item : list) {
                        if (item.getTinh().equals(str[1])) {
                            System.out.println(item.toString());
                        }
                    }
                    break;
                case 3:
                    for (ThiSinh item : list) {
                        if (item.getSBD() == Integer.parseInt(str[1])) {
                            if (str[2].equals("1")) {
                                item.setTinh(str[3]);
                            } else {
                                item.setTongDiem(Double.parseDouble(str[3]));
                            }
                        }
                    }
                    break;
                case 4:
                    boolean kt = false;
                    for (j = 0; j < list.size(); j++) {
                        if (list.get(j).getSBD() == Integer.parseInt(str[1])) {
                            list.remove(j);
                            System.out.println(1);
                            kt = true;
                        }
                    }
                    if (kt == false) {
                        System.out.println(0);
                    }
                    break;
                case 5:
                    y = Integer.parseInt(str[1]);
                    list.sort(new DiemComparator());
                    if (y > list.size()) {
                        y = list.size();
                    }
                    for (j = 0; j < y; j++) {
                        System.out.println(list.get(j).toString());
                    }
                    break;
                case 6:
                    list.sort(new DiemComparator().thenComparing(new NameComparator()).thenComparing(new TinhComparator()));
                    WriteToCSV(list);
                    break;
            }
        }
    }
}
