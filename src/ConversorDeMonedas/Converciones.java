package ConversorDeMonedas;



public class Converciones {

	 private static double canFinDollar;
	 private static double canFinEuros;
	 private static double canFinLibras;
	 private static double canFinYens;
	 private static double canFinWons;
	 
	 	public  void cambiarDollar(double precioD, double cantidad) {
			this.setCanFinDollar(precioD * cantidad);	
		}
		
		public double  getCanFinDollar() {
			return  canFinDollar;
		}

		public void setCanFinDollar(double  canFinDollar) {
			this.canFinDollar = canFinDollar;
		}

//------------------------Euros-------------------------------------
	 
		public  void cambiarEuros(double precioE, double cantidadEuros) {
			canFinEuros= precioE  * cantidadEuros;			
		}
	 
		public  double getCanFinEuros() {
			return canFinEuros;
		}
	
		public  void setCanFinEuros(double canFinEuros) {
			this.canFinEuros = canFinEuros;
		}
	
//-----------------------Libras--------------------------------------
		
		public  void cambiarLibras(double precioL, double d) {
			this.setCanFinLibras(precioL * d);
			
		}

		public  double getCanFinLibras() {
			return canFinLibras;
		}
		
		public  void setCanFinLibras(double canFinLibras) {
			this.canFinLibras = canFinLibras;
		}
		
//------------------------Yens-------------------------------------	
		public void cambiarYens(double precioY, double d) {
			this.setCanFinYens(precioY * d);
			
		}
		public  double getCanFinYens() {
			return canFinYens;
		}

		public  void setCanFinYens(double canFinYens) {
			this.canFinYens = canFinYens;
		}
	
//------------------------Wons-------------------------------------	
		
		public void cambiarWons(double precioW, double d) {
			this.setCanFinWons(precioW  * d);
			
		}

		public  double getCanFinWons() {
			return canFinWons;
		}

		public  void setCanFinWons(double canFinWons) {
			this.canFinWons = canFinWons;
		}
//-------------------------------------------------------------		
		
		
		public static boolean isNumber(String cantidadDollarS) {
			try {
				Integer.parseInt(cantidadDollarS);
				return true;
				
			} catch (Exception e) {
				return false;		}
			
		}
		
}
	
	

