package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante( int remoteHandle ,
                                                                                                ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcoldsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Kilos = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Metros = new java.math.BigDecimal(0) ;
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

   public byte getHistipcol( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcol ;
   }

   public void setHistipcol( byte value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcol = value ;
   }

   public String getHistipcoldsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcoldsc ;
   }

   public void setHistipcoldsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcoldsc = value ;
   }

   public java.math.BigDecimal getKilos( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Kilos ;
   }

   public void setKilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Kilos = value ;
   }

   public java.math.BigDecimal getMetros( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Metros ;
   }

   public void setMetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Metros = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcol ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_N ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Histipcoldsc ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Kilos ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante_Metros ;
}

