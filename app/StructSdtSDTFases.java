package app ;
import com.genexus.*;

public final  class StructSdtSDTFases implements Cloneable, java.io.Serializable
{
   public StructSdtSDTFases( )
   {
      this( -1, new ModelContext( StructSdtSDTFases.class ));
   }

   public StructSdtSDTFases( int remoteHandle ,
                             ModelContext context )
   {
      gxTv_SdtSDTFases_Fase = "" ;
      gxTv_SdtSDTFases_Fasdsc = "" ;
      gxTv_SdtSDTFases_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTFases_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public String getFase( )
   {
      return gxTv_SdtSDTFases_Fase ;
   }

   public void setFase( String value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Fase = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtSDTFases_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Fasdsc = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTFases_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTFases_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTFases_N ;
   protected String gxTv_SdtSDTFases_Fase ;
   protected String gxTv_SdtSDTFases_Fasdsc ;
   protected java.math.BigDecimal gxTv_SdtSDTFases_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTFases_Metrosproduccion ;
}

