package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTBuild_artifact extends GxUserType
{
   public SdtSDTBuild_artifact( )
   {
      this(  new ModelContext(SdtSDTBuild_artifact.class));
   }

   public SdtSDTBuild_artifact( ModelContext context )
   {
      super( context, "SdtSDTBuild_artifact");
   }

   public SdtSDTBuild_artifact( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTBuild_artifact");
   }

   public SdtSDTBuild_artifact( StructSdtSDTBuild_artifact struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "version") )
            {
               gxTv_SdtSDTBuild_artifact_Version = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "builtAt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTBuild_artifact_Builtat = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTBuild_artifact_Builtat_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTBuild_artifact_Builtat_N = (byte)(0) ;
                  gxTv_SdtSDTBuild_artifact_Builtat = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "url") )
            {
               gxTv_SdtSDTBuild_artifact_Url = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "sha256") )
            {
               gxTv_SdtSDTBuild_artifact_Sha256 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "size") )
            {
               gxTv_SdtSDTBuild_artifact_Size = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "signatureUrl") )
            {
               gxTv_SdtSDTBuild_artifact_Signatureurl = oReader.getValue() ;
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
         sName = "SDTBuild.artifact" ;
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
      oWriter.writeElement("version", gxTv_SdtSDTBuild_artifact_Version);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTBuild_artifact_Builtat) && ( gxTv_SdtSDTBuild_artifact_Builtat_N == 1 ) )
      {
         oWriter.writeElement("builtAt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTBuild_artifact_Builtat), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTBuild_artifact_Builtat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTBuild_artifact_Builtat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTBuild_artifact_Builtat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTBuild_artifact_Builtat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTBuild_artifact_Builtat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("builtAt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("url", gxTv_SdtSDTBuild_artifact_Url);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("sha256", gxTv_SdtSDTBuild_artifact_Sha256);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("size", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTBuild_artifact_Size, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("signatureUrl", gxTv_SdtSDTBuild_artifact_Signatureurl);
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
      AddObjectProperty("version", gxTv_SdtSDTBuild_artifact_Version, false, false);
      datetime_STZ = gxTv_SdtSDTBuild_artifact_Builtat ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("builtAt", sDateCnv, false, false);
      AddObjectProperty("url", gxTv_SdtSDTBuild_artifact_Url, false, false);
      AddObjectProperty("sha256", gxTv_SdtSDTBuild_artifact_Sha256, false, false);
      AddObjectProperty("size", gxTv_SdtSDTBuild_artifact_Size, false, false);
      AddObjectProperty("signatureUrl", gxTv_SdtSDTBuild_artifact_Signatureurl, false, false);
   }

   public String getgxTv_SdtSDTBuild_artifact_Version( )
   {
      return gxTv_SdtSDTBuild_artifact_Version ;
   }

   public void setgxTv_SdtSDTBuild_artifact_Version( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Version = value ;
   }

   public java.util.Date getgxTv_SdtSDTBuild_artifact_Builtat( )
   {
      return gxTv_SdtSDTBuild_artifact_Builtat ;
   }

   public void setgxTv_SdtSDTBuild_artifact_Builtat( java.util.Date value )
   {
      gxTv_SdtSDTBuild_artifact_Builtat_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Builtat = value ;
   }

   public String getgxTv_SdtSDTBuild_artifact_Url( )
   {
      return gxTv_SdtSDTBuild_artifact_Url ;
   }

   public void setgxTv_SdtSDTBuild_artifact_Url( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Url = value ;
   }

   public String getgxTv_SdtSDTBuild_artifact_Sha256( )
   {
      return gxTv_SdtSDTBuild_artifact_Sha256 ;
   }

   public void setgxTv_SdtSDTBuild_artifact_Sha256( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Sha256 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTBuild_artifact_Size( )
   {
      return gxTv_SdtSDTBuild_artifact_Size ;
   }

   public void setgxTv_SdtSDTBuild_artifact_Size( java.math.BigDecimal value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Size = value ;
   }

   public String getgxTv_SdtSDTBuild_artifact_Signatureurl( )
   {
      return gxTv_SdtSDTBuild_artifact_Signatureurl ;
   }

   public void setgxTv_SdtSDTBuild_artifact_Signatureurl( String value )
   {
      gxTv_SdtSDTBuild_artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_artifact_Signatureurl = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTBuild_artifact_Version = "" ;
      gxTv_SdtSDTBuild_artifact_N = (byte)(1) ;
      gxTv_SdtSDTBuild_artifact_Builtat = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTBuild_artifact_Builtat_N = (byte)(1) ;
      gxTv_SdtSDTBuild_artifact_Url = "" ;
      gxTv_SdtSDTBuild_artifact_Sha256 = "" ;
      gxTv_SdtSDTBuild_artifact_Size = DecimalUtil.ZERO ;
      gxTv_SdtSDTBuild_artifact_Signatureurl = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTBuild_artifact_N ;
   }

   public app.devops.SdtSDTBuild_artifact Clone( )
   {
      return (app.devops.SdtSDTBuild_artifact)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtSDTBuild_artifact struct )
   {
      setgxTv_SdtSDTBuild_artifact_Version(struct.getVersion());
      if ( struct.gxTv_SdtSDTBuild_artifact_Builtat_N == 0 )
      {
         setgxTv_SdtSDTBuild_artifact_Builtat(struct.getBuiltat());
      }
      setgxTv_SdtSDTBuild_artifact_Url(struct.getUrl());
      setgxTv_SdtSDTBuild_artifact_Sha256(struct.getSha256());
      setgxTv_SdtSDTBuild_artifact_Size(struct.getSize());
      setgxTv_SdtSDTBuild_artifact_Signatureurl(struct.getSignatureurl());
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtSDTBuild_artifact getStruct( )
   {
      app.devops.StructSdtSDTBuild_artifact struct = new app.devops.StructSdtSDTBuild_artifact ();
      struct.setVersion(getgxTv_SdtSDTBuild_artifact_Version());
      if ( gxTv_SdtSDTBuild_artifact_Builtat_N == 0 )
      {
         struct.setBuiltat(getgxTv_SdtSDTBuild_artifact_Builtat());
      }
      struct.setUrl(getgxTv_SdtSDTBuild_artifact_Url());
      struct.setSha256(getgxTv_SdtSDTBuild_artifact_Sha256());
      struct.setSize(getgxTv_SdtSDTBuild_artifact_Size());
      struct.setSignatureurl(getgxTv_SdtSDTBuild_artifact_Signatureurl());
      return struct ;
   }

   protected byte gxTv_SdtSDTBuild_artifact_N ;
   protected byte gxTv_SdtSDTBuild_artifact_Builtat_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTBuild_artifact_Size ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTBuild_artifact_Builtat ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTBuild_artifact_Version ;
   protected String gxTv_SdtSDTBuild_artifact_Url ;
   protected String gxTv_SdtSDTBuild_artifact_Sha256 ;
   protected String gxTv_SdtSDTBuild_artifact_Signatureurl ;
}

