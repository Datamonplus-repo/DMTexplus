package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCuentaCorrienteProductos2_SDT extends GxUserType
{
   public SdtCuentaCorrienteProductos2_SDT( )
   {
      this(  new ModelContext(SdtCuentaCorrienteProductos2_SDT.class));
   }

   public SdtCuentaCorrienteProductos2_SDT( ModelContext context )
   {
      super( context, "SdtCuentaCorrienteProductos2_SDT");
   }

   public SdtCuentaCorrienteProductos2_SDT( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtCuentaCorrienteProductos2_SDT");
   }

   public SdtCuentaCorrienteProductos2_SDT( StructSdtCuentaCorrienteProductos2_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstklin") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkdiahora") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N = (byte)(0) ;
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipMovCC") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCstkdsc") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkcane") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkcans") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkpre") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCStkLot") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstklen") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkped") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CcstkUsu") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkbar") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkreo") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkpar") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstknhdr") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccstkfec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec = GXutil.nullDate() ;
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N = (byte)(0) ;
                  gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Existencias") )
            {
               gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "CuentaCorrienteProductos2_SDT" ;
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
      oWriter.writeElement("Ccstklin", GXutil.trim( GXutil.str( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora) && ( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N == 1 ) )
      {
         oWriter.writeElement("Ccstkdiahora", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Ccstkdiahora", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("TipMovCC", gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCstkdsc", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkcane", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkcans", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkpre", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCStkLot", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstklen", GXutil.trim( GXutil.str( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkped", GXutil.trim( GXutil.str( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CcstkUsu", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkbar", GXutil.trim( GXutil.str( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkreo", GXutil.trim( GXutil.str( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstkpar", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccstknhdr", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec)) && ( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N == 1 ) )
      {
         oWriter.writeElement("Ccstkfec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Ccstkfec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Existencias", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias, 12, 4)));
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
      AddObjectProperty("Ccstklin", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin, false, false);
      datetime_STZ = gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora ;
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
      AddObjectProperty("Ccstkdiahora", sDateCnv, false, false);
      AddObjectProperty("TipMovCC", gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc, false, false);
      AddObjectProperty("CCstkdsc", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc, false, false);
      AddObjectProperty("Ccstkcane", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane, false, false);
      AddObjectProperty("Ccstkcans", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans, false, false);
      AddObjectProperty("Ccstkpre", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre, false, false);
      AddObjectProperty("CCStkLot", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot, false, false);
      AddObjectProperty("Ccstklen", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen, false, false);
      AddObjectProperty("Ccstkped", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped, false, false);
      AddObjectProperty("CcstkUsu", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu, false, false);
      AddObjectProperty("Ccstkbar", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar, false, false);
      AddObjectProperty("Ccstkreo", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo, false, false);
      AddObjectProperty("Ccstkpar", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar, false, false);
      AddObjectProperty("Ccstknhdr", gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Ccstkfec", sDateCnv, false, false);
      AddObjectProperty("Existencias", gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias, false, false);
   }

   public long getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin( long value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin = value ;
   }

   public java.util.Date getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora( java.util.Date value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora = value ;
   }

   public String getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc = value ;
   }

   public String getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre = value ;
   }

   public String getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot = value ;
   }

   public short getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen( short value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen = value ;
   }

   public int getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped( int value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped = value ;
   }

   public String getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu = value ;
   }

   public int getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar( int value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar = value ;
   }

   public byte getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo( byte value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo = value ;
   }

   public String getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar = value ;
   }

   public String getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr( String value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr = value ;
   }

   public java.util.Date getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec( java.util.Date value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCuentaCorrienteProductos2_SDT_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr = "" ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec = GXutil.nullDate() ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtCuentaCorrienteProductos2_SDT_N ;
   }

   public app.SdtCuentaCorrienteProductos2_SDT Clone( )
   {
      return (app.SdtCuentaCorrienteProductos2_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtCuentaCorrienteProductos2_SDT struct )
   {
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin(struct.getCcstklin());
      if ( struct.gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N == 0 )
      {
         setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora(struct.getCcstkdiahora());
      }
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc(struct.getTipmovcc());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc(struct.getCcstkdsc());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane(struct.getCcstkcane());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans(struct.getCcstkcans());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre(struct.getCcstkpre());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot(struct.getCcstklot());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen(struct.getCcstklen());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped(struct.getCcstkped());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu(struct.getCcstkusu());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar(struct.getCcstkbar());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo(struct.getCcstkreo());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar(struct.getCcstkpar());
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr(struct.getCcstknhdr());
      if ( struct.gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N == 0 )
      {
         setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec(struct.getCcstkfec());
      }
      setgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias(struct.getExistencias());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtCuentaCorrienteProductos2_SDT getStruct( )
   {
      app.StructSdtCuentaCorrienteProductos2_SDT struct = new app.StructSdtCuentaCorrienteProductos2_SDT ();
      struct.setCcstklin(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin());
      if ( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N == 0 )
      {
         struct.setCcstkdiahora(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora());
      }
      struct.setTipmovcc(getgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc());
      struct.setCcstkdsc(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc());
      struct.setCcstkcane(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane());
      struct.setCcstkcans(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans());
      struct.setCcstkpre(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre());
      struct.setCcstklot(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot());
      struct.setCcstklen(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen());
      struct.setCcstkped(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped());
      struct.setCcstkusu(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu());
      struct.setCcstkbar(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar());
      struct.setCcstkreo(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo());
      struct.setCcstkpar(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar());
      struct.setCcstknhdr(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr());
      if ( gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N == 0 )
      {
         struct.setCcstkfec(getgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec());
      }
      struct.setExistencias(getgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias());
      return struct ;
   }

   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_N ;
   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora_N ;
   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo ;
   protected byte gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec_N ;
   protected short gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklen ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped ;
   protected int gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar ;
   protected long gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos2_SDT_Existencias ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar ;
   protected String gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

