package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTrabajoExterno_Recepcion_Mto_SDT_Item extends GxUserType
{
   public SdtTrabajoExterno_Recepcion_Mto_SDT_Item( )
   {
      this(  new ModelContext(SdtTrabajoExterno_Recepcion_Mto_SDT_Item.class));
   }

   public SdtTrabajoExterno_Recepcion_Mto_SDT_Item( ModelContext context )
   {
      super( context, "SdtTrabajoExterno_Recepcion_Mto_SDT_Item");
   }

   public SdtTrabajoExterno_Recepcion_Mto_SDT_Item( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtTrabajoExterno_Recepcion_Mto_SDT_Item");
   }

   public SdtTrabajoExterno_Recepcion_Mto_SDT_Item( StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item struct )
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
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdFe") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe = GXutil.nullDate() ;
                  gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N = (byte)(0) ;
                  gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdAlb") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdLi") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSer") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSerDsc") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdKgs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdMts") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdCns") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExSalLn") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdTip") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kgs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mts") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Pzs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OldKgs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OldMts") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OldPzs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUniMed") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CerrarFase") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarOrdlin") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TrabajoExterno_Recepcion_Mto_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe)) && ( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N == 1 ) )
      {
         oWriter.writeElement("RpExHdFe", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("RpExHdFe", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("RpExHdAlb", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdLi", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSer", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSerDsc", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdCns", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExSalLn", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdTip", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mts", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Pzs", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OldKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OldMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OldPzs", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUniMed", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CerrarFase", GXutil.booltostr( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarOrdlin", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin, 4, 0)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("RpExHdFe", sDateCnv, false, false);
      AddObjectProperty("RpExHdAlb", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb, false, false);
      AddObjectProperty("RpExHdLi", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli, false, false);
      AddObjectProperty("BarCod", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("CliCod", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom, false, false);
      AddObjectProperty("BarSer", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser, false, false);
      AddObjectProperty("BarSerDsc", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc, false, false);
      AddObjectProperty("RpExHdKgs", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs, false, false);
      AddObjectProperty("RpExHdMts", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts, false, false);
      AddObjectProperty("RpExHdCns", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns, false, false);
      AddObjectProperty("RpExSalLn", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln, false, false);
      AddObjectProperty("RpExHdTip", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip, false, false);
      AddObjectProperty("Kgs", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs, false, false);
      AddObjectProperty("Mts", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts, false, false);
      AddObjectProperty("Pzs", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs, false, false);
      AddObjectProperty("OldKgs", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs, false, false);
      AddObjectProperty("OldMts", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts, false, false);
      AddObjectProperty("OldPzs", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs, false, false);
      AddObjectProperty("BarUniMed", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed, false, false);
      AddObjectProperty("CerrarFase", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase, false, false);
      AddObjectProperty("Fascod", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod, false, false);
      AddObjectProperty("BarOrdlin", gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin, false, false);
   }

   public boolean getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar = value ;
   }

   public java.util.Date getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe( java.util.Date value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed = value ;
   }

   public boolean getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe = GXutil.nullDate() ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N ;
   }

   public app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item Clone( )
   {
      return (app.trabajosexternos.SdtTrabajoExterno_Recepcion_Mto_SDT_Item)(clone()) ;
   }

   public void setStruct( app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item struct )
   {
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar(struct.getSeleccionar());
      if ( struct.gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N == 0 )
      {
         setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe(struct.getRpexhdfe());
      }
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb(struct.getRpexhdalb());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli(struct.getRpexhdli());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs(struct.getRpexhdkgs());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts(struct.getRpexhdmts());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns(struct.getRpexhdcns());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln(struct.getRpexsalln());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip(struct.getRpexhdtip());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs(struct.getKgs());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts(struct.getMts());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs(struct.getPzs());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs(struct.getOldkgs());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts(struct.getOldmts());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs(struct.getOldpzs());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed(struct.getBarunimed());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase(struct.getCerrarfase());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin(struct.getBarordlin());
   }

   @SuppressWarnings("unchecked")
   public app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item getStruct( )
   {
      app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item struct = new app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_Mto_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar());
      if ( gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N == 0 )
      {
         struct.setRpexhdfe(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe());
      }
      struct.setRpexhdalb(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb());
      struct.setRpexhdli(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli());
      struct.setBarcod(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar());
      struct.setClicod(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom());
      struct.setBarser(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser());
      struct.setBarserdsc(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc());
      struct.setRpexhdkgs(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs());
      struct.setRpexhdmts(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts());
      struct.setRpexhdcns(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns());
      struct.setRpexsalln(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln());
      struct.setRpexhdtip(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip());
      struct.setKgs(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs());
      struct.setMts(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts());
      struct.setPzs(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs());
      struct.setOldkgs(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs());
      struct.setOldmts(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts());
      struct.setOldpzs(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs());
      struct.setBarunimed(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed());
      struct.setCerrarfase(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase());
      struct.setFascod(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod());
      struct.setBarordlin(getgxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin());
      return struct ;
   }

   protected byte gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_N ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe_N ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodreo ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdli ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdcns ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexsalln ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barordlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdalb ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clicod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Pzs ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldpzs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdmts ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Kgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Mts ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Oldmts ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barcodpar ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Clinom ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barser ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barserdsc ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdtip ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Barunimed ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Fascod ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Rpexhdfe ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_Mto_SDT_Item_Cerrarfase ;
   protected boolean readElement ;
   protected boolean formatError ;
}

