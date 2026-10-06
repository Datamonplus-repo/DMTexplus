package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem( )
   {
      this( -1, new ModelContext( StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem.class ));
   }

   public StructSdtWWCCPoln1SDT_WWCCPoln1SDTItem( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar = "" ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod = "" ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod = "" ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc = "" ;
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

   public int getGridbarcod( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod ;
   }

   public void setGridbarcod( int value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod = value ;
   }

   public byte getGridbarcodreo( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo ;
   }

   public void setGridbarcodreo( byte value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo = value ;
   }

   public String getGridbarcodpar( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar ;
   }

   public void setGridbarcodpar( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar = value ;
   }

   public String getGridbarprocod( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod ;
   }

   public void setGridbarprocod( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod = value ;
   }

   public short getGridbarordlin( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin ;
   }

   public void setGridbarordlin( short value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin = value ;
   }

   public String getGridfascod( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod ;
   }

   public void setGridfascod( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod = value ;
   }

   public String getGridfasdsc( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc ;
   }

   public void setGridfasdsc( String value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc = value ;
   }

   public short getGridnum_cc( )
   {
      return gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc ;
   }

   public void setGridnum_cc( short value )
   {
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N = (byte)(0) ;
      gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc = value ;
   }

   protected byte gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo ;
   protected byte gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_N ;
   protected short gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin ;
   protected short gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc ;
   protected int gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod ;
   protected String gxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc ;
}

