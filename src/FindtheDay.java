import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.*;

public class FindtheDay implements ActionListener {
    private static JLabel Birthday;
    private static JTextField BDAYTEXT;
    private static JButton Generate;
    private static JTextField GeneratedDay;

    public static void main(String[] args) {

        JFrame frame = new JFrame("DAY CALCULATOR BASED ON YEAR");
        JPanel panel = new JPanel();
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        Birthday = new JLabel("ENTER DAY FORMAT DDMMYYYY");
        Birthday.setBounds(10, 20, 400, 25);
        panel.add(Birthday);
        BDAYTEXT = new JTextField(50);
        BDAYTEXT.setBounds(250, 20, 190, 25);
        panel.add(BDAYTEXT);

        Generate = new JButton("Generate");
        Generate.setBounds(10, 150, 130, 25);
        Generate.addActionListener((ActionListener) new FindtheDay());
        panel.add(Generate);
        GeneratedDay = new JTextField(20);
        GeneratedDay.setBounds(250, 150, 190, 25);
        panel.add(GeneratedDay);
        frame.setVisible(true);
    }
/*        System.out.println("The the Date in format DDMMYYYY");
        Scanner input = new Scanner(System.in);
        int Date = input.nextInt();
        String StrDate = String.valueOf(Date);*/
    public void actionPerformed(ActionEvent e) {

        String StrDate =BDAYTEXT.getText();
        String Day = StrDate.substring(0, 2);
        String Month = StrDate.substring(2, 4);
        String Year = StrDate.substring(4, 8);

        int IntDay = Integer.parseInt(Day);
        int IntMonth = Integer.parseInt(Month);
        int IntYear = Integer.parseInt(Year);

        int SecondValue=Monthcode(IntMonth);
        int ThirdValue=Centurycode(IntYear);
        int FourthValue= Integer.parseInt(StrDate.substring(6,8));
        int FifthValue=FourthValue/4;

        int FinalVal= IntDay+SecondValue+ThirdValue+FourthValue+FifthValue;
        int FinalDay=FinalVal%7;
        String Expectday=Daycode(FinalDay);
        GeneratedDay.setText(Expectday);

        /*System.out.println(Expectday);*/

    }

    public static int Monthcode(int Month) {
        HashMap<Integer, Integer> MonthMap = new HashMap<Integer, Integer>();
        MonthMap.put(1,1);
        MonthMap.put(2,4);
        MonthMap.put(3,4);
        MonthMap.put(4,0);
        MonthMap.put(5,2);
        MonthMap.put(6,5);
        MonthMap.put(7,0);
        MonthMap.put(8,3);
        MonthMap.put(9,6);
        MonthMap.put(10,1);
        MonthMap.put(11,4);
        MonthMap.put(12,6);
        int Keypair = MonthMap.get(Month);
        return Keypair;
    }
    public static String Daycode(int FinalDay) {
        HashMap<Integer, String> Daycode = new HashMap<Integer, String>();
        Daycode.put(0,"Saturday");
        Daycode.put(1,"Sunday");
        Daycode.put(2,"Monday");
        Daycode.put(3,"Tuesday");
        Daycode.put(4,"Wednesday");
        Daycode.put(5,"Thursday");
        Daycode.put(6,"Friday");
        return Daycode.get(FinalDay);
    }

    public static int Centurycode(int Year){
        int Centurcodeval = 0;
        if(Year>=1500 && Year<=1599)
             Centurcodeval =0;
        else if(Year>=1600 && Year<=1699)
             Centurcodeval =6;
        else if(Year>=1700 && Year<=1799)
             Centurcodeval =4;
        else if(Year>=1800 && Year<=1899)
             Centurcodeval =2;
        else if(Year>=1900 && Year<=1999)
             Centurcodeval =0;
        else if(Year>=2000 && Year<=2099)
             Centurcodeval =6;
        return Centurcodeval;
    }

}

