package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenOperario_OperarioItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenOperario_OperarioItem( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenOperario_OperarioItem.class ));
   }

   public StructSdtSDTInformeProduccionResumenOperario_OperarioItem( int remoteHandle ,
                                                                     ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom = "" ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod = value ;
   }

   public byte getHisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo ;
   }

   public void setHisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom = value ;
   }

   public int getGruopecod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod ;
   }

   public void setGruopecod( int value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod = value ;
   }

   public java.math.BigDecimal getPorkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo ;
   }

   public void setPorkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo = value ;
   }

   public java.math.BigDecimal getPormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro ;
   }

   public void setPormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo ;
   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N ;
   protected short gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod ;
   protected int gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod ;
   protected String gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro ;
}

