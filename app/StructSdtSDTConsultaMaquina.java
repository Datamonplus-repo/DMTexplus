package app ;
import com.genexus.*;

public final  class StructSdtSDTConsultaMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTConsultaMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTConsultaMaquina.class ));
   }

   public StructSdtSDTConsultaMaquina( int remoteHandle ,
                                       ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTConsultaMaquina_Ommaqcod = "" ;
      gxTv_SdtSDTConsultaMaquina_Omdscmqpla = "" ;
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre = cal.getTime() ;
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre = cal.getTime() ;
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_Ordenes_N = (byte)(1) ;
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

   public String getOmmaqcod( )
   {
      return gxTv_SdtSDTConsultaMaquina_Ommaqcod ;
   }

   public void setOmmaqcod( String value )
   {
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Ommaqcod = value ;
   }

   public String getOmdscmqpla( )
   {
      return gxTv_SdtSDTConsultaMaquina_Omdscmqpla ;
   }

   public void setOmdscmqpla( String value )
   {
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Omdscmqpla = value ;
   }

   public java.util.Date getMinimaomfchcre( )
   {
      return gxTv_SdtSDTConsultaMaquina_Minimaomfchcre ;
   }

   public void setMinimaomfchcre( java.util.Date value )
   {
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre = value ;
   }

   public java.util.Date getMaximaomfchcre( )
   {
      return gxTv_SdtSDTConsultaMaquina_Maximaomfchcre ;
   }

   public void setMaximaomfchcre( java.util.Date value )
   {
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre = value ;
   }

   public long getTotalordenes( )
   {
      return gxTv_SdtSDTConsultaMaquina_Totalordenes ;
   }

   public void setTotalordenes( long value )
   {
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Totalordenes = value ;
   }

   public java.util.Vector<app.StructSdtSDTConsultaMaquina_OrdenesItem> getOrdenes( )
   {
      return gxTv_SdtSDTConsultaMaquina_Ordenes ;
   }

   public void setOrdenes( java.util.Vector<app.StructSdtSDTConsultaMaquina_OrdenesItem> value )
   {
      gxTv_SdtSDTConsultaMaquina_Ordenes_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Ordenes = value ;
   }

   protected byte gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_Ordenes_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_N ;
   protected long gxTv_SdtSDTConsultaMaquina_Totalordenes ;
   protected String gxTv_SdtSDTConsultaMaquina_Ommaqcod ;
   protected String gxTv_SdtSDTConsultaMaquina_Omdscmqpla ;
   protected java.util.Date gxTv_SdtSDTConsultaMaquina_Minimaomfchcre ;
   protected java.util.Date gxTv_SdtSDTConsultaMaquina_Maximaomfchcre ;
   protected java.util.Vector<app.StructSdtSDTConsultaMaquina_OrdenesItem> gxTv_SdtSDTConsultaMaquina_Ordenes=null ;
}

