fun main()
{

	println("\n1:Km to mi\n2:Mi to km\n3:Cm to In\n4:In to Cm\n5:L to cups \n6:cups to L")//gave the options to the user to select 
	print("Select the type of convesion you like to perform: ")

    val conversionMethod = readLine()!!.toInt() //Got the input from the user
	
	println()
	//use switch case to convert different measurements
	when(conversionMethod){			
		(1) -> {
			println("enter the kilometeres to convert in miles:")
			val KmToMi  = readLine()!!.toDouble()
			val result = KmToMi * 0.62
			println("$KmToMi kilometeres = $result miles")
		}
		(2) -> {
			println("enter the Miles to convert in kilometeres:")
			val MiToKm  = readLine()!!.toDouble()
			val result = MiToKm * 1.61
			println("$MiToKm miles = $result kilometers")
		}
		(3) -> {
			println("enter Centimeters  to convert in Inches:")
			val CmToIn  = readLine()!!.toDouble()
			val result = CmToIn * 0.39
			println("$CmToIn Centimeters = $result Inches")
		}
		(4) -> {
			println("enter the Inches to convert in Centimeters:")
			val InToCm  = readLine()!!.toDouble()
			val result = InToCm * 2.54
			println("$InToCm Inches = $result Centimeters")
		}
		(5) -> {
			println("enter the Liters to convert in cups:")
			val LTocups  = readLine()!!.toDouble()
			val result = LTocups * 4.17
			println("$LTocups Liters = $result cups")
		}
		(6) -> {
			println("enter the cups to convert in Liters:")
			val cupsToL  = readLine()!!.toDouble()
			val result = cupsToL * 0.45
			println("$cupsToL cups = $result Liters")
		}
		else -> {
			print("Error!please select the write opition")//if user select the wrong input 
		}
	}
}
