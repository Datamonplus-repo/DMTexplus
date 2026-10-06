package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTtablahdrs extends GxUserType
{
   public SdtSDTtablahdrs( )
   {
      this(  new ModelContext(SdtSDTtablahdrs.class));
   }

   public SdtSDTtablahdrs( ModelContext context )
   {
      super( context, "SdtSDTtablahdrs");
   }

   public SdtSDTtablahdrs( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTtablahdrs");
   }

   public SdtSDTtablahdrs( StructSdtSDTtablahdrs struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtSDTtablahdrs_Barnhdr = oReader.getValue() ;
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
         sName = "SDTtablahdrs" ;
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
      oWriter.writeElement("Barnhdr", gxTv_SdtSDTtablahdrs_Barnhdr);
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
      AddObjectProperty("Barnhdr", gxTv_SdtSDTtablahdrs_Barnhdr, false, false);
   }

   public String getgxTv_SdtSDTtablahdrs_Barnhdr( )
   {
      return gxTv_SdtSDTtablahdrs_Barnhdr ;
   }

   public void setgxTv_SdtSDTtablahdrs_Barnhdr( String value )
   {
      gxTv_SdtSDTtablahdrs_N = (byte)(0) ;
      gxTv_SdtSDTtablahdrs_Barnhdr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTtablahdrs_Barnhdr = "" ;
      gxTv_SdtSDTtablahdrs_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTtablahdrs_N ;
   }

   public app.SdtSDTtablahdrs Clone( )
   {
      return (app.SdtSDTtablahdrs)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTtablahdrs struct )
   {
      setgxTv_SdtSDTtablahdrs_Barnhdr(struct.getBarnhdr());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTtablahdrs getStruct( )
   {
      app.StructSdtSDTtablahdrs struct = new app.StructSdtSDTtablahdrs ();
      struct.setBarnhdr(getgxTv_SdtSDTtablahdrs_Barnhdr());
      return struct ;
   }

   protected byte gxTv_SdtSDTtablahdrs_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTtablahdrs_Barnhdr ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

