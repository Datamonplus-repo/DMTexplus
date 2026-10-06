package app.license ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLicenseData extends GxUserType
{
   public SdtLicenseData( )
   {
      this(  new ModelContext(SdtLicenseData.class));
   }

   public SdtLicenseData( ModelContext context )
   {
      super( context, "SdtLicenseData");
   }

   public SdtLicenseData( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtLicenseData");
   }

   public SdtLicenseData( StructSdtLicenseData struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "licenseKey") )
            {
               gxTv_SdtLicenseData_Licensekey = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "token") )
            {
               gxTv_SdtLicenseData_Token = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "environmentId") )
            {
               gxTv_SdtLicenseData_Environmentid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "version") )
            {
               gxTv_SdtLicenseData_Version = oReader.getValue() ;
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
         sName = "LicenseData" ;
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
      oWriter.writeElement("licenseKey", gxTv_SdtLicenseData_Licensekey);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("token", gxTv_SdtLicenseData_Token);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("environmentId", gxTv_SdtLicenseData_Environmentid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("version", gxTv_SdtLicenseData_Version);
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
      AddObjectProperty("licenseKey", gxTv_SdtLicenseData_Licensekey, false, false);
      AddObjectProperty("token", gxTv_SdtLicenseData_Token, false, false);
      AddObjectProperty("environmentId", gxTv_SdtLicenseData_Environmentid, false, false);
      AddObjectProperty("version", gxTv_SdtLicenseData_Version, false, false);
   }

   public String getgxTv_SdtLicenseData_Licensekey( )
   {
      return gxTv_SdtLicenseData_Licensekey ;
   }

   public void setgxTv_SdtLicenseData_Licensekey( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Licensekey = value ;
   }

   public String getgxTv_SdtLicenseData_Token( )
   {
      return gxTv_SdtLicenseData_Token ;
   }

   public void setgxTv_SdtLicenseData_Token( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Token = value ;
   }

   public String getgxTv_SdtLicenseData_Environmentid( )
   {
      return gxTv_SdtLicenseData_Environmentid ;
   }

   public void setgxTv_SdtLicenseData_Environmentid( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Environmentid = value ;
   }

   public String getgxTv_SdtLicenseData_Version( )
   {
      return gxTv_SdtLicenseData_Version ;
   }

   public void setgxTv_SdtLicenseData_Version( String value )
   {
      gxTv_SdtLicenseData_N = (byte)(0) ;
      gxTv_SdtLicenseData_Version = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLicenseData_Licensekey = "" ;
      gxTv_SdtLicenseData_N = (byte)(1) ;
      gxTv_SdtLicenseData_Token = "" ;
      gxTv_SdtLicenseData_Environmentid = "" ;
      gxTv_SdtLicenseData_Version = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtLicenseData_N ;
   }

   public app.license.SdtLicenseData Clone( )
   {
      return (app.license.SdtLicenseData)(clone()) ;
   }

   public void setStruct( app.license.StructSdtLicenseData struct )
   {
      setgxTv_SdtLicenseData_Licensekey(struct.getLicensekey());
      setgxTv_SdtLicenseData_Token(struct.getToken());
      setgxTv_SdtLicenseData_Environmentid(struct.getEnvironmentid());
      setgxTv_SdtLicenseData_Version(struct.getVersion());
   }

   @SuppressWarnings("unchecked")
   public app.license.StructSdtLicenseData getStruct( )
   {
      app.license.StructSdtLicenseData struct = new app.license.StructSdtLicenseData ();
      struct.setLicensekey(getgxTv_SdtLicenseData_Licensekey());
      struct.setToken(getgxTv_SdtLicenseData_Token());
      struct.setEnvironmentid(getgxTv_SdtLicenseData_Environmentid());
      struct.setVersion(getgxTv_SdtLicenseData_Version());
      return struct ;
   }

   protected byte gxTv_SdtLicenseData_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtLicenseData_Licensekey ;
   protected String gxTv_SdtLicenseData_Token ;
   protected String gxTv_SdtLicenseData_Environmentid ;
   protected String gxTv_SdtLicenseData_Version ;
}

