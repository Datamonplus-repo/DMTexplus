package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenenCrudoDistribucion extends GxUserType
{
   public SdtSDTInformeAlmacenenCrudoDistribucion( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenenCrudoDistribucion.class));
   }

   public SdtSDTInformeAlmacenenCrudoDistribucion( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenenCrudoDistribucion");
   }

   public SdtSDTInformeAlmacenenCrudoDistribucion( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenenCrudoDistribucion");
   }

   public SdtSDTInformeAlmacenenCrudoDistribucion( StructSdtSDTInformeAlmacenenCrudoDistribucion struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albreccod") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrfen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen = GXutil.nullDate() ;
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N = (byte)(0) ;
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrent2") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLote") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesEntradas") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesUtilizadas") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesLibres") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasEntradas") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasUtilizadas") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasDisponibles") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaHdr") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr = GXutil.nullDate() ;
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N = (byte)(0) ;
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bartipcol") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarKgm") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarMtr") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPie") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProcod") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albprofch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N = (byte)(0) ;
                  gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbKgmE") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbMtrE") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbPie") )
            {
               gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTInformeAlmacenenCrudoDistribucion" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albreccod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen)) && ( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N == 1 ) )
      {
         oWriter.writeElement("Albrfen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albrfen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Albrent2", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLote", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesEntradas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesUtilizadas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesLibres", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasEntradas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasUtilizadas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasDisponibles", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barnhdr", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr)) && ( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N == 1 ) )
      {
         oWriter.writeElement("FechaHdr", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FechaHdr", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Barser", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bartipcol", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPie", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProcod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch)) && ( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N == 1 ) )
      {
         oWriter.writeElement("Albprofch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albprofch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarAlbKgmE", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbMtrE", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbPie", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie, 6, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom, false, false);
      AddObjectProperty("Albreccod", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albrfen", sDateCnv, false, false);
      AddObjectProperty("Albrent2", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2, false, false);
      AddObjectProperty("AlbRLote", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote, false, false);
      AddObjectProperty("UnidadesEntradas", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas, false, false);
      AddObjectProperty("UnidadesUtilizadas", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas, false, false);
      AddObjectProperty("UnidadesLibres", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres, false, false);
      AddObjectProperty("PiezasEntradas", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas, false, false);
      AddObjectProperty("PiezasUtilizadas", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas, false, false);
      AddObjectProperty("PiezasDisponibles", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles, false, false);
      AddObjectProperty("Barnhdr", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FechaHdr", sDateCnv, false, false);
      AddObjectProperty("Barser", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum, false, false);
      AddObjectProperty("Bartipcol", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol, false, false);
      AddObjectProperty("BarKgm", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm, false, false);
      AddObjectProperty("BarMtr", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr, false, false);
      AddObjectProperty("BarPie", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie, false, false);
      AddObjectProperty("AlbProcod", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albprofch", sDateCnv, false, false);
      AddObjectProperty("BarAlbKgmE", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme, false, false);
      AddObjectProperty("BarAlbMtrE", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre, false, false);
      AddObjectProperty("BarAlbPie", gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie, false, false);
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom( String value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum = value ;
   }

   public byte getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol( byte value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie = value ;
   }

   public long getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod( long value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie ;
   }

   public void setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie( int value )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen = GXutil.nullDate() ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr = GXutil.nullDate() ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom = "" ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch = GXutil.nullDate() ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N ;
   }

   public app.SdtSDTInformeAlmacenenCrudoDistribucion Clone( )
   {
      return (app.SdtSDTInformeAlmacenenCrudoDistribucion)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenenCrudoDistribucion struct )
   {
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod(struct.getClicod());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom(struct.getClinom());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod(struct.getAlbreccod());
      if ( struct.gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N == 0 )
      {
         setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen(struct.getAlbrfen());
      }
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2(struct.getAlbrent2());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote(struct.getAlbrlote());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas(struct.getUnidadesentradas());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas(struct.getUnidadesutilizadas());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres(struct.getUnidadeslibres());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas(struct.getPiezasentradas());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas(struct.getPiezasutilizadas());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles(struct.getPiezasdisponibles());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr(struct.getBarnhdr());
      if ( struct.gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N == 0 )
      {
         setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr(struct.getFechahdr());
      }
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser(struct.getBarser());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol(struct.getBartipcol());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm(struct.getBarkgm());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr(struct.getBarmtr());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie(struct.getBarpie());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod(struct.getAlbprocod());
      if ( struct.gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N == 0 )
      {
         setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch(struct.getAlbprofch());
      }
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme(struct.getBaralbkgme());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre(struct.getBaralbmtre());
      setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie(struct.getBaralbpie());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenenCrudoDistribucion getStruct( )
   {
      app.StructSdtSDTInformeAlmacenenCrudoDistribucion struct = new app.StructSdtSDTInformeAlmacenenCrudoDistribucion ();
      struct.setClicod(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod());
      struct.setClinom(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom());
      struct.setAlbreccod(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod());
      if ( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N == 0 )
      {
         struct.setAlbrfen(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen());
      }
      struct.setAlbrent2(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2());
      struct.setAlbrlote(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote());
      struct.setUnidadesentradas(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas());
      struct.setUnidadesutilizadas(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas());
      struct.setUnidadeslibres(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres());
      struct.setPiezasentradas(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas());
      struct.setPiezasutilizadas(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas());
      struct.setPiezasdisponibles(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles());
      struct.setBarnhdr(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr());
      if ( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N == 0 )
      {
         struct.setFechahdr(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr());
      }
      struct.setBarser(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser());
      struct.setBarserdsc(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc());
      struct.setBarcolnom(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum());
      struct.setBartipcol(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol());
      struct.setBarkgm(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm());
      struct.setBarmtr(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr());
      struct.setBarpie(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie());
      struct.setAlbprocod(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod());
      if ( gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch());
      }
      struct.setBaralbkgme(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme());
      struct.setBaralbmtre(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre());
      struct.setBaralbpie(getgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_N ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen_N ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr_N ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol ;
   protected byte gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie ;
   protected int gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie ;
   protected long gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2 ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc ;
   protected String gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

