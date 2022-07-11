package com.javaprogram;

public class Runner {

	public static void main(String[] args) throws Exception {
		Class1GetterSetter class1 = new Class1GetterSetter(5, "Fauzan Rahman", "Nurlita Putri");
//		class1.setPlayerName("SilvianiNurlita");
//		class1.setNumber(10);
//		class1.setClub("Fathur Rahman");
//		class1.setClub("Nurlita Putri");
		System.out.println(class1.getClub());
		System.out.println(class1.getPlayerName());
		System.out.println(class1.getNumber());
		
		System.out.println(AppEnums.SUCCESS.getValue());
		System.out.println(AppEnums.FAILED.getValue());
		System.out.println(AppEnums.FAILED.name());
		
		Parent prt = new Parent();
		Child chd = new Child();
		
		prt.parentName();
		chd.childName();
		chd.parentProof();
		prt.parentProof();
		
		Untility.hardWait(10);
		
		Implementer imptr = new Implementer();
		imptr.test2();
		
		
//		AbstrackClass abs = new AbstrackClass();
//		System.out.println(abs.createMessage());
		
		String o = "";
		
		try {
			System.out.println(o.charAt(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		

		AbstackChild abschild = new AbstackChild() {
		};
		String text = abschild.createMessage();
		System.out.println(text);
		{
		};
		}
		
	}

