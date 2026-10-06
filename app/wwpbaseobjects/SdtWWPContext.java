package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWWPContext extends GxUserType
{
   public SdtWWPContext( )
   {
      this(  new ModelContext(SdtWWPContext.class));
   }

   public SdtWWPContext( ModelContext context )
   {
      super( context, "SdtWWPContext");
   }

   public SdtWWPContext( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtWWPContext");
   }

   public SdtWWPContext( StructSdtWWPContext struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UserId") )
            {
               gxTv_SdtWWPContext_Userid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UserName") )
            {
               gxTv_SdtWWPContext_Username = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCod") )
            {
               gxTv_SdtWWPContext_Usurcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UserGuid") )
            {
               gxTv_SdtWWPContext_Userguid = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtWWPContext_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsuMail") )
            {
               gxTv_SdtWWPContext_Usumail = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurPrint") )
            {
               gxTv_SdtWWPContext_Usurprint = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurSockt") )
            {
               gxTv_SdtWWPContext_Usursockt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknId") )
            {
               gxTv_SdtWWPContext_Mtknid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "licenseKey") )
            {
               gxTv_SdtWWPContext_Licensekey = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "token") )
            {
               gxTv_SdtWWPContext_Token = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "environmentId") )
            {
               gxTv_SdtWWPContext_Environmentid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "product") )
            {
               gxTv_SdtWWPContext_Product = oReader.getValue() ;
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
         sName = "WWPContext" ;
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
      oWriter.writeElement("UserId", gxTv_SdtWWPContext_Userid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UserName", gxTv_SdtWWPContext_Username);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurCod", gxTv_SdtWWPContext_Usurcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UserGuid", gxTv_SdtWWPContext_Userguid.toString());
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtWWPContext_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsuMail", gxTv_SdtWWPContext_Usumail);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurPrint", gxTv_SdtWWPContext_Usurprint);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurSockt", gxTv_SdtWWPContext_Usursockt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MTknId", GXutil.trim( GXutil.str( gxTv_SdtWWPContext_Mtknid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("licenseKey", gxTv_SdtWWPContext_Licensekey);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("token", gxTv_SdtWWPContext_Token);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("environmentId", gxTv_SdtWWPContext_Environmentid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("product", gxTv_SdtWWPContext_Product);
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
      AddObjectProperty("UserId", gxTv_SdtWWPContext_Userid, false, false);
      AddObjectProperty("UserName", gxTv_SdtWWPContext_Username, false, false);
      AddObjectProperty("UsurCod", gxTv_SdtWWPContext_Usurcod, false, false);
      AddObjectProperty("UserGuid", gxTv_SdtWWPContext_Userguid, false, false);
      AddObjectProperty("EmprCod", gxTv_SdtWWPContext_Emprcod, false, false);
      AddObjectProperty("UsuMail", gxTv_SdtWWPContext_Usumail, false, false);
      AddObjectProperty("UsurPrint", gxTv_SdtWWPContext_Usurprint, false, false);
      AddObjectProperty("UsurSockt", gxTv_SdtWWPContext_Usursockt, false, false);
      AddObjectProperty("MTknId", gxTv_SdtWWPContext_Mtknid, false, false);
      AddObjectProperty("licenseKey", gxTv_SdtWWPContext_Licensekey, false, false);
      AddObjectProperty("token", gxTv_SdtWWPContext_Token, false, false);
      AddObjectProperty("environmentId", gxTv_SdtWWPContext_Environmentid, false, false);
      AddObjectProperty("product", gxTv_SdtWWPContext_Product, false, false);
   }

   public String getgxTv_SdtWWPContext_Userid( )
   {
      return gxTv_SdtWWPContext_Userid ;
   }

   public void setgxTv_SdtWWPContext_Userid( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Userid = value ;
   }

   public String getgxTv_SdtWWPContext_Username( )
   {
      return gxTv_SdtWWPContext_Username ;
   }

   public void setgxTv_SdtWWPContext_Username( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Username = value ;
   }

   public String getgxTv_SdtWWPContext_Usurcod( )
   {
      return gxTv_SdtWWPContext_Usurcod ;
   }

   public void setgxTv_SdtWWPContext_Usurcod( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usurcod = value ;
   }

   public java.util.UUID getgxTv_SdtWWPContext_Userguid( )
   {
      return gxTv_SdtWWPContext_Userguid ;
   }

   public void setgxTv_SdtWWPContext_Userguid( java.util.UUID value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Userguid = value ;
   }

   public String getgxTv_SdtWWPContext_Emprcod( )
   {
      return gxTv_SdtWWPContext_Emprcod ;
   }

   public void setgxTv_SdtWWPContext_Emprcod( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Emprcod = value ;
   }

   public String getgxTv_SdtWWPContext_Usumail( )
   {
      return gxTv_SdtWWPContext_Usumail ;
   }

   public void setgxTv_SdtWWPContext_Usumail( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usumail = value ;
   }

   public String getgxTv_SdtWWPContext_Usurprint( )
   {
      return gxTv_SdtWWPContext_Usurprint ;
   }

   public void setgxTv_SdtWWPContext_Usurprint( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usurprint = value ;
   }

   public String getgxTv_SdtWWPContext_Usursockt( )
   {
      return gxTv_SdtWWPContext_Usursockt ;
   }

   public void setgxTv_SdtWWPContext_Usursockt( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Usursockt = value ;
   }

   public long getgxTv_SdtWWPContext_Mtknid( )
   {
      return gxTv_SdtWWPContext_Mtknid ;
   }

   public void setgxTv_SdtWWPContext_Mtknid( long value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Mtknid = value ;
   }

   public String getgxTv_SdtWWPContext_Licensekey( )
   {
      return gxTv_SdtWWPContext_Licensekey ;
   }

   public void setgxTv_SdtWWPContext_Licensekey( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Licensekey = value ;
   }

   public String getgxTv_SdtWWPContext_Token( )
   {
      return gxTv_SdtWWPContext_Token ;
   }

   public void setgxTv_SdtWWPContext_Token( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Token = value ;
   }

   public String getgxTv_SdtWWPContext_Environmentid( )
   {
      return gxTv_SdtWWPContext_Environmentid ;
   }

   public void setgxTv_SdtWWPContext_Environmentid( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Environmentid = value ;
   }

   public String getgxTv_SdtWWPContext_Product( )
   {
      return gxTv_SdtWWPContext_Product ;
   }

   public void setgxTv_SdtWWPContext_Product( String value )
   {
      gxTv_SdtWWPContext_N = (byte)(0) ;
      gxTv_SdtWWPContext_Product = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWWPContext_Userid = "" ;
      gxTv_SdtWWPContext_N = (byte)(1) ;
      gxTv_SdtWWPContext_Username = "" ;
      gxTv_SdtWWPContext_Usurcod = "" ;
      gxTv_SdtWWPContext_Userguid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtWWPContext_Emprcod = "" ;
      gxTv_SdtWWPContext_Usumail = "" ;
      gxTv_SdtWWPContext_Usurprint = "" ;
      gxTv_SdtWWPContext_Usursockt = "" ;
      gxTv_SdtWWPContext_Licensekey = "" ;
      gxTv_SdtWWPContext_Token = "" ;
      gxTv_SdtWWPContext_Environmentid = "" ;
      gxTv_SdtWWPContext_Product = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWWPContext_N ;
   }

   public app.wwpbaseobjects.SdtWWPContext Clone( )
   {
      return (app.wwpbaseobjects.SdtWWPContext)(clone()) ;
   }

   public void setStruct( app.wwpbaseobjects.StructSdtWWPContext struct )
   {
      setgxTv_SdtWWPContext_Userid(struct.getUserid());
      setgxTv_SdtWWPContext_Username(struct.getUsername());
      setgxTv_SdtWWPContext_Usurcod(struct.getUsurcod());
      setgxTv_SdtWWPContext_Userguid(struct.getUserguid());
      setgxTv_SdtWWPContext_Emprcod(struct.getEmprcod());
      setgxTv_SdtWWPContext_Usumail(struct.getUsumail());
      setgxTv_SdtWWPContext_Usurprint(struct.getUsurprint());
      setgxTv_SdtWWPContext_Usursockt(struct.getUsursockt());
      setgxTv_SdtWWPContext_Mtknid(struct.getMtknid());
      setgxTv_SdtWWPContext_Licensekey(struct.getLicensekey());
      setgxTv_SdtWWPContext_Token(struct.getToken());
      setgxTv_SdtWWPContext_Environmentid(struct.getEnvironmentid());
      setgxTv_SdtWWPContext_Product(struct.getProduct());
   }

   @SuppressWarnings("unchecked")
   public app.wwpbaseobjects.StructSdtWWPContext getStruct( )
   {
      app.wwpbaseobjects.StructSdtWWPContext struct = new app.wwpbaseobjects.StructSdtWWPContext ();
      struct.setUserid(getgxTv_SdtWWPContext_Userid());
      struct.setUsername(getgxTv_SdtWWPContext_Username());
      struct.setUsurcod(getgxTv_SdtWWPContext_Usurcod());
      struct.setUserguid(getgxTv_SdtWWPContext_Userguid());
      struct.setEmprcod(getgxTv_SdtWWPContext_Emprcod());
      struct.setUsumail(getgxTv_SdtWWPContext_Usumail());
      struct.setUsurprint(getgxTv_SdtWWPContext_Usurprint());
      struct.setUsursockt(getgxTv_SdtWWPContext_Usursockt());
      struct.setMtknid(getgxTv_SdtWWPContext_Mtknid());
      struct.setLicensekey(getgxTv_SdtWWPContext_Licensekey());
      struct.setToken(getgxTv_SdtWWPContext_Token());
      struct.setEnvironmentid(getgxTv_SdtWWPContext_Environmentid());
      struct.setProduct(getgxTv_SdtWWPContext_Product());
      return struct ;
   }

   protected byte gxTv_SdtWWPContext_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtWWPContext_Mtknid ;
   protected String gxTv_SdtWWPContext_Userid ;
   protected String gxTv_SdtWWPContext_Usurcod ;
   protected String gxTv_SdtWWPContext_Emprcod ;
   protected String gxTv_SdtWWPContext_Usumail ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtWWPContext_Username ;
   protected String gxTv_SdtWWPContext_Usurprint ;
   protected String gxTv_SdtWWPContext_Usursockt ;
   protected String gxTv_SdtWWPContext_Licensekey ;
   protected String gxTv_SdtWWPContext_Token ;
   protected String gxTv_SdtWWPContext_Environmentid ;
   protected String gxTv_SdtWWPContext_Product ;
   protected java.util.UUID gxTv_SdtWWPContext_Userguid ;
}

