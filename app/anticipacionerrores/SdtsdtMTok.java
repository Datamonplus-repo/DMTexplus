package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtMTok extends GxUserType
{
   public SdtsdtMTok( )
   {
      this(  new ModelContext(SdtsdtMTok.class));
   }

   public SdtsdtMTok( ModelContext context )
   {
      super( context, "SdtsdtMTok");
   }

   public SdtsdtMTok( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtMTok");
   }

   public SdtsdtMTok( StructSdtsdtMTok struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknId") )
            {
               gxTv_SdtsdtMTok_Mtknid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknUsu") )
            {
               gxTv_SdtsdtMTok_Mtknusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknIp") )
            {
               gxTv_SdtsdtMTok_Mtknip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTkn") )
            {
               gxTv_SdtsdtMTok_Mtkn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtMTok_Mtknfec = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtsdtMTok_Mtknfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtMTok_Mtknfec_N = (byte)(0) ;
                  gxTv_SdtsdtMTok_Mtknfec = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))), (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 21, 3), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknVen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtMTok_Mtknven = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtsdtMTok_Mtknven_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtMTok_Mtknven_N = (byte)(0) ;
                  gxTv_SdtsdtMTok_Mtknven = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))), (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 21, 3), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTKnDat") )
            {
               gxTv_SdtsdtMTok_Mtkndat = oReader.getValue() ;
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
         sName = "sdtMTok" ;
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
      oWriter.writeElement("MTknId", GXutil.trim( GXutil.str( gxTv_SdtsdtMTok_Mtknid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MTknUsu", gxTv_SdtsdtMTok_Mtknusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MTknIp", gxTv_SdtsdtMTok_Mtknip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MTkn", gxTv_SdtsdtMTok_Mtkn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtMTok_Mtknfec) && ( gxTv_SdtsdtMTok_Mtknfec_N == 1 ) )
      {
         oWriter.writeElement("MTknFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "." ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( gxTv_SdtsdtMTok_Mtknfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MTknFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtMTok_Mtknven) && ( gxTv_SdtsdtMTok_Mtknven_N == 1 ) )
      {
         oWriter.writeElement("MTknVen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "." ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( gxTv_SdtsdtMTok_Mtknven), 10, 0)) ;
         sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MTknVen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MTKnDat", gxTv_SdtsdtMTok_Mtkndat);
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
      AddObjectProperty("MTknId", gxTv_SdtsdtMTok_Mtknid, false, false);
      AddObjectProperty("MTknUsu", gxTv_SdtsdtMTok_Mtknusu, false, false);
      AddObjectProperty("MTknIp", gxTv_SdtsdtMTok_Mtknip, false, false);
      AddObjectProperty("MTkn", gxTv_SdtsdtMTok_Mtkn, false, false);
      datetimemil_STZ = gxTv_SdtsdtMTok_Mtknfec ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "." ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("MTknFec", sDateCnv, false, false);
      datetimemil_STZ = gxTv_SdtsdtMTok_Mtknven ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "." ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("MTknVen", sDateCnv, false, false);
      AddObjectProperty("MTKnDat", gxTv_SdtsdtMTok_Mtkndat, false, false);
   }

   public long getgxTv_SdtsdtMTok_Mtknid( )
   {
      return gxTv_SdtsdtMTok_Mtknid ;
   }

   public void setgxTv_SdtsdtMTok_Mtknid( long value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknid = value ;
   }

   public String getgxTv_SdtsdtMTok_Mtknusu( )
   {
      return gxTv_SdtsdtMTok_Mtknusu ;
   }

   public void setgxTv_SdtsdtMTok_Mtknusu( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknusu = value ;
   }

   public String getgxTv_SdtsdtMTok_Mtknip( )
   {
      return gxTv_SdtsdtMTok_Mtknip ;
   }

   public void setgxTv_SdtsdtMTok_Mtknip( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknip = value ;
   }

   public String getgxTv_SdtsdtMTok_Mtkn( )
   {
      return gxTv_SdtsdtMTok_Mtkn ;
   }

   public void setgxTv_SdtsdtMTok_Mtkn( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtkn = value ;
   }

   public java.util.Date getgxTv_SdtsdtMTok_Mtknfec( )
   {
      return gxTv_SdtsdtMTok_Mtknfec ;
   }

   public void setgxTv_SdtsdtMTok_Mtknfec( java.util.Date value )
   {
      gxTv_SdtsdtMTok_Mtknfec_N = (byte)(0) ;
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknfec = value ;
   }

   public java.util.Date getgxTv_SdtsdtMTok_Mtknven( )
   {
      return gxTv_SdtsdtMTok_Mtknven ;
   }

   public void setgxTv_SdtsdtMTok_Mtknven( java.util.Date value )
   {
      gxTv_SdtsdtMTok_Mtknven_N = (byte)(0) ;
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknven = value ;
   }

   public String getgxTv_SdtsdtMTok_Mtkndat( )
   {
      return gxTv_SdtsdtMTok_Mtkndat ;
   }

   public void setgxTv_SdtsdtMTok_Mtkndat( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtkndat = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtMTok_N = (byte)(1) ;
      gxTv_SdtsdtMTok_Mtknusu = "" ;
      gxTv_SdtsdtMTok_Mtknip = "" ;
      gxTv_SdtsdtMTok_Mtkn = "" ;
      gxTv_SdtsdtMTok_Mtknfec = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtsdtMTok_Mtknfec_N = (byte)(1) ;
      gxTv_SdtsdtMTok_Mtknven = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtsdtMTok_Mtknven_N = (byte)(1) ;
      gxTv_SdtsdtMTok_Mtkndat = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetimemil_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtMTok_N ;
   }

   public app.anticipacionerrores.SdtsdtMTok Clone( )
   {
      return (app.anticipacionerrores.SdtsdtMTok)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtsdtMTok struct )
   {
      setgxTv_SdtsdtMTok_Mtknid(struct.getMtknid());
      setgxTv_SdtsdtMTok_Mtknusu(struct.getMtknusu());
      setgxTv_SdtsdtMTok_Mtknip(struct.getMtknip());
      setgxTv_SdtsdtMTok_Mtkn(struct.getMtkn());
      if ( struct.gxTv_SdtsdtMTok_Mtknfec_N == 0 )
      {
         setgxTv_SdtsdtMTok_Mtknfec(struct.getMtknfec());
      }
      if ( struct.gxTv_SdtsdtMTok_Mtknven_N == 0 )
      {
         setgxTv_SdtsdtMTok_Mtknven(struct.getMtknven());
      }
      setgxTv_SdtsdtMTok_Mtkndat(struct.getMtkndat());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtsdtMTok getStruct( )
   {
      app.anticipacionerrores.StructSdtsdtMTok struct = new app.anticipacionerrores.StructSdtsdtMTok ();
      struct.setMtknid(getgxTv_SdtsdtMTok_Mtknid());
      struct.setMtknusu(getgxTv_SdtsdtMTok_Mtknusu());
      struct.setMtknip(getgxTv_SdtsdtMTok_Mtknip());
      struct.setMtkn(getgxTv_SdtsdtMTok_Mtkn());
      if ( gxTv_SdtsdtMTok_Mtknfec_N == 0 )
      {
         struct.setMtknfec(getgxTv_SdtsdtMTok_Mtknfec());
      }
      if ( gxTv_SdtsdtMTok_Mtknven_N == 0 )
      {
         struct.setMtknven(getgxTv_SdtsdtMTok_Mtknven());
      }
      struct.setMtkndat(getgxTv_SdtsdtMTok_Mtkndat());
      return struct ;
   }

   protected byte gxTv_SdtsdtMTok_N ;
   protected byte gxTv_SdtsdtMTok_Mtknfec_N ;
   protected byte gxTv_SdtsdtMTok_Mtknven_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtsdtMTok_Mtknid ;
   protected String gxTv_SdtsdtMTok_Mtknusu ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtMTok_Mtknfec ;
   protected java.util.Date gxTv_SdtsdtMTok_Mtknven ;
   protected java.util.Date datetimemil_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtMTok_Mtknip ;
   protected String gxTv_SdtsdtMTok_Mtkn ;
   protected String gxTv_SdtsdtMTok_Mtkndat ;
}

