package hierarchy;

public class Andriod extends Mobile{
		private double andriodVersion;
		
		public Andriod() {
			System.out.println("Andriod is Created...");
		}
		public Andriod(String name) {
			super(name);
			
		}
		public Andriod(String name,String brand) {
			super(name,brand);
		}
		public Andriod(String name,String brand, double price) {
			super(name,brand,price);
			}
		public Andriod(String name,String brand, double price,double andriodVersion) {
			super(name,brand,price);
			this.andriodVersion=andriodVersion;
			}
		public double getAndriodVersion() {
			return andriodVersion;
		}
		public void setAndriodVersion(double andriodVersion) {
			this.andriodVersion = andriodVersion;
		}
		
		public void adisplay() {
			super.display();
			System.out.println(getAndriodVersion());
		}
}
