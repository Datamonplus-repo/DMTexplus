package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtConsultadeProduccion_SDT_Item extends GxUserType
{
   public SdtConsultadeProduccion_SDT_Item( )
   {
      this(  new ModelContext(SdtConsultadeProduccion_SDT_Item.class));
   }

   public SdtConsultadeProduccion_SDT_Item( ModelContext context )
   {
      super( context, "SdtConsultadeProduccion_SDT_Item");
   }

   public SdtConsultadeProduccion_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtConsultadeProduccion_SDT_Item");
   }

   public SdtConsultadeProduccion_SDT_Item( StructSdtConsultadeProduccion_SDT_Item struct )
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
               gxTv_SdtConsultadeProduccion_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNHdr") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrEst") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PedidoCliente") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipArt") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipArtDsc") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomCli") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarKgm") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarMtr") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPie") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSit") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barsit = (byte)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen = GXutil.nullDate() ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N = (byte)(0) ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecCli") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli = GXutil.nullDate() ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N = (byte)(0) ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecsal") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal = GXutil.nullDate() ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N = (byte)(0) ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecFpr") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr = GXutil.nullDate() ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N = (byte)(0) ;
                  gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barfascod") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFasSig") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbUltimo") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbFact") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbMts") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbKgs") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarGirar") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAcaAnh") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCuaderno") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarProPer") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barproper = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarProPerIdtx") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNormas") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUsrCod") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarExt") )
            {
               gxTv_SdtConsultadeProduccion_SDT_Item_Barext = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "ConsultadeProduccion_SDT.Item" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtConsultadeProduccion_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNHdr", gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrEst", gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PedidoCliente", gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtConsultadeProduccion_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipArt", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTipArtDsc", gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomCli", gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPie", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSit", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Barsit, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen)) && ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecgen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli)) && ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N == 1 ) )
      {
         oWriter.writeElement("BarFecCli", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecCli", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal)) && ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N == 1 ) )
      {
         oWriter.writeElement("BarFecsal", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecsal", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr)) && ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N == 1 ) )
      {
         oWriter.writeElement("BarFecFpr", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecFpr", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Barfascod", gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarFasSig", gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbUltimo", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbFact", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarGirar", gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAcaAnh", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCuaderno", gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarProPer", gxTv_SdtConsultadeProduccion_SDT_Item_Barproper);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarProPerIdtx", gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNormas", gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUsrCod", gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarExt", GXutil.trim( GXutil.str( gxTv_SdtConsultadeProduccion_SDT_Item_Barext, 1, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtConsultadeProduccion_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtConsultadeProduccion_SDT_Item_Clinom, false, false);
      AddObjectProperty("BarNHdr", gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr, false, false);
      AddObjectProperty("BarAgrEst", gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest, false, false);
      AddObjectProperty("PedidoCliente", gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente, false, false);
      AddObjectProperty("Barser", gxTv_SdtConsultadeProduccion_SDT_Item_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc, false, false);
      AddObjectProperty("BarTipArt", gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart, false, false);
      AddObjectProperty("BarTipArtDsc", gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum, false, false);
      AddObjectProperty("BarNomCli", gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli, false, false);
      AddObjectProperty("BarKgm", gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm, false, false);
      AddObjectProperty("BarMtr", gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr, false, false);
      AddObjectProperty("BarPie", gxTv_SdtConsultadeProduccion_SDT_Item_Barpie, false, false);
      AddObjectProperty("BarSit", gxTv_SdtConsultadeProduccion_SDT_Item_Barsit, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecgen", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecCli", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecsal", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecFpr", sDateCnv, false, false);
      AddObjectProperty("Barfascod", gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod, false, false);
      AddObjectProperty("BarFasSig", gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig, false, false);
      AddObjectProperty("BarAlbUltimo", gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo, false, false);
      AddObjectProperty("BarAlbFact", gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact, false, false);
      AddObjectProperty("BarAlbMts", gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts, false, false);
      AddObjectProperty("BarAlbKgs", gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs, false, false);
      AddObjectProperty("BarGirar", gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar, false, false);
      AddObjectProperty("BarAcaAnh", gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh, false, false);
      AddObjectProperty("BarCuaderno", gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno, false, false);
      AddObjectProperty("BarProPer", gxTv_SdtConsultadeProduccion_SDT_Item_Barproper, false, false);
      AddObjectProperty("BarProPerIdtx", gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx, false, false);
      AddObjectProperty("BarNormas", gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas, false, false);
      AddObjectProperty("DisUsrCod", gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod, false, false);
      AddObjectProperty("Barcod", gxTv_SdtConsultadeProduccion_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("BarExt", gxTv_SdtConsultadeProduccion_SDT_Item_Barext, false, false);
   }

   public int getgxTv_SdtConsultadeProduccion_SDT_Item_Clicod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Clicod( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Clinom( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Clinom( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Baragrest( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Baragrest( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barser( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barser ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barser( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc = value ;
   }

   public short getgxTv_SdtConsultadeProduccion_SDT_Item_Bartipart( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Bartipart( short value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom = value ;
   }

   public int getgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr = value ;
   }

   public int getgxTv_SdtConsultadeProduccion_SDT_Item_Barpie( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barpie ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barpie( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barpie = value ;
   }

   public byte getgxTv_SdtConsultadeProduccion_SDT_Item_Barsit( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barsit ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barsit( byte value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barsit = value ;
   }

   public java.util.Date getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen = value ;
   }

   public java.util.Date getgxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli = value ;
   }

   public java.util.Date getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal = value ;
   }

   public java.util.Date getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barfascod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barfascod( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barfassig( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barfassig( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig = value ;
   }

   public long getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo( long value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo = value ;
   }

   public int getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts = value ;
   }

   public java.math.BigDecimal getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Bargirar( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Bargirar( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar = value ;
   }

   public short getgxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh( short value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barproper( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barproper ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barproper( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproper = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barnormas( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barnormas( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod = value ;
   }

   public int getgxTv_SdtConsultadeProduccion_SDT_Item_Barcod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barcod( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar = value ;
   }

   public byte getgxTv_SdtConsultadeProduccion_SDT_Item_Barext( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barext ;
   }

   public void setgxTv_SdtConsultadeProduccion_SDT_Item_Barext( byte value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barext = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Clinom = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barser = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr = DecimalUtil.ZERO ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen = GXutil.nullDate() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli = GXutil.nullDate() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal = GXutil.nullDate() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr = GXutil.nullDate() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts = DecimalUtil.ZERO ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs = DecimalUtil.ZERO ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproper = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_N ;
   }

   public app.produccion.SdtConsultadeProduccion_SDT_Item Clone( )
   {
      return (app.produccion.SdtConsultadeProduccion_SDT_Item)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtConsultadeProduccion_SDT_Item struct )
   {
      setgxTv_SdtConsultadeProduccion_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Baragrest(struct.getBaragrest());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente(struct.getPedidocliente());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Bartipart(struct.getBartipart());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc(struct.getBartipartdsc());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm(struct.getBarkgm());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr(struct.getBarmtr());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barpie(struct.getBarpie());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barsit(struct.getBarsit());
      if ( struct.gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N == 0 )
      {
         setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen(struct.getBarfecgen());
      }
      if ( struct.gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N == 0 )
      {
         setgxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli(struct.getBarfeccli());
      }
      if ( struct.gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N == 0 )
      {
         setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal(struct.getBarfecsal());
      }
      if ( struct.gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N == 0 )
      {
         setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr(struct.getBarfecfpr());
      }
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barfascod(struct.getBarfascod());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barfassig(struct.getBarfassig());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo(struct.getBaralbultimo());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact(struct.getBaralbfact());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts(struct.getBaralbmts());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs(struct.getBaralbkgs());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Bargirar(struct.getBargirar());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh(struct.getBaracaanh());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno(struct.getBarcuaderno());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barproper(struct.getBarproper());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx(struct.getBarproperidtx());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barnormas(struct.getBarnormas());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod(struct.getDisusrcod());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtConsultadeProduccion_SDT_Item_Barext(struct.getBarext());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtConsultadeProduccion_SDT_Item getStruct( )
   {
      app.produccion.StructSdtConsultadeProduccion_SDT_Item struct = new app.produccion.StructSdtConsultadeProduccion_SDT_Item ();
      struct.setClicod(getgxTv_SdtConsultadeProduccion_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtConsultadeProduccion_SDT_Item_Clinom());
      struct.setBarnhdr(getgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr());
      struct.setBaragrest(getgxTv_SdtConsultadeProduccion_SDT_Item_Baragrest());
      struct.setPedidocliente(getgxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente());
      struct.setBarser(getgxTv_SdtConsultadeProduccion_SDT_Item_Barser());
      struct.setBarserdsc(getgxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc());
      struct.setBartipart(getgxTv_SdtConsultadeProduccion_SDT_Item_Bartipart());
      struct.setBartipartdsc(getgxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc());
      struct.setBarcolnom(getgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum());
      struct.setBarnomcli(getgxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli());
      struct.setBarkgm(getgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm());
      struct.setBarmtr(getgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr());
      struct.setBarpie(getgxTv_SdtConsultadeProduccion_SDT_Item_Barpie());
      struct.setBarsit(getgxTv_SdtConsultadeProduccion_SDT_Item_Barsit());
      if ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N == 0 )
      {
         struct.setBarfecgen(getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen());
      }
      if ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N == 0 )
      {
         struct.setBarfeccli(getgxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli());
      }
      if ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N == 0 )
      {
         struct.setBarfecsal(getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal());
      }
      if ( gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N == 0 )
      {
         struct.setBarfecfpr(getgxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr());
      }
      struct.setBarfascod(getgxTv_SdtConsultadeProduccion_SDT_Item_Barfascod());
      struct.setBarfassig(getgxTv_SdtConsultadeProduccion_SDT_Item_Barfassig());
      struct.setBaralbultimo(getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo());
      struct.setBaralbfact(getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact());
      struct.setBaralbmts(getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts());
      struct.setBaralbkgs(getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs());
      struct.setBargirar(getgxTv_SdtConsultadeProduccion_SDT_Item_Bargirar());
      struct.setBaracaanh(getgxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh());
      struct.setBarcuaderno(getgxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno());
      struct.setBarproper(getgxTv_SdtConsultadeProduccion_SDT_Item_Barproper());
      struct.setBarproperidtx(getgxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx());
      struct.setBarnormas(getgxTv_SdtConsultadeProduccion_SDT_Item_Barnormas());
      struct.setDisusrcod(getgxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod());
      struct.setBarcod(getgxTv_SdtConsultadeProduccion_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar());
      struct.setBarext(getgxTv_SdtConsultadeProduccion_SDT_Item_Barext());
      return struct ;
   }

   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barsit ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barext ;
   protected short gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart ;
   protected short gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Clicod ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Barpie ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Barcod ;
   protected long gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Clinom ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barser ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barproper ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas ;
}

