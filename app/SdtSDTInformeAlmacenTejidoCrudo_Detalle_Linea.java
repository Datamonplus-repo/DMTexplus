package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea extends GxUserType
{
   public SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea.class));
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea( StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRef") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRefDsc") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albreccod") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen = GXutil.nullDate() ;
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N = (byte)(0) ;
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NAlbaran") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albruni") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniEnt") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniUti") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesLibres") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieEnt") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieUti") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLoc") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLote") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procenom") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRDisCli") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesExpedidas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasExpedidas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTInformeAlmacenTejidoCrudo_Detalle.Linea" ;
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
      oWriter.writeElement("AlbRef", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRefDsc", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albreccod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen)) && ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albrfen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("NAlbaran", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albruni", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesLibres", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniDis", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieEnt", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieUti", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieDis", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLoc", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLote", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procenom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRDisCli", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesExpedidas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasExpedidas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas, 6, 0)));
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
      AddObjectProperty("AlbRef", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref, false, false);
      AddObjectProperty("AlbRefDsc", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc, false, false);
      AddObjectProperty("Albreccod", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albrfen", sDateCnv, false, false);
      AddObjectProperty("NAlbaran", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran, false, false);
      AddObjectProperty("Albruni", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni, false, false);
      AddObjectProperty("AlbRUniEnt", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient, false, false);
      AddObjectProperty("AlbRUniUti", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti, false, false);
      AddObjectProperty("UnidadesLibres", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres, false, false);
      AddObjectProperty("AlbRUniDis", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis, false, false);
      AddObjectProperty("AlbRPieEnt", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent, false, false);
      AddObjectProperty("AlbRPieUti", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti, false, false);
      AddObjectProperty("AlbRPieDis", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis, false, false);
      AddObjectProperty("AlbRLoc", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc, false, false);
      AddObjectProperty("AlbRLote", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote, false, false);
      AddObjectProperty("Procenom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom, false, false);
      AddObjectProperty("TrnNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom, false, false);
      AddObjectProperty("AlbRDisCli", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli, false, false);
      AddObjectProperty("UnidadesExpedidas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas, false, false);
      AddObjectProperty("PiezasExpedidas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas, false, false);
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen( java.util.Date value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen = GXutil.nullDate() ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N ;
   }

   public app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea Clone( )
   {
      return (app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea struct )
   {
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref(struct.getAlbref());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod(struct.getAlbreccod());
      if ( struct.gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N == 0 )
      {
         setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen(struct.getAlbrfen());
      }
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran(struct.getNalbaran());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni(struct.getAlbruni());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient(struct.getAlbrunient());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti(struct.getAlbruniuti());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres(struct.getUnidadeslibres());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis(struct.getAlbrunidis());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent(struct.getAlbrpieent());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti(struct.getAlbrpieuti());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis(struct.getAlbrpiedis());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc(struct.getAlbrloc());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote(struct.getAlbrlote());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom(struct.getProcenom());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom(struct.getTrnnom());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli(struct.getAlbrdiscli());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas(struct.getUnidadesexpedidas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas(struct.getPiezasexpedidas());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea getStruct( )
   {
      app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea struct = new app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea ();
      struct.setAlbref(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref());
      struct.setAlbrefdsc(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc());
      struct.setAlbreccod(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod());
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N == 0 )
      {
         struct.setAlbrfen(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen());
      }
      struct.setNalbaran(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran());
      struct.setAlbruni(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni());
      struct.setAlbrunient(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient());
      struct.setAlbruniuti(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti());
      struct.setUnidadeslibres(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres());
      struct.setAlbrunidis(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis());
      struct.setAlbrpieent(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent());
      struct.setAlbrpieuti(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti());
      struct.setAlbrpiedis(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis());
      struct.setAlbrloc(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc());
      struct.setAlbrlote(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote());
      struct.setProcenom(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom());
      struct.setTrnnom(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom());
      struct.setAlbrdiscli(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli());
      struct.setUnidadesexpedidas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas());
      struct.setPiezasexpedidas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albreccod ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieent ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpieuti ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrpiedis ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Piezasexpedidas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadeslibres ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrunidis ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Unidadesexpedidas ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albref ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrefdsc ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Nalbaran ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albruni ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrloc ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrlote ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Procenom ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Trnnom ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrdiscli ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea_Albrfen ;
   protected boolean readElement ;
   protected boolean formatError ;
}

