package day21_MultiDimesionalArrays;

public class scrumteam {
    public static void main(String[] args) {

        String[] DevTeam = {"eeee","eEDEF","ewf","WEf"};
        String[] Tester = {"scdv","gdsf","wgfdse","Wegf"};
        String[] PO = {"efewds","vbryhtg","htg","hger"};

        String[] [] ScrumTeam = {DevTeam, Tester, PO};

        ScrumTeam[0][3] = "Jean";
        String info = ScrumTeam[1][2];

        System.out.println(info);

        System.out.println("=============================================");

        for ( String each : ScrumTeam[0]){
            System.out.println(each);
        }


    }
}
