package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtUPQ_CuentaCorriente_SDT extends GxUserType
{
   public SdtUPQ_CuentaCorriente_SDT( )
   {
      this(  new ModelContext(SdtUPQ_CuentaCorriente_SDT.class));
   }

   public SdtUPQ_CuentaCorriente_SDT( ModelContext context )
   {
      super( context, "SdtUPQ_CuentaCorriente_SDT");
   }

   public SdtUPQ_CuentaCorriente_SDT( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtUPQ_CuentaCorriente_SDT");
   }

   public SdtUPQ_CuentaCorriente_SDT( StructSdtUPQ_CuentaCorriente_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdnum") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdnom") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstklin") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DiaHora") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipMovcc") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkDsc") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkCanE") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkCanS") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkPre") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Exis") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Exis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkLot") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkLotFech") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech = GXutil.nullDate() ;
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N = (byte)(0) ;
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hdr") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkUsu") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkBar") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkReo") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkpar") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkPed") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkLen") )
            {
               gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec = GXutil.nullDate() ;
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N = (byte)(0) ;
                  gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
         sName = "UPQ_CuentaCorriente_SDT" ;
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
      oWriter.writeElement("Prdnum", gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Prdnom", gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstklin", GXutil.trim( GXutil.str( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DiaHora", gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipMovcc", gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkDsc", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkCanE", GXutil.trim( GXutil.strNoRound( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkCanS", GXutil.trim( GXutil.strNoRound( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkPre", GXutil.trim( GXutil.strNoRound( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Exis", GXutil.trim( GXutil.strNoRound( gxTv_SdtUPQ_CuentaCorriente_SDT_Exis, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkLot", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech)) && ( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N == 1 ) )
      {
         oWriter.writeElement("CCStkLotFech", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CCStkLotFech", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Hdr", gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkUsu", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkBar", GXutil.trim( GXutil.str( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkReo", GXutil.trim( GXutil.str( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkpar", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkPed", GXutil.trim( GXutil.str( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkLen", GXutil.trim( GXutil.str( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec)) && ( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N == 1 ) )
      {
         oWriter.writeElement("CCStkFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CCStkFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("Prdnum", gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum, false, false);
      AddObjectProperty("Prdnom", gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom, false, false);
      AddObjectProperty("Ccstklin", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin, false, false);
      AddObjectProperty("DiaHora", gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora, false, false);
      AddObjectProperty("TipMovcc", gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc, false, false);
      AddObjectProperty("CCStkDsc", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc, false, false);
      AddObjectProperty("CCStkCanE", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane, false, false);
      AddObjectProperty("CCStkCanS", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans, false, false);
      AddObjectProperty("CCStkPre", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre, false, false);
      AddObjectProperty("Exis", gxTv_SdtUPQ_CuentaCorriente_SDT_Exis, false, false);
      AddObjectProperty("CCStkLot", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CCStkLotFech", sDateCnv, false, false);
      AddObjectProperty("Hdr", gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr, false, false);
      AddObjectProperty("CCStkUsu", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu, false, false);
      AddObjectProperty("CCStkBar", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar, false, false);
      AddObjectProperty("CCStkReo", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo, false, false);
      AddObjectProperty("CCStkpar", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar, false, false);
      AddObjectProperty("CCStkPed", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped, false, false);
      AddObjectProperty("CCStkLen", gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CCStkFec", sDateCnv, false, false);
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom = value ;
   }

   public long getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin( long value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Diahora( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Diahora( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane = value ;
   }

   public java.math.BigDecimal getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans = value ;
   }

   public java.math.BigDecimal getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre = value ;
   }

   public java.math.BigDecimal getgxTv_SdtUPQ_CuentaCorriente_SDT_Exis( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Exis ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Exis( java.math.BigDecimal value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Exis = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot = value ;
   }

   public java.util.Date getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech( java.util.Date value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Hdr( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Hdr( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu = value ;
   }

   public int getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar( int value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar = value ;
   }

   public byte getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo( byte value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo = value ;
   }

   public String getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar( String value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar = value ;
   }

   public int getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped( int value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped = value ;
   }

   public short getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen( short value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen = value ;
   }

   public java.util.Date getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec ;
   }

   public void setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec( java.util.Date value )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(0) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_N = (byte)(1) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane = DecimalUtil.ZERO ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans = DecimalUtil.ZERO ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre = DecimalUtil.ZERO ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Exis = DecimalUtil.ZERO ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech = GXutil.nullDate() ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N = (byte)(1) ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar = "" ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec = GXutil.nullDate() ;
      gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtUPQ_CuentaCorriente_SDT_N ;
   }

   public app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT Clone( )
   {
      return (app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT)(clone()) ;
   }

   public void setStruct( app.stocksquimicos.StructSdtUPQ_CuentaCorriente_SDT struct )
   {
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum(struct.getPrdnum());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom(struct.getPrdnom());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin(struct.getCcstklin());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Diahora(struct.getDiahora());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc(struct.getTipmovcc());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc(struct.getCcstkdsc());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane(struct.getCcstkcane());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans(struct.getCcstkcans());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre(struct.getCcstkpre());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Exis(struct.getExis());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot(struct.getCcstklot());
      if ( struct.gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N == 0 )
      {
         setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech(struct.getCcstklotfech());
      }
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Hdr(struct.getHdr());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu(struct.getCcstkusu());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar(struct.getCcstkbar());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo(struct.getCcstkreo());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar(struct.getCcstkpar());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped(struct.getCcstkped());
      setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen(struct.getCcstklen());
      if ( struct.gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N == 0 )
      {
         setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec(struct.getCcstkfec());
      }
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtUPQ_CuentaCorriente_SDT getStruct( )
   {
      app.stocksquimicos.StructSdtUPQ_CuentaCorriente_SDT struct = new app.stocksquimicos.StructSdtUPQ_CuentaCorriente_SDT ();
      struct.setPrdnum(getgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum());
      struct.setPrdnom(getgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom());
      struct.setCcstklin(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin());
      struct.setDiahora(getgxTv_SdtUPQ_CuentaCorriente_SDT_Diahora());
      struct.setTipmovcc(getgxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc());
      struct.setCcstkdsc(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc());
      struct.setCcstkcane(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane());
      struct.setCcstkcans(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans());
      struct.setCcstkpre(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre());
      struct.setExis(getgxTv_SdtUPQ_CuentaCorriente_SDT_Exis());
      struct.setCcstklot(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot());
      if ( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N == 0 )
      {
         struct.setCcstklotfech(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech());
      }
      struct.setHdr(getgxTv_SdtUPQ_CuentaCorriente_SDT_Hdr());
      struct.setCcstkusu(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu());
      struct.setCcstkbar(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar());
      struct.setCcstkreo(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo());
      struct.setCcstkpar(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar());
      struct.setCcstkped(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped());
      struct.setCcstklen(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen());
      if ( gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N == 0 )
      {
         struct.setCcstkfec(getgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec());
      }
      return struct ;
   }

   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_N ;
   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech_N ;
   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo ;
   protected byte gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec_N ;
   protected short gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar ;
   protected int gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped ;
   protected long gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre ;
   protected java.math.BigDecimal gxTv_SdtUPQ_CuentaCorriente_SDT_Exis ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Diahora ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Hdr ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu ;
   protected String gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech ;
   protected java.util.Date gxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

