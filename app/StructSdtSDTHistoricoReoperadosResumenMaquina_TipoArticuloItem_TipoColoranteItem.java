package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( int remoteHandle ,
                                                                                            ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod = new java.math.BigDecimal(0) ;
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

   public byte getTipcolcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod = value ;
   }

   public String getTipcoldsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc ;
   }

   public void setTipcoldsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc = value ;
   }

   public java.math.BigDecimal getKilostipcolcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod ;
   }

   public void setKilostipcolcod( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod = value ;
   }

   public java.math.BigDecimal getMetrostipcolcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod ;
   }

   public void setMetrostipcolcod( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod ;
}

