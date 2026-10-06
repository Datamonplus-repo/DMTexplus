package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionLector extends GxUserType
{
   public SdtSDTProduccionLector( )
   {
      this(  new ModelContext(SdtSDTProduccionLector.class));
   }

   public SdtSDTProduccionLector( ModelContext context )
   {
      super( context, "SdtSDTProduccionLector");
   }

   public SdtSDTProduccionLector( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionLector");
   }

   public SdtSDTProduccionLector( StructSdtSDTProduccionLector struct )
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
               gxTv_SdtSDTProduccionLector_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqdsc") )
            {
               gxTv_SdtSDTProduccionLector_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarencCli") )
            {
               gxTv_SdtSDTProduccionLector_Barenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNhdr") )
            {
               gxTv_SdtSDTProduccionLector_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtSDTProduccionLector_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTProduccionLector_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barfecgen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTProduccionLector_Barfecgen = GXutil.nullDate() ;
                  gxTv_SdtSDTProduccionLector_Barfecgen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTProduccionLector_Barfecgen_N = (byte)(0) ;
                  gxTv_SdtSDTProduccionLector_Barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtSDTProduccionLector_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtSDTProduccionLector_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtdsc") )
            {
               gxTv_SdtSDTProduccionLector_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtSDTProduccionLector_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtSDTProduccionLector_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColDsc") )
            {
               gxTv_SdtSDTProduccionLector_Tipcoldsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IntDsc") )
            {
               gxTv_SdtSDTProduccionLector_Intdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomcli") )
            {
               gxTv_SdtSDTProduccionLector_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNumcli") )
            {
               gxTv_SdtSDTProduccionLector_Barnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bardibcli") )
            {
               gxTv_SdtSDTProduccionLector_Bardibcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bardibint") )
            {
               gxTv_SdtSDTProduccionLector_Bardibint = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcod") )
            {
               gxTv_SdtSDTProduccionLector_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCodNom") )
            {
               gxTv_SdtSDTProduccionLector_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeNom") )
            {
               gxTv_SdtSDTProduccionLector_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSDTProduccionLector_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tinte") )
            {
               gxTv_SdtSDTProduccionLector_Tinte = oReader.getValue() ;
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
                  gxTv_SdtSDTProduccionLector_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTProduccionLector_Hisprodti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTProduccionLector_Hisprodti_N = (byte)(0) ;
                  gxTv_SdtSDTProduccionLector_Hisprodti = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
                  gxTv_SdtSDTProduccionLector_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTProduccionLector_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTProduccionLector_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTProduccionLector_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprof") )
            {
               gxTv_SdtSDTProduccionLector_Hisprof = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTur") )
            {
               gxTv_SdtSDTProduccionLector_Hisprotur = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTProduccionLector_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTProduccionLector_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tiempom") )
            {
               gxTv_SdtSDTProduccionLector_Tiempom = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTProduccionLector" ;
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
      oWriter.writeElement("MaqCod", gxTv_SdtSDTProduccionLector_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maqdsc", gxTv_SdtSDTProduccionLector_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarencCli", gxTv_SdtSDTProduccionLector_Barenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNhdr", gxTv_SdtSDTProduccionLector_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTProduccionLector_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTProduccionLector_Barfecgen)) && ( gxTv_SdtSDTProduccionLector_Barfecgen_N == 1 ) )
      {
         oWriter.writeElement("Barfecgen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTProduccionLector_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTProduccionLector_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTProduccionLector_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Barfecgen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Barser", gxTv_SdtSDTProduccionLector_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtSDTProduccionLector_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtdsc", gxTv_SdtSDTProduccionLector_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtSDTProduccionLector_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColDsc", gxTv_SdtSDTProduccionLector_Tipcoldsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IntDsc", gxTv_SdtSDTProduccionLector_Intdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomcli", gxTv_SdtSDTProduccionLector_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNumcli", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Barnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bardibcli", gxTv_SdtSDTProduccionLector_Bardibcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bardibint", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Bardibint, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcod", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParCodNom", gxTv_SdtSDTProduccionLector_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeNom", gxTv_SdtSDTProduccionLector_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtSDTProduccionLector_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tinte", gxTv_SdtSDTProduccionLector_Tinte);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTProduccionLector_Hisprodti) && ( gxTv_SdtSDTProduccionLector_Hisprodti_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTProduccionLector_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTProduccionLector_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTProduccionLector_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTProduccionLector_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTProduccionLector_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTProduccionLector_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTProduccionLector_Hisprodtf) && ( gxTv_SdtSDTProduccionLector_Hisprodtf_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTProduccionLector_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTProduccionLector_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTProduccionLector_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTProduccionLector_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTProduccionLector_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTProduccionLector_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodtf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Hisprof", gxTv_SdtSDTProduccionLector_Hisprof);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTur", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Hisprotur, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionLector_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionLector_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tiempom", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionLector_Tiempom, 4, 0)));
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
      AddObjectProperty("MaqCod", gxTv_SdtSDTProduccionLector_Maqcod, false, false);
      AddObjectProperty("Maqdsc", gxTv_SdtSDTProduccionLector_Maqdsc, false, false);
      AddObjectProperty("BarencCli", gxTv_SdtSDTProduccionLector_Barenccli, false, false);
      AddObjectProperty("BarNhdr", gxTv_SdtSDTProduccionLector_Barnhdr, false, false);
      AddObjectProperty("Clicod", gxTv_SdtSDTProduccionLector_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTProduccionLector_Clinom, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTProduccionLector_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTProduccionLector_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTProduccionLector_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Barfecgen", sDateCnv, false, false);
      AddObjectProperty("Barser", gxTv_SdtSDTProduccionLector_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtSDTProduccionLector_Barserdsc, false, false);
      AddObjectProperty("TipArtdsc", gxTv_SdtSDTProduccionLector_Tipartdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtSDTProduccionLector_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtSDTProduccionLector_Barcolnum, false, false);
      AddObjectProperty("TipColDsc", gxTv_SdtSDTProduccionLector_Tipcoldsc, false, false);
      AddObjectProperty("IntDsc", gxTv_SdtSDTProduccionLector_Intdsc, false, false);
      AddObjectProperty("BarNomcli", gxTv_SdtSDTProduccionLector_Barnomcli, false, false);
      AddObjectProperty("BarNumcli", gxTv_SdtSDTProduccionLector_Barnumcli, false, false);
      AddObjectProperty("Bardibcli", gxTv_SdtSDTProduccionLector_Bardibcli, false, false);
      AddObjectProperty("Bardibint", gxTv_SdtSDTProduccionLector_Bardibint, false, false);
      AddObjectProperty("Parcod", gxTv_SdtSDTProduccionLector_Parcod, false, false);
      AddObjectProperty("ParCodNom", gxTv_SdtSDTProduccionLector_Parcodnom, false, false);
      AddObjectProperty("OpeNom", gxTv_SdtSDTProduccionLector_Openom, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtSDTProduccionLector_Fasdsc, false, false);
      AddObjectProperty("Tinte", gxTv_SdtSDTProduccionLector_Tinte, false, false);
      datetime_STZ = gxTv_SdtSDTProduccionLector_Hisprodti ;
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
      datetime_STZ = gxTv_SdtSDTProduccionLector_Hisprodtf ;
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
      AddObjectProperty("Hisprof", gxTv_SdtSDTProduccionLector_Hisprof, false, false);
      AddObjectProperty("HisProTur", gxTv_SdtSDTProduccionLector_Hisprotur, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTProduccionLector_Hisprokgr, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTProduccionLector_Hispromtr, false, false);
      AddObjectProperty("Tiempom", gxTv_SdtSDTProduccionLector_Tiempom, false, false);
   }

   public String getgxTv_SdtSDTProduccionLector_Maqcod( )
   {
      return gxTv_SdtSDTProduccionLector_Maqcod ;
   }

   public void setgxTv_SdtSDTProduccionLector_Maqcod( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Maqcod = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Maqdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Maqdsc ;
   }

   public void setgxTv_SdtSDTProduccionLector_Maqdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Maqdsc = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Barenccli( )
   {
      return gxTv_SdtSDTProduccionLector_Barenccli ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barenccli( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barenccli = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Barnhdr( )
   {
      return gxTv_SdtSDTProduccionLector_Barnhdr ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barnhdr( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barnhdr = value ;
   }

   public int getgxTv_SdtSDTProduccionLector_Clicod( )
   {
      return gxTv_SdtSDTProduccionLector_Clicod ;
   }

   public void setgxTv_SdtSDTProduccionLector_Clicod( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Clicod = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Clinom( )
   {
      return gxTv_SdtSDTProduccionLector_Clinom ;
   }

   public void setgxTv_SdtSDTProduccionLector_Clinom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Clinom = value ;
   }

   public java.util.Date getgxTv_SdtSDTProduccionLector_Barfecgen( )
   {
      return gxTv_SdtSDTProduccionLector_Barfecgen ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barfecgen( java.util.Date value )
   {
      gxTv_SdtSDTProduccionLector_Barfecgen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barfecgen = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Barser( )
   {
      return gxTv_SdtSDTProduccionLector_Barser ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barser( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barser = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Barserdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Barserdsc ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barserdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barserdsc = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Tipartdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Tipartdsc ;
   }

   public void setgxTv_SdtSDTProduccionLector_Tipartdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tipartdsc = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Barcolnom( )
   {
      return gxTv_SdtSDTProduccionLector_Barcolnom ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barcolnom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barcolnom = value ;
   }

   public int getgxTv_SdtSDTProduccionLector_Barcolnum( )
   {
      return gxTv_SdtSDTProduccionLector_Barcolnum ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barcolnum( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barcolnum = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Tipcoldsc( )
   {
      return gxTv_SdtSDTProduccionLector_Tipcoldsc ;
   }

   public void setgxTv_SdtSDTProduccionLector_Tipcoldsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tipcoldsc = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Intdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Intdsc ;
   }

   public void setgxTv_SdtSDTProduccionLector_Intdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Intdsc = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Barnomcli( )
   {
      return gxTv_SdtSDTProduccionLector_Barnomcli ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barnomcli( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barnomcli = value ;
   }

   public int getgxTv_SdtSDTProduccionLector_Barnumcli( )
   {
      return gxTv_SdtSDTProduccionLector_Barnumcli ;
   }

   public void setgxTv_SdtSDTProduccionLector_Barnumcli( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barnumcli = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Bardibcli( )
   {
      return gxTv_SdtSDTProduccionLector_Bardibcli ;
   }

   public void setgxTv_SdtSDTProduccionLector_Bardibcli( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Bardibcli = value ;
   }

   public int getgxTv_SdtSDTProduccionLector_Bardibint( )
   {
      return gxTv_SdtSDTProduccionLector_Bardibint ;
   }

   public void setgxTv_SdtSDTProduccionLector_Bardibint( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Bardibint = value ;
   }

   public short getgxTv_SdtSDTProduccionLector_Parcod( )
   {
      return gxTv_SdtSDTProduccionLector_Parcod ;
   }

   public void setgxTv_SdtSDTProduccionLector_Parcod( short value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Parcod = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Parcodnom( )
   {
      return gxTv_SdtSDTProduccionLector_Parcodnom ;
   }

   public void setgxTv_SdtSDTProduccionLector_Parcodnom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Parcodnom = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Openom( )
   {
      return gxTv_SdtSDTProduccionLector_Openom ;
   }

   public void setgxTv_SdtSDTProduccionLector_Openom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Openom = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Fasdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Fasdsc ;
   }

   public void setgxTv_SdtSDTProduccionLector_Fasdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Fasdsc = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Tinte( )
   {
      return gxTv_SdtSDTProduccionLector_Tinte ;
   }

   public void setgxTv_SdtSDTProduccionLector_Tinte( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tinte = value ;
   }

   public java.util.Date getgxTv_SdtSDTProduccionLector_Hisprodti( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprodti ;
   }

   public void setgxTv_SdtSDTProduccionLector_Hisprodti( java.util.Date value )
   {
      gxTv_SdtSDTProduccionLector_Hisprodti_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprodti = value ;
   }

   public java.util.Date getgxTv_SdtSDTProduccionLector_Hisprodtf( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprodtf ;
   }

   public void setgxTv_SdtSDTProduccionLector_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTProduccionLector_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprodtf = value ;
   }

   public String getgxTv_SdtSDTProduccionLector_Hisprof( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprof ;
   }

   public void setgxTv_SdtSDTProduccionLector_Hisprof( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprof = value ;
   }

   public byte getgxTv_SdtSDTProduccionLector_Hisprotur( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprotur ;
   }

   public void setgxTv_SdtSDTProduccionLector_Hisprotur( byte value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprotur = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionLector_Hisprokgr( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprokgr ;
   }

   public void setgxTv_SdtSDTProduccionLector_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionLector_Hispromtr( )
   {
      return gxTv_SdtSDTProduccionLector_Hispromtr ;
   }

   public void setgxTv_SdtSDTProduccionLector_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hispromtr = value ;
   }

   public short getgxTv_SdtSDTProduccionLector_Tiempom( )
   {
      return gxTv_SdtSDTProduccionLector_Tiempom ;
   }

   public void setgxTv_SdtSDTProduccionLector_Tiempom( short value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tiempom = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionLector_Maqcod = "" ;
      gxTv_SdtSDTProduccionLector_N = (byte)(1) ;
      gxTv_SdtSDTProduccionLector_Maqdsc = "" ;
      gxTv_SdtSDTProduccionLector_Barenccli = "" ;
      gxTv_SdtSDTProduccionLector_Barnhdr = "" ;
      gxTv_SdtSDTProduccionLector_Clinom = "" ;
      gxTv_SdtSDTProduccionLector_Barfecgen = GXutil.nullDate() ;
      gxTv_SdtSDTProduccionLector_Barfecgen_N = (byte)(1) ;
      gxTv_SdtSDTProduccionLector_Barser = "" ;
      gxTv_SdtSDTProduccionLector_Barserdsc = "" ;
      gxTv_SdtSDTProduccionLector_Tipartdsc = "" ;
      gxTv_SdtSDTProduccionLector_Barcolnom = "" ;
      gxTv_SdtSDTProduccionLector_Tipcoldsc = "" ;
      gxTv_SdtSDTProduccionLector_Intdsc = "" ;
      gxTv_SdtSDTProduccionLector_Barnomcli = "" ;
      gxTv_SdtSDTProduccionLector_Bardibcli = "" ;
      gxTv_SdtSDTProduccionLector_Parcodnom = "" ;
      gxTv_SdtSDTProduccionLector_Openom = "" ;
      gxTv_SdtSDTProduccionLector_Fasdsc = "" ;
      gxTv_SdtSDTProduccionLector_Tinte = "" ;
      gxTv_SdtSDTProduccionLector_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTProduccionLector_Hisprodti_N = (byte)(1) ;
      gxTv_SdtSDTProduccionLector_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTProduccionLector_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTProduccionLector_Hisprof = "" ;
      gxTv_SdtSDTProduccionLector_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTProduccionLector_Hispromtr = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionLector_N ;
   }

   public app.SdtSDTProduccionLector Clone( )
   {
      return (app.SdtSDTProduccionLector)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionLector struct )
   {
      setgxTv_SdtSDTProduccionLector_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTProduccionLector_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDTProduccionLector_Barenccli(struct.getBarenccli());
      setgxTv_SdtSDTProduccionLector_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtSDTProduccionLector_Clicod(struct.getClicod());
      setgxTv_SdtSDTProduccionLector_Clinom(struct.getClinom());
      if ( struct.gxTv_SdtSDTProduccionLector_Barfecgen_N == 0 )
      {
         setgxTv_SdtSDTProduccionLector_Barfecgen(struct.getBarfecgen());
      }
      setgxTv_SdtSDTProduccionLector_Barser(struct.getBarser());
      setgxTv_SdtSDTProduccionLector_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtSDTProduccionLector_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtSDTProduccionLector_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDTProduccionLector_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtSDTProduccionLector_Tipcoldsc(struct.getTipcoldsc());
      setgxTv_SdtSDTProduccionLector_Intdsc(struct.getIntdsc());
      setgxTv_SdtSDTProduccionLector_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtSDTProduccionLector_Barnumcli(struct.getBarnumcli());
      setgxTv_SdtSDTProduccionLector_Bardibcli(struct.getBardibcli());
      setgxTv_SdtSDTProduccionLector_Bardibint(struct.getBardibint());
      setgxTv_SdtSDTProduccionLector_Parcod(struct.getParcod());
      setgxTv_SdtSDTProduccionLector_Parcodnom(struct.getParcodnom());
      setgxTv_SdtSDTProduccionLector_Openom(struct.getOpenom());
      setgxTv_SdtSDTProduccionLector_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSDTProduccionLector_Tinte(struct.getTinte());
      if ( struct.gxTv_SdtSDTProduccionLector_Hisprodti_N == 0 )
      {
         setgxTv_SdtSDTProduccionLector_Hisprodti(struct.getHisprodti());
      }
      if ( struct.gxTv_SdtSDTProduccionLector_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTProduccionLector_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTProduccionLector_Hisprof(struct.getHisprof());
      setgxTv_SdtSDTProduccionLector_Hisprotur(struct.getHisprotur());
      setgxTv_SdtSDTProduccionLector_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTProduccionLector_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTProduccionLector_Tiempom(struct.getTiempom());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionLector getStruct( )
   {
      app.StructSdtSDTProduccionLector struct = new app.StructSdtSDTProduccionLector ();
      struct.setMaqcod(getgxTv_SdtSDTProduccionLector_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTProduccionLector_Maqdsc());
      struct.setBarenccli(getgxTv_SdtSDTProduccionLector_Barenccli());
      struct.setBarnhdr(getgxTv_SdtSDTProduccionLector_Barnhdr());
      struct.setClicod(getgxTv_SdtSDTProduccionLector_Clicod());
      struct.setClinom(getgxTv_SdtSDTProduccionLector_Clinom());
      if ( gxTv_SdtSDTProduccionLector_Barfecgen_N == 0 )
      {
         struct.setBarfecgen(getgxTv_SdtSDTProduccionLector_Barfecgen());
      }
      struct.setBarser(getgxTv_SdtSDTProduccionLector_Barser());
      struct.setBarserdsc(getgxTv_SdtSDTProduccionLector_Barserdsc());
      struct.setTipartdsc(getgxTv_SdtSDTProduccionLector_Tipartdsc());
      struct.setBarcolnom(getgxTv_SdtSDTProduccionLector_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtSDTProduccionLector_Barcolnum());
      struct.setTipcoldsc(getgxTv_SdtSDTProduccionLector_Tipcoldsc());
      struct.setIntdsc(getgxTv_SdtSDTProduccionLector_Intdsc());
      struct.setBarnomcli(getgxTv_SdtSDTProduccionLector_Barnomcli());
      struct.setBarnumcli(getgxTv_SdtSDTProduccionLector_Barnumcli());
      struct.setBardibcli(getgxTv_SdtSDTProduccionLector_Bardibcli());
      struct.setBardibint(getgxTv_SdtSDTProduccionLector_Bardibint());
      struct.setParcod(getgxTv_SdtSDTProduccionLector_Parcod());
      struct.setParcodnom(getgxTv_SdtSDTProduccionLector_Parcodnom());
      struct.setOpenom(getgxTv_SdtSDTProduccionLector_Openom());
      struct.setFasdsc(getgxTv_SdtSDTProduccionLector_Fasdsc());
      struct.setTinte(getgxTv_SdtSDTProduccionLector_Tinte());
      if ( gxTv_SdtSDTProduccionLector_Hisprodti_N == 0 )
      {
         struct.setHisprodti(getgxTv_SdtSDTProduccionLector_Hisprodti());
      }
      if ( gxTv_SdtSDTProduccionLector_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTProduccionLector_Hisprodtf());
      }
      struct.setHisprof(getgxTv_SdtSDTProduccionLector_Hisprof());
      struct.setHisprotur(getgxTv_SdtSDTProduccionLector_Hisprotur());
      struct.setHisprokgr(getgxTv_SdtSDTProduccionLector_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtSDTProduccionLector_Hispromtr());
      struct.setTiempom(getgxTv_SdtSDTProduccionLector_Tiempom());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionLector_N ;
   protected byte gxTv_SdtSDTProduccionLector_Barfecgen_N ;
   protected byte gxTv_SdtSDTProduccionLector_Hisprodti_N ;
   protected byte gxTv_SdtSDTProduccionLector_Hisprodtf_N ;
   protected byte gxTv_SdtSDTProduccionLector_Hisprotur ;
   protected short gxTv_SdtSDTProduccionLector_Parcod ;
   protected short gxTv_SdtSDTProduccionLector_Tiempom ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTProduccionLector_Clicod ;
   protected int gxTv_SdtSDTProduccionLector_Barcolnum ;
   protected int gxTv_SdtSDTProduccionLector_Barnumcli ;
   protected int gxTv_SdtSDTProduccionLector_Bardibint ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionLector_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionLector_Hispromtr ;
   protected String gxTv_SdtSDTProduccionLector_Maqcod ;
   protected String gxTv_SdtSDTProduccionLector_Maqdsc ;
   protected String gxTv_SdtSDTProduccionLector_Barenccli ;
   protected String gxTv_SdtSDTProduccionLector_Barnhdr ;
   protected String gxTv_SdtSDTProduccionLector_Clinom ;
   protected String gxTv_SdtSDTProduccionLector_Barser ;
   protected String gxTv_SdtSDTProduccionLector_Barserdsc ;
   protected String gxTv_SdtSDTProduccionLector_Tipartdsc ;
   protected String gxTv_SdtSDTProduccionLector_Barcolnom ;
   protected String gxTv_SdtSDTProduccionLector_Tipcoldsc ;
   protected String gxTv_SdtSDTProduccionLector_Intdsc ;
   protected String gxTv_SdtSDTProduccionLector_Barnomcli ;
   protected String gxTv_SdtSDTProduccionLector_Bardibcli ;
   protected String gxTv_SdtSDTProduccionLector_Parcodnom ;
   protected String gxTv_SdtSDTProduccionLector_Openom ;
   protected String gxTv_SdtSDTProduccionLector_Fasdsc ;
   protected String gxTv_SdtSDTProduccionLector_Tinte ;
   protected String gxTv_SdtSDTProduccionLector_Hisprof ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTProduccionLector_Hisprodti ;
   protected java.util.Date gxTv_SdtSDTProduccionLector_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSDTProduccionLector_Barfecgen ;
   protected boolean readElement ;
   protected boolean formatError ;
}

