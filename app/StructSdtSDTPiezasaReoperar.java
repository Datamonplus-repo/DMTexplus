package app ;
import com.genexus.*;

public final  class StructSdtSDTPiezasaReoperar implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPiezasaReoperar( )
   {
      this( -1, new ModelContext( StructSdtSDTPiezasaReoperar.class ));
   }

   public StructSdtSDTPiezasaReoperar( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtSDTPiezasaReoperar_Barpiecod = "" ;
      gxTv_SdtSDTPiezasaReoperar_Barpiekil = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiemet = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino = "" ;
      gxTv_SdtSDTPiezasaReoperar_Barpieloc = "" ;
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

   public String getBarpiecod( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiecod ;
   }

   public void setBarpiecod( String value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiecod = value ;
   }

   public java.math.BigDecimal getBarpiekil( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiekil ;
   }

   public void setBarpiekil( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiekil = value ;
   }

   public java.math.BigDecimal getKilosdisponibles( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles ;
   }

   public void setKilosdisponibles( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles = value ;
   }

   public java.math.BigDecimal getBarpiemet( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiemet ;
   }

   public void setBarpiemet( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiemet = value ;
   }

   public java.math.BigDecimal getMetrosdispobibles( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles ;
   }

   public void setMetrosdispobibles( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles = value ;
   }

   public String getBarpiecoddestino( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino ;
   }

   public void setBarpiecoddestino( String value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino = value ;
   }

   public String getBarpieloc( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpieloc ;
   }

   public void setBarpieloc( String value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpieloc = value ;
   }

   protected byte gxTv_SdtSDTPiezasaReoperar_N ;
   protected String gxTv_SdtSDTPiezasaReoperar_Barpiecod ;
   protected String gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino ;
   protected String gxTv_SdtSDTPiezasaReoperar_Barpieloc ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Barpiekil ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Barpiemet ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles ;
}

