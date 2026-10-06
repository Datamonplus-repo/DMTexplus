package app ;
import com.genexus.*;

public final  class StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( )
   {
      this( -1, new ModelContext( StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem.class ));
   }

   public StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( int remoteHandle ,
                                                                     ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran = cal.getTime() ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N = (byte)(1) ;
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

   public long getNalbaran( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran ;
   }

   public void setNalbaran( long value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran = value ;
   }

   public java.util.Date getFalbaran( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran ;
   }

   public void setFalbaran( java.util.Date value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran = value ;
   }

   public java.math.BigDecimal getKilosalb( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb ;
   }

   public void setKilosalb( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb = value ;
   }

   public java.math.BigDecimal getMetrosalb( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb ;
   }

   public void setMetrosalb( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb = value ;
   }

   public int getPiezasalb( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb ;
   }

   public void setPiezasalb( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb = value ;
   }

   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb ;
   protected long gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran ;
   protected java.util.Date gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb ;
}

