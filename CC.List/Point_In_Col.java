package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.$.Q$.Point$;
import java.util.Collection;

public class Point_In_Col<Adbl> implements Point$<Adbl>
{
	/*
	public static final Clas_Rap Class=Init_StRt(Point_In_Col.class,
		Clas_Rap.class);/*Dep ?done*/

	public Point_In_Col(Collection<Adbl> Col){this.Col=Col;}
	public Point_In_Col(){}

	public Collection<Adbl> Col;
		@Override public void Point$(Adbl Ad){Col.add(Ad);}

	//static{Init_Nd(Point_In_Col.class);}
}