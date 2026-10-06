package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTrabajoExterno_Recepcion_SDT_Item extends GxUserType
{
   public SdtTrabajoExterno_Recepcion_SDT_Item( )
   {
      this(  new ModelContext(SdtTrabajoExterno_Recepcion_SDT_Item.class));
   }

   public SdtTrabajoExterno_Recepcion_SDT_Item( ModelContext context )
   {
      super( context, "SdtTrabajoExterno_Recepcion_SDT_Item");
   }

   public SdtTrabajoExterno_Recepcion_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtTrabajoExterno_Recepcion_SDT_Item");
   }

   public SdtTrabajoExterno_Recepcion_SDT_Item( StructSdtTrabajoExterno_Recepcion_SDT_Item struct )
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
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtAlb") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExNln") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExtFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec = GXutil.nullDate() ;
                  gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N = (byte)(0) ;
                  gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCodn") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdCns") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdKgs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdMts") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RpExHdTip") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CerrarFase") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "oldKgs") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "oldMts") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "oldCns") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomcli") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OrdLin") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mancod") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUniMed") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ExhDpz") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SalExEsb") )
            {
               gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TrabajoExterno_Recepcion_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SalExtAlb", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SalExNln", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec)) && ( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N == 1 ) )
      {
         oWriter.writeElement("SalExtFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("SalExtFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCodn", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdCns", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RpExHdTip", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CerrarFase", GXutil.booltostr( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("oldKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("oldMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("oldCns", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomcli", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OrdLin", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mancod", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUniMed", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ExhDpz", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SalExEsb", GXutil.trim( GXutil.str( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb, 1, 0)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("SalExtAlb", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb, false, false);
      AddObjectProperty("SalExNln", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("SalExtFec", sDateCnv, false, false);
      AddObjectProperty("Barcod", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("Clicod", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom, false, false);
      AddObjectProperty("Barser", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc, false, false);
      AddObjectProperty("FasCodn", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc, false, false);
      AddObjectProperty("RpExHdCns", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns, false, false);
      AddObjectProperty("RpExHdKgs", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs, false, false);
      AddObjectProperty("RpExHdMts", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts, false, false);
      AddObjectProperty("RpExHdTip", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip, false, false);
      AddObjectProperty("CerrarFase", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase, false, false);
      AddObjectProperty("oldKgs", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs, false, false);
      AddObjectProperty("oldMts", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts, false, false);
      AddObjectProperty("oldCns", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns, false, false);
      AddObjectProperty("BarNomcli", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli, false, false);
      AddObjectProperty("OrdLin", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin, false, false);
      AddObjectProperty("Mancod", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("BarUniMed", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed, false, false);
      AddObjectProperty("ExhDpz", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz, false, false);
      AddObjectProperty("SalExEsb", gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb, false, false);
   }

   public boolean getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln = value ;
   }

   public java.util.Date getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec( java.util.Date value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar = value ;
   }

   public int getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod( int value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip = value ;
   }

   public boolean getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase( boolean value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts( java.math.BigDecimal value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin = value ;
   }

   public short getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod( short value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom = value ;
   }

   public String getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed( String value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed = value ;
   }

   public byte getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz = value ;
   }

   public byte getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb ;
   }

   public void setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb( byte value )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec = GXutil.nullDate() ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N = (byte)(1) ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts = DecimalUtil.ZERO ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom = "" ;
      gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N ;
   }

   public app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item Clone( )
   {
      return (app.trabajosexternos.SdtTrabajoExterno_Recepcion_SDT_Item)(clone()) ;
   }

   public void setStruct( app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_SDT_Item struct )
   {
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb(struct.getSalextalb());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln(struct.getSalexnln());
      if ( struct.gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N == 0 )
      {
         setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec(struct.getSalextfec());
      }
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn(struct.getFascodn());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc(struct.getFasdsc());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns(struct.getRpexhdcns());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs(struct.getRpexhdkgs());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts(struct.getRpexhdmts());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip(struct.getRpexhdtip());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase(struct.getCerrarfase());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs(struct.getOldkgs());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts(struct.getOldmts());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns(struct.getOldcns());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin(struct.getOrdlin());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod(struct.getMancod());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed(struct.getBarunimed());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz(struct.getExhdpz());
      setgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb(struct.getSalexesb());
   }

   @SuppressWarnings("unchecked")
   public app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_SDT_Item getStruct( )
   {
      app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_SDT_Item struct = new app.trabajosexternos.StructSdtTrabajoExterno_Recepcion_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar());
      struct.setSalextalb(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb());
      struct.setSalexnln(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln());
      if ( gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N == 0 )
      {
         struct.setSalextfec(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec());
      }
      struct.setBarcod(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar());
      struct.setClicod(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom());
      struct.setBarser(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser());
      struct.setBarserdsc(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc());
      struct.setFascodn(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn());
      struct.setFasdsc(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc());
      struct.setRpexhdcns(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns());
      struct.setRpexhdkgs(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs());
      struct.setRpexhdmts(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts());
      struct.setRpexhdtip(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip());
      struct.setCerrarfase(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase());
      struct.setOldkgs(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs());
      struct.setOldmts(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts());
      struct.setOldcns(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns());
      struct.setBarnomcli(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli());
      struct.setOrdlin(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin());
      struct.setMancod(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod());
      struct.setBarcolnom(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom());
      struct.setBarunimed(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed());
      struct.setExhdpz(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz());
      struct.setSalexesb(getgxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb());
      return struct ;
   }

   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_N ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec_N ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Exhdpz ;
   protected byte gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexesb ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salexnln ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdcns ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldcns ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Ordlin ;
   protected short gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Mancod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextalb ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcod ;
   protected int gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdmts ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldkgs ;
   protected java.math.BigDecimal gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Oldmts ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcodpar ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Clinom ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barser ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barserdsc ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fascodn ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Fasdsc ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Rpexhdtip ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barnomcli ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barcolnom ;
   protected String gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Barunimed ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Salextfec ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtTrabajoExterno_Recepcion_SDT_Item_Cerrarfase ;
   protected boolean readElement ;
   protected boolean formatError ;
}

