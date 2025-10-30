package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.ArrayList;
import java.util.HashMap;

public class List_Setng implements List_Prt
{
	public static final Clas_Rap Class=Init_StRt(List_Setng.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public List_Setng(){}

	public Object N(Object Item,Object[] Adrs)
	{
		Object[] var3=Adrs;
		int var4=Adrs.length;

		for(int var5=0;var5<var4;var5+=1)
		{
			Object Key=var3[var5];
			if(Item instanceof HashMap){Item=((HashMap)Item).get(Key);}
			else if(Item instanceof ArrayList){Item=((ArrayList)Item).get((Integer)Key);}
		}

		return Item;
	}

	static{Init_Nd(List_Setng.class);}
}