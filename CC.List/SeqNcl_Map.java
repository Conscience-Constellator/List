package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.ArrayList;
import java.util.HashMap;

public class SeqNcl_Map<K,V> extends HashMap<K,V>
{
	/*
	public static final Clas_Rap Class=Init_StRt(SeqNcl_Map.class,
		Clas_Rap.class);/*Dep ?done*/

	public SeqNcl_Map(){}

	public ArrayList<K> Seqnc=new ArrayList<>();
	@Override public V put(K Ke,V Valu)
	{
		Seqnc.add(Ke);
		return super.put(Ke,Valu);
	}

	//static{Init_Nd(SeqNcl_Map.class);}
}