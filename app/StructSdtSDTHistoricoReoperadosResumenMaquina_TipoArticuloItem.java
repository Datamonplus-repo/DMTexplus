package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( int remoteHandle ,
                                                                          ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N = (byte)(1) ;
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

   public short getTipartcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod ;
   }

   public void setTipartcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> getTipocolorante( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante ;
   }

   public void setTipocolorante( java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante=null ;
}

