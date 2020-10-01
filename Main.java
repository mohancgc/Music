import java.io.*;
import java.text.SimpleDateFormat;
public class Main {
    	public static void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter the details of user");
            String det[]=br.readLine().split(",");
            System.out.println("Enter the details of track");
            String dett[]=br.readLine().split(",");
            System.out.println("If user is premium user(yes/no)");
            String str=br.readLine();
            if(str.equals("yes"))
            {
                System.out.println("Enter validity period");
                String str2=br.readLine();
                PremiumUser pu=new PremiumUser(Integer.parseInt(det[0]),det[1],det[2],det[3],det[4],sdf.parse(str2));
                System.out.println(pu.hearTrack(new Track(Integer.parseInt(dett[0]),dett[1],dett[2],dett[3],Double.parseDouble(dett[4]),sdf.parse(dett[5])),pu.validityPeriod));
            }
            else
            {
                User u=new User(Integer.parseInt(det[0]),det[1],det[2],det[3],det[4]);
                System.out.println(u.hearTrack(new Track(Integer.parseInt(dett[0]),dett[1],dett[2],dett[3],Double.parseDouble(dett[4]),sdf.parse(dett[5])),sdf.parse(dett[5])));
            }
		}
}
