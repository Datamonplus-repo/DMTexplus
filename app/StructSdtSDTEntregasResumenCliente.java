package app ;
import com.genexus.*;

public final  class StructSdtSDTEntregasResumenCliente implements Cloneable, java.io.Serializable
{
   public StructSdtSDTEntregasResumenCliente( )
   {
      this( -1, new ModelContext( StructSdtSDTEntregasResumenCliente.class ));
   }

   public StructSdtSDTEntregasResumenCliente( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtSDTEntregasResumenCliente_Clinom = "" ;
      gxTv_SdtSDTEntregasResumenCliente_Level1_N = (byte)(1) ;
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
      return gxTv_SdtSDTEntregasResumenCliente_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTEntregasResumenCliente_Level1Item> getLevel1( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.StructSdtSDTEntregasResumenCliente_Level1Item> value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1 = value ;
   }

   protected byte gxTv_SdtSDTEntregasResumenCliente_Level1_N ;
   protected byte gxTv_SdtSDTEntregasResumenCliente_N ;
   protected int gxTv_SdtSDTEntregasResumenCliente_Clicod ;
   protected String gxTv_SdtSDTEntregasResumenCliente_Clinom ;
   protected java.util.Vector<app.StructSdtSDTEntregasResumenCliente_Level1Item> gxTv_SdtSDTEntregasResumenCliente_Level1=null ;
}

