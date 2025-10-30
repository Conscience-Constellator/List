package CC.List;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static java.lang.System.out;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Conect.Nod.Lin_Nod;
import CC.Util.Object_Plus;

public interface   Nod_Abs
	   extends Lin_Nod
{
	/*
	Clas_Rap Class=Init_StRt(Nod_Abs.class,
		Clas_Rap.class);/*Dep !done*/

	@Override
	Nod_Abs Bfor();
	@Override
	Nod_Abs Aftr();

	class Nod<Item> extends Object_Plus implements Nod_Abs
	{
		public static final Clas_Rap Class=Init_StRt(Nod.class,Nod_Abs.Class.Depg);

		public Nod(Item Item){Set_Item(Item);}
		public Nod(){}

		public Item Item;
			public Item Item(){return Item;}
			public void Set_Item(Item Item){this.Item=Item;}

		public Nod<Item> Bfor,Aftr;
			@Override public Nod<Item> Bfor(){return Bfor;}
			public void Set_Bfor(Nod<Item> Bfor){this.Bfor=Bfor;}
			@Override public Nod<Item> Aftr(){return Aftr;}
			public void Set_Aftr(Nod<Item> Aftr){this.Aftr=Aftr;}

		public static <Item>void Set_Bfor_Aftr(Nod<Item> Bfor,Nod<Item> Bfor_Aftr,Nod<Item> Aftr,Nod<Item> Aftr_Bfor)
		{
			Bfor.Set_Aftr(Bfor_Aftr);
			Aftr.Set_Bfor(Aftr_Bfor);
		}
			public static <Item>void Con(Nod<Item> Bfor,Nod<Item> Aftr)
			{
				//out.println("Lin_List.Con()");
				Set_Bfor_Aftr(Bfor,Aftr,Aftr,Bfor);
			}
			public void Con_Bfor(Nod<Item> Bfor){Con(Bfor,this);}
			public void Con_Aftr(Nod<Item> Aftr){Con(this,Aftr);}
			public void Con(Nod<Item> Aftr){Con_Aftr(Aftr);}
				public void Con_Cyc(Nod<Item> B)
				{
					Con_Bfor(B);
					Con_Aftr(B);
				}
		public static <Item>void Discon(Nod<Item> Bfor,Nod<Item> Aftr)
		{
			Bfor.Set_Aftr(null);
			Aftr.Set_Bfor(null);
		}
			public void Discon_Bfor(){Discon(Bfor(),this);}
			public void Discon_Aftr(){Discon(this,Aftr());}
			public void Discon(){Discon_Aftr();}

		public static <Item>void Insrt(Nod<Item> Bfor,Nod<Item> Insrt,Nod<Item> Aftr)
		{
			Insrt.Con_Bfor(Bfor);
			Insrt.Con_Aftr(Aftr);
		}
			public void Insrt_Bfor(Nod<Item> Bfor)
			{
				out.println("Insrt_Bfor()");
				Insrt(Bfor,this,Bfor.Aftr());
			}
			public void Insrt_Aftr(Nod<Item> Aftr){Insrt(Aftr.Bfor(),this,Aftr);}
			public static <Item>void Insrt(Nod<Item> A_Strt,Nod<Item> A_Nd,Nod<Item> B_Strt,Nod<Item> B_Nd)
			{
				A_Strt.Con_Aftr(B_Strt);
				A_Nd.Con_Bfor(B_Nd);
			}
		public void Rem()
		{
			Bfor().Con_Aftr(Aftr());
			Set_Bfor(null);
			Set_Aftr(null);
		}

		static{Init_Nd(Nod.class);}
	}

	Nom_Imp_Par Imp_Par=Init_Nd(new Nom_Imp_Par(Nod.class,"Linkd_List_Nod"),List_Nod_Abs.class);
}