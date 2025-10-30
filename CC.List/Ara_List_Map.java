package CC.List;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.List.Col_Util;
import java.util.*;

public class Ara_List_Map<KE,ValU>
  implements Map_Plus<KE,ValU>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Ara_List_Map.class,
		Clas_Rap.class);
	/*Dep ?done*/

	public List<KE> KEg=new ArrayList<>();
	public List<ValU> ValUg=new ArrayList<>();
		@Override public int size(){return KEg.size();}
		@Override public boolean containsKey(Object KE){return this.KEg.contains(KE);}
		@Override public boolean containsValue(Object ValU){return this.ValUg.contains(ValU);}
		@Override public ValU get(Object KE)
		{
			for(int IndX=0;
				IndX<this.KEg.size();
				IndX+=1)
			{
				if(KE==this.KEg.get(IndX))
				{return ValUg.get(IndX);}
			}
			return null;
		}
		@Override
		public ValU put(KE KE,ValU ValU)
		{
			int IndX=KEg.indexOf(KE);
			if(IndX!=-1)
			{
				KEg.set(IndX,KE);
				ValUg.set(IndX,ValU);
			}
			else
			{
				KEg.add(KE);
				this.ValUg.add(ValU);
			}
			return null;
		}
		@Override
		public ValU remove(Object KE)
		{
			int IndX=KEg.indexOf(KE);
			ValU Old=ValUg.get(IndX);
			KEg.remove(IndX);
			ValUg.remove(IndX);

			return Old;
		}
		@Override
		public void clear()
		{
			KEg=new ArrayList<>();
			ValUg=new ArrayList<>();
		}
		@Override public Set<KE> keySet(){return Col_Util.Ad_List(new HashSet<>(),KEg);}
		@Override public Set<ValU> values(){return Col_Util.Ad_List(new HashSet<>(),ValUg);}
		@Override public Set<Entry<KE,ValU>> entrySet(){return Col_Util.Ad_List(new HashSet<>(),Map_Plus.Ntry_Set(KEg,ValUg));}

	public Ara_List_Map(Object... List)
	{Put_List(List);}
	public Ara_List_Map()
	{}

//	static{Init_Nd(Ara_List_Map.class);}
}