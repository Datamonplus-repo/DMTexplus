package app ;
import com.genexus.*;

public final  class StructSdtSDTHistoricoReoperadosTipoDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtSDTHistoricoReoperadosTipoDefecto( )
   {
      this( -1, new ModelContext( StructSdtSDTHistoricoReoperadosTipoDefecto.class ));
   }

   public StructSdtSDTHistoricoReoperadosTipoDefecto( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N = (byte)(1) ;
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
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> getClientes( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes ;
   }

   public void setClientes( java.util.Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes = value ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc ;
   protected java.util.Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes=null ;
}

