package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtResponseHeartBeat extends GxUserType
{
   public SdtResponseHeartBeat( )
   {
      this(  new ModelContext(SdtResponseHeartBeat.class));
   }

   public SdtResponseHeartBeat( ModelContext context )
   {
      super( context, "SdtResponseHeartBeat");
   }

   public SdtResponseHeartBeat( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtResponseHeartBeat");
   }

   public SdtResponseHeartBeat( StructSdtResponseHeartBeat struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "message") )
            {
               gxTv_SdtResponseHeartBeat_Message = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "error") )
            {
               gxTv_SdtResponseHeartBeat_Error = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "statusCode") )
            {
               gxTv_SdtResponseHeartBeat_Statuscode = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "ResponseHeartBeat" ;
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
      oWriter.writeElement("message", gxTv_SdtResponseHeartBeat_Message);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("error", gxTv_SdtResponseHeartBeat_Error);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("statusCode", GXutil.trim( GXutil.strNoRound( gxTv_SdtResponseHeartBeat_Statuscode, 10, 5)));
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
      AddObjectProperty("message", gxTv_SdtResponseHeartBeat_Message, false, false);
      AddObjectProperty("error", gxTv_SdtResponseHeartBeat_Error, false, false);
      AddObjectProperty("statusCode", gxTv_SdtResponseHeartBeat_Statuscode, false, false);
   }

   public String getgxTv_SdtResponseHeartBeat_Message( )
   {
      return gxTv_SdtResponseHeartBeat_Message ;
   }

   public void setgxTv_SdtResponseHeartBeat_Message( String value )
   {
      gxTv_SdtResponseHeartBeat_N = (byte)(0) ;
      gxTv_SdtResponseHeartBeat_Message = value ;
   }

   public String getgxTv_SdtResponseHeartBeat_Error( )
   {
      return gxTv_SdtResponseHeartBeat_Error ;
   }

   public void setgxTv_SdtResponseHeartBeat_Error( String value )
   {
      gxTv_SdtResponseHeartBeat_N = (byte)(0) ;
      gxTv_SdtResponseHeartBeat_Error = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResponseHeartBeat_Statuscode( )
   {
      return gxTv_SdtResponseHeartBeat_Statuscode ;
   }

   public void setgxTv_SdtResponseHeartBeat_Statuscode( java.math.BigDecimal value )
   {
      gxTv_SdtResponseHeartBeat_N = (byte)(0) ;
      gxTv_SdtResponseHeartBeat_Statuscode = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtResponseHeartBeat_Message = "" ;
      gxTv_SdtResponseHeartBeat_N = (byte)(1) ;
      gxTv_SdtResponseHeartBeat_Error = "" ;
      gxTv_SdtResponseHeartBeat_Statuscode = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtResponseHeartBeat_N ;
   }

   public app.devops.SdtResponseHeartBeat Clone( )
   {
      return (app.devops.SdtResponseHeartBeat)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtResponseHeartBeat struct )
   {
      setgxTv_SdtResponseHeartBeat_Message(struct.getMessage());
      setgxTv_SdtResponseHeartBeat_Error(struct.getError());
      setgxTv_SdtResponseHeartBeat_Statuscode(struct.getStatuscode());
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtResponseHeartBeat getStruct( )
   {
      app.devops.StructSdtResponseHeartBeat struct = new app.devops.StructSdtResponseHeartBeat ();
      struct.setMessage(getgxTv_SdtResponseHeartBeat_Message());
      struct.setError(getgxTv_SdtResponseHeartBeat_Error());
      struct.setStatuscode(getgxTv_SdtResponseHeartBeat_Statuscode());
      return struct ;
   }

   protected byte gxTv_SdtResponseHeartBeat_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtResponseHeartBeat_Statuscode ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtResponseHeartBeat_Message ;
   protected String gxTv_SdtResponseHeartBeat_Error ;
}

