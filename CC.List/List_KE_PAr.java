package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.List.Col_Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static CC.List.ArA_Util.To_ArA;
import static CC.List.Map_Plus.To_Map;

public class List_KE_PAr<Numratd> extends Num_Ke_Par<Numratd,List<Numratd>> implements List_Rap_Abs<Numratd>
{
	public static final Clas_Rap Class=Init_StRt(List_KE_PAr.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public List_KE_PAr(List<Numratd> List){super(List);}
	public List_KE_PAr(Iterator<Numratd> Sorc){this(Col_Util.Pop(Sorc));}
	public List_KE_PAr(@ArA Object Sorc){super((ArrayList<Numratd>)Col_Util.Pop(new Ara_Itr<>((Object[])Sorc)));}
	public List_KE_PAr(){}

	/**List*/
		@Override public List<Numratd> Get_Rapd(){return Numratd_Havr;}
		@Override public void Set_Rapd(List<Numratd> List){this.Numratd_Havr=Numratd_Havr;}
	@Override public Map<Numratd,Integer> Ke(List<Numratd> List){return To_Map(List);}
	@Override public boolean add(Numratd Numratd)
	{
		Ke.put(Numratd,size());

		return List_Rap_Abs.super.add(Numratd);
	}
	@Override public boolean remove(Object Numratd)
	{
		boolean Ret=List_Rap_Abs.super.remove(Numratd);
		Updat_Ke();

		return Ret;
	}

	public interface Ara_Ke_Par_Havr_Abs<Item>
	{
		Clas_Rap Class=Init_StRt(Ara_Ke_Par_Havr_Abs.class
			,Clas_Rap.class
		);/*Dep ?done*/

		List_KE_PAr<Item> Ara_Ke_Par();

		class Ara_Ke_Par_Havr<Item> implements Ara_Ke_Par_Havr_Abs<Item>
		{
			public static final Clas_Rap Class=Init_StRt(Ara_Ke_Par_Havr.class
				,Clas_Rap.class
			);/*Dep ?done*/

			public Ara_Ke_Par_Havr(List_KE_PAr Par){this.Ara_Ke_Par=Ara_Ke_Par;}
			public Ara_Ke_Par_Havr(){}

			public List_KE_PAr<Item> Ara_Ke_Par;
				@Override public List_KE_PAr<Item> Ara_Ke_Par(){return Ara_Ke_Par;}

			static{Init_Nd(Ara_Ke_Par_Havr.class);}
		}
	}

	static{Init_Nd(List_KE_PAr.class);}
}