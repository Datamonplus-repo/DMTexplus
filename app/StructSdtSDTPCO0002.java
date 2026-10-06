package app ;
import com.genexus.*;

public final  class StructSdtSDTPCO0002 implements Cloneable, java.io.Serializable
{
   public StructSdtSDTPCO0002( )
   {
      this( -1, new ModelContext( StructSdtSDTPCO0002.class ));
   }

   public StructSdtSDTPCO0002( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtSDTPCO0002_Codigo = "" ;
      gxTv_SdtSDTPCO0002_Descripcion = "" ;
      gxTv_SdtSDTPCO0002_Periodo = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPCO0002_Acumulado = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTPCO0002_Total = new java.math.BigDecimal(0) ;
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

   public String getCodigo( )
   {
      return gxTv_SdtSDTPCO0002_Codigo ;
   }

   public void setCodigo( String value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Codigo = value ;
   }

   public String getDescripcion( )
   {
      return gxTv_SdtSDTPCO0002_Descripcion ;
   }

   public void setDescripcion( String value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Descripcion = value ;
   }

   public java.math.BigDecimal getPeriodo( )
   {
      return gxTv_SdtSDTPCO0002_Periodo ;
   }

   public void setPeriodo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Periodo = value ;
   }

   public java.math.BigDecimal getAcumulado( )
   {
      return gxTv_SdtSDTPCO0002_Acumulado ;
   }

   public void setAcumulado( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Acumulado = value ;
   }

   public java.math.BigDecimal getTotal( )
   {
      return gxTv_SdtSDTPCO0002_Total ;
   }

   public void setTotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPCO0002_N = (byte)(0) ;
      gxTv_SdtSDTPCO0002_Total = value ;
   }

   protected byte gxTv_SdtSDTPCO0002_N ;
   protected String gxTv_SdtSDTPCO0002_Codigo ;
   protected String gxTv_SdtSDTPCO0002_Descripcion ;
   protected java.math.BigDecimal gxTv_SdtSDTPCO0002_Periodo ;
   protected java.math.BigDecimal gxTv_SdtSDTPCO0002_Acumulado ;
   protected java.math.BigDecimal gxTv_SdtSDTPCO0002_Total ;
}

