package app.oliveiraegoncalves.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLoginRequest extends GxUserType
{
   public SdtLoginRequest( )
   {
      this(  new ModelContext(SdtLoginRequest.class));
   }

   public SdtLoginRequest( ModelContext context )
   {
      super( context, "SdtLoginRequest");
   }

   public SdtLoginRequest( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtLoginRequest");
   }

   public SdtLoginRequest( StructSdtLoginRequest struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "username") )
            {
               gxTv_SdtLoginRequest_Username = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "password") )
            {
               gxTv_SdtLoginRequest_Password = oReader.getValue() ;
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
         sName = "LoginRequest" ;
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
      oWriter.writeElement("username", gxTv_SdtLoginRequest_Username);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("password", gxTv_SdtLoginRequest_Password);
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
      AddObjectProperty("username", gxTv_SdtLoginRequest_Username, false, false);
      AddObjectProperty("password", gxTv_SdtLoginRequest_Password, false, false);
   }

   public String getgxTv_SdtLoginRequest_Username( )
   {
      return gxTv_SdtLoginRequest_Username ;
   }

   public void setgxTv_SdtLoginRequest_Username( String value )
   {
      gxTv_SdtLoginRequest_N = (byte)(0) ;
      gxTv_SdtLoginRequest_Username = value ;
   }

   public String getgxTv_SdtLoginRequest_Password( )
   {
      return gxTv_SdtLoginRequest_Password ;
   }

   public void setgxTv_SdtLoginRequest_Password( String value )
   {
      gxTv_SdtLoginRequest_N = (byte)(0) ;
      gxTv_SdtLoginRequest_Password = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLoginRequest_Username = "" ;
      gxTv_SdtLoginRequest_N = (byte)(1) ;
      gxTv_SdtLoginRequest_Password = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtLoginRequest_N ;
   }

   public app.oliveiraegoncalves.v1.SdtLoginRequest Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtLoginRequest)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtLoginRequest struct )
   {
      setgxTv_SdtLoginRequest_Username(struct.getUsername());
      setgxTv_SdtLoginRequest_Password(struct.getPassword());
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtLoginRequest getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtLoginRequest struct = new app.oliveiraegoncalves.v1.StructSdtLoginRequest ();
      struct.setUsername(getgxTv_SdtLoginRequest_Username());
      struct.setPassword(getgxTv_SdtLoginRequest_Password());
      return struct ;
   }

   protected byte gxTv_SdtLoginRequest_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtLoginRequest_Username ;
   protected String gxTv_SdtLoginRequest_Password ;
}

