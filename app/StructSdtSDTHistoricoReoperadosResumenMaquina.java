package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenMaquina.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenMaquina( int remoteHandle ,
                                                         ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N = (byte)(1) ;
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
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> getTipoarticulo( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo ;
   }

   public void setTipoarticulo( java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo=null ;
}

