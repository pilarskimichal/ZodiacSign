import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Member;
import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class Zad_znakZodiaku {
	private int yearOfBirth;
	private int monthOfBirth;
	private int dayOfBirth;
	private String name;
	private String surname;
	private String placeOfBirth;
	
	public Zad_znakZodiaku()
	{
		this(0);
		//System.out.println("Nie poda³eœ wieku");
	}	
	public Zad_znakZodiaku(int years)
	{
		yearOfBirth = years;
	}
	
	public int getYearOfBirth()
	{
		return yearOfBirth;
	}
	public void setYearOfBirth(int x)
	{
		yearOfBirth= x;
	}

	public int getDayOfBirth()
	{
		return dayOfBirth;
	}
	public void setDayOfBirth(int y)
	{
		dayOfBirth = y;
	}

	public int getMonthOfBirth()
	{
		return monthOfBirth;
	}
	public void setMonthOfBirth(int z)
	{
		monthOfBirth = z;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String Name)
	{
		name = Name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	public void setSurname(String Surname)
	{
		surname = Surname;
	}
	
	public String getPlaceOfBirth()
	{
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String place)
	{
		placeOfBirth = place;
	}
	
	public static void calculateTheAge(int yearOfBirth)
	{
		int age;
		age = 2019 - yearOfBirth;
		System.out.println();
		System.out.println("W tej chwili masz rocznikowo: " + age + " lat.");
	}
	public static void sayHello(String name)
	{
		System.out.println();
		System.out.println("----------------");
		System.out.println("Witaj " + name + "!");
		System.out.println("Zostaniesz poproszony o datê Twoich urodzin, proszê podaj¹c miesi¹c postêpuj wg poni¿szego schematu:");
		System.out.println("Styczeñ     - wpisz 1");
		System.out.println("Luty        - wpisz 2");
		System.out.println("Marzec      - wpisz 3");
		System.out.println("Kwiecieñ    - wpisz 4");
		System.out.println("Maj         - wpisz 5");
		System.out.println("Czerwiec    - wpisz 6");
		System.out.println("Lipiec      - wpisz 7");
		System.out.println("Sierpieñ    - wpisz 8");
		System.out.println("Wrzesieñ    - wpisz 9");
		System.out.println("PaŸdziernik - wpisz 10");
		System.out.println("Listopad    - wpisz 11");
		System.out.println("Grudzieñ    - wpisz 12");
		System.out.println();
	}
	
	public static void zodiacSign(int dayOfMonth, int dayOfBirth)
	{
		switch (dayOfMonth)
		{
		case 1:
			if (dayOfBirth<20)
			{
				System.out.println("Znak zodiaku: Kozioro¿ec");

			}
			else
			{
				System.out.println("Znak zodiaku: Wodnik");
			}
			break;
		case 2: 
			if (dayOfBirth<19)
			{
				System.out.println("Znak zodiaku: Wodnik");
			}
			else
			{
				System.out.println("Znak zodiaku: Ryby");
			}
			break;
		case 3:
			if (dayOfBirth<21)
			{
				System.out.println("Znak zodiaku: Ryby");
			}
			else 
			{
				System.out.println("Znak zodiaku: Baran");
			}
			break;
		case 4:
			if (dayOfBirth<20)
			{
				System.out.println("Znak zodiaku: Baran");
			}
			else
			{
				System.out.println("Znak zodiaku: Byk");
			}
			break;
		case 5:
			if (dayOfBirth<21)
			{
				System.out.println("Znak zodiaku: Byk");
			}
			else
			{
				System.out.println("Znak zodiaku: BliŸniêta");
			}
			break;
		case 6:
			if (dayOfBirth<21)
			{
				System.out.println("Znak zodiaku: BliŸniêta");
			}
			else
			{
				System.out.println("Znak zodiaku: Rak");
			}
			break;
		case 7:
			if (dayOfBirth<23)
			{
				System.out.println("Znak zodiaku: Rak");
			}
			else
			{
				System.out.println("Znak zodiaku: Lew");	
			}
			break;
		case 8:
			if (dayOfBirth<23)
			{
				System.out.println("Znak zodiaku: Lew");
			}
			else
			{
				System.out.println("Znak zodiaku: Panna");
			}
			break;
		case 9: 
			if (dayOfBirth<23)
			{
				System.out.println("Znak zodiaku: Panna");
			}
			else
			{
				System.out.println("Znak zodiaku: Waga");	
			}
			break;
		case 10:
			if (dayOfBirth<23)
			{
				System.out.println("Znak zodiaku: Waga");
			}
			else
			{
				System.out.println("Znak zodiaku: Skorpion");	
			}
			break;
		case 11:
			if (dayOfBirth<22)
			{
				System.out.println("Znak zodiaku: Skorpion");
			}
			else
			{
				System.out.println("Znak zodiaku: Strzelec");	
			}
			break;
		case 12:
			if (dayOfBirth<22)
			{
				System.out.println("Znak zodiaku: Strzelec");
			}
			else
			{
				System.out.println("Znak zodiaku: Kozioro¿ec");	
			}
			break;
		default:
			{
				System.out.println("Podana przez Ciebie liczba nie ma odniesienia w miesi¹cach");
			}
			break;
		}
		
	}
	
	public static void biography(String name, String surname, String place, int dayOfYear, int dayOfMonth, int dayOfBirth)
	{
		System.out.println();
		System.out.println("----------------");
		System.out.println("WIZYTÓWKA:");
		System.out.println("Imiê: " + name);
		System.out.println("Naziwsko: " + surname);
		System.out.println("Miejsce urodzenia: " + place);
		System.out.println("Data urodzenia: " + dayOfBirth + "." + dayOfMonth + "."  + dayOfYear  + "r.");
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Zad_znakZodiaku personName = new Zad_znakZodiaku();
		Zad_znakZodiaku personSurname = new Zad_znakZodiaku();
		Zad_znakZodiaku place = new Zad_znakZodiaku();
		Zad_znakZodiaku year = new Zad_znakZodiaku();
		Zad_znakZodiaku month = new Zad_znakZodiaku();
		Zad_znakZodiaku day = new Zad_znakZodiaku();
			
		System.out.println("Jak masz na imiê?");
		personName.setName(input.nextLine());

		System.out.println("Jak masz na nazwisko?");
		personSurname.setSurname(input.nextLine());
	
		System.out.println("Mijesce urodzenia?");
		place.setPlaceOfBirth(input.nextLine());
		
		sayHello(personName.getName());
		
		System.out.println("Podaj rok urodzenia:");
		year.setYearOfBirth(input.nextInt());
		
		System.out.println();
		System.out.println("Podaj miesi¹c urodzenia:");
		month.setMonthOfBirth(input.nextInt());
		
		System.out.println();
		System.out.println("Podaj dzieñ urodzenia:");
		day.setDayOfBirth(input.nextInt());
		
		biography(personName.getName(), personSurname.getSurname(), place.getPlaceOfBirth(), year.getYearOfBirth(), month.getMonthOfBirth(), day.getDayOfBirth());
		zodiacSign(month.getMonthOfBirth(), day.getDayOfBirth());
		calculateTheAge(year.getYearOfBirth());  
	}

}
