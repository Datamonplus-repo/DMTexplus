package app ;
import com.genexus.*;

public final  class StructSdtSDTClienteResumenEntradas implements Cloneable, java.io.Serializable
{
   public StructSdtSDTClienteResumenEntradas( )
   {
      this( -1, new ModelContext( StructSdtSDTClienteResumenEntradas.class ));
   }

   public StructSdtSDTClienteResumenEntradas( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtSDTClienteResumenEntradas_Clinom = "" ;
      gxTv_SdtSDTClienteResumenEntradas_Level1_N = (byte)(1) ;
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
      return gxTv_SdtSDTClienteResumenEntradas_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Clinom = value ;
   }

   public java.util.Vector<app.StructSdtSDTClienteResumenEntradas_Level1Item> getLevel1( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.StructSdtSDTClienteResumenEntradas_Level1Item> value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1 = value ;
   }

   protected byte gxTv_SdtSDTClienteResumenEntradas_Level1_N ;
   protected byte gxTv_SdtSDTClienteResumenEntradas_N ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Clicod ;
   protected String gxTv_SdtSDTClienteResumenEntradas_Clinom ;
   protected java.util.Vector<app.StructSdtSDTClienteResumenEntradas_Level1Item> gxTv_SdtSDTClienteResumenEntradas_Level1=null ;
}

