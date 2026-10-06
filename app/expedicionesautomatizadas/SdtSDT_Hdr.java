package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_Hdr extends GxUserType
{
   public SdtSDT_Hdr( )
   {
      this(  new ModelContext(SdtSDT_Hdr.class));
   }

   public SdtSDT_Hdr( ModelContext context )
   {
      super( context, "SdtSDT_Hdr");
   }

   public SdtSDT_Hdr( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_Hdr");
   }

   public SdtSDT_Hdr( StructSdtSDT_Hdr struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSDT_Hdr_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtSDT_Hdr_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtSDT_Hdr_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtSDT_Hdr_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDT_Hdr_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDT_Hdr_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod") )
            {
               gxTv_SdtSDT_Hdr_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDes") )
            {
               gxTv_SdtSDT_Hdr_Disdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSer") )
            {
               gxTv_SdtSDT_Hdr_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSerDsc") )
            {
               gxTv_SdtSDT_Hdr_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipArt") )
            {
               gxTv_SdtSDT_Hdr_Bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNum") )
            {
               gxTv_SdtSDT_Hdr_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNom") )
            {
               gxTv_SdtSDT_Hdr_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomCli") )
            {
               gxTv_SdtSDT_Hdr_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipCol") )
            {
               gxTv_SdtSDT_Hdr_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtSDT_Hdr_Barfecgen = GXutil.nullDate() ;
                  gxTv_SdtSDT_Hdr_Barfecgen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDT_Hdr_Barfecgen_N = (byte)(0) ;
                  gxTv_SdtSDT_Hdr_Barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarDisNum") )
            {
               gxTv_SdtSDT_Hdr_Bardisnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUniMed") )
            {
               gxTv_SdtSDT_Hdr_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAncAca1") )
            {
               gxTv_SdtSDT_Hdr_Barancaca1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarMtr") )
            {
               gxTv_SdtSDT_Hdr_Barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barkgm") )
            {
               gxTv_SdtSDT_Hdr_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPie") )
            {
               gxTv_SdtSDT_Hdr_Barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarGraAca") )
            {
               gxTv_SdtSDT_Hdr_Bargraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPes") )
            {
               gxTv_SdtSDT_Hdr_Barpes = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarRdt") )
            {
               gxTv_SdtSDT_Hdr_Barrdt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarHdr") )
            {
               gxTv_SdtSDT_Hdr_Barhdr = oReader.getValue() ;
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
         sName = "SDT_Hdr" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDT_Hdr_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtSDT_Hdr_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDT_Hdr_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCod", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDes", gxTv_SdtSDT_Hdr_Disdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSer", gxTv_SdtSDT_Hdr_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSerDsc", gxTv_SdtSDT_Hdr_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipArt", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNum", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNom", gxTv_SdtSDT_Hdr_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomCli", gxTv_SdtSDT_Hdr_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipCol", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDT_Hdr_Barfecgen)) && ( gxTv_SdtSDT_Hdr_Barfecgen_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDT_Hdr_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDT_Hdr_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDT_Hdr_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecGen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarDisNum", gxTv_SdtSDT_Hdr_Bardisnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUniMed", gxTv_SdtSDT_Hdr_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAncAca1", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Barancaca1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Hdr_Barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Hdr_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPie", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarGraAca", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Bargraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPes", GXutil.trim( GXutil.str( gxTv_SdtSDT_Hdr_Barpes, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarRdt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Hdr_Barrdt, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarHdr", gxTv_SdtSDT_Hdr_Barhdr);
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
      AddObjectProperty("EmprCod", gxTv_SdtSDT_Hdr_Emprcod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtSDT_Hdr_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtSDT_Hdr_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtSDT_Hdr_Barcodpar, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDT_Hdr_Clinom, false, false);
      AddObjectProperty("CliCod", gxTv_SdtSDT_Hdr_Clicod, false, false);
      AddObjectProperty("DisCod", gxTv_SdtSDT_Hdr_Discod, false, false);
      AddObjectProperty("DisDes", gxTv_SdtSDT_Hdr_Disdes, false, false);
      AddObjectProperty("BarSer", gxTv_SdtSDT_Hdr_Barser, false, false);
      AddObjectProperty("BarSerDsc", gxTv_SdtSDT_Hdr_Barserdsc, false, false);
      AddObjectProperty("BarTipArt", gxTv_SdtSDT_Hdr_Bartipart, false, false);
      AddObjectProperty("BarColNum", gxTv_SdtSDT_Hdr_Barcolnum, false, false);
      AddObjectProperty("BarColNom", gxTv_SdtSDT_Hdr_Barcolnom, false, false);
      AddObjectProperty("BarNomCli", gxTv_SdtSDT_Hdr_Barnomcli, false, false);
      AddObjectProperty("BarTipCol", gxTv_SdtSDT_Hdr_Bartipcol, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDT_Hdr_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDT_Hdr_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDT_Hdr_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecGen", sDateCnv, false, false);
      AddObjectProperty("BarDisNum", gxTv_SdtSDT_Hdr_Bardisnum, false, false);
      AddObjectProperty("BarUniMed", gxTv_SdtSDT_Hdr_Barunimed, false, false);
      AddObjectProperty("BarAncAca1", gxTv_SdtSDT_Hdr_Barancaca1, false, false);
      AddObjectProperty("BarMtr", gxTv_SdtSDT_Hdr_Barmtr, false, false);
      AddObjectProperty("Barkgm", gxTv_SdtSDT_Hdr_Barkgm, false, false);
      AddObjectProperty("BarPie", gxTv_SdtSDT_Hdr_Barpie, false, false);
      AddObjectProperty("BarGraAca", gxTv_SdtSDT_Hdr_Bargraaca, false, false);
      AddObjectProperty("BarPes", gxTv_SdtSDT_Hdr_Barpes, false, false);
      AddObjectProperty("BarRdt", gxTv_SdtSDT_Hdr_Barrdt, false, false);
      AddObjectProperty("BarHdr", gxTv_SdtSDT_Hdr_Barhdr, false, false);
   }

   public String getgxTv_SdtSDT_Hdr_Emprcod( )
   {
      return gxTv_SdtSDT_Hdr_Emprcod ;
   }

   public void setgxTv_SdtSDT_Hdr_Emprcod( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Emprcod = value ;
   }

   public int getgxTv_SdtSDT_Hdr_Barcod( )
   {
      return gxTv_SdtSDT_Hdr_Barcod ;
   }

   public void setgxTv_SdtSDT_Hdr_Barcod( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcod = value ;
   }

   public byte getgxTv_SdtSDT_Hdr_Barcodreo( )
   {
      return gxTv_SdtSDT_Hdr_Barcodreo ;
   }

   public void setgxTv_SdtSDT_Hdr_Barcodreo( byte value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcodreo = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barcodpar( )
   {
      return gxTv_SdtSDT_Hdr_Barcodpar ;
   }

   public void setgxTv_SdtSDT_Hdr_Barcodpar( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcodpar = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Clinom( )
   {
      return gxTv_SdtSDT_Hdr_Clinom ;
   }

   public void setgxTv_SdtSDT_Hdr_Clinom( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Clinom = value ;
   }

   public int getgxTv_SdtSDT_Hdr_Clicod( )
   {
      return gxTv_SdtSDT_Hdr_Clicod ;
   }

   public void setgxTv_SdtSDT_Hdr_Clicod( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Clicod = value ;
   }

   public int getgxTv_SdtSDT_Hdr_Discod( )
   {
      return gxTv_SdtSDT_Hdr_Discod ;
   }

   public void setgxTv_SdtSDT_Hdr_Discod( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Discod = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Disdes( )
   {
      return gxTv_SdtSDT_Hdr_Disdes ;
   }

   public void setgxTv_SdtSDT_Hdr_Disdes( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Disdes = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barser( )
   {
      return gxTv_SdtSDT_Hdr_Barser ;
   }

   public void setgxTv_SdtSDT_Hdr_Barser( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barser = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barserdsc( )
   {
      return gxTv_SdtSDT_Hdr_Barserdsc ;
   }

   public void setgxTv_SdtSDT_Hdr_Barserdsc( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barserdsc = value ;
   }

   public short getgxTv_SdtSDT_Hdr_Bartipart( )
   {
      return gxTv_SdtSDT_Hdr_Bartipart ;
   }

   public void setgxTv_SdtSDT_Hdr_Bartipart( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bartipart = value ;
   }

   public int getgxTv_SdtSDT_Hdr_Barcolnum( )
   {
      return gxTv_SdtSDT_Hdr_Barcolnum ;
   }

   public void setgxTv_SdtSDT_Hdr_Barcolnum( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcolnum = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barcolnom( )
   {
      return gxTv_SdtSDT_Hdr_Barcolnom ;
   }

   public void setgxTv_SdtSDT_Hdr_Barcolnom( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barcolnom = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barnomcli( )
   {
      return gxTv_SdtSDT_Hdr_Barnomcli ;
   }

   public void setgxTv_SdtSDT_Hdr_Barnomcli( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barnomcli = value ;
   }

   public byte getgxTv_SdtSDT_Hdr_Bartipcol( )
   {
      return gxTv_SdtSDT_Hdr_Bartipcol ;
   }

   public void setgxTv_SdtSDT_Hdr_Bartipcol( byte value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bartipcol = value ;
   }

   public java.util.Date getgxTv_SdtSDT_Hdr_Barfecgen( )
   {
      return gxTv_SdtSDT_Hdr_Barfecgen ;
   }

   public void setgxTv_SdtSDT_Hdr_Barfecgen( java.util.Date value )
   {
      gxTv_SdtSDT_Hdr_Barfecgen_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barfecgen = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Bardisnum( )
   {
      return gxTv_SdtSDT_Hdr_Bardisnum ;
   }

   public void setgxTv_SdtSDT_Hdr_Bardisnum( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bardisnum = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barunimed( )
   {
      return gxTv_SdtSDT_Hdr_Barunimed ;
   }

   public void setgxTv_SdtSDT_Hdr_Barunimed( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barunimed = value ;
   }

   public short getgxTv_SdtSDT_Hdr_Barancaca1( )
   {
      return gxTv_SdtSDT_Hdr_Barancaca1 ;
   }

   public void setgxTv_SdtSDT_Hdr_Barancaca1( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barancaca1 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Hdr_Barmtr( )
   {
      return gxTv_SdtSDT_Hdr_Barmtr ;
   }

   public void setgxTv_SdtSDT_Hdr_Barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barmtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Hdr_Barkgm( )
   {
      return gxTv_SdtSDT_Hdr_Barkgm ;
   }

   public void setgxTv_SdtSDT_Hdr_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barkgm = value ;
   }

   public int getgxTv_SdtSDT_Hdr_Barpie( )
   {
      return gxTv_SdtSDT_Hdr_Barpie ;
   }

   public void setgxTv_SdtSDT_Hdr_Barpie( int value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barpie = value ;
   }

   public short getgxTv_SdtSDT_Hdr_Bargraaca( )
   {
      return gxTv_SdtSDT_Hdr_Bargraaca ;
   }

   public void setgxTv_SdtSDT_Hdr_Bargraaca( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Bargraaca = value ;
   }

   public short getgxTv_SdtSDT_Hdr_Barpes( )
   {
      return gxTv_SdtSDT_Hdr_Barpes ;
   }

   public void setgxTv_SdtSDT_Hdr_Barpes( short value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barpes = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Hdr_Barrdt( )
   {
      return gxTv_SdtSDT_Hdr_Barrdt ;
   }

   public void setgxTv_SdtSDT_Hdr_Barrdt( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barrdt = value ;
   }

   public String getgxTv_SdtSDT_Hdr_Barhdr( )
   {
      return gxTv_SdtSDT_Hdr_Barhdr ;
   }

   public void setgxTv_SdtSDT_Hdr_Barhdr( String value )
   {
      gxTv_SdtSDT_Hdr_N = (byte)(0) ;
      gxTv_SdtSDT_Hdr_Barhdr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_Hdr_Emprcod = "" ;
      gxTv_SdtSDT_Hdr_N = (byte)(1) ;
      gxTv_SdtSDT_Hdr_Barcodpar = "" ;
      gxTv_SdtSDT_Hdr_Clinom = "" ;
      gxTv_SdtSDT_Hdr_Disdes = "" ;
      gxTv_SdtSDT_Hdr_Barser = "" ;
      gxTv_SdtSDT_Hdr_Barserdsc = "" ;
      gxTv_SdtSDT_Hdr_Barcolnom = "" ;
      gxTv_SdtSDT_Hdr_Barnomcli = "" ;
      gxTv_SdtSDT_Hdr_Barfecgen = GXutil.nullDate() ;
      gxTv_SdtSDT_Hdr_Barfecgen_N = (byte)(1) ;
      gxTv_SdtSDT_Hdr_Bardisnum = "" ;
      gxTv_SdtSDT_Hdr_Barunimed = "" ;
      gxTv_SdtSDT_Hdr_Barmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Hdr_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Hdr_Barrdt = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Hdr_Barhdr = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_Hdr_N ;
   }

   public app.expedicionesautomatizadas.SdtSDT_Hdr Clone( )
   {
      return (app.expedicionesautomatizadas.SdtSDT_Hdr)(clone()) ;
   }

   public void setStruct( app.expedicionesautomatizadas.StructSdtSDT_Hdr struct )
   {
      setgxTv_SdtSDT_Hdr_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDT_Hdr_Barcod(struct.getBarcod());
      setgxTv_SdtSDT_Hdr_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtSDT_Hdr_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtSDT_Hdr_Clinom(struct.getClinom());
      setgxTv_SdtSDT_Hdr_Clicod(struct.getClicod());
      setgxTv_SdtSDT_Hdr_Discod(struct.getDiscod());
      setgxTv_SdtSDT_Hdr_Disdes(struct.getDisdes());
      setgxTv_SdtSDT_Hdr_Barser(struct.getBarser());
      setgxTv_SdtSDT_Hdr_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtSDT_Hdr_Bartipart(struct.getBartipart());
      setgxTv_SdtSDT_Hdr_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtSDT_Hdr_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDT_Hdr_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtSDT_Hdr_Bartipcol(struct.getBartipcol());
      if ( struct.gxTv_SdtSDT_Hdr_Barfecgen_N == 0 )
      {
         setgxTv_SdtSDT_Hdr_Barfecgen(struct.getBarfecgen());
      }
      setgxTv_SdtSDT_Hdr_Bardisnum(struct.getBardisnum());
      setgxTv_SdtSDT_Hdr_Barunimed(struct.getBarunimed());
      setgxTv_SdtSDT_Hdr_Barancaca1(struct.getBarancaca1());
      setgxTv_SdtSDT_Hdr_Barmtr(struct.getBarmtr());
      setgxTv_SdtSDT_Hdr_Barkgm(struct.getBarkgm());
      setgxTv_SdtSDT_Hdr_Barpie(struct.getBarpie());
      setgxTv_SdtSDT_Hdr_Bargraaca(struct.getBargraaca());
      setgxTv_SdtSDT_Hdr_Barpes(struct.getBarpes());
      setgxTv_SdtSDT_Hdr_Barrdt(struct.getBarrdt());
      setgxTv_SdtSDT_Hdr_Barhdr(struct.getBarhdr());
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.StructSdtSDT_Hdr getStruct( )
   {
      app.expedicionesautomatizadas.StructSdtSDT_Hdr struct = new app.expedicionesautomatizadas.StructSdtSDT_Hdr ();
      struct.setEmprcod(getgxTv_SdtSDT_Hdr_Emprcod());
      struct.setBarcod(getgxTv_SdtSDT_Hdr_Barcod());
      struct.setBarcodreo(getgxTv_SdtSDT_Hdr_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtSDT_Hdr_Barcodpar());
      struct.setClinom(getgxTv_SdtSDT_Hdr_Clinom());
      struct.setClicod(getgxTv_SdtSDT_Hdr_Clicod());
      struct.setDiscod(getgxTv_SdtSDT_Hdr_Discod());
      struct.setDisdes(getgxTv_SdtSDT_Hdr_Disdes());
      struct.setBarser(getgxTv_SdtSDT_Hdr_Barser());
      struct.setBarserdsc(getgxTv_SdtSDT_Hdr_Barserdsc());
      struct.setBartipart(getgxTv_SdtSDT_Hdr_Bartipart());
      struct.setBarcolnum(getgxTv_SdtSDT_Hdr_Barcolnum());
      struct.setBarcolnom(getgxTv_SdtSDT_Hdr_Barcolnom());
      struct.setBarnomcli(getgxTv_SdtSDT_Hdr_Barnomcli());
      struct.setBartipcol(getgxTv_SdtSDT_Hdr_Bartipcol());
      if ( gxTv_SdtSDT_Hdr_Barfecgen_N == 0 )
      {
         struct.setBarfecgen(getgxTv_SdtSDT_Hdr_Barfecgen());
      }
      struct.setBardisnum(getgxTv_SdtSDT_Hdr_Bardisnum());
      struct.setBarunimed(getgxTv_SdtSDT_Hdr_Barunimed());
      struct.setBarancaca1(getgxTv_SdtSDT_Hdr_Barancaca1());
      struct.setBarmtr(getgxTv_SdtSDT_Hdr_Barmtr());
      struct.setBarkgm(getgxTv_SdtSDT_Hdr_Barkgm());
      struct.setBarpie(getgxTv_SdtSDT_Hdr_Barpie());
      struct.setBargraaca(getgxTv_SdtSDT_Hdr_Bargraaca());
      struct.setBarpes(getgxTv_SdtSDT_Hdr_Barpes());
      struct.setBarrdt(getgxTv_SdtSDT_Hdr_Barrdt());
      struct.setBarhdr(getgxTv_SdtSDT_Hdr_Barhdr());
      return struct ;
   }

   protected byte gxTv_SdtSDT_Hdr_N ;
   protected byte gxTv_SdtSDT_Hdr_Barcodreo ;
   protected byte gxTv_SdtSDT_Hdr_Bartipcol ;
   protected byte gxTv_SdtSDT_Hdr_Barfecgen_N ;
   protected short gxTv_SdtSDT_Hdr_Bartipart ;
   protected short gxTv_SdtSDT_Hdr_Barancaca1 ;
   protected short gxTv_SdtSDT_Hdr_Bargraaca ;
   protected short gxTv_SdtSDT_Hdr_Barpes ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_Hdr_Barcod ;
   protected int gxTv_SdtSDT_Hdr_Clicod ;
   protected int gxTv_SdtSDT_Hdr_Discod ;
   protected int gxTv_SdtSDT_Hdr_Barcolnum ;
   protected int gxTv_SdtSDT_Hdr_Barpie ;
   protected java.math.BigDecimal gxTv_SdtSDT_Hdr_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDT_Hdr_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDT_Hdr_Barrdt ;
   protected String gxTv_SdtSDT_Hdr_Emprcod ;
   protected String gxTv_SdtSDT_Hdr_Barcodpar ;
   protected String gxTv_SdtSDT_Hdr_Clinom ;
   protected String gxTv_SdtSDT_Hdr_Disdes ;
   protected String gxTv_SdtSDT_Hdr_Barser ;
   protected String gxTv_SdtSDT_Hdr_Barserdsc ;
   protected String gxTv_SdtSDT_Hdr_Barcolnom ;
   protected String gxTv_SdtSDT_Hdr_Barnomcli ;
   protected String gxTv_SdtSDT_Hdr_Bardisnum ;
   protected String gxTv_SdtSDT_Hdr_Barunimed ;
   protected String gxTv_SdtSDT_Hdr_Barhdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDT_Hdr_Barfecgen ;
   protected boolean readElement ;
   protected boolean formatError ;
}

