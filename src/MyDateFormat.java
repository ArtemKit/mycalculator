import java.util.Date;
import java.text.SimpleDateFormat;
public class MyDateFormat {

	public static void main(String[] args) {
		Date today=new Date();
		System.out.println("���� "+today);
		// ������, ������� ������� ���� � ���� 10-08-11
		SimpleDateFormat sdf= new SimpleDateFormat("MM-dd-yy");
		String formattedDate=sdf.format(today);
		System.out.println( "����(��-��-��): " + formattedDate );
		// ������, ������� ������� ���� � ���� 08-10-2011
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		formattedDate=sdf.format(today);
		System.out.println( "����(��-��-����): " + formattedDate );
		// ������, ������� ������� ���� � ���� ��, ��� 27, �11
		sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
		formattedDate=sdf.format(today);
		System.out.println(
		"���� (���� ������, ��� �, '��) "+ formattedDate);
		// ������, ������� ������� ����� � ���� 07:18:51 AM
		sdf = new SimpleDateFormat("hh:mm:ss a");
		formattedDate=sdf.format(today);
		System.out.println( "����� (��:��:��) "+ formattedDate );
		}
		
		

	}


