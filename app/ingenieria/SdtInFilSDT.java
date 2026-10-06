package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInFilSDT extends GxUserType
{
   public SdtInFilSDT( )
   {
      this(  new ModelContext(SdtInFilSDT.class));
   }

   public SdtInFilSDT( ModelContext context )
   {
      super( context, "SdtInFilSDT");
   }

   public SdtInFilSDT( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle, context, "SdtInFilSDT");
   }

   public SdtInFilSDT( StructSdtInFilSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilId") )
            {
               gxTv_SdtInFilSDT_Infilid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilUsu") )
            {
               gxTv_SdtInFilSDT_Infilusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilIp") )
            {
               gxTv_SdtInFilSDT_Infilip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilObj") )
            {
               gxTv_SdtInFilSDT_Infilobj = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilFReg") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtInFilSDT_Infilfreg = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtInFilSDT_Infilfreg_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtInFilSDT_Infilfreg_N = (byte)(0) ;
                  gxTv_SdtInFilSDT_Infilfreg = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))), (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 21, 3), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilFIni") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtInFilSDT_Infilfini = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtInFilSDT_Infilfini_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtInFilSDT_Infilfini_N = (byte)(0) ;
                  gxTv_SdtInFilSDT_Infilfini = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilFFin") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtInFilSDT_Infilffin = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtInFilSDT_Infilffin_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtInFilSDT_Infilffin_N = (byte)(0) ;
                  gxTv_SdtInFilSDT_Infilffin = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilMaq") )
            {
               gxTv_SdtInFilSDT_Infilmaq = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilFase") )
            {
               gxTv_SdtInFilSDT_Infilfase = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilHdr") )
            {
               gxTv_SdtInFilSDT_Infilhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilPar") )
            {
               gxTv_SdtInFilSDT_Infilpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilErr") )
            {
               gxTv_SdtInFilSDT_Infilerr = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilEmp") )
            {
               gxTv_SdtInFilSDT_Infilemp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "InFilTkn") )
            {
               gxTv_SdtInFilSDT_Infiltkn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Intervalo") )
            {
               gxTv_SdtInFilSDT_Intervalo = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "InFilSDT" ;
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
      oWriter.writeElement("InFilId", GXutil.trim( GXutil.str( gxTv_SdtInFilSDT_Infilid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilUsu", gxTv_SdtInFilSDT_Infilusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilIp", gxTv_SdtInFilSDT_Infilip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilObj", gxTv_SdtInFilSDT_Infilobj);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtInFilSDT_Infilfreg) && ( gxTv_SdtInFilSDT_Infilfreg_N == 1 ) )
      {
         oWriter.writeElement("InFilFReg", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "." ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( gxTv_SdtInFilSDT_Infilfreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("InFilFReg", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtInFilSDT_Infilfini) && ( gxTv_SdtInFilSDT_Infilfini_N == 1 ) )
      {
         oWriter.writeElement("InFilFIni", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInFilSDT_Infilfini), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInFilSDT_Infilfini), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInFilSDT_Infilfini), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtInFilSDT_Infilfini), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtInFilSDT_Infilfini), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtInFilSDT_Infilfini), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("InFilFIni", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtInFilSDT_Infilffin) && ( gxTv_SdtInFilSDT_Infilffin_N == 1 ) )
      {
         oWriter.writeElement("InFilFFin", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtInFilSDT_Infilffin), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtInFilSDT_Infilffin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtInFilSDT_Infilffin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtInFilSDT_Infilffin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtInFilSDT_Infilffin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtInFilSDT_Infilffin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("InFilFFin", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("InFilMaq", gxTv_SdtInFilSDT_Infilmaq);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilFase", gxTv_SdtInFilSDT_Infilfase);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilHdr", gxTv_SdtInFilSDT_Infilhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilPar", gxTv_SdtInFilSDT_Infilpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilErr", GXutil.booltostr( gxTv_SdtInFilSDT_Infilerr));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilEmp", gxTv_SdtInFilSDT_Infilemp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("InFilTkn", gxTv_SdtInFilSDT_Infiltkn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Intervalo", GXutil.trim( GXutil.str( gxTv_SdtInFilSDT_Intervalo, 6, 0)));
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
      AddObjectProperty("InFilId", gxTv_SdtInFilSDT_Infilid, false, false);
      AddObjectProperty("InFilUsu", gxTv_SdtInFilSDT_Infilusu, false, false);
      AddObjectProperty("InFilIp", gxTv_SdtInFilSDT_Infilip, false, false);
      AddObjectProperty("InFilObj", gxTv_SdtInFilSDT_Infilobj, false, false);
      datetimemil_STZ = gxTv_SdtInFilSDT_Infilfreg ;
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
      AddObjectProperty("InFilFReg", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtInFilSDT_Infilfini ;
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
      AddObjectProperty("InFilFIni", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtInFilSDT_Infilffin ;
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
      AddObjectProperty("InFilFFin", sDateCnv, false, false);
      AddObjectProperty("InFilMaq", gxTv_SdtInFilSDT_Infilmaq, false, false);
      AddObjectProperty("InFilFase", gxTv_SdtInFilSDT_Infilfase, false, false);
      AddObjectProperty("InFilHdr", gxTv_SdtInFilSDT_Infilhdr, false, false);
      AddObjectProperty("InFilPar", gxTv_SdtInFilSDT_Infilpar, false, false);
      AddObjectProperty("InFilErr", gxTv_SdtInFilSDT_Infilerr, false, false);
      AddObjectProperty("InFilEmp", gxTv_SdtInFilSDT_Infilemp, false, false);
      AddObjectProperty("InFilTkn", gxTv_SdtInFilSDT_Infiltkn, false, false);
      AddObjectProperty("Intervalo", gxTv_SdtInFilSDT_Intervalo, false, false);
   }

   public long getgxTv_SdtInFilSDT_Infilid( )
   {
      return gxTv_SdtInFilSDT_Infilid ;
   }

   public void setgxTv_SdtInFilSDT_Infilid( long value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilid = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilusu( )
   {
      return gxTv_SdtInFilSDT_Infilusu ;
   }

   public void setgxTv_SdtInFilSDT_Infilusu( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilusu = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilip( )
   {
      return gxTv_SdtInFilSDT_Infilip ;
   }

   public void setgxTv_SdtInFilSDT_Infilip( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilip = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilobj( )
   {
      return gxTv_SdtInFilSDT_Infilobj ;
   }

   public void setgxTv_SdtInFilSDT_Infilobj( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilobj = value ;
   }

   public java.util.Date getgxTv_SdtInFilSDT_Infilfreg( )
   {
      return gxTv_SdtInFilSDT_Infilfreg ;
   }

   public void setgxTv_SdtInFilSDT_Infilfreg( java.util.Date value )
   {
      gxTv_SdtInFilSDT_Infilfreg_N = (byte)(0) ;
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilfreg = value ;
   }

   public java.util.Date getgxTv_SdtInFilSDT_Infilfini( )
   {
      return gxTv_SdtInFilSDT_Infilfini ;
   }

   public void setgxTv_SdtInFilSDT_Infilfini( java.util.Date value )
   {
      gxTv_SdtInFilSDT_Infilfini_N = (byte)(0) ;
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilfini = value ;
   }

   public java.util.Date getgxTv_SdtInFilSDT_Infilffin( )
   {
      return gxTv_SdtInFilSDT_Infilffin ;
   }

   public void setgxTv_SdtInFilSDT_Infilffin( java.util.Date value )
   {
      gxTv_SdtInFilSDT_Infilffin_N = (byte)(0) ;
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilffin = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilmaq( )
   {
      return gxTv_SdtInFilSDT_Infilmaq ;
   }

   public void setgxTv_SdtInFilSDT_Infilmaq( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilmaq = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilfase( )
   {
      return gxTv_SdtInFilSDT_Infilfase ;
   }

   public void setgxTv_SdtInFilSDT_Infilfase( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilfase = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilhdr( )
   {
      return gxTv_SdtInFilSDT_Infilhdr ;
   }

   public void setgxTv_SdtInFilSDT_Infilhdr( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilhdr = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilpar( )
   {
      return gxTv_SdtInFilSDT_Infilpar ;
   }

   public void setgxTv_SdtInFilSDT_Infilpar( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilpar = value ;
   }

   public boolean getgxTv_SdtInFilSDT_Infilerr( )
   {
      return gxTv_SdtInFilSDT_Infilerr ;
   }

   public void setgxTv_SdtInFilSDT_Infilerr( boolean value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilerr = value ;
   }

   public String getgxTv_SdtInFilSDT_Infilemp( )
   {
      return gxTv_SdtInFilSDT_Infilemp ;
   }

   public void setgxTv_SdtInFilSDT_Infilemp( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infilemp = value ;
   }

   public String getgxTv_SdtInFilSDT_Infiltkn( )
   {
      return gxTv_SdtInFilSDT_Infiltkn ;
   }

   public void setgxTv_SdtInFilSDT_Infiltkn( String value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Infiltkn = value ;
   }

   public int getgxTv_SdtInFilSDT_Intervalo( )
   {
      return gxTv_SdtInFilSDT_Intervalo ;
   }

   public void setgxTv_SdtInFilSDT_Intervalo( int value )
   {
      gxTv_SdtInFilSDT_N = (byte)(0) ;
      gxTv_SdtInFilSDT_Intervalo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInFilSDT_N = (byte)(1) ;
      gxTv_SdtInFilSDT_Infilusu = "" ;
      gxTv_SdtInFilSDT_Infilip = "" ;
      gxTv_SdtInFilSDT_Infilobj = "" ;
      gxTv_SdtInFilSDT_Infilfreg = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtInFilSDT_Infilfreg_N = (byte)(1) ;
      gxTv_SdtInFilSDT_Infilfini = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtInFilSDT_Infilfini_N = (byte)(1) ;
      gxTv_SdtInFilSDT_Infilffin = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtInFilSDT_Infilffin_N = (byte)(1) ;
      gxTv_SdtInFilSDT_Infilmaq = "" ;
      gxTv_SdtInFilSDT_Infilfase = "" ;
      gxTv_SdtInFilSDT_Infilhdr = "" ;
      gxTv_SdtInFilSDT_Infilpar = "" ;
      gxTv_SdtInFilSDT_Infilemp = "" ;
      gxTv_SdtInFilSDT_Infiltkn = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetimemil_STZ = GXutil.resetTime( GXutil.nullDate() );
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtInFilSDT_N ;
   }

   public app.ingenieria.SdtInFilSDT Clone( )
   {
      return (app.ingenieria.SdtInFilSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtInFilSDT struct )
   {
      setgxTv_SdtInFilSDT_Infilid(struct.getInfilid());
      setgxTv_SdtInFilSDT_Infilusu(struct.getInfilusu());
      setgxTv_SdtInFilSDT_Infilip(struct.getInfilip());
      setgxTv_SdtInFilSDT_Infilobj(struct.getInfilobj());
      if ( struct.gxTv_SdtInFilSDT_Infilfreg_N == 0 )
      {
         setgxTv_SdtInFilSDT_Infilfreg(struct.getInfilfreg());
      }
      if ( struct.gxTv_SdtInFilSDT_Infilfini_N == 0 )
      {
         setgxTv_SdtInFilSDT_Infilfini(struct.getInfilfini());
      }
      if ( struct.gxTv_SdtInFilSDT_Infilffin_N == 0 )
      {
         setgxTv_SdtInFilSDT_Infilffin(struct.getInfilffin());
      }
      setgxTv_SdtInFilSDT_Infilmaq(struct.getInfilmaq());
      setgxTv_SdtInFilSDT_Infilfase(struct.getInfilfase());
      setgxTv_SdtInFilSDT_Infilhdr(struct.getInfilhdr());
      setgxTv_SdtInFilSDT_Infilpar(struct.getInfilpar());
      setgxTv_SdtInFilSDT_Infilerr(struct.getInfilerr());
      setgxTv_SdtInFilSDT_Infilemp(struct.getInfilemp());
      setgxTv_SdtInFilSDT_Infiltkn(struct.getInfiltkn());
      setgxTv_SdtInFilSDT_Intervalo(struct.getIntervalo());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtInFilSDT getStruct( )
   {
      app.ingenieria.StructSdtInFilSDT struct = new app.ingenieria.StructSdtInFilSDT ();
      struct.setInfilid(getgxTv_SdtInFilSDT_Infilid());
      struct.setInfilusu(getgxTv_SdtInFilSDT_Infilusu());
      struct.setInfilip(getgxTv_SdtInFilSDT_Infilip());
      struct.setInfilobj(getgxTv_SdtInFilSDT_Infilobj());
      if ( gxTv_SdtInFilSDT_Infilfreg_N == 0 )
      {
         struct.setInfilfreg(getgxTv_SdtInFilSDT_Infilfreg());
      }
      if ( gxTv_SdtInFilSDT_Infilfini_N == 0 )
      {
         struct.setInfilfini(getgxTv_SdtInFilSDT_Infilfini());
      }
      if ( gxTv_SdtInFilSDT_Infilffin_N == 0 )
      {
         struct.setInfilffin(getgxTv_SdtInFilSDT_Infilffin());
      }
      struct.setInfilmaq(getgxTv_SdtInFilSDT_Infilmaq());
      struct.setInfilfase(getgxTv_SdtInFilSDT_Infilfase());
      struct.setInfilhdr(getgxTv_SdtInFilSDT_Infilhdr());
      struct.setInfilpar(getgxTv_SdtInFilSDT_Infilpar());
      struct.setInfilerr(getgxTv_SdtInFilSDT_Infilerr());
      struct.setInfilemp(getgxTv_SdtInFilSDT_Infilemp());
      struct.setInfiltkn(getgxTv_SdtInFilSDT_Infiltkn());
      struct.setIntervalo(getgxTv_SdtInFilSDT_Intervalo());
      return struct ;
   }

   protected byte gxTv_SdtInFilSDT_N ;
   protected byte gxTv_SdtInFilSDT_Infilfreg_N ;
   protected byte gxTv_SdtInFilSDT_Infilfini_N ;
   protected byte gxTv_SdtInFilSDT_Infilffin_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtInFilSDT_Intervalo ;
   protected long gxTv_SdtInFilSDT_Infilid ;
   protected String gxTv_SdtInFilSDT_Infilusu ;
   protected String gxTv_SdtInFilSDT_Infilemp ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtInFilSDT_Infilfreg ;
   protected java.util.Date gxTv_SdtInFilSDT_Infilfini ;
   protected java.util.Date gxTv_SdtInFilSDT_Infilffin ;
   protected java.util.Date datetimemil_STZ ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtInFilSDT_Infilerr ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtInFilSDT_Infilip ;
   protected String gxTv_SdtInFilSDT_Infilobj ;
   protected String gxTv_SdtInFilSDT_Infilmaq ;
   protected String gxTv_SdtInFilSDT_Infilfase ;
   protected String gxTv_SdtInFilSDT_Infilhdr ;
   protected String gxTv_SdtInFilSDT_Infilpar ;
   protected String gxTv_SdtInFilSDT_Infiltkn ;
}

