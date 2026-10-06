package app.almacensindetalle ;
import com.genexus.*;

public final  class StructSdtFilterDevolucionTejido_1 implements Cloneable, java.io.Serializable
{
   public StructSdtFilterDevolucionTejido_1( )
   {
      this( -1, new ModelContext( StructSdtFilterDevolucionTejido_1.class ));
   }

   public StructSdtFilterDevolucionTejido_1( int remoteHandle ,
                                             ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterDevolucionTejido_1_Devcrustt = "" ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom = cal.getTime() ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto = cal.getTime() ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N = (byte)(1) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public int getDevcruid( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcruid ;
   }

   public void setDevcruid( int value )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcruid = value ;
   }

   public String getDevcrustt( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcrustt ;
   }

   public void setDevcrustt( String value )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrustt = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Clicod = value ;
   }

   public java.util.Date getDevcrufecfrom( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom ;
   }

   public void setDevcrufecfrom( java.util.Date value )
   {
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom = value ;
   }

   public java.util.Date getDevcrufecto( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcrufecto ;
   }

   public void setDevcrufecto( java.util.Date value )
   {
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto = value ;
   }

   protected byte gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N ;
   protected byte gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N ;
   protected byte gxTv_SdtFilterDevolucionTejido_1_N ;
   protected int gxTv_SdtFilterDevolucionTejido_1_Devcruid ;
   protected int gxTv_SdtFilterDevolucionTejido_1_Clicod ;
   protected String gxTv_SdtFilterDevolucionTejido_1_Devcrustt ;
   protected java.util.Date gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom ;
   protected java.util.Date gxTv_SdtFilterDevolucionTejido_1_Devcrufecto ;
}

