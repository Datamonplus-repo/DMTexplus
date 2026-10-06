package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtProduccionMaquinaDetalle extends GxUserType
{
   public SdtsdtProduccionMaquinaDetalle( )
   {
      this(  new ModelContext(SdtsdtProduccionMaquinaDetalle.class));
   }

   public SdtsdtProduccionMaquinaDetalle( ModelContext context )
   {
      super( context, "SdtsdtProduccionMaquinaDetalle");
   }

   public SdtsdtProduccionMaquinaDetalle( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtProduccionMaquinaDetalle");
   }

   public SdtsdtProduccionMaquinaDetalle( StructSdtsdtProduccionMaquinaDetalle struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barhdr") )
            {
               gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprodti") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N = (byte)(0) ;
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProdtf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos") )
            {
               gxTv_SdtsdtProduccionMaquinaDetalle_Kilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros") )
            {
               gxTv_SdtsdtProduccionMaquinaDetalle_Metros = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "sdtProduccionMaquinaDetalle" ;
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
      oWriter.writeElement("MaqCod", gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barhdr", gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti) && ( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N == 1 ) )
      {
         oWriter.writeElement("Hisprodti", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf) && ( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("HisProdtf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProdtf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Kilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtProduccionMaquinaDetalle_Kilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metros", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtProduccionMaquinaDetalle_Metros, 9, 2)));
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
      AddObjectProperty("MaqCod", gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc, false, false);
      AddObjectProperty("Barhdr", gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr, false, false);
      datetime_STZ = gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti ;
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
      AddObjectProperty("Hisprodti", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf ;
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
      AddObjectProperty("HisProdtf", sDateCnv, false, false);
      AddObjectProperty("Kilos", gxTv_SdtsdtProduccionMaquinaDetalle_Kilos, false, false);
      AddObjectProperty("Metros", gxTv_SdtsdtProduccionMaquinaDetalle_Metros, false, false);
   }

   public String getgxTv_SdtsdtProduccionMaquinaDetalle_Maqcod( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Maqcod( String value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod = value ;
   }

   public String getgxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc( String value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc = value ;
   }

   public String getgxTv_SdtsdtProduccionMaquinaDetalle_Barhdr( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Barhdr( String value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr = value ;
   }

   public java.util.Date getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti( java.util.Date value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti = value ;
   }

   public java.util.Date getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtProduccionMaquinaDetalle_Kilos( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Kilos ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Kilos( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Kilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtProduccionMaquinaDetalle_Metros( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_Metros ;
   }

   public void setgxTv_SdtsdtProduccionMaquinaDetalle_Metros( java.math.BigDecimal value )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(0) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Metros = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod = "" ;
      gxTv_SdtsdtProduccionMaquinaDetalle_N = (byte)(1) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc = "" ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr = "" ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N = (byte)(1) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Kilos = DecimalUtil.ZERO ;
      gxTv_SdtsdtProduccionMaquinaDetalle_Metros = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtProduccionMaquinaDetalle_N ;
   }

   public app.SdtsdtProduccionMaquinaDetalle Clone( )
   {
      return (app.SdtsdtProduccionMaquinaDetalle)(clone()) ;
   }

   public void setStruct( app.StructSdtsdtProduccionMaquinaDetalle struct )
   {
      setgxTv_SdtsdtProduccionMaquinaDetalle_Maqcod(struct.getMaqcod());
      setgxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtsdtProduccionMaquinaDetalle_Barhdr(struct.getBarhdr());
      if ( struct.gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N == 0 )
      {
         setgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti(struct.getHisprodti());
      }
      if ( struct.gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N == 0 )
      {
         setgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtsdtProduccionMaquinaDetalle_Kilos(struct.getKilos());
      setgxTv_SdtsdtProduccionMaquinaDetalle_Metros(struct.getMetros());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtsdtProduccionMaquinaDetalle getStruct( )
   {
      app.StructSdtsdtProduccionMaquinaDetalle struct = new app.StructSdtsdtProduccionMaquinaDetalle ();
      struct.setMaqcod(getgxTv_SdtsdtProduccionMaquinaDetalle_Maqcod());
      struct.setMaqdsc(getgxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc());
      struct.setBarhdr(getgxTv_SdtsdtProduccionMaquinaDetalle_Barhdr());
      if ( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N == 0 )
      {
         struct.setHisprodti(getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti());
      }
      if ( gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf());
      }
      struct.setKilos(getgxTv_SdtsdtProduccionMaquinaDetalle_Kilos());
      struct.setMetros(getgxTv_SdtsdtProduccionMaquinaDetalle_Metros());
      return struct ;
   }

   protected byte gxTv_SdtsdtProduccionMaquinaDetalle_N ;
   protected byte gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti_N ;
   protected byte gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquinaDetalle_Kilos ;
   protected java.math.BigDecimal gxTv_SdtsdtProduccionMaquinaDetalle_Metros ;
   protected String gxTv_SdtsdtProduccionMaquinaDetalle_Maqcod ;
   protected String gxTv_SdtsdtProduccionMaquinaDetalle_Maqdsc ;
   protected String gxTv_SdtsdtProduccionMaquinaDetalle_Barhdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodti ;
   protected java.util.Date gxTv_SdtsdtProduccionMaquinaDetalle_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

