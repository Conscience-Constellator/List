package CC.List;

import CC.$.Q2$1.Point2$1;
import java.util.HashMap;

public class Hash_Grid_Fil_Fun<KE_A,KE_B,ValU>
	extends Hash_Grid_Auto_Fil<KE_A,KE_B,ValU>
{
//	public static final Clas_Rap Class=Init_StRt(Hash_Grid_Fil_Fun.class
//		,Class.class
//	);/*Dep ?done*/

	@Override public void Fil_A(KE_A A)
	{
		HashMap<KE_A,ValU> A_List;
		for(KE_B B:DB)
		{
			A_List=get(B);
			if(!A_List.containsKey(A))
			{A_List.put(A,Filr.Point2$1(A,B));}
		}
	}
	@Override public void Fil_B(KE_B B,HashMap<KE_A,ValU> A_List)
	{
		for(KE_A A:DA)
		{
			if(!A_List.containsKey(A))
			{A_List.put(A,Filr.Point2$1(A,B));}
		}
	}

	public Point2$1<KE_A,KE_B,ValU> Filr;
	@Override public void Fil(KE_A A,KE_B B)
	{Put(A,B,Filr.Point2$1(A,B));}

	public Hash_Grid_Fil_Fun(Point2$1<KE_A,KE_B,ValU> Filr)
	{this.Filr=Filr;}
	public Hash_Grid_Fil_Fun(Point2$1<KE_A,KE_B,ValU> Filr,
		KE_A[] DA,
		KE_B[] DB)
	{this(Filr);}
	public Hash_Grid_Fil_Fun()
	{}

//	static{Init_Nd(Hash_Grid_Fil_Fun.class);}
}