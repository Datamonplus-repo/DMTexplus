package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem.class ));
   }

   public StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem( int remoteHandle ,
                                                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod = value ;
   }

   public byte getHisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo ;
   }

   public void setHisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr = value ;
   }

   public short getHisprotip( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip ;
   }

   public void setHisprotip( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc = value ;
   }

   public java.math.BigDecimal getPorkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo ;
   }

   public void setPorkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo = value ;
   }

   public java.math.BigDecimal getPormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro ;
   }

   public void setPormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N ;
   protected short gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod ;
   protected short gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro ;
}

