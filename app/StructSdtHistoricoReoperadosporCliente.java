package app ;
import com.genexus.*;

public final  class StructSdtHistoricoReoperadosporCliente implements Cloneable, java.io.Serializable
{
   public StructSdtHistoricoReoperadosporCliente( )
   {
      this( -1, new ModelContext( StructSdtHistoricoReoperadosporCliente.class ));
   }

   public StructSdtHistoricoReoperadosporCliente( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtHistoricoReoperadosporCliente_Clinom = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N = (byte)(1) ;
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
      return gxTv_SdtHistoricoReoperadosporCliente_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto> getTiposdedefectos( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos ;
   }

   public void setTiposdedefectos( java.util.Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto> value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos = value ;
   }

   protected byte gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N ;
   protected byte gxTv_SdtHistoricoReoperadosporCliente_N ;
   protected int gxTv_SdtHistoricoReoperadosporCliente_Clicod ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_Clinom ;
   protected java.util.Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto> gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos=null ;
}

