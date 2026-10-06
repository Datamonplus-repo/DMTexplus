package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosMaquina.class ));
   }

   public StructSdtSDTHistoricoReoperadosMaquina( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N = (byte)(1) ;
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
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> getTiposdedefectos( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos ;
   }

   public void setTiposdedefectos( java.util.Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_N ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos=null ;
}

