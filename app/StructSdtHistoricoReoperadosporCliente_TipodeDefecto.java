package app ;
import com.genexus.*;

public final  class StructSdtHistoricoReoperadosporCliente_TipodeDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtHistoricoReoperadosporCliente_TipodeDefecto( )
   {
      this( -1, new ModelContext( StructSdtHistoricoReoperadosporCliente_TipodeDefecto.class ));
   }

   public StructSdtHistoricoReoperadosporCliente_TipodeDefecto( int remoteHandle ,
                                                                ModelContext context )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N = (byte)(1) ;
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
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod ;
   }

   public void setTipdefcod( short value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod = value ;
   }

   public String getTipdefdsc( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc ;
   }

   public void setTipdefdsc( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc = value ;
   }

   public java.util.Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> getHdrs( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs ;
   }

   public void setHdrs( java.util.Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs = value ;
   }

   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N ;
   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N ;
   protected short gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc ;
   protected java.util.Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs=null ;
}

