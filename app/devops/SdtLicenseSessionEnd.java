package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLicenseSessionEnd extends GxUserType
{
   public SdtLicenseSessionEnd( )
   {
      this(  new ModelContext(SdtLicenseSessionEnd.class));
   }

   public SdtLicenseSessionEnd( ModelContext context )
   {
      super( context, "SdtLicenseSessionEnd");
   }

   public SdtLicenseSessionEnd( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtLicenseSessionEnd");
   }

   public SdtLicenseSessionEnd( StructSdtLicenseSessionEnd struct )
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
               gxTv_SdtLicenseSessionEnd_Licensekey = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "environmentId") )
            {
               gxTv_SdtLicenseSessionEnd_Environmentid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "userId") )
            {
               gxTv_SdtLicenseSessionEnd_Userid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "sessionId") )
            {
               gxTv_SdtLicenseSessionEnd_Sessionid = oReader.getValue() ;
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
         sName = "LicenseSessionEnd" ;
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
      oWriter.writeElement("licenseKey", gxTv_SdtLicenseSessionEnd_Licensekey);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("environmentId", gxTv_SdtLicenseSessionEnd_Environmentid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("userId", gxTv_SdtLicenseSessionEnd_Userid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("sessionId", gxTv_SdtLicenseSessionEnd_Sessionid);
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
      if ( gxTv_SdtLicenseSessionEnd_Licensekey_N != 1 )
      {
         AddObjectProperty("licenseKey", gxTv_SdtLicenseSessionEnd_Licensekey, false, false);
      }
      if ( gxTv_SdtLicenseSessionEnd_Environmentid_N != 1 )
      {
         AddObjectProperty("environmentId", gxTv_SdtLicenseSessionEnd_Environmentid, false, false);
      }
      if ( gxTv_SdtLicenseSessionEnd_Userid_N != 1 )
      {
         AddObjectProperty("userId", gxTv_SdtLicenseSessionEnd_Userid, false, false);
      }
      if ( gxTv_SdtLicenseSessionEnd_Sessionid_N != 1 )
      {
         AddObjectProperty("sessionId", gxTv_SdtLicenseSessionEnd_Sessionid, false, false);
      }
   }

   public String getgxTv_SdtLicenseSessionEnd_Licensekey( )
   {
      return gxTv_SdtLicenseSessionEnd_Licensekey ;
   }

   public void setgxTv_SdtLicenseSessionEnd_Licensekey( String value )
   {
      gxTv_SdtLicenseSessionEnd_Licensekey_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Licensekey = value ;
   }

   public byte getgxTv_SdtLicenseSessionEnd_Licensekey_N( )
   {
      return gxTv_SdtLicenseSessionEnd_Licensekey_N ;
   }

   public String getgxTv_SdtLicenseSessionEnd_Environmentid( )
   {
      return gxTv_SdtLicenseSessionEnd_Environmentid ;
   }

   public void setgxTv_SdtLicenseSessionEnd_Environmentid( String value )
   {
      gxTv_SdtLicenseSessionEnd_Environmentid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Environmentid = value ;
   }

   public byte getgxTv_SdtLicenseSessionEnd_Environmentid_N( )
   {
      return gxTv_SdtLicenseSessionEnd_Environmentid_N ;
   }

   public String getgxTv_SdtLicenseSessionEnd_Userid( )
   {
      return gxTv_SdtLicenseSessionEnd_Userid ;
   }

   public void setgxTv_SdtLicenseSessionEnd_Userid( String value )
   {
      gxTv_SdtLicenseSessionEnd_Userid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Userid = value ;
   }

   public byte getgxTv_SdtLicenseSessionEnd_Userid_N( )
   {
      return gxTv_SdtLicenseSessionEnd_Userid_N ;
   }

   public String getgxTv_SdtLicenseSessionEnd_Sessionid( )
   {
      return gxTv_SdtLicenseSessionEnd_Sessionid ;
   }

   public void setgxTv_SdtLicenseSessionEnd_Sessionid( String value )
   {
      gxTv_SdtLicenseSessionEnd_Sessionid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(0) ;
      gxTv_SdtLicenseSessionEnd_Sessionid = value ;
   }

   public byte getgxTv_SdtLicenseSessionEnd_Sessionid_N( )
   {
      return gxTv_SdtLicenseSessionEnd_Sessionid_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLicenseSessionEnd_Licensekey = "" ;
      gxTv_SdtLicenseSessionEnd_Licensekey_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_Environmentid = "" ;
      gxTv_SdtLicenseSessionEnd_Environmentid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_Userid = "" ;
      gxTv_SdtLicenseSessionEnd_Userid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionEnd_Sessionid = "" ;
      gxTv_SdtLicenseSessionEnd_Sessionid_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtLicenseSessionEnd_N ;
   }

   public app.devops.SdtLicenseSessionEnd Clone( )
   {
      return (app.devops.SdtLicenseSessionEnd)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtLicenseSessionEnd struct )
   {
      setgxTv_SdtLicenseSessionEnd_Licensekey(struct.getLicensekey());
      setgxTv_SdtLicenseSessionEnd_Environmentid(struct.getEnvironmentid());
      setgxTv_SdtLicenseSessionEnd_Userid(struct.getUserid());
      setgxTv_SdtLicenseSessionEnd_Sessionid(struct.getSessionid());
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtLicenseSessionEnd getStruct( )
   {
      app.devops.StructSdtLicenseSessionEnd struct = new app.devops.StructSdtLicenseSessionEnd ();
      struct.setLicensekey(getgxTv_SdtLicenseSessionEnd_Licensekey());
      struct.setEnvironmentid(getgxTv_SdtLicenseSessionEnd_Environmentid());
      struct.setUserid(getgxTv_SdtLicenseSessionEnd_Userid());
      struct.setSessionid(getgxTv_SdtLicenseSessionEnd_Sessionid());
      return struct ;
   }

   protected byte gxTv_SdtLicenseSessionEnd_Licensekey_N ;
   protected byte gxTv_SdtLicenseSessionEnd_N ;
   protected byte gxTv_SdtLicenseSessionEnd_Environmentid_N ;
   protected byte gxTv_SdtLicenseSessionEnd_Userid_N ;
   protected byte gxTv_SdtLicenseSessionEnd_Sessionid_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtLicenseSessionEnd_Licensekey ;
   protected String gxTv_SdtLicenseSessionEnd_Environmentid ;
   protected String gxTv_SdtLicenseSessionEnd_Userid ;
   protected String gxTv_SdtLicenseSessionEnd_Sessionid ;
}

