package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenCliente_Total implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenCliente_Total( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenCliente_Total.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenCliente_Total( int remoteHandle ,
                                                               ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getTotalkilos( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos ;
   }

   public void setTotalkilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos = value ;
   }

   public java.math.BigDecimal getTotalmetros( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros ;
   }

   public void setTotalmetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros ;
}

