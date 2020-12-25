package _03examenes.mallorcaAjedrez;

public class TRey extends TPesa{

	public TRey(TColor color) {
		super(color);
	}

	@Override
	public boolean pucMoure(TPosicio origen, TPosicio desti) {
		return true;
	}

	@Override
	public boolean mou(TPosicio origen, TPosicio desti) {
		return true;
		
	}

}
