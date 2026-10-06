package app ;
import com.genexus.*;

public final  class StructSdtSDTResumenGrupoOperario implements Cloneable, java.io.Serializable
{
   public StructSdtSDTResumenGrupoOperario( )
   {
      this( -1, new ModelContext( StructSdtSDTResumenGrupoOperario.class ));
   }

   public StructSdtSDTResumenGrupoOperario( int remoteHandle ,
                                            ModelContext context )
   {
      gxTv_SdtSDTResumenGrupoOperario_Openom = "" ;
      gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion = new java.math.BigDecimal(0) ;
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

   public int getGruopecod( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Gruopecod ;
   }

   public void setGruopecod( int value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Gruopecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Openom = value ;
   }

   public java.math.BigDecimal getKilosproduccion( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion ;
   }

   public void setKilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getMetrosproduccion( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion ;
   }

   public void setMetrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion = value ;
   }

   protected byte gxTv_SdtSDTResumenGrupoOperario_N ;
   protected int gxTv_SdtSDTResumenGrupoOperario_Gruopecod ;
   protected String gxTv_SdtSDTResumenGrupoOperario_Openom ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion ;
}

