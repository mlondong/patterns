package com.ar.builderComplex;

public class VBurger extends Burger{

	
	
	/*CONSTRUCTOR*/
	public VBurger(String pan, boolean queso, boolean tomate, boolean lechuga, boolean cebolla) {
		super(pan, queso, tomate, lechuga, cebolla);
	}


	
	@Override
	public _InterfacePacking packing() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Veggie Burguer";
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 150;
	}


	@Override
	public String getPan() {
		// TODO Auto-generated method stub
		return super.getPan();
	}

	@Override
	public void setPan(String pan) {
		// TODO Auto-generated method stub
		super.setPan(pan);
	}

	@Override
	public boolean isQueso() {
		// TODO Auto-generated method stub
		return super.isQueso();
	}

	@Override
	public void setQueso(boolean queso) {
		// TODO Auto-generated method stub
		super.setQueso(queso);
	}

	@Override
	public boolean isTomate() {
		// TODO Auto-generated method stub
		return super.isTomate();
	}

	@Override
	public void setTomate(boolean tomate) {
		// TODO Auto-generated method stub
		super.setTomate(tomate);
	}

	@Override
	public boolean isLechuga() {
		// TODO Auto-generated method stub
		return super.isLechuga();
	}

	@Override
	public void setLechuga(boolean lechuga) {
		// TODO Auto-generated method stub
		super.setLechuga(lechuga);
	}

	@Override
	public boolean isCebolla() {
		// TODO Auto-generated method stub
		return super.isCebolla();
	}

	@Override
	public void setCebolla(boolean cebolla) {
		// TODO Auto-generated method stub
		super.setCebolla(cebolla);
	}




	@Override
	public String toString() {
		return "VeBurguer [packing()=" + getPacking().pack()+" VBurger [getName()=" + getName() + ", getPrecio()=" + getPrecio() + ", getPan()=" + getPan()
				+ ", isQueso()=" + isQueso() + ", isTomate()=" + isTomate() + ", isLechuga()=" + isLechuga()
				+ ", isCebolla()=" + isCebolla() + "]";
	}








	

}
