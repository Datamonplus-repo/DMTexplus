package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCostesBasicos_SDT_CostesBasicos_SDTItem extends GxUserType
{
   public SdtCostesBasicos_SDT_CostesBasicos_SDTItem( )
   {
      this(  new ModelContext(SdtCostesBasicos_SDT_CostesBasicos_SDTItem.class));
   }

   public SdtCostesBasicos_SDT_CostesBasicos_SDTItem( ModelContext context )
   {
      super( context, "SdtCostesBasicos_SDT_CostesBasicos_SDTItem");
   }

   public SdtCostesBasicos_SDT_CostesBasicos_SDTItem( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtCostesBasicos_SDT_CostesBasicos_SDTItem");
   }

   public SdtCostesBasicos_SDT_CostesBasicos_SDTItem( StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem struct )
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
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bartipart") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barkgm") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barmtr") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Coste_p") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costequimicoacumulado") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CosteFab") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costefab2") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CosteFabAcumulado") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Margen") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TxtAlb") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPrekgm") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecgen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen = GXutil.nullDate() ;
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N = (byte)(0) ;
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barfecsal") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal = GXutil.nullDate() ;
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N = (byte)(0) ;
                  gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mmod") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mmoi") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "menergia") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mgas") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "magua") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mgi") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mam") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "madc") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUnimed") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CosteTeo") )
            {
               gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "CostesBasicos_SDT.CostesBasicos_SDTItem" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barnhdr", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bartipart", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barmtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Coste_p", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Costequimicoacumulado", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CosteFab", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Costefab2", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CosteFabAcumulado", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Valor", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Margen", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TxtAlb", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPrekgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen)) && ( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N == 1 ) )
      {
         oWriter.writeElement("BarFecgen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecgen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal)) && ( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N == 1 ) )
      {
         oWriter.writeElement("Barfecsal", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Barfecsal", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("mmod", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("mmoi", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("menergia", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("mgas", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("magua", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("mgi", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("mam", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("madc", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUnimed", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CosteTeo", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo, 10, 2)));
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
      AddObjectProperty("Clicod", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom, false, false);
      AddObjectProperty("Barcod", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar, false, false);
      AddObjectProperty("Barnhdr", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr, false, false);
      AddObjectProperty("Barser", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc, false, false);
      AddObjectProperty("Bartipart", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum, false, false);
      AddObjectProperty("Barkgm", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm, false, false);
      AddObjectProperty("Barmtr", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr, false, false);
      AddObjectProperty("Coste_p", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p, false, false);
      AddObjectProperty("Costequimicoacumulado", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado, false, false);
      AddObjectProperty("CosteFab", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab, false, false);
      AddObjectProperty("Costefab2", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2, false, false);
      AddObjectProperty("CosteFabAcumulado", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado, false, false);
      AddObjectProperty("Valor", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor, false, false);
      AddObjectProperty("Margen", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen, false, false);
      AddObjectProperty("TxtAlb", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb, false, false);
      AddObjectProperty("BarPrekgm", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecgen", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Barfecsal", sDateCnv, false, false);
      AddObjectProperty("mmod", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod, false, false);
      AddObjectProperty("mmoi", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi, false, false);
      AddObjectProperty("menergia", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia, false, false);
      AddObjectProperty("mgas", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas, false, false);
      AddObjectProperty("magua", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua, false, false);
      AddObjectProperty("mgi", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi, false, false);
      AddObjectProperty("mam", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam, false, false);
      AddObjectProperty("madc", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc, false, false);
      AddObjectProperty("BarUnimed", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed, false, false);
      AddObjectProperty("CosteTeo", gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo, false, false);
   }

   public int getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod( int value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom = value ;
   }

   public int getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod( int value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo( byte value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc = value ;
   }

   public short getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart( short value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom = value ;
   }

   public int getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum( int value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm = value ;
   }

   public java.util.Date getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen( java.util.Date value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen = value ;
   }

   public java.util.Date getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal( java.util.Date value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc = value ;
   }

   public String getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo ;
   }

   public void setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(1) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen = GXutil.nullDate() ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N = (byte)(1) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal = GXutil.nullDate() ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N = (byte)(1) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N ;
   }

   public app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem Clone( )
   {
      return (app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)(clone()) ;
   }

   public void setStruct( app.costesbasicos.StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem struct )
   {
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser(struct.getBarser());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart(struct.getBartipart());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm(struct.getBarkgm());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr(struct.getBarmtr());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p(struct.getCoste_p());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado(struct.getCostequimicoacumulado());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab(struct.getCostefab());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2(struct.getCostefab2());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado(struct.getCostefabacumulado());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor(struct.getValor());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen(struct.getMargen());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb(struct.getTxtalb());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm(struct.getBarprekgm());
      if ( struct.gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N == 0 )
      {
         setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen(struct.getBarfecgen());
      }
      if ( struct.gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N == 0 )
      {
         setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal(struct.getBarfecsal());
      }
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod(struct.getMmod());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi(struct.getMmoi());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia(struct.getMenergia());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas(struct.getMgas());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua(struct.getMagua());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi(struct.getMgi());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam(struct.getMam());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc(struct.getMadc());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed(struct.getBarunimed());
      setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo(struct.getCosteteo());
   }

   @SuppressWarnings("unchecked")
   public app.costesbasicos.StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem getStruct( )
   {
      app.costesbasicos.StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem struct = new app.costesbasicos.StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem ();
      struct.setClicod(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom());
      struct.setBarcod(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar());
      struct.setBarnhdr(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr());
      struct.setBarser(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser());
      struct.setBarserdsc(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc());
      struct.setBartipart(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart());
      struct.setBarcolnom(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum());
      struct.setBarkgm(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm());
      struct.setBarmtr(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr());
      struct.setCoste_p(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p());
      struct.setCostequimicoacumulado(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado());
      struct.setCostefab(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab());
      struct.setCostefab2(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2());
      struct.setCostefabacumulado(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado());
      struct.setValor(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor());
      struct.setMargen(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen());
      struct.setTxtalb(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb());
      struct.setBarprekgm(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm());
      if ( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N == 0 )
      {
         struct.setBarfecgen(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen());
      }
      if ( gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N == 0 )
      {
         struct.setBarfecsal(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal());
      }
      struct.setMmod(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod());
      struct.setMmoi(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi());
      struct.setMenergia(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia());
      struct.setMgas(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas());
      struct.setMagua(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua());
      struct.setMgi(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi());
      struct.setMam(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam());
      struct.setMadc(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc());
      struct.setBarunimed(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed());
      struct.setCosteteo(getgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo());
      return struct ;
   }

   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N ;
   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo ;
   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N ;
   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N ;
   protected short gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod ;
   protected int gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod ;
   protected int gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen ;
   protected java.util.Date gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb ;
}

