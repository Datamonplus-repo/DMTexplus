package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina.class ));
   }

   public StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina( int remoteHandle ,
                                                                     ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N = (byte)(1) ;
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
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> getTiposarticulos( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos ;
   }

   public void setTiposarticulos( java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos=null ;
}

