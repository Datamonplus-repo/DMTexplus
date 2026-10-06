package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem extends GxUserType
{
   public SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem( )
   {
      this(  new ModelContext(SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem.class));
   }

   public SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem( ModelContext context )
   {
      super( context, "SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem");
   }

   public SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem( int remoteHandle ,
                                                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem");
   }

   public SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem( StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem struct )
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
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albref") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrefdsc") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albreccod") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrfen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen = GXutil.nullDate() ;
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N = (byte)(0) ;
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrent2") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albruni") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrunient") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrpieent") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "barcodreo") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "bartipcol") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barpiekil") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "barpiemet") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "barpiepie") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albprocod") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albprofch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N = (byte)(0) ;
                  gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbKgm") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbMtr") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbPie") )
            {
               gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "AlmacenTejidoencrudoDistribucion_SDT.AlmacenTejidoencrudoDistribucion_SDTItem" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albref", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albrefdsc", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albreccod", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen)) && ( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N == 1 ) )
      {
         oWriter.writeElement("albrfen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("albrfen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("albrent2", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albruni", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albrunient", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albrpieent", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("barcodreo", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barnhdr", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("bartipcol", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barpiekil", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("barpiemet", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("barpiepie", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albprocod", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch)) && ( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N == 1 ) )
      {
         oWriter.writeElement("albprofch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("albprofch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarAlbKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbPie", GXutil.trim( GXutil.str( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie, 6, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom, false, false);
      AddObjectProperty("albref", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref, false, false);
      AddObjectProperty("albrefdsc", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc, false, false);
      AddObjectProperty("albreccod", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("albrfen", sDateCnv, false, false);
      AddObjectProperty("albrent2", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2, false, false);
      AddObjectProperty("albruni", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni, false, false);
      AddObjectProperty("albrunient", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient, false, false);
      AddObjectProperty("albrpieent", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent, false, false);
      AddObjectProperty("Barcod", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod, false, false);
      AddObjectProperty("barcodreo", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar, false, false);
      AddObjectProperty("Barnhdr", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr, false, false);
      AddObjectProperty("Barser", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum, false, false);
      AddObjectProperty("bartipcol", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol, false, false);
      AddObjectProperty("Barpiekil", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil, false, false);
      AddObjectProperty("barpiemet", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet, false, false);
      AddObjectProperty("barpiepie", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie, false, false);
      AddObjectProperty("albprocod", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("albprofch", sDateCnv, false, false);
      AddObjectProperty("BarAlbKgm", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm, false, false);
      AddObjectProperty("BarAlbMtr", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr, false, false);
      AddObjectProperty("BarAlbPie", gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie, false, false);
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod = value ;
   }

   public java.util.Date getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen( java.util.Date value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo( byte value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser = value ;
   }

   public String getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom( String value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum = value ;
   }

   public byte getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol( byte value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie = value ;
   }

   public long getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod( long value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod = value ;
   }

   public java.util.Date getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch( java.util.Date value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr( java.math.BigDecimal value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr = value ;
   }

   public int getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie ;
   }

   public void setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie( int value )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(0) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N = (byte)(1) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen = GXutil.nullDate() ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N = (byte)(1) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom = "" ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch = GXutil.nullDate() ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N = (byte)(1) ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm = DecimalUtil.ZERO ;
      gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N ;
   }

   public app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem Clone( )
   {
      return (app.SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem struct )
   {
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref(struct.getAlbref());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod(struct.getAlbreccod());
      if ( struct.gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N == 0 )
      {
         setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen(struct.getAlbrfen());
      }
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2(struct.getAlbrent2());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni(struct.getAlbruni());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient(struct.getAlbrunient());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent(struct.getAlbrpieent());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser(struct.getBarser());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol(struct.getBartipcol());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil(struct.getBarpiekil());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet(struct.getBarpiemet());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie(struct.getBarpiepie());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod(struct.getAlbprocod());
      if ( struct.gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N == 0 )
      {
         setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch(struct.getAlbprofch());
      }
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm(struct.getBaralbkgm());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr(struct.getBaralbmtr());
      setgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie(struct.getBaralbpie());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem getStruct( )
   {
      app.StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem struct = new app.StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem ();
      struct.setClicod(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom());
      struct.setAlbref(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref());
      struct.setAlbrefdsc(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc());
      struct.setAlbreccod(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod());
      if ( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N == 0 )
      {
         struct.setAlbrfen(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen());
      }
      struct.setAlbrent2(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2());
      struct.setAlbruni(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni());
      struct.setAlbrunient(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient());
      struct.setAlbrpieent(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent());
      struct.setBarcod(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar());
      struct.setBarnhdr(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr());
      struct.setBarser(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser());
      struct.setBarcolnom(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum());
      struct.setBartipcol(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol());
      struct.setBarpiekil(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil());
      struct.setBarpiemet(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet());
      struct.setBarpiepie(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie());
      struct.setAlbprocod(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod());
      if ( gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch());
      }
      struct.setBaralbkgm(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm());
      struct.setBaralbmtr(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr());
      struct.setBaralbpie(getgxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie());
      return struct ;
   }

   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_N ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen_N ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodreo ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Bartipcol ;
   protected byte gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clicod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albreccod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrpieent ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcod ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnum ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiepie ;
   protected int gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbpie ;
   protected long gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprocod ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiekil ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barpiemet ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbkgm ;
   protected java.math.BigDecimal gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Baralbmtr ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Clinom ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albref ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrefdsc ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrent2 ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albruni ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcodpar ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barnhdr ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barser ;
   protected String gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Barcolnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albrfen ;
   protected java.util.Date gxTv_SdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem_Albprofch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

