package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtHdrscreadas_SDT extends GxUserType
{
   public SdtHdrscreadas_SDT( )
   {
      this(  new ModelContext(SdtHdrscreadas_SDT.class));
   }

   public SdtHdrscreadas_SDT( ModelContext context )
   {
      super( context, "SdtHdrscreadas_SDT");
   }

   public SdtHdrscreadas_SDT( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtHdrscreadas_SDT");
   }

   public SdtHdrscreadas_SDT( StructSdtHdrscreadas_SDT struct )
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
               gxTv_SdtHdrscreadas_SDT_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtHdrscreadas_SDT_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtHdrscreadas_SDT_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Reclinmaq") )
            {
               gxTv_SdtHdrscreadas_SDT_Reclinmaq = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Hdrscreadas_SDT" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtHdrscreadas_SDT_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtHdrscreadas_SDT_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtHdrscreadas_SDT_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Reclinmaq", GXutil.trim( GXutil.str( gxTv_SdtHdrscreadas_SDT_Reclinmaq, 4, 0)));
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
      AddObjectProperty("Barcod", gxTv_SdtHdrscreadas_SDT_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtHdrscreadas_SDT_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtHdrscreadas_SDT_Barcodpar, false, false);
      AddObjectProperty("Reclinmaq", gxTv_SdtHdrscreadas_SDT_Reclinmaq, false, false);
   }

   public int getgxTv_SdtHdrscreadas_SDT_Barcod( )
   {
      return gxTv_SdtHdrscreadas_SDT_Barcod ;
   }

   public void setgxTv_SdtHdrscreadas_SDT_Barcod( int value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Barcod = value ;
   }

   public byte getgxTv_SdtHdrscreadas_SDT_Barcodreo( )
   {
      return gxTv_SdtHdrscreadas_SDT_Barcodreo ;
   }

   public void setgxTv_SdtHdrscreadas_SDT_Barcodreo( byte value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Barcodreo = value ;
   }

   public String getgxTv_SdtHdrscreadas_SDT_Barcodpar( )
   {
      return gxTv_SdtHdrscreadas_SDT_Barcodpar ;
   }

   public void setgxTv_SdtHdrscreadas_SDT_Barcodpar( String value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Barcodpar = value ;
   }

   public short getgxTv_SdtHdrscreadas_SDT_Reclinmaq( )
   {
      return gxTv_SdtHdrscreadas_SDT_Reclinmaq ;
   }

   public void setgxTv_SdtHdrscreadas_SDT_Reclinmaq( short value )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(0) ;
      gxTv_SdtHdrscreadas_SDT_Reclinmaq = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtHdrscreadas_SDT_N = (byte)(1) ;
      gxTv_SdtHdrscreadas_SDT_Barcodpar = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtHdrscreadas_SDT_N ;
   }

   public app.SdtHdrscreadas_SDT Clone( )
   {
      return (app.SdtHdrscreadas_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtHdrscreadas_SDT struct )
   {
      setgxTv_SdtHdrscreadas_SDT_Barcod(struct.getBarcod());
      setgxTv_SdtHdrscreadas_SDT_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtHdrscreadas_SDT_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtHdrscreadas_SDT_Reclinmaq(struct.getReclinmaq());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtHdrscreadas_SDT getStruct( )
   {
      app.StructSdtHdrscreadas_SDT struct = new app.StructSdtHdrscreadas_SDT ();
      struct.setBarcod(getgxTv_SdtHdrscreadas_SDT_Barcod());
      struct.setBarcodreo(getgxTv_SdtHdrscreadas_SDT_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtHdrscreadas_SDT_Barcodpar());
      struct.setReclinmaq(getgxTv_SdtHdrscreadas_SDT_Reclinmaq());
      return struct ;
   }

   protected byte gxTv_SdtHdrscreadas_SDT_N ;
   protected byte gxTv_SdtHdrscreadas_SDT_Barcodreo ;
   protected short gxTv_SdtHdrscreadas_SDT_Reclinmaq ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtHdrscreadas_SDT_Barcod ;
   protected String gxTv_SdtHdrscreadas_SDT_Barcodpar ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

