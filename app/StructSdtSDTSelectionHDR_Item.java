package app ;
import com.genexus.*;

public final  class StructSdtSDTSelectionHDR_Item implements Cloneable, java.io.Serializable
{
   public StructSdtSDTSelectionHDR_Item( )
   {
      this( -1, new ModelContext( StructSdtSDTSelectionHDR_Item.class ));
   }

   public StructSdtSDTSelectionHDR_Item( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtSDTSelectionHDR_Item_Emprcod = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barnhdr = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barcodpar = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barunimed = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Kilact = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Mtract = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcosany = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcospro = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barpri = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Usurcod = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barmdlcod = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Bardisnum = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barser = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barcolnom = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barnomcli = "" ;
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

   public boolean getSelected( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Selected ;
   }

   public void setSelected( boolean value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Selected = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Emprcod = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barnhdr = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcodpar = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barkgm = value ;
   }

   public java.math.BigDecimal getBarmtr( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barmtr ;
   }

   public void setBarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barmtr = value ;
   }

   public int getBarpie( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barpie ;
   }

   public void setBarpie( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barpie = value ;
   }

   public String getBarunimed( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barunimed ;
   }

   public void setBarunimed( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barunimed = value ;
   }

   public byte getBarsit( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barsit ;
   }

   public void setBarsit( byte value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barsit = value ;
   }

   public java.math.BigDecimal getKilact( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Kilact ;
   }

   public void setKilact( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Kilact = value ;
   }

   public java.math.BigDecimal getMtract( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Mtract ;
   }

   public void setMtract( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Mtract = value ;
   }

   public java.math.BigDecimal getBarcosany( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcosany ;
   }

   public void setBarcosany( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcosany = value ;
   }

   public java.math.BigDecimal getBarcospro( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcospro ;
   }

   public void setBarcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcospro = value ;
   }

   public String getBarpri( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barpri ;
   }

   public void setBarpri( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barpri = value ;
   }

   public String getUsurcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Usurcod ;
   }

   public void setUsurcod( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Usurcod = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Discod = value ;
   }

   public String getBarmdlcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barmdlcod ;
   }

   public void setBarmdlcod( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barmdlcod = value ;
   }

   public String getBardisnum( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Bardisnum ;
   }

   public void setBardisnum( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Bardisnum = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barser = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcolnum = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barnomcli = value ;
   }

   public short getMacrop( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Macrop ;
   }

   public void setMacrop( short value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Macrop = value ;
   }

   protected byte gxTv_SdtSDTSelectionHDR_Item_Barcodreo ;
   protected byte gxTv_SdtSDTSelectionHDR_Item_Barsit ;
   protected byte gxTv_SdtSDTSelectionHDR_Item_N ;
   protected short gxTv_SdtSDTSelectionHDR_Item_Macrop ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Barcod ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Barpie ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Discod ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Barcolnum ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Emprcod ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barnhdr ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barcodpar ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barunimed ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barpri ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Usurcod ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barmdlcod ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Bardisnum ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barser ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barcolnom ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barnomcli ;
   protected boolean gxTv_SdtSDTSelectionHDR_Item_Selected ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Kilact ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Mtract ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barcosany ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barcospro ;
}

