package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRecetadeTinte_Cierre_SDT_Item extends GxUserType
{
   public SdtRecetadeTinte_Cierre_SDT_Item( )
   {
      this(  new ModelContext(SdtRecetadeTinte_Cierre_SDT_Item.class));
   }

   public SdtRecetadeTinte_Cierre_SDT_Item( ModelContext context )
   {
      super( context, "SdtRecetadeTinte_Cierre_SDT_Item");
   }

   public SdtRecetadeTinte_Cierre_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtRecetadeTinte_Cierre_SDT_Item");
   }

   public SdtRecetadeTinte_Cierre_SDT_Item( StructSdtRecetadeTinte_Cierre_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Pesado") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Adicion") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Incidencias") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecLinMaq") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSit") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrEst") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bartipcol") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnomcli") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnumcli") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rectotkgm") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecVolprd") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecFecAlt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N = (byte)(0) ;
                  gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNumAny") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lconti") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisreh") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BatchCode") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "WeigProdID") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Colorservicedatos") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecNroPar") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecHayAny") )
            {
               gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany = oReader.getValue() ;
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
         sName = "RecetadeTinte_Cierre_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Pesado", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Adicion", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Incidencias", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecLinMaq", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSit", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrEst", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bartipcol", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barnomcli", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barnumcli", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maqcod", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Rectotkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecVolprd", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt) && ( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N == 1 ) )
      {
         oWriter.writeElement("RecFecAlt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("RecFecAlt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarNumAny", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lconti", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisreh", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BatchCode", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("WeigProdID", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid, 12, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Colorservicedatos", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecNroPar", GXutil.trim( GXutil.str( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RecHayAny", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany);
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
      AddObjectProperty("Seleccionar", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Pesado", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado, false, false);
      AddObjectProperty("Adicion", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion, false, false);
      AddObjectProperty("Incidencias", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias, false, false);
      AddObjectProperty("Barcod", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("RecLinMaq", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq, false, false);
      AddObjectProperty("BarSit", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit, false, false);
      AddObjectProperty("BarAgrEst", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest, false, false);
      AddObjectProperty("Barser", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum, false, false);
      AddObjectProperty("Bartipcol", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol, false, false);
      AddObjectProperty("Barnomcli", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli, false, false);
      AddObjectProperty("Barnumcli", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli, false, false);
      AddObjectProperty("Maqcod", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod, false, false);
      AddObjectProperty("Rectotkgm", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm, false, false);
      AddObjectProperty("RecVolprd", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd, false, false);
      datetime_STZ = gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt ;
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
      AddObjectProperty("RecFecAlt", sDateCnv, false, false);
      AddObjectProperty("BarNumAny", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany, false, false);
      AddObjectProperty("Lconti", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti, false, false);
      AddObjectProperty("Hisreh", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh, false, false);
      AddObjectProperty("BatchCode", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode, false, false);
      AddObjectProperty("WeigProdID", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid, false, false);
      AddObjectProperty("Colorservicedatos", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos, false, false);
      AddObjectProperty("RecNroPar", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar, false, false);
      AddObjectProperty("RecHayAny", gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany, false, false);
   }

   public boolean getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion = value ;
   }

   public short getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias = value ;
   }

   public int getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar = value ;
   }

   public short getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq = value ;
   }

   public byte getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom = value ;
   }

   public int getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum = value ;
   }

   public byte getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli = value ;
   }

   public int getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm( java.math.BigDecimal value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm = value ;
   }

   public int getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd = value ;
   }

   public java.util.Date getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt( java.util.Date value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt = value ;
   }

   public short getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany = value ;
   }

   public byte getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti = value ;
   }

   public byte getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh( byte value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode = value ;
   }

   public long getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid( long value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid = value ;
   }

   public short getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos( short value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos = value ;
   }

   public int getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar( int value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar = value ;
   }

   public String getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany ;
   }

   public void setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany( String value )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N = (byte)(1) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm = DecimalUtil.ZERO ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N = (byte)(1) ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode = "" ;
      gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N ;
   }

   public app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item Clone( )
   {
      return (app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(clone()) ;
   }

   public void setStruct( app.formulaciontinte.StructSdtRecetadeTinte_Cierre_SDT_Item struct )
   {
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado(struct.getPesado());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion(struct.getAdicion());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias(struct.getIncidencias());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq(struct.getReclinmaq());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit(struct.getBarsit());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest(struct.getBaragrest());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol(struct.getBartipcol());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli(struct.getBarnumcli());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod(struct.getMaqcod());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(struct.getRectotkgm());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd(struct.getRecvolprd());
      if ( struct.gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N == 0 )
      {
         setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt(struct.getRecfecalt());
      }
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany(struct.getBarnumany());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti(struct.getLconti());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh(struct.getHisreh());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode(struct.getBatchcode());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid(struct.getWeigprodid());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos(struct.getColorservicedatos());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(struct.getRecnropar());
      setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany(struct.getRechayany());
   }

   @SuppressWarnings("unchecked")
   public app.formulaciontinte.StructSdtRecetadeTinte_Cierre_SDT_Item getStruct( )
   {
      app.formulaciontinte.StructSdtRecetadeTinte_Cierre_SDT_Item struct = new app.formulaciontinte.StructSdtRecetadeTinte_Cierre_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar());
      struct.setPesado(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado());
      struct.setAdicion(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion());
      struct.setIncidencias(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias());
      struct.setBarcod(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar());
      struct.setReclinmaq(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq());
      struct.setBarsit(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit());
      struct.setBaragrest(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest());
      struct.setBarser(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser());
      struct.setBarserdsc(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc());
      struct.setBarcolnom(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum());
      struct.setBartipcol(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol());
      struct.setBarnomcli(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli());
      struct.setBarnumcli(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli());
      struct.setMaqcod(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod());
      struct.setRectotkgm(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm());
      struct.setRecvolprd(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd());
      if ( gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N == 0 )
      {
         struct.setRecfecalt(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt());
      }
      struct.setBarnumany(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany());
      struct.setLconti(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti());
      struct.setHisreh(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh());
      struct.setBatchcode(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode());
      struct.setWeigprodid(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid());
      struct.setColorservicedatos(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos());
      struct.setRecnropar(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar());
      struct.setRechayany(getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany());
      return struct ;
   }

   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_N ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt_N ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti ;
   protected byte gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany ;
   protected short gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd ;
   protected int gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar ;
   protected long gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid ;
   protected java.math.BigDecimal gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode ;
   protected String gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

