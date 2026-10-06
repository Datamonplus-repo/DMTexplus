package app ;
import com.genexus.*;

public final  class StructSdtSDTDefectos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDefectos( )
   {
      this( -1, new ModelContext( StructSdtSDTDefectos.class ));
   }

   public StructSdtSDTDefectos( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtSDTDefectos_Tipdefdsc = "" ;
      gxTv_SdtSDTDefectos_Kilosdefectos = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDefectos_Metrosdefectos = new java.math.BigDecimal(0) ;
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

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDTDefectos_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Tipdefdsc = value ;
   }

   public short getNumerodefectos( )
   {
      return gxTv_SdtSDTDefectos_Numerodefectos ;
   }

   public void setNumerodefectos( short value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Numerodefectos = value ;
   }

   public java.math.BigDecimal getKilosdefectos( )
   {
      return gxTv_SdtSDTDefectos_Kilosdefectos ;
   }

   public void setKilosdefectos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Kilosdefectos = value ;
   }

   public java.math.BigDecimal getMetrosdefectos( )
   {
      return gxTv_SdtSDTDefectos_Metrosdefectos ;
   }

   public void setMetrosdefectos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDefectos_N = (byte)(0) ;
      gxTv_SdtSDTDefectos_Metrosdefectos = value ;
   }

   protected byte gxTv_SdtSDTDefectos_N ;
   protected short gxTv_SdtSDTDefectos_Numerodefectos ;
   protected String gxTv_SdtSDTDefectos_Tipdefdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTDefectos_Kilosdefectos ;
   protected java.math.BigDecimal gxTv_SdtSDTDefectos_Metrosdefectos ;
}

