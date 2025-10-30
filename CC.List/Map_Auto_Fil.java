package CC.List;

import CC.$.Q$Q.Point1$1;
import CC.$.Q$Q.Point_IO_In_Out_Rapr;
import CC.$.Q$.Point$;
import CC.Util.Prim.Point_Havr.Point_Havr_Imp;
import CC.Util.Rapr_Abs.Rapr;
import java.util.HashMap;
import java.util.Map;

public class Map_Auto_Fil<KE,Valu>
	extends Rapr<Map<KE,Valu>>
	implements Map_AbsNt_Act<KE,Valu>
{
//	public static Clas_Rap Class=Init_StRt(Map_Auto_Fil.class
//		,Class.class
//	);/*Dep ?done*/

	public Map_Auto_Fil(Point1$1<KE,Valu> Auto,Map<KE,Valu> Rapd,Object... List)
	{
		super(Rapd);
		this.Auto=Auto;
	}
		public Map_Auto_Fil(Point1$1<KE,Valu> Auto,Object... List)
		{this(Auto,new HashMap<>(),List);}
	public Map_Auto_Fil(Valu Dfalt,Map<KE,Valu> Rapd,Object... List)
	{
		this(new Point_IO_In_Out_Rapr<>(
			Point$.Get_No(),
			new Point_Havr_Imp<>(Dfalt)),
		Rapd,List);
	}
		public Map_Auto_Fil(Valu Dfalt,Object... List)
		{this(Dfalt,new HashMap<>(),List);}
	public Map_Auto_Fil()
	{}

	/**Automatically determines appropriate value given A {@code Ke}.*/
	public Point1$1<KE,Valu> Auto;
		@Override public void AbsNt_Act(KE KE)
		{put(KE,Auto.Point1$1(KE));}

	@Override public Valu get(Object KE)
	{
		If_AbsNt_Act((KE)KE);

		return
//			Console.Print_Indx_Lin(3,"get(",KE,")->",
				Map_AbsNt_Act.super.get(KE)
//			)
		;
	}
}