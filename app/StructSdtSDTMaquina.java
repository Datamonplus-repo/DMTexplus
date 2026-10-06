package app ;
import com.genexus.*;

public final  class StructSdtSDTMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTMaquina.class ));
   }

   public StructSdtSDTMaquina( int remoteHandle ,
                               ModelContext context )
   {
      gxTv_SdtSDTMaquina_Maqcod = "" ;
      gxTv_SdtSDTMaquina_Maqdsc = "" ;
      gxTv_SdtSDTMaquina_Sdthdrspormaquina_N = (byte)(1) ;
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
      return gxTv_SdtSDTMaquina_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTMaquina_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_Maqdsc = value ;
   }

   public java.util.Vector<app.StructSdtSDTHdrsporMaquina> getSdthdrspormaquina( )
   {
      return gxTv_SdtSDTMaquina_Sdthdrspormaquina ;
   }

   public void setSdthdrspormaquina( java.util.Vector<app.StructSdtSDTHdrsporMaquina> value )
   {
      gxTv_SdtSDTMaquina_Sdthdrspormaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_Sdthdrspormaquina = value ;
   }

   protected byte gxTv_SdtSDTMaquina_Sdthdrspormaquina_N ;
   protected byte gxTv_SdtSDTMaquina_N ;
   protected String gxTv_SdtSDTMaquina_Maqcod ;
   protected String gxTv_SdtSDTMaquina_Maqdsc ;
   protected java.util.Vector<app.StructSdtSDTHdrsporMaquina> gxTv_SdtSDTMaquina_Sdthdrspormaquina=null ;
}

