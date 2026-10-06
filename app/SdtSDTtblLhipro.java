package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTtblLhipro extends GxUserType
{
   public SdtSDTtblLhipro( )
   {
      this(  new ModelContext(SdtSDTtblLhipro.class));
   }

   public SdtSDTtblLhipro( ModelContext context )
   {
      super( context, "SdtSDTtblLhipro");
   }

   public SdtSDTtblLhipro( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTtblLhipro");
   }

   public SdtSDTtblLhipro( StructSdtSDTtblLhipro struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtSDTtblLhipro_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTtblLhipro_Maqdsc = oReader.getValue() ;
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
                  gxTv_SdtSDTtblLhipro_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTtblLhipro_Hisprodti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTtblLhipro_Hisprodti_N = (byte)(0) ;
                  gxTv_SdtSDTtblLhipro_Hisprodti = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprodtf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTtblLhipro_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTtblLhipro_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTtblLhipro_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTtblLhipro_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProf") )
            {
               gxTv_SdtSDTtblLhipro_Hisprof = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTtblLhipro_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTtblLhipro_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNhdr") )
            {
               gxTv_SdtSDTtblLhipro_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprolot") )
            {
               gxTv_SdtSDTtblLhipro_Hisprolot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprotur") )
            {
               gxTv_SdtSDTtblLhipro_Hisprotur = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               gxTv_SdtSDTtblLhipro_Fase = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSDTtblLhipro_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprotr2") )
            {
               gxTv_SdtSDTtblLhipro_Hisprotr2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcod") )
            {
               gxTv_SdtSDTtblLhipro_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcodnom") )
            {
               gxTv_SdtSDTtblLhipro_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtSDTtblLhipro_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSerdsc") )
            {
               gxTv_SdtSDTtblLhipro_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTip") )
            {
               gxTv_SdtSDTtblLhipro_Hisprotip = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtSDTtblLhipro_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNom") )
            {
               gxTv_SdtSDTtblLhipro_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomCli") )
            {
               gxTv_SdtSDTtblLhipro_Barnomcli = oReader.getValue() ;
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
         sName = "SDTtblLhipro" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTtblLhipro_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTtblLhipro_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTtblLhipro_Hisprodti) && ( gxTv_SdtSDTtblLhipro_Hisprodti_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTtblLhipro_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTtblLhipro_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTtblLhipro_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTtblLhipro_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTtblLhipro_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTtblLhipro_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTtblLhipro_Hisprodtf) && ( gxTv_SdtSDTtblLhipro_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("Hisprodtf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTtblLhipro_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTtblLhipro_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTtblLhipro_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTtblLhipro_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTtblLhipro_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTtblLhipro_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodtf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("HisProf", gxTv_SdtSDTtblLhipro_Hisprof);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTtblLhipro_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTtblLhipro_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNhdr", gxTv_SdtSDTtblLhipro_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprolot", gxTv_SdtSDTtblLhipro_Hisprolot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprotur", GXutil.trim( GXutil.str( gxTv_SdtSDTtblLhipro_Hisprotur, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fase", gxTv_SdtSDTtblLhipro_Fase);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtSDTtblLhipro_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprotr2", GXutil.trim( GXutil.str( gxTv_SdtSDTtblLhipro_Hisprotr2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcod", GXutil.trim( GXutil.str( gxTv_SdtSDTtblLhipro_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcodnom", gxTv_SdtSDTtblLhipro_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtSDTtblLhipro_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSerdsc", gxTv_SdtSDTtblLhipro_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTip", GXutil.trim( GXutil.str( gxTv_SdtSDTtblLhipro_Hisprotip, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtSDTtblLhipro_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNom", gxTv_SdtSDTtblLhipro_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomCli", gxTv_SdtSDTtblLhipro_Barnomcli);
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTtblLhipro_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTtblLhipro_Maqdsc, false, false);
      datetime_STZ = gxTv_SdtSDTtblLhipro_Hisprodti ;
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
      datetime_STZ = gxTv_SdtSDTtblLhipro_Hisprodtf ;
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
      AddObjectProperty("Hisprodtf", sDateCnv, false, false);
      AddObjectProperty("HisProf", gxTv_SdtSDTtblLhipro_Hisprof, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTtblLhipro_Hisprokgr, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTtblLhipro_Hispromtr, false, false);
      AddObjectProperty("BarNhdr", gxTv_SdtSDTtblLhipro_Barnhdr, false, false);
      AddObjectProperty("Hisprolot", gxTv_SdtSDTtblLhipro_Hisprolot, false, false);
      AddObjectProperty("Hisprotur", gxTv_SdtSDTtblLhipro_Hisprotur, false, false);
      AddObjectProperty("Fase", gxTv_SdtSDTtblLhipro_Fase, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtSDTtblLhipro_Fasdsc, false, false);
      AddObjectProperty("Hisprotr2", gxTv_SdtSDTtblLhipro_Hisprotr2, false, false);
      AddObjectProperty("Parcod", gxTv_SdtSDTtblLhipro_Parcod, false, false);
      AddObjectProperty("Parcodnom", gxTv_SdtSDTtblLhipro_Parcodnom, false, false);
      AddObjectProperty("Barser", gxTv_SdtSDTtblLhipro_Barser, false, false);
      AddObjectProperty("BarSerdsc", gxTv_SdtSDTtblLhipro_Barserdsc, false, false);
      AddObjectProperty("HisProTip", gxTv_SdtSDTtblLhipro_Hisprotip, false, false);
      AddObjectProperty("TipArtDsc", gxTv_SdtSDTtblLhipro_Tipartdsc, false, false);
      AddObjectProperty("BarColNom", gxTv_SdtSDTtblLhipro_Barcolnom, false, false);
      AddObjectProperty("BarNomCli", gxTv_SdtSDTtblLhipro_Barnomcli, false, false);
   }

   public String getgxTv_SdtSDTtblLhipro_Maqcod( )
   {
      return gxTv_SdtSDTtblLhipro_Maqcod ;
   }

   public void setgxTv_SdtSDTtblLhipro_Maqcod( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Maqcod = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Maqdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Maqdsc ;
   }

   public void setgxTv_SdtSDTtblLhipro_Maqdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Maqdsc = value ;
   }

   public java.util.Date getgxTv_SdtSDTtblLhipro_Hisprodti( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprodti ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprodti( java.util.Date value )
   {
      gxTv_SdtSDTtblLhipro_Hisprodti_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprodti = value ;
   }

   public java.util.Date getgxTv_SdtSDTtblLhipro_Hisprodtf( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprodtf ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTtblLhipro_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprodtf = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Hisprof( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprof ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprof( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprof = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTtblLhipro_Hisprokgr( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprokgr ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTtblLhipro_Hispromtr( )
   {
      return gxTv_SdtSDTtblLhipro_Hispromtr ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hispromtr = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Barnhdr( )
   {
      return gxTv_SdtSDTtblLhipro_Barnhdr ;
   }

   public void setgxTv_SdtSDTtblLhipro_Barnhdr( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barnhdr = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Hisprolot( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprolot ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprolot( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprolot = value ;
   }

   public byte getgxTv_SdtSDTtblLhipro_Hisprotur( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprotur ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprotur( byte value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprotur = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Fase( )
   {
      return gxTv_SdtSDTtblLhipro_Fase ;
   }

   public void setgxTv_SdtSDTtblLhipro_Fase( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Fase = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Fasdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Fasdsc ;
   }

   public void setgxTv_SdtSDTtblLhipro_Fasdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Fasdsc = value ;
   }

   public short getgxTv_SdtSDTtblLhipro_Hisprotr2( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprotr2 ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprotr2( short value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprotr2 = value ;
   }

   public short getgxTv_SdtSDTtblLhipro_Parcod( )
   {
      return gxTv_SdtSDTtblLhipro_Parcod ;
   }

   public void setgxTv_SdtSDTtblLhipro_Parcod( short value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Parcod = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Parcodnom( )
   {
      return gxTv_SdtSDTtblLhipro_Parcodnom ;
   }

   public void setgxTv_SdtSDTtblLhipro_Parcodnom( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Parcodnom = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Barser( )
   {
      return gxTv_SdtSDTtblLhipro_Barser ;
   }

   public void setgxTv_SdtSDTtblLhipro_Barser( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barser = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Barserdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Barserdsc ;
   }

   public void setgxTv_SdtSDTtblLhipro_Barserdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barserdsc = value ;
   }

   public short getgxTv_SdtSDTtblLhipro_Hisprotip( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprotip ;
   }

   public void setgxTv_SdtSDTtblLhipro_Hisprotip( short value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprotip = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Tipartdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Tipartdsc ;
   }

   public void setgxTv_SdtSDTtblLhipro_Tipartdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Tipartdsc = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Barcolnom( )
   {
      return gxTv_SdtSDTtblLhipro_Barcolnom ;
   }

   public void setgxTv_SdtSDTtblLhipro_Barcolnom( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barcolnom = value ;
   }

   public String getgxTv_SdtSDTtblLhipro_Barnomcli( )
   {
      return gxTv_SdtSDTtblLhipro_Barnomcli ;
   }

   public void setgxTv_SdtSDTtblLhipro_Barnomcli( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barnomcli = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTtblLhipro_Maqcod = "" ;
      gxTv_SdtSDTtblLhipro_N = (byte)(1) ;
      gxTv_SdtSDTtblLhipro_Maqdsc = "" ;
      gxTv_SdtSDTtblLhipro_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTtblLhipro_Hisprodti_N = (byte)(1) ;
      gxTv_SdtSDTtblLhipro_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTtblLhipro_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTtblLhipro_Hisprof = "" ;
      gxTv_SdtSDTtblLhipro_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTtblLhipro_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTtblLhipro_Barnhdr = "" ;
      gxTv_SdtSDTtblLhipro_Hisprolot = "" ;
      gxTv_SdtSDTtblLhipro_Fase = "" ;
      gxTv_SdtSDTtblLhipro_Fasdsc = "" ;
      gxTv_SdtSDTtblLhipro_Parcodnom = "" ;
      gxTv_SdtSDTtblLhipro_Barser = "" ;
      gxTv_SdtSDTtblLhipro_Barserdsc = "" ;
      gxTv_SdtSDTtblLhipro_Tipartdsc = "" ;
      gxTv_SdtSDTtblLhipro_Barcolnom = "" ;
      gxTv_SdtSDTtblLhipro_Barnomcli = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTtblLhipro_N ;
   }

   public app.SdtSDTtblLhipro Clone( )
   {
      return (app.SdtSDTtblLhipro)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTtblLhipro struct )
   {
      setgxTv_SdtSDTtblLhipro_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTtblLhipro_Maqdsc(struct.getMaqdsc());
      if ( struct.gxTv_SdtSDTtblLhipro_Hisprodti_N == 0 )
      {
         setgxTv_SdtSDTtblLhipro_Hisprodti(struct.getHisprodti());
      }
      if ( struct.gxTv_SdtSDTtblLhipro_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTtblLhipro_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTtblLhipro_Hisprof(struct.getHisprof());
      setgxTv_SdtSDTtblLhipro_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTtblLhipro_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTtblLhipro_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtSDTtblLhipro_Hisprolot(struct.getHisprolot());
      setgxTv_SdtSDTtblLhipro_Hisprotur(struct.getHisprotur());
      setgxTv_SdtSDTtblLhipro_Fase(struct.getFase());
      setgxTv_SdtSDTtblLhipro_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSDTtblLhipro_Hisprotr2(struct.getHisprotr2());
      setgxTv_SdtSDTtblLhipro_Parcod(struct.getParcod());
      setgxTv_SdtSDTtblLhipro_Parcodnom(struct.getParcodnom());
      setgxTv_SdtSDTtblLhipro_Barser(struct.getBarser());
      setgxTv_SdtSDTtblLhipro_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtSDTtblLhipro_Hisprotip(struct.getHisprotip());
      setgxTv_SdtSDTtblLhipro_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtSDTtblLhipro_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDTtblLhipro_Barnomcli(struct.getBarnomcli());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTtblLhipro getStruct( )
   {
      app.StructSdtSDTtblLhipro struct = new app.StructSdtSDTtblLhipro ();
      struct.setMaqcod(getgxTv_SdtSDTtblLhipro_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTtblLhipro_Maqdsc());
      if ( gxTv_SdtSDTtblLhipro_Hisprodti_N == 0 )
      {
         struct.setHisprodti(getgxTv_SdtSDTtblLhipro_Hisprodti());
      }
      if ( gxTv_SdtSDTtblLhipro_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTtblLhipro_Hisprodtf());
      }
      struct.setHisprof(getgxTv_SdtSDTtblLhipro_Hisprof());
      struct.setHisprokgr(getgxTv_SdtSDTtblLhipro_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtSDTtblLhipro_Hispromtr());
      struct.setBarnhdr(getgxTv_SdtSDTtblLhipro_Barnhdr());
      struct.setHisprolot(getgxTv_SdtSDTtblLhipro_Hisprolot());
      struct.setHisprotur(getgxTv_SdtSDTtblLhipro_Hisprotur());
      struct.setFase(getgxTv_SdtSDTtblLhipro_Fase());
      struct.setFasdsc(getgxTv_SdtSDTtblLhipro_Fasdsc());
      struct.setHisprotr2(getgxTv_SdtSDTtblLhipro_Hisprotr2());
      struct.setParcod(getgxTv_SdtSDTtblLhipro_Parcod());
      struct.setParcodnom(getgxTv_SdtSDTtblLhipro_Parcodnom());
      struct.setBarser(getgxTv_SdtSDTtblLhipro_Barser());
      struct.setBarserdsc(getgxTv_SdtSDTtblLhipro_Barserdsc());
      struct.setHisprotip(getgxTv_SdtSDTtblLhipro_Hisprotip());
      struct.setTipartdsc(getgxTv_SdtSDTtblLhipro_Tipartdsc());
      struct.setBarcolnom(getgxTv_SdtSDTtblLhipro_Barcolnom());
      struct.setBarnomcli(getgxTv_SdtSDTtblLhipro_Barnomcli());
      return struct ;
   }

   protected byte gxTv_SdtSDTtblLhipro_N ;
   protected byte gxTv_SdtSDTtblLhipro_Hisprodti_N ;
   protected byte gxTv_SdtSDTtblLhipro_Hisprodtf_N ;
   protected byte gxTv_SdtSDTtblLhipro_Hisprotur ;
   protected short gxTv_SdtSDTtblLhipro_Hisprotr2 ;
   protected short gxTv_SdtSDTtblLhipro_Parcod ;
   protected short gxTv_SdtSDTtblLhipro_Hisprotip ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTtblLhipro_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTtblLhipro_Hispromtr ;
   protected String gxTv_SdtSDTtblLhipro_Maqcod ;
   protected String gxTv_SdtSDTtblLhipro_Maqdsc ;
   protected String gxTv_SdtSDTtblLhipro_Hisprof ;
   protected String gxTv_SdtSDTtblLhipro_Barnhdr ;
   protected String gxTv_SdtSDTtblLhipro_Hisprolot ;
   protected String gxTv_SdtSDTtblLhipro_Fase ;
   protected String gxTv_SdtSDTtblLhipro_Fasdsc ;
   protected String gxTv_SdtSDTtblLhipro_Parcodnom ;
   protected String gxTv_SdtSDTtblLhipro_Barser ;
   protected String gxTv_SdtSDTtblLhipro_Barserdsc ;
   protected String gxTv_SdtSDTtblLhipro_Tipartdsc ;
   protected String gxTv_SdtSDTtblLhipro_Barcolnom ;
   protected String gxTv_SdtSDTtblLhipro_Barnomcli ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTtblLhipro_Hisprodti ;
   protected java.util.Date gxTv_SdtSDTtblLhipro_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

