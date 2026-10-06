package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEmails_Config extends GxUserType
{
   public SdtEmails_Config( )
   {
      this(  new ModelContext(SdtEmails_Config.class));
   }

   public SdtEmails_Config( ModelContext context )
   {
      super( context, "SdtEmails_Config");
   }

   public SdtEmails_Config( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtEmails_Config");
   }

   public SdtEmails_Config( StructSdtEmails_Config struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "User") )
            {
               gxTv_SdtEmails_Config_User = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Password") )
            {
               gxTv_SdtEmails_Config_Password = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Authentication") )
            {
               gxTv_SdtEmails_Config_Authentication = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Security") )
            {
               gxTv_SdtEmails_Config_Security = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Port") )
            {
               gxTv_SdtEmails_Config_Port = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Email") )
            {
               gxTv_SdtEmails_Config_Email = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Smtp") )
            {
               gxTv_SdtEmails_Config_Smtp = oReader.getValue() ;
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
         sName = "Emails.Config" ;
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
      oWriter.writeElement("User", gxTv_SdtEmails_Config_User);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Password", gxTv_SdtEmails_Config_Password);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Authentication", GXutil.booltostr( gxTv_SdtEmails_Config_Authentication));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Security", GXutil.booltostr( gxTv_SdtEmails_Config_Security));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Port", GXutil.trim( GXutil.str( gxTv_SdtEmails_Config_Port, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Email", gxTv_SdtEmails_Config_Email);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Smtp", gxTv_SdtEmails_Config_Smtp);
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
      AddObjectProperty("User", gxTv_SdtEmails_Config_User, false, false);
      AddObjectProperty("Password", gxTv_SdtEmails_Config_Password, false, false);
      AddObjectProperty("Authentication", gxTv_SdtEmails_Config_Authentication, false, false);
      AddObjectProperty("Security", gxTv_SdtEmails_Config_Security, false, false);
      AddObjectProperty("Port", gxTv_SdtEmails_Config_Port, false, false);
      AddObjectProperty("Email", gxTv_SdtEmails_Config_Email, false, false);
      AddObjectProperty("Smtp", gxTv_SdtEmails_Config_Smtp, false, false);
   }

   public String getgxTv_SdtEmails_Config_User( )
   {
      return gxTv_SdtEmails_Config_User ;
   }

   public void setgxTv_SdtEmails_Config_User( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_User = value ;
   }

   public String getgxTv_SdtEmails_Config_Password( )
   {
      return gxTv_SdtEmails_Config_Password ;
   }

   public void setgxTv_SdtEmails_Config_Password( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Password = value ;
   }

   public boolean getgxTv_SdtEmails_Config_Authentication( )
   {
      return gxTv_SdtEmails_Config_Authentication ;
   }

   public void setgxTv_SdtEmails_Config_Authentication( boolean value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Authentication = value ;
   }

   public boolean getgxTv_SdtEmails_Config_Security( )
   {
      return gxTv_SdtEmails_Config_Security ;
   }

   public void setgxTv_SdtEmails_Config_Security( boolean value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Security = value ;
   }

   public short getgxTv_SdtEmails_Config_Port( )
   {
      return gxTv_SdtEmails_Config_Port ;
   }

   public void setgxTv_SdtEmails_Config_Port( short value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Port = value ;
   }

   public String getgxTv_SdtEmails_Config_Email( )
   {
      return gxTv_SdtEmails_Config_Email ;
   }

   public void setgxTv_SdtEmails_Config_Email( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Email = value ;
   }

   public String getgxTv_SdtEmails_Config_Smtp( )
   {
      return gxTv_SdtEmails_Config_Smtp ;
   }

   public void setgxTv_SdtEmails_Config_Smtp( String value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_Config_Smtp = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEmails_Config_User = "" ;
      gxTv_SdtEmails_Config_N = (byte)(1) ;
      gxTv_SdtEmails_Config_Password = "" ;
      gxTv_SdtEmails_Config_Email = "" ;
      gxTv_SdtEmails_Config_Smtp = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEmails_Config_N ;
   }

   public app.SdtEmails_Config Clone( )
   {
      return (app.SdtEmails_Config)(clone()) ;
   }

   public void setStruct( app.StructSdtEmails_Config struct )
   {
      setgxTv_SdtEmails_Config_User(struct.getUser());
      setgxTv_SdtEmails_Config_Password(struct.getPassword());
      setgxTv_SdtEmails_Config_Authentication(struct.getAuthentication());
      setgxTv_SdtEmails_Config_Security(struct.getSecurity());
      setgxTv_SdtEmails_Config_Port(struct.getPort());
      setgxTv_SdtEmails_Config_Email(struct.getEmail());
      setgxTv_SdtEmails_Config_Smtp(struct.getSmtp());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtEmails_Config getStruct( )
   {
      app.StructSdtEmails_Config struct = new app.StructSdtEmails_Config ();
      struct.setUser(getgxTv_SdtEmails_Config_User());
      struct.setPassword(getgxTv_SdtEmails_Config_Password());
      struct.setAuthentication(getgxTv_SdtEmails_Config_Authentication());
      struct.setSecurity(getgxTv_SdtEmails_Config_Security());
      struct.setPort(getgxTv_SdtEmails_Config_Port());
      struct.setEmail(getgxTv_SdtEmails_Config_Email());
      struct.setSmtp(getgxTv_SdtEmails_Config_Smtp());
      return struct ;
   }

   protected byte gxTv_SdtEmails_Config_N ;
   protected short gxTv_SdtEmails_Config_Port ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtEmails_Config_Authentication ;
   protected boolean gxTv_SdtEmails_Config_Security ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtEmails_Config_User ;
   protected String gxTv_SdtEmails_Config_Password ;
   protected String gxTv_SdtEmails_Config_Email ;
   protected String gxTv_SdtEmails_Config_Smtp ;
}

