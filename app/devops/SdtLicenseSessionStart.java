package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLicenseSessionStart extends GxUserType
{
   public SdtLicenseSessionStart( )
   {
      this(  new ModelContext(SdtLicenseSessionStart.class));
   }

   public SdtLicenseSessionStart( ModelContext context )
   {
      super( context, "SdtLicenseSessionStart");
   }

   public SdtLicenseSessionStart( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtLicenseSessionStart");
   }

   public SdtLicenseSessionStart( StructSdtLicenseSessionStart struct )
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
               gxTv_SdtLicenseSessionStart_Licensekey = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "token") )
            {
               gxTv_SdtLicenseSessionStart_Token = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "environmentId") )
            {
               gxTv_SdtLicenseSessionStart_Environmentid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "userId") )
            {
               gxTv_SdtLicenseSessionStart_Userid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "sessionId") )
            {
               gxTv_SdtLicenseSessionStart_Sessionid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "program") )
            {
               gxTv_SdtLicenseSessionStart_Program = oReader.getValue() ;
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
         sName = "LicenseSessionStart" ;
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
      oWriter.writeElement("licenseKey", gxTv_SdtLicenseSessionStart_Licensekey);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("token", gxTv_SdtLicenseSessionStart_Token);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("environmentId", gxTv_SdtLicenseSessionStart_Environmentid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("userId", gxTv_SdtLicenseSessionStart_Userid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("sessionId", gxTv_SdtLicenseSessionStart_Sessionid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("program", gxTv_SdtLicenseSessionStart_Program);
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
      if ( gxTv_SdtLicenseSessionStart_Licensekey_N != 1 )
      {
         AddObjectProperty("licenseKey", gxTv_SdtLicenseSessionStart_Licensekey, false, false);
      }
      if ( gxTv_SdtLicenseSessionStart_Token_N != 1 )
      {
         AddObjectProperty("token", gxTv_SdtLicenseSessionStart_Token, false, false);
      }
      if ( gxTv_SdtLicenseSessionStart_Environmentid_N != 1 )
      {
         AddObjectProperty("environmentId", gxTv_SdtLicenseSessionStart_Environmentid, false, false);
      }
      if ( gxTv_SdtLicenseSessionStart_Userid_N != 1 )
      {
         AddObjectProperty("userId", gxTv_SdtLicenseSessionStart_Userid, false, false);
      }
      if ( gxTv_SdtLicenseSessionStart_Sessionid_N != 1 )
      {
         AddObjectProperty("sessionId", gxTv_SdtLicenseSessionStart_Sessionid, false, false);
      }
      AddObjectProperty("program", gxTv_SdtLicenseSessionStart_Program, false, false);
   }

   public String getgxTv_SdtLicenseSessionStart_Licensekey( )
   {
      return gxTv_SdtLicenseSessionStart_Licensekey ;
   }

   public void setgxTv_SdtLicenseSessionStart_Licensekey( String value )
   {
      gxTv_SdtLicenseSessionStart_Licensekey_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Licensekey = value ;
   }

   public byte getgxTv_SdtLicenseSessionStart_Licensekey_N( )
   {
      return gxTv_SdtLicenseSessionStart_Licensekey_N ;
   }

   public String getgxTv_SdtLicenseSessionStart_Token( )
   {
      return gxTv_SdtLicenseSessionStart_Token ;
   }

   public void setgxTv_SdtLicenseSessionStart_Token( String value )
   {
      gxTv_SdtLicenseSessionStart_Token_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Token = value ;
   }

   public byte getgxTv_SdtLicenseSessionStart_Token_N( )
   {
      return gxTv_SdtLicenseSessionStart_Token_N ;
   }

   public String getgxTv_SdtLicenseSessionStart_Environmentid( )
   {
      return gxTv_SdtLicenseSessionStart_Environmentid ;
   }

   public void setgxTv_SdtLicenseSessionStart_Environmentid( String value )
   {
      gxTv_SdtLicenseSessionStart_Environmentid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Environmentid = value ;
   }

   public byte getgxTv_SdtLicenseSessionStart_Environmentid_N( )
   {
      return gxTv_SdtLicenseSessionStart_Environmentid_N ;
   }

   public String getgxTv_SdtLicenseSessionStart_Userid( )
   {
      return gxTv_SdtLicenseSessionStart_Userid ;
   }

   public void setgxTv_SdtLicenseSessionStart_Userid( String value )
   {
      gxTv_SdtLicenseSessionStart_Userid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Userid = value ;
   }

   public byte getgxTv_SdtLicenseSessionStart_Userid_N( )
   {
      return gxTv_SdtLicenseSessionStart_Userid_N ;
   }

   public String getgxTv_SdtLicenseSessionStart_Sessionid( )
   {
      return gxTv_SdtLicenseSessionStart_Sessionid ;
   }

   public void setgxTv_SdtLicenseSessionStart_Sessionid( String value )
   {
      gxTv_SdtLicenseSessionStart_Sessionid_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Sessionid = value ;
   }

   public byte getgxTv_SdtLicenseSessionStart_Sessionid_N( )
   {
      return gxTv_SdtLicenseSessionStart_Sessionid_N ;
   }

   public String getgxTv_SdtLicenseSessionStart_Program( )
   {
      return gxTv_SdtLicenseSessionStart_Program ;
   }

   public void setgxTv_SdtLicenseSessionStart_Program( String value )
   {
      gxTv_SdtLicenseSessionStart_N = (byte)(0) ;
      gxTv_SdtLicenseSessionStart_Program = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLicenseSessionStart_Licensekey = "" ;
      gxTv_SdtLicenseSessionStart_Licensekey_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Token = "" ;
      gxTv_SdtLicenseSessionStart_Token_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Environmentid = "" ;
      gxTv_SdtLicenseSessionStart_Environmentid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Userid = "" ;
      gxTv_SdtLicenseSessionStart_Userid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Sessionid = "" ;
      gxTv_SdtLicenseSessionStart_Sessionid_N = (byte)(1) ;
      gxTv_SdtLicenseSessionStart_Program = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtLicenseSessionStart_N ;
   }

   public app.devops.SdtLicenseSessionStart Clone( )
   {
      return (app.devops.SdtLicenseSessionStart)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtLicenseSessionStart struct )
   {
      setgxTv_SdtLicenseSessionStart_Licensekey(struct.getLicensekey());
      setgxTv_SdtLicenseSessionStart_Token(struct.getToken());
      setgxTv_SdtLicenseSessionStart_Environmentid(struct.getEnvironmentid());
      setgxTv_SdtLicenseSessionStart_Userid(struct.getUserid());
      setgxTv_SdtLicenseSessionStart_Sessionid(struct.getSessionid());
      setgxTv_SdtLicenseSessionStart_Program(struct.getProgram());
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtLicenseSessionStart getStruct( )
   {
      app.devops.StructSdtLicenseSessionStart struct = new app.devops.StructSdtLicenseSessionStart ();
      struct.setLicensekey(getgxTv_SdtLicenseSessionStart_Licensekey());
      struct.setToken(getgxTv_SdtLicenseSessionStart_Token());
      struct.setEnvironmentid(getgxTv_SdtLicenseSessionStart_Environmentid());
      struct.setUserid(getgxTv_SdtLicenseSessionStart_Userid());
      struct.setSessionid(getgxTv_SdtLicenseSessionStart_Sessionid());
      struct.setProgram(getgxTv_SdtLicenseSessionStart_Program());
      return struct ;
   }

   protected byte gxTv_SdtLicenseSessionStart_Licensekey_N ;
   protected byte gxTv_SdtLicenseSessionStart_N ;
   protected byte gxTv_SdtLicenseSessionStart_Token_N ;
   protected byte gxTv_SdtLicenseSessionStart_Environmentid_N ;
   protected byte gxTv_SdtLicenseSessionStart_Userid_N ;
   protected byte gxTv_SdtLicenseSessionStart_Sessionid_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtLicenseSessionStart_Licensekey ;
   protected String gxTv_SdtLicenseSessionStart_Token ;
   protected String gxTv_SdtLicenseSessionStart_Environmentid ;
   protected String gxTv_SdtLicenseSessionStart_Userid ;
   protected String gxTv_SdtLicenseSessionStart_Sessionid ;
   protected String gxTv_SdtLicenseSessionStart_Program ;
}

