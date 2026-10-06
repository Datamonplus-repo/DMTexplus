package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPrecios_cliente_SDT_Item extends GxUserType
{
   public SdtPrecios_cliente_SDT_Item( )
   {
      this(  new ModelContext(SdtPrecios_cliente_SDT_Item.class));
   }

   public SdtPrecios_cliente_SDT_Item( ModelContext context )
   {
      super( context, "SdtPrecios_cliente_SDT_Item");
   }

   public SdtPrecios_cliente_SDT_Item( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtPrecios_cliente_SDT_Item");
   }

   public SdtPrecios_cliente_SDT_Item( StructSdtPrecios_cliente_SDT_Item struct )
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
               gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forser") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForSerdsc") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnum") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipcolcod") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnom") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForNomcli") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IntDsc") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Intdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Grdtipart") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cr") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Cr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcan") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forcan = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PC") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Pc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MV") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Mv = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PV") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Pv = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "C_M") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_C_m = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cm") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Cm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fi") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Fi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ti") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Ti = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mc") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Mc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "F_i") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_F_i = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NewPreKgm") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Obs") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Obs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPrefec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPrecios_cliente_SDT_Item_Forprefec = GXutil.nullDate() ;
                  gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N = (byte)(0) ;
                  gxTv_SdtPrecios_cliente_SDT_Item_Forprefec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForFecant") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtPrecios_cliente_SDT_Item_Forfecant = GXutil.nullDate() ;
                  gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N = (byte)(0) ;
                  gxTv_SdtPrecios_cliente_SDT_Item_Forfecant = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtDsc") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Artdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fortonal") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Fortonal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fam_cod") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForCosUti") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OldClasse") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForRelban") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Forrelban = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OldPreKgm") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fornumcol") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliTipo") )
            {
               gxTv_SdtPrecios_cliente_SDT_Item_Clitipo = oReader.getValue() ;
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
         sName = "Precios_cliente_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtPrecios_cliente_SDT_Item_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forser", gxTv_SdtPrecios_cliente_SDT_Item_Forser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForSerdsc", gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnum", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tipcolcod", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnom", gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForNomcli", gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("IntDsc", gxTv_SdtPrecios_cliente_SDT_Item_Intdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Grdtipart", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cr", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Cr, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcan", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Forcan, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PC", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Pc, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MV", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Mv, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PV", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Pv, 10, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("C_M", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_C_m, 11, 8)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Cm, 11, 8)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fi", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Fi, 11, 8)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ti", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Ti, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mc", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Mc, 7, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("F_i", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_F_i, 8, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NewPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm, 6, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Obs", gxTv_SdtPrecios_cliente_SDT_Item_Obs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtPrecios_cliente_SDT_Item_Forprefec)) && ( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N == 1 ) )
      {
         oWriter.writeElement("ForPrefec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForPrefec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtPrecios_cliente_SDT_Item_Forfecant)) && ( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N == 1 ) )
      {
         oWriter.writeElement("ForFecant", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForFecant", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtDsc", gxTv_SdtPrecios_cliente_SDT_Item_Artdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fortonal", gxTv_SdtPrecios_cliente_SDT_Item_Fortonal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fam_cod", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForCosUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OldClasse", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForRelban", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Forrelban, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OldPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm, 6, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fornumcol", GXutil.trim( GXutil.str( gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliTipo", gxTv_SdtPrecios_cliente_SDT_Item_Clitipo);
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
      AddObjectProperty("Seleccionar", gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("EmprCod", gxTv_SdtPrecios_cliente_SDT_Item_Emprcod, false, false);
      AddObjectProperty("CliCod", gxTv_SdtPrecios_cliente_SDT_Item_Clicod, false, false);
      AddObjectProperty("Forser", gxTv_SdtPrecios_cliente_SDT_Item_Forser, false, false);
      AddObjectProperty("ForSerdsc", gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc, false, false);
      AddObjectProperty("Forcolnum", gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum, false, false);
      AddObjectProperty("Tipcolcod", gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod, false, false);
      AddObjectProperty("Forcolnom", gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom, false, false);
      AddObjectProperty("ForNomcli", gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli, false, false);
      AddObjectProperty("IntDsc", gxTv_SdtPrecios_cliente_SDT_Item_Intdsc, false, false);
      AddObjectProperty("Grdtipart", gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart, false, false);
      AddObjectProperty("Cr", gxTv_SdtPrecios_cliente_SDT_Item_Cr, false, false);
      AddObjectProperty("Forcan", gxTv_SdtPrecios_cliente_SDT_Item_Forcan, false, false);
      AddObjectProperty("PC", gxTv_SdtPrecios_cliente_SDT_Item_Pc, false, false);
      AddObjectProperty("MV", gxTv_SdtPrecios_cliente_SDT_Item_Mv, false, false);
      AddObjectProperty("PV", gxTv_SdtPrecios_cliente_SDT_Item_Pv, false, false);
      AddObjectProperty("C_M", gxTv_SdtPrecios_cliente_SDT_Item_C_m, false, false);
      AddObjectProperty("Cm", gxTv_SdtPrecios_cliente_SDT_Item_Cm, false, false);
      AddObjectProperty("Fi", gxTv_SdtPrecios_cliente_SDT_Item_Fi, false, false);
      AddObjectProperty("Ti", gxTv_SdtPrecios_cliente_SDT_Item_Ti, false, false);
      AddObjectProperty("Mc", gxTv_SdtPrecios_cliente_SDT_Item_Mc, false, false);
      AddObjectProperty("F_i", gxTv_SdtPrecios_cliente_SDT_Item_F_i, false, false);
      AddObjectProperty("NewPreKgm", gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm, false, false);
      AddObjectProperty("Obs", gxTv_SdtPrecios_cliente_SDT_Item_Obs, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForPrefec", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForFecant", sDateCnv, false, false);
      AddObjectProperty("TipArtDsc", gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc, false, false);
      AddObjectProperty("ArtDsc", gxTv_SdtPrecios_cliente_SDT_Item_Artdsc, false, false);
      AddObjectProperty("Fortonal", gxTv_SdtPrecios_cliente_SDT_Item_Fortonal, false, false);
      AddObjectProperty("Fam_cod", gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod, false, false);
      AddObjectProperty("ForCosUti", gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti, false, false);
      AddObjectProperty("OldClasse", gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse, false, false);
      AddObjectProperty("ForRelban", gxTv_SdtPrecios_cliente_SDT_Item_Forrelban, false, false);
      AddObjectProperty("OldPreKgm", gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm, false, false);
      AddObjectProperty("Fornumcol", gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol, false, false);
      AddObjectProperty("CliTipo", gxTv_SdtPrecios_cliente_SDT_Item_Clitipo, false, false);
   }

   public boolean getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Emprcod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Emprcod ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Emprcod( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Emprcod = value ;
   }

   public int getgxTv_SdtPrecios_cliente_SDT_Item_Clicod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Clicod( int value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Forser( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forser ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forser( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forser = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc = value ;
   }

   public int getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum( int value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum = value ;
   }

   public byte getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod( byte value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Intdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Intdsc ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Intdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Intdsc = value ;
   }

   public short getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Cr( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Cr ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Cr( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Forcan( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcan ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forcan( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcan = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Pc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Pc ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Pc( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Mv( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Mv ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Mv( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mv = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Pv( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Pv ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Pv( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pv = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_C_m( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_C_m ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_C_m( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_C_m = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Cm( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Cm ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Cm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Fi( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fi ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Fi( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fi = value ;
   }

   public short getgxTv_SdtPrecios_cliente_SDT_Item_Ti( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Ti ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Ti( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Ti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Mc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Mc ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Mc( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_F_i( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_F_i ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_F_i( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_F_i = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Obs( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Obs ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Obs( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Obs = value ;
   }

   public java.util.Date getgxTv_SdtPrecios_cliente_SDT_Item_Forprefec( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forprefec ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forprefec( java.util.Date value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec = value ;
   }

   public java.util.Date getgxTv_SdtPrecios_cliente_SDT_Item_Forfecant( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forfecant ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forfecant( java.util.Date value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Artdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Artdsc ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Artdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Artdsc = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Fortonal( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fortonal ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Fortonal( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fortonal = value ;
   }

   public short getgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti = value ;
   }

   public short getgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forrelban ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Forrelban( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forrelban = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm = value ;
   }

   public int getgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol( int value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol = value ;
   }

   public String getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Clitipo ;
   }

   public void setgxTv_SdtPrecios_cliente_SDT_Item_Clitipo( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Clitipo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(1) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Emprcod = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forser = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Intdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cr = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcan = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pc = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mv = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pv = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_C_m = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cm = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fi = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mc = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_F_i = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Obs = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec = GXutil.nullDate() ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N = (byte)(1) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant = GXutil.nullDate() ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N = (byte)(1) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Artdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fortonal = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forrelban = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm = DecimalUtil.ZERO ;
      gxTv_SdtPrecios_cliente_SDT_Item_Clitipo = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_N ;
   }

   public app.facturacion.SdtPrecios_cliente_SDT_Item Clone( )
   {
      return (app.facturacion.SdtPrecios_cliente_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtPrecios_cliente_SDT_Item struct )
   {
      setgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtPrecios_cliente_SDT_Item_Emprcod(struct.getEmprcod());
      setgxTv_SdtPrecios_cliente_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forser(struct.getForser());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc(struct.getForserdsc());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum(struct.getForcolnum());
      setgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod(struct.getTipcolcod());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom(struct.getForcolnom());
      setgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli(struct.getFornomcli());
      setgxTv_SdtPrecios_cliente_SDT_Item_Intdsc(struct.getIntdsc());
      setgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart(struct.getGrdtipart());
      setgxTv_SdtPrecios_cliente_SDT_Item_Cr(struct.getCr());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forcan(struct.getForcan());
      setgxTv_SdtPrecios_cliente_SDT_Item_Pc(struct.getPc());
      setgxTv_SdtPrecios_cliente_SDT_Item_Mv(struct.getMv());
      setgxTv_SdtPrecios_cliente_SDT_Item_Pv(struct.getPv());
      setgxTv_SdtPrecios_cliente_SDT_Item_C_m(struct.getC_m());
      setgxTv_SdtPrecios_cliente_SDT_Item_Cm(struct.getCm());
      setgxTv_SdtPrecios_cliente_SDT_Item_Fi(struct.getFi());
      setgxTv_SdtPrecios_cliente_SDT_Item_Ti(struct.getTi());
      setgxTv_SdtPrecios_cliente_SDT_Item_Mc(struct.getMc());
      setgxTv_SdtPrecios_cliente_SDT_Item_F_i(struct.getF_i());
      setgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm(struct.getNewprekgm());
      setgxTv_SdtPrecios_cliente_SDT_Item_Obs(struct.getObs());
      if ( struct.gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N == 0 )
      {
         setgxTv_SdtPrecios_cliente_SDT_Item_Forprefec(struct.getForprefec());
      }
      if ( struct.gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N == 0 )
      {
         setgxTv_SdtPrecios_cliente_SDT_Item_Forfecant(struct.getForfecant());
      }
      setgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtPrecios_cliente_SDT_Item_Artdsc(struct.getArtdsc());
      setgxTv_SdtPrecios_cliente_SDT_Item_Fortonal(struct.getFortonal());
      setgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod(struct.getFam_cod());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti(struct.getForcosuti());
      setgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse(struct.getOldclasse());
      setgxTv_SdtPrecios_cliente_SDT_Item_Forrelban(struct.getForrelban());
      setgxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm(struct.getOldprekgm());
      setgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol(struct.getFornumcol());
      setgxTv_SdtPrecios_cliente_SDT_Item_Clitipo(struct.getClitipo());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtPrecios_cliente_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtPrecios_cliente_SDT_Item struct = new app.facturacion.StructSdtPrecios_cliente_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtPrecios_cliente_SDT_Item_Seleccionar());
      struct.setEmprcod(getgxTv_SdtPrecios_cliente_SDT_Item_Emprcod());
      struct.setClicod(getgxTv_SdtPrecios_cliente_SDT_Item_Clicod());
      struct.setForser(getgxTv_SdtPrecios_cliente_SDT_Item_Forser());
      struct.setForserdsc(getgxTv_SdtPrecios_cliente_SDT_Item_Forserdsc());
      struct.setForcolnum(getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnum());
      struct.setTipcolcod(getgxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod());
      struct.setForcolnom(getgxTv_SdtPrecios_cliente_SDT_Item_Forcolnom());
      struct.setFornomcli(getgxTv_SdtPrecios_cliente_SDT_Item_Fornomcli());
      struct.setIntdsc(getgxTv_SdtPrecios_cliente_SDT_Item_Intdsc());
      struct.setGrdtipart(getgxTv_SdtPrecios_cliente_SDT_Item_Grdtipart());
      struct.setCr(getgxTv_SdtPrecios_cliente_SDT_Item_Cr());
      struct.setForcan(getgxTv_SdtPrecios_cliente_SDT_Item_Forcan());
      struct.setPc(getgxTv_SdtPrecios_cliente_SDT_Item_Pc());
      struct.setMv(getgxTv_SdtPrecios_cliente_SDT_Item_Mv());
      struct.setPv(getgxTv_SdtPrecios_cliente_SDT_Item_Pv());
      struct.setC_m(getgxTv_SdtPrecios_cliente_SDT_Item_C_m());
      struct.setCm(getgxTv_SdtPrecios_cliente_SDT_Item_Cm());
      struct.setFi(getgxTv_SdtPrecios_cliente_SDT_Item_Fi());
      struct.setTi(getgxTv_SdtPrecios_cliente_SDT_Item_Ti());
      struct.setMc(getgxTv_SdtPrecios_cliente_SDT_Item_Mc());
      struct.setF_i(getgxTv_SdtPrecios_cliente_SDT_Item_F_i());
      struct.setNewprekgm(getgxTv_SdtPrecios_cliente_SDT_Item_Newprekgm());
      struct.setObs(getgxTv_SdtPrecios_cliente_SDT_Item_Obs());
      if ( gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N == 0 )
      {
         struct.setForprefec(getgxTv_SdtPrecios_cliente_SDT_Item_Forprefec());
      }
      if ( gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N == 0 )
      {
         struct.setForfecant(getgxTv_SdtPrecios_cliente_SDT_Item_Forfecant());
      }
      struct.setTipartdsc(getgxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc());
      struct.setArtdsc(getgxTv_SdtPrecios_cliente_SDT_Item_Artdsc());
      struct.setFortonal(getgxTv_SdtPrecios_cliente_SDT_Item_Fortonal());
      struct.setFam_cod(getgxTv_SdtPrecios_cliente_SDT_Item_Fam_cod());
      struct.setForcosuti(getgxTv_SdtPrecios_cliente_SDT_Item_Forcosuti());
      struct.setOldclasse(getgxTv_SdtPrecios_cliente_SDT_Item_Oldclasse());
      struct.setForrelban(getgxTv_SdtPrecios_cliente_SDT_Item_Forrelban());
      struct.setOldprekgm(getgxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm());
      struct.setFornumcol(getgxTv_SdtPrecios_cliente_SDT_Item_Fornumcol());
      struct.setClitipo(getgxTv_SdtPrecios_cliente_SDT_Item_Clitipo());
      return struct ;
   }

   protected byte gxTv_SdtPrecios_cliente_SDT_Item_N ;
   protected byte gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N ;
   protected byte gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Ti ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtPrecios_cliente_SDT_Item_Clicod ;
   protected int gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum ;
   protected int gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Cr ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Forcan ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Pc ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Mv ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Pv ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_C_m ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Cm ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Fi ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Mc ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_F_i ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Forrelban ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Emprcod ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Forser ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Intdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Obs ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Artdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Fortonal ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Clitipo ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtPrecios_cliente_SDT_Item_Forprefec ;
   protected java.util.Date gxTv_SdtPrecios_cliente_SDT_Item_Forfecant ;
   protected boolean gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

