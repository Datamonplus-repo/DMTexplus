package app ;
import com.genexus.*;

public final  class StructSdtSDTOperarios implements Cloneable, java.io.Serializable
{
   public StructSdtSDTOperarios( )
   {
      this( -1, new ModelContext( StructSdtSDTOperarios.class ));
   }

   public StructSdtSDTOperarios( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSDTOperarios_Openom = "" ;
      gxTv_SdtSDTOperarios_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTOperarios_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public int getOpecod( )
   {
      return gxTv_SdtSDTOperarios_Opecod ;
   }

   public void setOpecod( int value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Opecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtSDTOperarios_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Openom = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTOperarios_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTOperarios_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTOperarios_N ;
   protected int gxTv_SdtSDTOperarios_Opecod ;
   protected String gxTv_SdtSDTOperarios_Openom ;
   protected java.math.BigDecimal gxTv_SdtSDTOperarios_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTOperarios_Metrosproduccion ;
}

