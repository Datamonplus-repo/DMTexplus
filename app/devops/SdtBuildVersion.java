package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtBuildVersion extends GxUserType
{
   public SdtBuildVersion( )
   {
      this(  new ModelContext(SdtBuildVersion.class));
   }

   public SdtBuildVersion( ModelContext context )
   {
      super( context, "SdtBuildVersion");
   }

   public SdtBuildVersion( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtBuildVersion");
   }

   public SdtBuildVersion( StructSdtBuildVersion struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "BUILD_NUMBER") )
            {
               gxTv_SdtBuildVersion_Build_number = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PRODUCT") )
            {
               gxTv_SdtBuildVersion_Product = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DATE") )
            {
               gxTv_SdtBuildVersion_Date = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RELEASE") )
            {
               gxTv_SdtBuildVersion_Release = oReader.getValue() ;
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
         sName = "BuildVersion" ;
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
      oWriter.writeElement("BUILD_NUMBER", gxTv_SdtBuildVersion_Build_number);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PRODUCT", gxTv_SdtBuildVersion_Product);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DATE", gxTv_SdtBuildVersion_Date);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RELEASE", gxTv_SdtBuildVersion_Release);
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
      AddObjectProperty("BUILD_NUMBER", gxTv_SdtBuildVersion_Build_number, false, false);
      AddObjectProperty("PRODUCT", gxTv_SdtBuildVersion_Product, false, false);
      AddObjectProperty("DATE", gxTv_SdtBuildVersion_Date, false, false);
      AddObjectProperty("RELEASE", gxTv_SdtBuildVersion_Release, false, false);
   }

   public String getgxTv_SdtBuildVersion_Build_number( )
   {
      return gxTv_SdtBuildVersion_Build_number ;
   }

   public void setgxTv_SdtBuildVersion_Build_number( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Build_number = value ;
   }

   public String getgxTv_SdtBuildVersion_Product( )
   {
      return gxTv_SdtBuildVersion_Product ;
   }

   public void setgxTv_SdtBuildVersion_Product( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Product = value ;
   }

   public String getgxTv_SdtBuildVersion_Date( )
   {
      return gxTv_SdtBuildVersion_Date ;
   }

   public void setgxTv_SdtBuildVersion_Date( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Date = value ;
   }

   public String getgxTv_SdtBuildVersion_Release( )
   {
      return gxTv_SdtBuildVersion_Release ;
   }

   public void setgxTv_SdtBuildVersion_Release( String value )
   {
      gxTv_SdtBuildVersion_N = (byte)(0) ;
      gxTv_SdtBuildVersion_Release = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtBuildVersion_Build_number = "" ;
      gxTv_SdtBuildVersion_N = (byte)(1) ;
      gxTv_SdtBuildVersion_Product = "" ;
      gxTv_SdtBuildVersion_Date = "" ;
      gxTv_SdtBuildVersion_Release = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtBuildVersion_N ;
   }

   public app.devops.SdtBuildVersion Clone( )
   {
      return (app.devops.SdtBuildVersion)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtBuildVersion struct )
   {
      setgxTv_SdtBuildVersion_Build_number(struct.getBuild_number());
      setgxTv_SdtBuildVersion_Product(struct.getProduct());
      setgxTv_SdtBuildVersion_Date(struct.getDate());
      setgxTv_SdtBuildVersion_Release(struct.getRelease());
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtBuildVersion getStruct( )
   {
      app.devops.StructSdtBuildVersion struct = new app.devops.StructSdtBuildVersion ();
      struct.setBuild_number(getgxTv_SdtBuildVersion_Build_number());
      struct.setProduct(getgxTv_SdtBuildVersion_Product());
      struct.setDate(getgxTv_SdtBuildVersion_Date());
      struct.setRelease(getgxTv_SdtBuildVersion_Release());
      return struct ;
   }

   protected byte gxTv_SdtBuildVersion_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtBuildVersion_Release ;
   protected String gxTv_SdtBuildVersion_Build_number ;
   protected String gxTv_SdtBuildVersion_Product ;
   protected String gxTv_SdtBuildVersion_Date ;
}

