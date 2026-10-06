package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_AlertaGraficaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_AlertaGraficaSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_AlertaGraficaSDT.class ));
   }

   public StructSdtMRec_AlertaGraficaSDT( int remoteHandle ,
                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha = cal.getTime() ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 = new java.math.BigDecimal(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N = (byte)(1) ;
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

   public java.util.Date getGraficafecha( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha ;
   }

   public void setGraficafecha( java.util.Date value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha = value ;
   }

   public java.math.BigDecimal getMprecplc_1( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 ;
   }

   public void setMprecplc_1( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 = value ;
   }

   public java.math.BigDecimal getMprecplc_2( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 ;
   }

   public void setMprecplc_2( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 = value ;
   }

   public java.math.BigDecimal getMprecplc_3( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 ;
   }

   public void setMprecplc_3( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 = value ;
   }

   protected byte gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N ;
   protected byte gxTv_SdtMRec_AlertaGraficaSDT_N ;
   protected java.util.Date gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 ;
}

