package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( int remoteHandle ,
                                                                                  ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N = (byte)(1) ;
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

   public short getHistipart( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart ;
   }

   public void setHistipart( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart = value ;
   }

   public String getHistipartdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc ;
   }

   public void setHistipartdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> getTiposcolorantes( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes ;
   }

   public void setTiposcolorantes( java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes=null ;
}

