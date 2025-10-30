package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import static CC.List.Col_Util.Ad_Al;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Hash_Grid<KeA,KeB,Valu> extends HashMap<KeB,HashMap<KeA,Valu>>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Hash_Grid.class,
		Class.class);/*Dep ?done*/

	public Hash_Grid(ArrayList<KeA> DA,ArrayList<KeB> DB){Set_Ds(DA,DB);}
	public Hash_Grid(KeA[] DA,KeB[] DB){Set_Ds(DA,DB);}
	public Hash_Grid(){}

	public ArrayList<KeA> DA=new ArrayList<>();
	public ArrayList<KeB> DB=new ArrayList<>();
		public void Set_Ds(ArrayList<KeA> DA,ArrayList<KeB> DB)
		{
			this.DA=DA;
			this.DB=DB;
		}
			public void Set_Ds(KeA[] DA,KeB[] DB)
			{
				ArrayList<KeA> DA_P=new ArrayList<>();
				ArrayList<KeB> DB_P=new ArrayList<>();
				Ad_Al(DA,DA_P);
				Ad_Al(DB,DB_P);
				Set_Ds(DA_P,DB_P);
			}

	public void Ad_Dim_A(KeA A){DA.add(A);}
	public void Ad_Dim_B(KeB B)
	{
		DB.add(B);
		put(B,new HashMap<>());
	}
	public void Ad_Dim_A_B(KeA A)
	{
		Ad_Dim_A(A);
		Ad_Dim_B((KeB)A);
	}
	public Valu Put(KeA A,KeB B,Valu Valu){return get(B).put(A,Valu);}
	public Valu Get(KeA A,KeB B){return get(B).get(A);}

	static{Init_Nd(Hash_Grid.class);}
}