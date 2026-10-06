package app.produccion ;
import com.genexus.*;

public final  class StructSdtSDTInformeProduccionResumenFase_FaseItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInformeProduccionResumenFase_FaseItem( )
   {
      this( -1, new ModelContext( StructSdtSDTInformeProduccionResumenFase_FaseItem.class ));
   }

   public StructSdtSDTInformeProduccionResumenFase_FaseItem( int remoteHandle ,
                                                             ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N = (byte)(1) ;
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
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod = value ;
   }

   public byte getHisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo ;
   }

   public void setHisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo = value ;
   }

   public String getFase( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase ;
   }

   public void setFase( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getPorkilos( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos ;
   }

   public void setPorkilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos = value ;
   }

   public java.math.BigDecimal getPormetros( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros ;
   }

   public void setPormetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros = value ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo ;
   protected byte gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N ;
   protected short gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros ;
}

