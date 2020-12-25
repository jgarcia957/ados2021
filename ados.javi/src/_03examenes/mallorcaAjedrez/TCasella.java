package _03examenes.mallorcaAjedrez;

public class TCasella {
	private TPesa pesa;
	private TColor color;
	public TCasella(TPesa pesa, TColor color){
		this.pesa = pesa;
		this.color = color;
	}
	public TPesa getPesa() {
		return pesa;
	}
	public void setPesa(TPesa pesa) {
		this.pesa = pesa;
	}
	public TColor getColor() {
		return color;
	}
	public void setColor(TColor color) {
		this.color = color;
	}
	
}
