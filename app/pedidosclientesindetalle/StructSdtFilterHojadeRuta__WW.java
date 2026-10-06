package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtFilterHojadeRuta__WW implements Cloneable, java.io.Serializable
{
   public StructSdtFilterHojadeRuta__WW( )
   {
      this( -1, new ModelContext( StructSdtFilterHojadeRuta__WW.class ));
   }

   public StructSdtFilterHojadeRuta__WW( int remoteHandle ,
                                         ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterHojadeRuta__WW_Barcodpar = "" ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom = cal.getTime() ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento = cal.getTime() ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N = (byte)(1) ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N = (byte)(1) ;
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
      return gxTv_SdtFilterHojadeRuta__WW_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Clicod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcodpar = value ;
   }

   public java.util.Date getBarfecgenfrom( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom ;
   }

   public void setBarfecgenfrom( java.util.Date value )
   {
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom = value ;
   }

   public java.util.Date getBarfecgento( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barfecgento ;
   }

   public void setBarfecgento( java.util.Date value )
   {
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento = value ;
   }

   public byte getBarsitfrom( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barsitfrom ;
   }

   public void setBarsitfrom( byte value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barsitfrom = value ;
   }

   public byte getBarsitto( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barsitto ;
   }

   public void setBarsitto( byte value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barsitto = value ;
   }

   protected byte gxTv_SdtFilterHojadeRuta__WW_Barcodreo ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barsitfrom ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barsitto ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_N ;
   protected int gxTv_SdtFilterHojadeRuta__WW_Clicod ;
   protected int gxTv_SdtFilterHojadeRuta__WW_Barcod ;
   protected String gxTv_SdtFilterHojadeRuta__WW_Barcodpar ;
   protected java.util.Date gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom ;
   protected java.util.Date gxTv_SdtFilterHojadeRuta__WW_Barfecgento ;
}

