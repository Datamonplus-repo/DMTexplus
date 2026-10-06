package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem extends GxUserType
{
   public SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem( )
   {
      this(  new ModelContext(SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class));
   }

   public SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem( ModelContext context )
   {
      super( context, "SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem");
   }

   public SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem");
   }

   public SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem( StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TabladeHdrs_SDT.TabladeHdrs_SDTItem" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("Barcod", gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar, false, false);
   }

   public int getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod ;
   }

   public void setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( int value )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo ;
   }

   public void setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( byte value )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar ;
   }

   public void setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( String value )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N = (byte)(1) ;
      gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N ;
   }

   public app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem Clone( )
   {
      return (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem struct )
   {
      setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar(struct.getBarcodpar());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem getStruct( )
   {
      app.StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem struct = new app.StructSdtTabladeHdrs_SDT_TabladeHdrs_SDTItem ();
      struct.setBarcod(getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar());
      return struct ;
   }

   protected byte gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_N ;
   protected byte gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod ;
   protected String gxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

