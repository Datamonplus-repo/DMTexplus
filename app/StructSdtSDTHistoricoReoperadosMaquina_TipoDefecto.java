package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto.class ));
   }

   public StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto( int remoteHandle ,
                                                              ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N = (byte)(1) ;
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

   public short getTipdefcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> getHdrs( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs ;
   }

   public void setHdrs( java.util.Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs=null ;
}

