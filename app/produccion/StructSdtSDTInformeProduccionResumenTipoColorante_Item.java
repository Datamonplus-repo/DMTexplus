package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenTipoColorante_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenTipoColorante_Item( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenTipoColorante_Item.class ));
   }

   public StructSdtSDTInformeProduccionResumenTipoColorante_Item( int remoteHandle ,
                                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod = value ;
   }

   public byte getHisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo ;
   }

   public void setHisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr = value ;
   }

   public String getTipcoldsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc ;
   }

   public void setTipcoldsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc = value ;
   }

   public java.math.BigDecimal getPorkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo ;
   }

   public void setPorkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo = value ;
   }

   public java.math.BigDecimal getPormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro ;
   }

   public void setPormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N ;
   protected short gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro ;
}

