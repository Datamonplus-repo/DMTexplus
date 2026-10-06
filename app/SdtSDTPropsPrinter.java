package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTPropsPrinter extends GxUserType
{
   public SdtSDTPropsPrinter( )
   {
      this(  new ModelContext(SdtSDTPropsPrinter.class));
   }

   public SdtSDTPropsPrinter( ModelContext context )
   {
      super( context, "SdtSDTPropsPrinter");
   }

   public SdtSDTPropsPrinter( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPropsPrinter");
   }

   public SdtSDTPropsPrinter( StructSdtSDTPropsPrinter struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Copies") )
            {
               gxTv_SdtSDTPropsPrinter_Copies = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Color") )
            {
               gxTv_SdtSDTPropsPrinter_Color = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Landscape") )
            {
               gxTv_SdtSDTPropsPrinter_Landscape = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SDTPropsPrinter" ;
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
      oWriter.writeElement("Copies", GXutil.trim( GXutil.str( gxTv_SdtSDTPropsPrinter_Copies, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Color", GXutil.booltostr( gxTv_SdtSDTPropsPrinter_Color));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Landscape", GXutil.booltostr( gxTv_SdtSDTPropsPrinter_Landscape));
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
      AddObjectProperty("Copies", gxTv_SdtSDTPropsPrinter_Copies, false, false);
      AddObjectProperty("Color", gxTv_SdtSDTPropsPrinter_Color, false, false);
      AddObjectProperty("Landscape", gxTv_SdtSDTPropsPrinter_Landscape, false, false);
   }

   public byte getgxTv_SdtSDTPropsPrinter_Copies( )
   {
      return gxTv_SdtSDTPropsPrinter_Copies ;
   }

   public void setgxTv_SdtSDTPropsPrinter_Copies( byte value )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(0) ;
      gxTv_SdtSDTPropsPrinter_Copies = value ;
   }

   public boolean getgxTv_SdtSDTPropsPrinter_Color( )
   {
      return gxTv_SdtSDTPropsPrinter_Color ;
   }

   public void setgxTv_SdtSDTPropsPrinter_Color( boolean value )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(0) ;
      gxTv_SdtSDTPropsPrinter_Color = value ;
   }

   public boolean getgxTv_SdtSDTPropsPrinter_Landscape( )
   {
      return gxTv_SdtSDTPropsPrinter_Landscape ;
   }

   public void setgxTv_SdtSDTPropsPrinter_Landscape( boolean value )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(0) ;
      gxTv_SdtSDTPropsPrinter_Landscape = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTPropsPrinter_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTPropsPrinter_N ;
   }

   public app.SdtSDTPropsPrinter Clone( )
   {
      return (app.SdtSDTPropsPrinter)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTPropsPrinter struct )
   {
      setgxTv_SdtSDTPropsPrinter_Copies(struct.getCopies());
      setgxTv_SdtSDTPropsPrinter_Color(struct.getColor());
      setgxTv_SdtSDTPropsPrinter_Landscape(struct.getLandscape());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTPropsPrinter getStruct( )
   {
      app.StructSdtSDTPropsPrinter struct = new app.StructSdtSDTPropsPrinter ();
      struct.setCopies(getgxTv_SdtSDTPropsPrinter_Copies());
      struct.setColor(getgxTv_SdtSDTPropsPrinter_Color());
      struct.setLandscape(getgxTv_SdtSDTPropsPrinter_Landscape());
      return struct ;
   }

   protected byte gxTv_SdtSDTPropsPrinter_Copies ;
   protected byte gxTv_SdtSDTPropsPrinter_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTPropsPrinter_Color ;
   protected boolean gxTv_SdtSDTPropsPrinter_Landscape ;
   protected boolean readElement ;
   protected boolean formatError ;
}

