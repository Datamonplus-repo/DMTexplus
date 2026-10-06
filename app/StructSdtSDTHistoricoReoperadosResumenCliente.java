package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenCliente implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenCliente( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenCliente.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenCliente( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(1) ;
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

   public int getCliente( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente ;
   }

   public void setCliente( int value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente = value ;
   }

   public String getClientenombre( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre ;
   }

   public void setClientenombre( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre = value ;
   }

   public app.StructSdtSDTHistoricoReoperadosResumenCliente_Total getTotal( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total ;
   }

   public void setTotal( app.StructSdtSDTHistoricoReoperadosResumenCliente_Total value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total = value;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenCliente_N ;
   protected int gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre ;
   protected app.StructSdtSDTHistoricoReoperadosResumenCliente_Total gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total=null ;
}

