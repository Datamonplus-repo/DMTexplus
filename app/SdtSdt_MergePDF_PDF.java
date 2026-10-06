package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdt_MergePDF_PDF extends GxUserType
{
   public SdtSdt_MergePDF_PDF( )
   {
      this(  new ModelContext(SdtSdt_MergePDF_PDF.class));
   }

   public SdtSdt_MergePDF_PDF( ModelContext context )
   {
      super( context, "SdtSdt_MergePDF_PDF");
   }

   public SdtSdt_MergePDF_PDF( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSdt_MergePDF_PDF");
   }

   public SdtSdt_MergePDF_PDF( StructSdtSdt_MergePDF_PDF struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "realpath") )
            {
               gxTv_SdtSdt_MergePDF_PDF_Realpath = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "textoCopia") )
            {
               gxTv_SdtSdt_MergePDF_PDF_Textocopia = oReader.getValue() ;
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
         sName = "Sdt_MergePDF.PDF" ;
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
      oWriter.writeElement("realpath", gxTv_SdtSdt_MergePDF_PDF_Realpath);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("textoCopia", gxTv_SdtSdt_MergePDF_PDF_Textocopia);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("realpath", gxTv_SdtSdt_MergePDF_PDF_Realpath, false, false);
      AddObjectProperty("textoCopia", gxTv_SdtSdt_MergePDF_PDF_Textocopia, false, false);
   }

   public String getgxTv_SdtSdt_MergePDF_PDF_Realpath( )
   {
      return gxTv_SdtSdt_MergePDF_PDF_Realpath ;
   }

   public void setgxTv_SdtSdt_MergePDF_PDF_Realpath( String value )
   {
      gxTv_SdtSdt_MergePDF_PDF_N = (byte)(0) ;
      gxTv_SdtSdt_MergePDF_PDF_Realpath = value ;
   }

   public String getgxTv_SdtSdt_MergePDF_PDF_Textocopia( )
   {
      return gxTv_SdtSdt_MergePDF_PDF_Textocopia ;
   }

   public void setgxTv_SdtSdt_MergePDF_PDF_Textocopia( String value )
   {
      gxTv_SdtSdt_MergePDF_PDF_N = (byte)(0) ;
      gxTv_SdtSdt_MergePDF_PDF_Textocopia = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdt_MergePDF_PDF_Realpath = "" ;
      gxTv_SdtSdt_MergePDF_PDF_N = (byte)(1) ;
      gxTv_SdtSdt_MergePDF_PDF_Textocopia = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdt_MergePDF_PDF_N ;
   }

   public app.SdtSdt_MergePDF_PDF Clone( )
   {
      return (app.SdtSdt_MergePDF_PDF)(clone()) ;
   }

   public void setStruct( app.StructSdtSdt_MergePDF_PDF struct )
   {
      setgxTv_SdtSdt_MergePDF_PDF_Realpath(struct.getRealpath());
      setgxTv_SdtSdt_MergePDF_PDF_Textocopia(struct.getTextocopia());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdt_MergePDF_PDF getStruct( )
   {
      app.StructSdtSdt_MergePDF_PDF struct = new app.StructSdtSdt_MergePDF_PDF ();
      struct.setRealpath(getgxTv_SdtSdt_MergePDF_PDF_Realpath());
      struct.setTextocopia(getgxTv_SdtSdt_MergePDF_PDF_Textocopia());
      return struct ;
   }

   protected byte gxTv_SdtSdt_MergePDF_PDF_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdt_MergePDF_PDF_Realpath ;
   protected String gxTv_SdtSdt_MergePDF_PDF_Textocopia ;
}

