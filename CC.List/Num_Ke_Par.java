package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Util.IndX.Get_IndX;
import java.util.Map;

public abstract class Num_Ke_Par<Numratd,Numratd_Havr>
	implements Get_IndX<Numratd>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Num_Ke_Par.class,
		Clas_Rap.class);/*Dep ?done*/

	public Numratd_Havr Numratd_Havr;
	public Map<Numratd,Integer> Ke;
		public int Point_To_Num(Numratd Numratd)
		{return Ke.get(Numratd);}
		public abstract Map<Numratd,Integer> Ke(Numratd_Havr Numratd_Havr);
			public void Updat_Ke()
			{Ke=Ke(Numratd_Havr);}
		public void Set_Numratd_Havr(Numratd_Havr Numratd_Havr)
		{
			this.Numratd_Havr=Numratd_Havr;
			Updat_Ke();
		}

	public Num_Ke_Par(Numratd_Havr Numratd_Havr)
	{Set_Numratd_Havr(Numratd_Havr);}
	public Num_Ke_Par()
	{}

	//static{Init_Nd(Num_Ke_Par.class);}
}