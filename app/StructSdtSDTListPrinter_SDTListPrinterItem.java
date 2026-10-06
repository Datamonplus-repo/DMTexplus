package app ;
import com.genexus.*;

public final  class StructSdtSDTListPrinter_SDTListPrinterItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTListPrinter_SDTListPrinterItem( )
   {
      this( -1, new ModelContext( StructSdtSDTListPrinter_SDTListPrinterItem.class ));
   }

   public StructSdtSDTListPrinter_SDTListPrinterItem( int remoteHandle ,
                                                      ModelContext context )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name = "" ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path = "" ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status = "" ;
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

   public String getName( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(0) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name = value ;
   }

   public String getPath( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path ;
   }

   public void setPath( String value )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(0) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path = value ;
   }

   public String getStatus( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status ;
   }

   public void setStatus( String value )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(0) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status = value ;
   }

   protected byte gxTv_SdtSDTListPrinter_SDTListPrinterItem_N ;
   protected String gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name ;
   protected String gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path ;
   protected String gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status ;
}

