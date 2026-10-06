package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAnalisisCostesHistoricosRecetas_SDT extends GxUserType
{
   public SdtAnalisisCostesHistoricosRecetas_SDT( )
   {
      this(  new ModelContext(SdtAnalisisCostesHistoricosRecetas_SDT.class));
   }

   public SdtAnalisisCostesHistoricosRecetas_SDT( ModelContext context )
   {
      super( context, "SdtAnalisisCostesHistoricosRecetas_SDT");
   }

   public SdtAnalisisCostesHistoricosRecetas_SDT( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtAnalisisCostesHistoricosRecetas_SDT");
   }

   public SdtAnalisisCostesHistoricosRecetas_SDT( StructSdtAnalisisCostesHistoricosRecetas_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ToA") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreFectin") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin = GXutil.nullDate() ;
                  gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N = (byte)(0) ;
                  gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Marca") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hdr") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hrebarcod") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hrebarreo") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreBarpar") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrest") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreBarKgm") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreTotKgm") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreMaqcod") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreVolPrd") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Rb") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costei") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CosteT") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Dif") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Porc") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Costek") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hrebarser") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreBarDsc") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreTipArtd") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreColnom") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreColNum") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreTipColN") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreIntDsc") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EncCli") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAgrlot") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CostesQuimicosI") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CostesQuimicosA") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItemOrderSDT") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreProCod") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HreProDsc") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrvDsc") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TablaA") )
            {
               gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "AnalisisCostesHistoricosRecetas_SDT" ;
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
      oWriter.writeElement("ToA", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin)) && ( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N == 1 ) )
      {
         oWriter.writeElement("HreFectin", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HreFectin", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Marca", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hdr", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hrebarcod", GXutil.trim( GXutil.str( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hrebarreo", GXutil.trim( GXutil.str( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreBarpar", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrest", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreBarKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreTotKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreMaqcod", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreVolPrd", GXutil.trim( GXutil.str( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Rb", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Costei", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CosteT", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Dif", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Porc", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Costek", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hrebarser", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreBarDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreTipArtd", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreColnom", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreColNum", GXutil.trim( GXutil.str( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreTipColN", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreIntDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EncCli", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAgrlot", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CostesQuimicosI", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CostesQuimicosA", GXutil.trim( GXutil.strNoRound( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ItemOrderSDT", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreProCod", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HreProDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrvDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TablaA", GXutil.trim( GXutil.str( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa, 1, 0)));
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
      AddObjectProperty("ToA", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HreFectin", sDateCnv, false, false);
      AddObjectProperty("Marca", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca, false, false);
      AddObjectProperty("Hdr", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr, false, false);
      AddObjectProperty("Hrebarcod", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod, false, false);
      AddObjectProperty("Hrebarreo", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo, false, false);
      AddObjectProperty("HreBarpar", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar, false, false);
      AddObjectProperty("BarAgrest", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest, false, false);
      AddObjectProperty("HreBarKgm", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm, false, false);
      AddObjectProperty("HreTotKgm", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm, false, false);
      AddObjectProperty("HreMaqcod", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod, false, false);
      AddObjectProperty("HreVolPrd", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd, false, false);
      AddObjectProperty("Rb", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb, false, false);
      AddObjectProperty("Costei", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei, false, false);
      AddObjectProperty("CosteT", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet, false, false);
      AddObjectProperty("Dif", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif, false, false);
      AddObjectProperty("Porc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc, false, false);
      AddObjectProperty("Costek", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek, false, false);
      AddObjectProperty("Clicod", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom, false, false);
      AddObjectProperty("Hrebarser", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser, false, false);
      AddObjectProperty("HreBarDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc, false, false);
      AddObjectProperty("HreTipArtd", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd, false, false);
      AddObjectProperty("HreColnom", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom, false, false);
      AddObjectProperty("HreColNum", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum, false, false);
      AddObjectProperty("HreTipColN", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln, false, false);
      AddObjectProperty("HreIntDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc, false, false);
      AddObjectProperty("EncCli", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli, false, false);
      AddObjectProperty("BarAgrlot", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot, false, false);
      AddObjectProperty("CostesQuimicosI", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi, false, false);
      AddObjectProperty("CostesQuimicosA", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa, false, false);
      AddObjectProperty("ItemOrderSDT", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt, false, false);
      AddObjectProperty("HreProCod", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod, false, false);
      AddObjectProperty("HreProDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc, false, false);
      AddObjectProperty("PrvDsc", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc, false, false);
      AddObjectProperty("TablaA", gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa, false, false);
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa = value ;
   }

   public java.util.Date getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin( java.util.Date value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr = value ;
   }

   public int getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod( int value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod = value ;
   }

   public byte getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo( byte value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod = value ;
   }

   public int getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd( int value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek = value ;
   }

   public int getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod( int value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom = value ;
   }

   public int getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum( int value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa( java.math.BigDecimal value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc = value ;
   }

   public String getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc( String value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc = value ;
   }

   public byte getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa ;
   }

   public void setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa( byte value )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(0) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N = (byte)(1) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin = GXutil.nullDate() ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N = (byte)(1) ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa = DecimalUtil.ZERO ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc = "" ;
      gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N ;
   }

   public app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT Clone( )
   {
      return (app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)(clone()) ;
   }

   public void setStruct( app.formulaciontinte.StructSdtAnalisisCostesHistoricosRecetas_SDT struct )
   {
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa(struct.getToa());
      if ( struct.gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N == 0 )
      {
         setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin(struct.getHrefectin());
      }
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca(struct.getMarca());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr(struct.getHdr());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod(struct.getHrebarcod());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo(struct.getHrebarreo());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar(struct.getHrebarpar());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest(struct.getBaragrest());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm(struct.getHrebarkgm());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm(struct.getHretotkgm());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod(struct.getHremaqcod());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd(struct.getHrevolprd());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb(struct.getRb());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei(struct.getCostei());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet(struct.getCostet());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif(struct.getDif());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc(struct.getPorc());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek(struct.getCostek());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod(struct.getClicod());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom(struct.getClinom());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser(struct.getHrebarser());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc(struct.getHrebardsc());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd(struct.getHretipartd());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom(struct.getHrecolnom());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum(struct.getHrecolnum());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln(struct.getHretipcoln());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc(struct.getHreintdsc());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli(struct.getEnccli());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot(struct.getBaragrlot());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi(struct.getCostesquimicosi());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa(struct.getCostesquimicosa());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt(struct.getItemordersdt());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod(struct.getHreprocod());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc(struct.getHreprodsc());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc(struct.getPrvdsc());
      setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa(struct.getTablaa());
   }

   @SuppressWarnings("unchecked")
   public app.formulaciontinte.StructSdtAnalisisCostesHistoricosRecetas_SDT getStruct( )
   {
      app.formulaciontinte.StructSdtAnalisisCostesHistoricosRecetas_SDT struct = new app.formulaciontinte.StructSdtAnalisisCostesHistoricosRecetas_SDT ();
      struct.setToa(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa());
      if ( gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N == 0 )
      {
         struct.setHrefectin(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin());
      }
      struct.setMarca(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca());
      struct.setHdr(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr());
      struct.setHrebarcod(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod());
      struct.setHrebarreo(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo());
      struct.setHrebarpar(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar());
      struct.setBaragrest(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest());
      struct.setHrebarkgm(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm());
      struct.setHretotkgm(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm());
      struct.setHremaqcod(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod());
      struct.setHrevolprd(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd());
      struct.setRb(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb());
      struct.setCostei(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei());
      struct.setCostet(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet());
      struct.setDif(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif());
      struct.setPorc(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc());
      struct.setCostek(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek());
      struct.setClicod(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod());
      struct.setClinom(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom());
      struct.setHrebarser(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser());
      struct.setHrebardsc(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc());
      struct.setHretipartd(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd());
      struct.setHrecolnom(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom());
      struct.setHrecolnum(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum());
      struct.setHretipcoln(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln());
      struct.setHreintdsc(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc());
      struct.setEnccli(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli());
      struct.setBaragrlot(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot());
      struct.setCostesquimicosi(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi());
      struct.setCostesquimicosa(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa());
      struct.setItemordersdt(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt());
      struct.setHreprocod(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod());
      struct.setHreprodsc(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc());
      struct.setPrvdsc(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc());
      struct.setTablaa(getgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa());
      return struct ;
   }

   protected byte gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_N ;
   protected byte gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin_N ;
   protected byte gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo ;
   protected byte gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod ;
   protected int gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd ;
   protected int gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod ;
   protected int gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi ;
   protected java.math.BigDecimal gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc ;
   protected String gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin ;
   protected boolean readElement ;
   protected boolean formatError ;
}

