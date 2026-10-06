package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_AnalisisDetalleSDT extends GxUserType
{
   public SdtMRec_AnalisisDetalleSDT( )
   {
      this(  new ModelContext(SdtMRec_AnalisisDetalleSDT.class));
   }

   public SdtMRec_AnalisisDetalleSDT( ModelContext context )
   {
      super( context, "SdtMRec_AnalisisDetalleSDT");
   }

   public SdtMRec_AnalisisDetalleSDT( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_AnalisisDetalleSDT");
   }

   public SdtMRec_AnalisisDetalleSDT( StructSdtMRec_AnalisisDetalleSDT struct )
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
               gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEnvOrd") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Menvord = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRecLin") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecValMn") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecVal") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecValMx") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N = (byte)(0) ;
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))), (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 21, 3), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecEr") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecFecEv") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N = (byte)(0) ;
                  gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))), (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 21, 3), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasCod") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasDsc") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hdr") )
            {
               gxTv_SdtMRec_AnalisisDetalleSDT_Hdr = oReader.getValue() ;
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
         sName = "MRec_AnalisisDetalleSDT" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisDetalleSDT_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MEnvOrd", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisDetalleSDT_Menvord, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRecLin", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC", gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecValMn", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecVal", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecValMx", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec) && ( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N == 1 ) )
      {
         oWriter.writeElement("MPRecFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "." ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MPRecFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MPRecEr", GXutil.booltostr( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev) && ( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N == 1 ) )
      {
         oWriter.writeElement("MPRecFecEv", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "." ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev), 10, 0)) ;
         sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MPRecFecEv", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MaqCod", gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCod", gxTv_SdtMRec_AnalisisDetalleSDT_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParFasCod", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParFasDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCod", gxTv_SdtMRec_AnalisisDetalleSDT_Artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisDetalleSDT_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtMRec_AnalisisDetalleSDT_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hdr", gxTv_SdtMRec_AnalisisDetalleSDT_Hdr);
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
      AddObjectProperty("EmprCod", gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtMRec_AnalisisDetalleSDT_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar, false, false);
      AddObjectProperty("MEnvOrd", gxTv_SdtMRec_AnalisisDetalleSDT_Menvord, false, false);
      AddObjectProperty("MRecLin", gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin, false, false);
      AddObjectProperty("MPRecPLC", gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc, false, false);
      AddObjectProperty("MPRecValMn", gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn, false, false);
      AddObjectProperty("MPRecVal", gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval, false, false);
      AddObjectProperty("MPRecValMx", gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx, false, false);
      datetimemil_STZ = gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec ;
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
      AddObjectProperty("MPRecFec", sDateCnv, false, false);
      AddObjectProperty("MPRecEr", gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer, false, false);
      datetimemil_STZ = gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev ;
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
      AddObjectProperty("MPRecFecEv", sDateCnv, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc, false, false);
      AddObjectProperty("FasCod", gxTv_SdtMRec_AnalisisDetalleSDT_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc, false, false);
      AddObjectProperty("ParFasCod", gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod, false, false);
      AddObjectProperty("ParFasDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc, false, false);
      AddObjectProperty("ArtCod", gxTv_SdtMRec_AnalisisDetalleSDT_Artcod, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc, false, false);
      AddObjectProperty("CliCod", gxTv_SdtMRec_AnalisisDetalleSDT_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtMRec_AnalisisDetalleSDT_Clinom, false, false);
      AddObjectProperty("Hdr", gxTv_SdtMRec_AnalisisDetalleSDT_Hdr, false, false);
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Emprcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Emprcod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod = value ;
   }

   public int getgxTv_SdtMRec_AnalisisDetalleSDT_Barcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Barcod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Barcod( int value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcod = value ;
   }

   public byte getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo( byte value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar = value ;
   }

   public short getgxTv_SdtMRec_AnalisisDetalleSDT_Menvord( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Menvord ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Menvord( short value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Menvord = value ;
   }

   public long getgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin( long value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx = value ;
   }

   public java.util.Date getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec = value ;
   }

   public boolean getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer( boolean value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer = value ;
   }

   public java.util.Date getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Maqcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Maqcod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Fascod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Fascod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Fascod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fascod = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc = value ;
   }

   public short getgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod( short value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Artcod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Artcod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Artcod( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artcod = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Artdsc( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Artdsc( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc = value ;
   }

   public int getgxTv_SdtMRec_AnalisisDetalleSDT_Clicod( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Clicod ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Clicod( int value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Clicod = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Clinom( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Clinom ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Clinom( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Clinom = value ;
   }

   public String getgxTv_SdtMRec_AnalisisDetalleSDT_Hdr( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_Hdr ;
   }

   public void setgxTv_SdtMRec_AnalisisDetalleSDT_Hdr( String value )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Hdr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn = DecimalUtil.ZERO ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval = DecimalUtil.ZERO ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx = DecimalUtil.ZERO ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fascod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artcod = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Clinom = "" ;
      gxTv_SdtMRec_AnalisisDetalleSDT_Hdr = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetimemil_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_AnalisisDetalleSDT_N ;
   }

   public app.ingenieria.SdtMRec_AnalisisDetalleSDT Clone( )
   {
      return (app.ingenieria.SdtMRec_AnalisisDetalleSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_AnalisisDetalleSDT struct )
   {
      setgxTv_SdtMRec_AnalisisDetalleSDT_Emprcod(struct.getEmprcod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Barcod(struct.getBarcod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Menvord(struct.getMenvord());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin(struct.getMreclin());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc(struct.getMprecplc());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn(struct.getMprecvalmn());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval(struct.getMprecval());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx(struct.getMprecvalmx());
      if ( struct.gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N == 0 )
      {
         setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec(struct.getMprecfec());
      }
      setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer(struct.getMprecer());
      if ( struct.gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N == 0 )
      {
         setgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev(struct.getMprecfecev());
      }
      setgxTv_SdtMRec_AnalisisDetalleSDT_Maqcod(struct.getMaqcod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Fascod(struct.getFascod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc(struct.getFasdsc());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod(struct.getParfascod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc(struct.getParfasdsc());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Artcod(struct.getArtcod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Artdsc(struct.getArtdsc());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Clicod(struct.getClicod());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Clinom(struct.getClinom());
      setgxTv_SdtMRec_AnalisisDetalleSDT_Hdr(struct.getHdr());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_AnalisisDetalleSDT getStruct( )
   {
      app.ingenieria.StructSdtMRec_AnalisisDetalleSDT struct = new app.ingenieria.StructSdtMRec_AnalisisDetalleSDT ();
      struct.setEmprcod(getgxTv_SdtMRec_AnalisisDetalleSDT_Emprcod());
      struct.setBarcod(getgxTv_SdtMRec_AnalisisDetalleSDT_Barcod());
      struct.setBarcodreo(getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar());
      struct.setMenvord(getgxTv_SdtMRec_AnalisisDetalleSDT_Menvord());
      struct.setMreclin(getgxTv_SdtMRec_AnalisisDetalleSDT_Mreclin());
      struct.setMprecplc(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc());
      struct.setMprecvalmn(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn());
      struct.setMprecval(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecval());
      struct.setMprecvalmx(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx());
      if ( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N == 0 )
      {
         struct.setMprecfec(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec());
      }
      struct.setMprecer(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecer());
      if ( gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N == 0 )
      {
         struct.setMprecfecev(getgxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev());
      }
      struct.setMaqcod(getgxTv_SdtMRec_AnalisisDetalleSDT_Maqcod());
      struct.setMaqdsc(getgxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc());
      struct.setFascod(getgxTv_SdtMRec_AnalisisDetalleSDT_Fascod());
      struct.setFasdsc(getgxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc());
      struct.setParfascod(getgxTv_SdtMRec_AnalisisDetalleSDT_Parfascod());
      struct.setParfasdsc(getgxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc());
      struct.setArtcod(getgxTv_SdtMRec_AnalisisDetalleSDT_Artcod());
      struct.setArtdsc(getgxTv_SdtMRec_AnalisisDetalleSDT_Artdsc());
      struct.setClicod(getgxTv_SdtMRec_AnalisisDetalleSDT_Clicod());
      struct.setClinom(getgxTv_SdtMRec_AnalisisDetalleSDT_Clinom());
      struct.setHdr(getgxTv_SdtMRec_AnalisisDetalleSDT_Hdr());
      return struct ;
   }

   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_N ;
   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_Barcodreo ;
   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec_N ;
   protected byte gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev_N ;
   protected short gxTv_SdtMRec_AnalisisDetalleSDT_Menvord ;
   protected short gxTv_SdtMRec_AnalisisDetalleSDT_Parfascod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMRec_AnalisisDetalleSDT_Barcod ;
   protected int gxTv_SdtMRec_AnalisisDetalleSDT_Clicod ;
   protected long gxTv_SdtMRec_AnalisisDetalleSDT_Mreclin ;
   protected java.math.BigDecimal gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmn ;
   protected java.math.BigDecimal gxTv_SdtMRec_AnalisisDetalleSDT_Mprecval ;
   protected java.math.BigDecimal gxTv_SdtMRec_AnalisisDetalleSDT_Mprecvalmx ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Emprcod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Barcodpar ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Maqcod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Maqdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Fascod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Fasdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Parfasdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Artcod ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Artdsc ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Clinom ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Hdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfec ;
   protected java.util.Date gxTv_SdtMRec_AnalisisDetalleSDT_Mprecfecev ;
   protected java.util.Date datetimemil_STZ ;
   protected boolean gxTv_SdtMRec_AnalisisDetalleSDT_Mprecer ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMRec_AnalisisDetalleSDT_Mprecplc ;
}

