package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.ArrayList;
import java.util.HashMap;

/**Adds the additional requirement that spaces must be autofilled.*/
public abstract class Hash_Grid_Auto_Fil<KeA,KeB,Valu> extends Hash_Grid<KeA,KeB,Valu>
{
	public static final Clas_Rap Class=Init_StRt(Hash_Grid_Auto_Fil.class
		,Class.class
	);/*Dep ?done*/

	public Hash_Grid_Auto_Fil(ArrayList<KeA> DA,ArrayList<KeB> DB){super(DA,DB);}
	public Hash_Grid_Auto_Fil(){}

	@Override public void Ad_Dim_A(KeA A)
	{
		super.Ad_Dim_A(A);
		Fil_A(A);
	}
	public abstract void Fil_A(KeA A);
	@Override public void Ad_Dim_B(KeB B)
	{
		super.Ad_Dim_B(B);
		Fil_B(B);
	}
	public abstract void Fil_B(KeB B,HashMap<KeA,Valu> A_List);
		public void Fil_B(KeB B){Fil_B(B,get(B));}

	public abstract void Fil(KeA A,KeB B);
		public void Fil(){for(KeB B:DB){Fil_B(B);}}

	static{Init_Nd(Hash_Grid_Auto_Fil.class);}
}