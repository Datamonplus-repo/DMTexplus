package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHdrsaReoperar extends GxUserType
{
   public SdtSDTHdrsaReoperar( )
   {
      this(  new ModelContext(SdtSDTHdrsaReoperar.class));
   }

   public SdtSDTHdrsaReoperar( ModelContext context )
   {
      super( context, "SdtSDTHdrsaReoperar");
   }

   public SdtSDTHdrsaReoperar( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHdrsaReoperar");
   }

   public SdtSDTHdrsaReoperar( StructSdtSDTHdrsaReoperar struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNHdr") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecGen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTHdrsaReoperar_Barfecgen = GXutil.nullDate() ;
                  gxTv_SdtSDTHdrsaReoperar_Barfecgen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTHdrsaReoperar_Barfecgen_N = (byte)(0) ;
                  gxTv_SdtSDTHdrsaReoperar_Barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDTHdrsaReoperar_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTHdrsaReoperar_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSer") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSerDsc") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipArt") )
            {
               gxTv_SdtSDTHdrsaReoperar_Bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtSDTHdrsaReoperar_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNum") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipCol") )
            {
               gxTv_SdtSDTHdrsaReoperar_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomCli") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarKgm") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarMtr") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPie") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSit") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barsit = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrest") )
            {
               gxTv_SdtSDTHdrsaReoperar_Baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUnimed") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RcTinte") )
            {
               gxTv_SdtSDTHdrsaReoperar_Rctinte = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RcAcabado") )
            {
               gxTv_SdtSDTHdrsaReoperar_Rcacabado = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarConReo") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barconreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Discod") )
            {
               gxTv_SdtSDTHdrsaReoperar_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCospro") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcospro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCosAny") )
            {
               gxTv_SdtSDTHdrsaReoperar_Barcosany = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDes") )
            {
               gxTv_SdtSDTHdrsaReoperar_Disdes = oReader.getValue() ;
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
         sName = "SDTHdrsaReoperar" ;
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
      oWriter.writeElement("BarNHdr", gxTv_SdtSDTHdrsaReoperar_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTHdrsaReoperar_Barfecgen)) && ( gxTv_SdtSDTHdrsaReoperar_Barfecgen_N == 1 ) )
      {
         oWriter.writeElement("BarFecGen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTHdrsaReoperar_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTHdrsaReoperar_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTHdrsaReoperar_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecGen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTHdrsaReoperar_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSer", gxTv_SdtSDTHdrsaReoperar_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSerDsc", gxTv_SdtSDTHdrsaReoperar_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipArt", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtSDTHdrsaReoperar_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtSDTHdrsaReoperar_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNum", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipCol", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomCli", gxTv_SdtSDTHdrsaReoperar_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsaReoperar_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsaReoperar_Barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPie", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSit", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Barsit, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrest", gxTv_SdtSDTHdrsaReoperar_Baragrest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUnimed", gxTv_SdtSDTHdrsaReoperar_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RcTinte", GXutil.booltostr( gxTv_SdtSDTHdrsaReoperar_Rctinte));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RcAcabado", GXutil.booltostr( gxTv_SdtSDTHdrsaReoperar_Rcacabado));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtSDTHdrsaReoperar_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarConReo", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Barconreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Discod", GXutil.trim( GXutil.str( gxTv_SdtSDTHdrsaReoperar_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCospro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsaReoperar_Barcospro, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCosAny", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHdrsaReoperar_Barcosany, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDes", gxTv_SdtSDTHdrsaReoperar_Disdes);
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
      AddObjectProperty("BarNHdr", gxTv_SdtSDTHdrsaReoperar_Barnhdr, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTHdrsaReoperar_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTHdrsaReoperar_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTHdrsaReoperar_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecGen", sDateCnv, false, false);
      AddObjectProperty("CliCod", gxTv_SdtSDTHdrsaReoperar_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTHdrsaReoperar_Clinom, false, false);
      AddObjectProperty("BarSer", gxTv_SdtSDTHdrsaReoperar_Barser, false, false);
      AddObjectProperty("BarSerDsc", gxTv_SdtSDTHdrsaReoperar_Barserdsc, false, false);
      AddObjectProperty("BarTipArt", gxTv_SdtSDTHdrsaReoperar_Bartipart, false, false);
      AddObjectProperty("TipArtDsc", gxTv_SdtSDTHdrsaReoperar_Tipartdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtSDTHdrsaReoperar_Barcolnom, false, false);
      AddObjectProperty("BarColNum", gxTv_SdtSDTHdrsaReoperar_Barcolnum, false, false);
      AddObjectProperty("BarTipCol", gxTv_SdtSDTHdrsaReoperar_Bartipcol, false, false);
      AddObjectProperty("BarNomCli", gxTv_SdtSDTHdrsaReoperar_Barnomcli, false, false);
      AddObjectProperty("BarKgm", gxTv_SdtSDTHdrsaReoperar_Barkgm, false, false);
      AddObjectProperty("BarMtr", gxTv_SdtSDTHdrsaReoperar_Barmtr, false, false);
      AddObjectProperty("BarPie", gxTv_SdtSDTHdrsaReoperar_Barpie, false, false);
      AddObjectProperty("BarSit", gxTv_SdtSDTHdrsaReoperar_Barsit, false, false);
      AddObjectProperty("BarAgrest", gxTv_SdtSDTHdrsaReoperar_Baragrest, false, false);
      AddObjectProperty("BarUnimed", gxTv_SdtSDTHdrsaReoperar_Barunimed, false, false);
      AddObjectProperty("RcTinte", gxTv_SdtSDTHdrsaReoperar_Rctinte, false, false);
      AddObjectProperty("RcAcabado", gxTv_SdtSDTHdrsaReoperar_Rcacabado, false, false);
      AddObjectProperty("Barcod", gxTv_SdtSDTHdrsaReoperar_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtSDTHdrsaReoperar_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtSDTHdrsaReoperar_Barcodpar, false, false);
      AddObjectProperty("BarConReo", gxTv_SdtSDTHdrsaReoperar_Barconreo, false, false);
      AddObjectProperty("Discod", gxTv_SdtSDTHdrsaReoperar_Discod, false, false);
      AddObjectProperty("BarCospro", gxTv_SdtSDTHdrsaReoperar_Barcospro, false, false);
      AddObjectProperty("BarCosAny", gxTv_SdtSDTHdrsaReoperar_Barcosany, false, false);
      AddObjectProperty("DisDes", gxTv_SdtSDTHdrsaReoperar_Disdes, false, false);
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barnhdr( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barnhdr ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barnhdr( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barnhdr = value ;
   }

   public java.util.Date getgxTv_SdtSDTHdrsaReoperar_Barfecgen( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barfecgen ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barfecgen( java.util.Date value )
   {
      gxTv_SdtSDTHdrsaReoperar_Barfecgen_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barfecgen = value ;
   }

   public int getgxTv_SdtSDTHdrsaReoperar_Clicod( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Clicod ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Clicod( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Clicod = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Clinom( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Clinom ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Clinom( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Clinom = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barser( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barser ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barser( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barser = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barserdsc( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barserdsc ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barserdsc( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barserdsc = value ;
   }

   public short getgxTv_SdtSDTHdrsaReoperar_Bartipart( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Bartipart ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Bartipart( short value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Bartipart = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Tipartdsc( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Tipartdsc ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Tipartdsc( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Tipartdsc = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barcolnom( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcolnom ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcolnom( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcolnom = value ;
   }

   public int getgxTv_SdtSDTHdrsaReoperar_Barcolnum( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcolnum ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcolnum( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcolnum = value ;
   }

   public byte getgxTv_SdtSDTHdrsaReoperar_Bartipcol( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Bartipcol ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Bartipcol( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Bartipcol = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barnomcli( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barnomcli ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barnomcli( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barnomcli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsaReoperar_Barkgm( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barkgm ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsaReoperar_Barmtr( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barmtr ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barmtr = value ;
   }

   public int getgxTv_SdtSDTHdrsaReoperar_Barpie( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barpie ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barpie( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barpie = value ;
   }

   public byte getgxTv_SdtSDTHdrsaReoperar_Barsit( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barsit ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barsit( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barsit = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Baragrest( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Baragrest ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Baragrest( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Baragrest = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barunimed( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barunimed ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barunimed( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barunimed = value ;
   }

   public boolean getgxTv_SdtSDTHdrsaReoperar_Rctinte( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Rctinte ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Rctinte( boolean value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Rctinte = value ;
   }

   public boolean getgxTv_SdtSDTHdrsaReoperar_Rcacabado( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Rcacabado ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Rcacabado( boolean value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Rcacabado = value ;
   }

   public int getgxTv_SdtSDTHdrsaReoperar_Barcod( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcod ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcod( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcod = value ;
   }

   public byte getgxTv_SdtSDTHdrsaReoperar_Barcodreo( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcodreo ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcodreo( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcodreo = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Barcodpar( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcodpar ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcodpar( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcodpar = value ;
   }

   public byte getgxTv_SdtSDTHdrsaReoperar_Barconreo( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barconreo ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barconreo( byte value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barconreo = value ;
   }

   public int getgxTv_SdtSDTHdrsaReoperar_Discod( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Discod ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Discod( int value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Discod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsaReoperar_Barcospro( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcospro ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcospro = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHdrsaReoperar_Barcosany( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Barcosany ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Barcosany( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Barcosany = value ;
   }

   public String getgxTv_SdtSDTHdrsaReoperar_Disdes( )
   {
      return gxTv_SdtSDTHdrsaReoperar_Disdes ;
   }

   public void setgxTv_SdtSDTHdrsaReoperar_Disdes( String value )
   {
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTHdrsaReoperar_Disdes = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHdrsaReoperar_Barnhdr = "" ;
      gxTv_SdtSDTHdrsaReoperar_N = (byte)(1) ;
      gxTv_SdtSDTHdrsaReoperar_Barfecgen = GXutil.nullDate() ;
      gxTv_SdtSDTHdrsaReoperar_Barfecgen_N = (byte)(1) ;
      gxTv_SdtSDTHdrsaReoperar_Clinom = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barser = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barserdsc = "" ;
      gxTv_SdtSDTHdrsaReoperar_Tipartdsc = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barcolnom = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barnomcli = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTHdrsaReoperar_Barmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTHdrsaReoperar_Baragrest = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barunimed = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barcodpar = "" ;
      gxTv_SdtSDTHdrsaReoperar_Barcospro = DecimalUtil.ZERO ;
      gxTv_SdtSDTHdrsaReoperar_Barcosany = DecimalUtil.ZERO ;
      gxTv_SdtSDTHdrsaReoperar_Disdes = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHdrsaReoperar_N ;
   }

   public app.SdtSDTHdrsaReoperar Clone( )
   {
      return (app.SdtSDTHdrsaReoperar)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHdrsaReoperar struct )
   {
      setgxTv_SdtSDTHdrsaReoperar_Barnhdr(struct.getBarnhdr());
      if ( struct.gxTv_SdtSDTHdrsaReoperar_Barfecgen_N == 0 )
      {
         setgxTv_SdtSDTHdrsaReoperar_Barfecgen(struct.getBarfecgen());
      }
      setgxTv_SdtSDTHdrsaReoperar_Clicod(struct.getClicod());
      setgxTv_SdtSDTHdrsaReoperar_Clinom(struct.getClinom());
      setgxTv_SdtSDTHdrsaReoperar_Barser(struct.getBarser());
      setgxTv_SdtSDTHdrsaReoperar_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtSDTHdrsaReoperar_Bartipart(struct.getBartipart());
      setgxTv_SdtSDTHdrsaReoperar_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtSDTHdrsaReoperar_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDTHdrsaReoperar_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtSDTHdrsaReoperar_Bartipcol(struct.getBartipcol());
      setgxTv_SdtSDTHdrsaReoperar_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtSDTHdrsaReoperar_Barkgm(struct.getBarkgm());
      setgxTv_SdtSDTHdrsaReoperar_Barmtr(struct.getBarmtr());
      setgxTv_SdtSDTHdrsaReoperar_Barpie(struct.getBarpie());
      setgxTv_SdtSDTHdrsaReoperar_Barsit(struct.getBarsit());
      setgxTv_SdtSDTHdrsaReoperar_Baragrest(struct.getBaragrest());
      setgxTv_SdtSDTHdrsaReoperar_Barunimed(struct.getBarunimed());
      setgxTv_SdtSDTHdrsaReoperar_Rctinte(struct.getRctinte());
      setgxTv_SdtSDTHdrsaReoperar_Rcacabado(struct.getRcacabado());
      setgxTv_SdtSDTHdrsaReoperar_Barcod(struct.getBarcod());
      setgxTv_SdtSDTHdrsaReoperar_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtSDTHdrsaReoperar_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtSDTHdrsaReoperar_Barconreo(struct.getBarconreo());
      setgxTv_SdtSDTHdrsaReoperar_Discod(struct.getDiscod());
      setgxTv_SdtSDTHdrsaReoperar_Barcospro(struct.getBarcospro());
      setgxTv_SdtSDTHdrsaReoperar_Barcosany(struct.getBarcosany());
      setgxTv_SdtSDTHdrsaReoperar_Disdes(struct.getDisdes());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHdrsaReoperar getStruct( )
   {
      app.StructSdtSDTHdrsaReoperar struct = new app.StructSdtSDTHdrsaReoperar ();
      struct.setBarnhdr(getgxTv_SdtSDTHdrsaReoperar_Barnhdr());
      if ( gxTv_SdtSDTHdrsaReoperar_Barfecgen_N == 0 )
      {
         struct.setBarfecgen(getgxTv_SdtSDTHdrsaReoperar_Barfecgen());
      }
      struct.setClicod(getgxTv_SdtSDTHdrsaReoperar_Clicod());
      struct.setClinom(getgxTv_SdtSDTHdrsaReoperar_Clinom());
      struct.setBarser(getgxTv_SdtSDTHdrsaReoperar_Barser());
      struct.setBarserdsc(getgxTv_SdtSDTHdrsaReoperar_Barserdsc());
      struct.setBartipart(getgxTv_SdtSDTHdrsaReoperar_Bartipart());
      struct.setTipartdsc(getgxTv_SdtSDTHdrsaReoperar_Tipartdsc());
      struct.setBarcolnom(getgxTv_SdtSDTHdrsaReoperar_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtSDTHdrsaReoperar_Barcolnum());
      struct.setBartipcol(getgxTv_SdtSDTHdrsaReoperar_Bartipcol());
      struct.setBarnomcli(getgxTv_SdtSDTHdrsaReoperar_Barnomcli());
      struct.setBarkgm(getgxTv_SdtSDTHdrsaReoperar_Barkgm());
      struct.setBarmtr(getgxTv_SdtSDTHdrsaReoperar_Barmtr());
      struct.setBarpie(getgxTv_SdtSDTHdrsaReoperar_Barpie());
      struct.setBarsit(getgxTv_SdtSDTHdrsaReoperar_Barsit());
      struct.setBaragrest(getgxTv_SdtSDTHdrsaReoperar_Baragrest());
      struct.setBarunimed(getgxTv_SdtSDTHdrsaReoperar_Barunimed());
      struct.setRctinte(getgxTv_SdtSDTHdrsaReoperar_Rctinte());
      struct.setRcacabado(getgxTv_SdtSDTHdrsaReoperar_Rcacabado());
      struct.setBarcod(getgxTv_SdtSDTHdrsaReoperar_Barcod());
      struct.setBarcodreo(getgxTv_SdtSDTHdrsaReoperar_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtSDTHdrsaReoperar_Barcodpar());
      struct.setBarconreo(getgxTv_SdtSDTHdrsaReoperar_Barconreo());
      struct.setDiscod(getgxTv_SdtSDTHdrsaReoperar_Discod());
      struct.setBarcospro(getgxTv_SdtSDTHdrsaReoperar_Barcospro());
      struct.setBarcosany(getgxTv_SdtSDTHdrsaReoperar_Barcosany());
      struct.setDisdes(getgxTv_SdtSDTHdrsaReoperar_Disdes());
      return struct ;
   }

   protected byte gxTv_SdtSDTHdrsaReoperar_N ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barfecgen_N ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Bartipcol ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barsit ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barcodreo ;
   protected byte gxTv_SdtSDTHdrsaReoperar_Barconreo ;
   protected short gxTv_SdtSDTHdrsaReoperar_Bartipart ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTHdrsaReoperar_Clicod ;
   protected int gxTv_SdtSDTHdrsaReoperar_Barcolnum ;
   protected int gxTv_SdtSDTHdrsaReoperar_Barpie ;
   protected int gxTv_SdtSDTHdrsaReoperar_Barcod ;
   protected int gxTv_SdtSDTHdrsaReoperar_Discod ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barcospro ;
   protected java.math.BigDecimal gxTv_SdtSDTHdrsaReoperar_Barcosany ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barnhdr ;
   protected String gxTv_SdtSDTHdrsaReoperar_Clinom ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barser ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barserdsc ;
   protected String gxTv_SdtSDTHdrsaReoperar_Tipartdsc ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barcolnom ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barnomcli ;
   protected String gxTv_SdtSDTHdrsaReoperar_Baragrest ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barunimed ;
   protected String gxTv_SdtSDTHdrsaReoperar_Barcodpar ;
   protected String gxTv_SdtSDTHdrsaReoperar_Disdes ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTHdrsaReoperar_Barfecgen ;
   protected boolean gxTv_SdtSDTHdrsaReoperar_Rctinte ;
   protected boolean gxTv_SdtSDTHdrsaReoperar_Rcacabado ;
   protected boolean readElement ;
   protected boolean formatError ;
}

