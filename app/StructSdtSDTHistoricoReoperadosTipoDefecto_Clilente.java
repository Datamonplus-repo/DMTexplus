package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente.class ));
   }

   public StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente( int remoteHandle ,
                                                               ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> getHdrs( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs ;
   }

   public void setHdrs( java.util.Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N ;
   protected int gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs=null ;
}

