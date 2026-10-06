package app ;
import com.genexus.*;

public final  class StructSdtSDTMaquinas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTMaquinas( )
   {
      this( -1, new ModelContext( StructSdtSDTMaquinas.class ));
   }

   public StructSdtSDTMaquinas( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtSDTMaquinas_Maqcod = "" ;
      gxTv_SdtSDTMaquinas_Maqdsc = "" ;
      gxTv_SdtSDTMaquinas_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTMaquinas_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public String getMaqcod( )
   {
      return gxTv_SdtSDTMaquinas_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTMaquinas_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Maqdsc = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTMaquinas_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTMaquinas_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTMaquinas_N ;
   protected String gxTv_SdtSDTMaquinas_Maqcod ;
   protected String gxTv_SdtSDTMaquinas_Maqdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinas_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinas_Metrosproduccion ;
}

