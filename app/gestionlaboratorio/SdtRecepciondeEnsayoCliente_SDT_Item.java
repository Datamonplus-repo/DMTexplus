package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRecepciondeEnsayoCliente_SDT_Item extends GxUserType
{
   public SdtRecepciondeEnsayoCliente_SDT_Item( )
   {
      this(  new ModelContext(SdtRecepciondeEnsayoCliente_SDT_Item.class));
   }

   public SdtRecepciondeEnsayoCliente_SDT_Item( ModelContext context )
   {
      super( context, "SdtRecepciondeEnsayoCliente_SDT_Item");
   }

   public SdtRecepciondeEnsayoCliente_SDT_Item( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtRecepciondeEnsayoCliente_SDT_Item");
   }

   public SdtRecepciondeEnsayoCliente_SDT_Item( StructSdtRecepciondeEnsayoCliente_SDT_Item struct )
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
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numero") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_artcod") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lb_colnomC") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_colnum") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_rb") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_opcion") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_TipRec") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numop") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Cartaz") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_fechaE") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae = GXutil.nullDate() ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N = (byte)(0) ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_FechaEn") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen = GXutil.nullDate() ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N = (byte)(0) ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_fechaR") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar = GXutil.nullDate() ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N = (byte)(0) ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_estado") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Eliminar") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_ProvDef") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_ObsCR") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_opst") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Opfc") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc = GXutil.nullDate() ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N = (byte)(0) ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clinom") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "F_Cformu") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForNumCol") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_costee") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipcolcod") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_colnom") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForUltUti") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti = GXutil.nullDate() ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N = (byte)(0) ;
                  gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_RGB") )
            {
               gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "RecepciondeEnsayoCliente_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_numero", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_artcod", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lb_colnomC", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_colnum", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_rb", GXutil.trim( GXutil.strNoRound( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_opcion", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_TipRec", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_numop", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_Cartaz", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae)) && ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N == 1 ) )
      {
         oWriter.writeElement("Lb_fechaE", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_fechaE", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen)) && ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N == 1 ) )
      {
         oWriter.writeElement("Lb_FechaEn", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_FechaEn", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar)) && ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N == 1 ) )
      {
         oWriter.writeElement("Lb_fechaR", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_fechaR", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Lb_estado", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Eliminar", GXutil.booltostr( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_ProvDef", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_ObsCR", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_opst", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc)) && ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N == 1 ) )
      {
         oWriter.writeElement("Lb_Opfc", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_Opfc", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Clinom", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("F_Cformu", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForNumCol", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_costee", GXutil.trim( GXutil.strNoRound( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tipcolcod", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_colnom", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti)) && ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N == 1 ) )
      {
         oWriter.writeElement("ForUltUti", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForUltUti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Lb_RGB", GXutil.trim( GXutil.str( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb, 10, 0)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Lb_numero", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero, false, false);
      AddObjectProperty("Clicod", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod, false, false);
      AddObjectProperty("Lb_artcod", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod, false, false);
      AddObjectProperty("lb_colnomC", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc, false, false);
      AddObjectProperty("Lb_colnum", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum, false, false);
      AddObjectProperty("Lb_rb", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb, false, false);
      AddObjectProperty("Lb_opcion", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion, false, false);
      AddObjectProperty("Lb_TipRec", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec, false, false);
      AddObjectProperty("Lb_numop", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop, false, false);
      AddObjectProperty("Lb_Cartaz", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_fechaE", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_FechaEn", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_fechaR", sDateCnv, false, false);
      AddObjectProperty("Lb_estado", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado, false, false);
      AddObjectProperty("Eliminar", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar, false, false);
      AddObjectProperty("Lb_ProvDef", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef, false, false);
      AddObjectProperty("Lb_ObsCR", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr, false, false);
      AddObjectProperty("Lb_opst", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_Opfc", sDateCnv, false, false);
      AddObjectProperty("Clinom", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom, false, false);
      AddObjectProperty("F_Cformu", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu, false, false);
      AddObjectProperty("ForNumCol", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol, false, false);
      AddObjectProperty("Lb_costee", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee, false, false);
      AddObjectProperty("Tipcolcod", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod, false, false);
      AddObjectProperty("Lb_colnom", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForUltUti", sDateCnv, false, false);
      AddObjectProperty("Lb_RGB", gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb, false, false);
   }

   public boolean getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero = value ;
   }

   public int getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc = value ;
   }

   public int getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb( java.math.BigDecimal value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion = value ;
   }

   public byte getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec = value ;
   }

   public byte getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae = value ;
   }

   public java.util.Date getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen = value ;
   }

   public java.util.Date getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar = value ;
   }

   public byte getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado = value ;
   }

   public boolean getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar( boolean value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst = value ;
   }

   public java.util.Date getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom = value ;
   }

   public short getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu( short value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu = value ;
   }

   public int getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol( int value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol = value ;
   }

   public java.math.BigDecimal getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee( java.math.BigDecimal value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee = value ;
   }

   public byte getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod( byte value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod = value ;
   }

   public String getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom( String value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom = value ;
   }

   public java.util.Date getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti( java.util.Date value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti = value ;
   }

   public long getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb ;
   }

   public void setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb( long value )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb = DecimalUtil.ZERO ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae = GXutil.nullDate() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen = GXutil.nullDate() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar = GXutil.nullDate() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc = GXutil.nullDate() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N = (byte)(1) ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee = DecimalUtil.ZERO ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom = "" ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti = GXutil.nullDate() ;
      gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N ;
   }

   public app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item Clone( )
   {
      return (app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)(clone()) ;
   }

   public void setStruct( app.gestionlaboratorio.StructSdtRecepciondeEnsayoCliente_SDT_Item struct )
   {
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero(struct.getLb_numero());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod(struct.getLb_artcod());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc(struct.getLb_colnomc());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum(struct.getLb_colnum());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb(struct.getLb_rb());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion(struct.getLb_opcion());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec(struct.getLb_tiprec());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop(struct.getLb_numop());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz(struct.getLb_cartaz());
      if ( struct.gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N == 0 )
      {
         setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae(struct.getLb_fechae());
      }
      if ( struct.gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N == 0 )
      {
         setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen(struct.getLb_fechaen());
      }
      if ( struct.gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N == 0 )
      {
         setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar(struct.getLb_fechar());
      }
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado(struct.getLb_estado());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar(struct.getEliminar());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef(struct.getLb_provdef());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr(struct.getLb_obscr());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst(struct.getLb_opst());
      if ( struct.gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N == 0 )
      {
         setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc(struct.getLb_opfc());
      }
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu(struct.getF_cformu());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol(struct.getFornumcol());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee(struct.getLb_costee());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod(struct.getTipcolcod());
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom(struct.getLb_colnom());
      if ( struct.gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N == 0 )
      {
         setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti(struct.getForultuti());
      }
      setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb(struct.getLb_rgb());
   }

   @SuppressWarnings("unchecked")
   public app.gestionlaboratorio.StructSdtRecepciondeEnsayoCliente_SDT_Item getStruct( )
   {
      app.gestionlaboratorio.StructSdtRecepciondeEnsayoCliente_SDT_Item struct = new app.gestionlaboratorio.StructSdtRecepciondeEnsayoCliente_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar());
      struct.setLb_numero(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero());
      struct.setClicod(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod());
      struct.setLb_artcod(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod());
      struct.setLb_colnomc(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc());
      struct.setLb_colnum(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum());
      struct.setLb_rb(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb());
      struct.setLb_opcion(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion());
      struct.setLb_tiprec(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec());
      struct.setLb_numop(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop());
      struct.setLb_cartaz(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz());
      if ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N == 0 )
      {
         struct.setLb_fechae(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae());
      }
      if ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N == 0 )
      {
         struct.setLb_fechaen(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen());
      }
      if ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N == 0 )
      {
         struct.setLb_fechar(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar());
      }
      struct.setLb_estado(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado());
      struct.setEliminar(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar());
      struct.setLb_provdef(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef());
      struct.setLb_obscr(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr());
      struct.setLb_opst(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst());
      if ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N == 0 )
      {
         struct.setLb_opfc(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc());
      }
      struct.setClinom(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom());
      struct.setF_cformu(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu());
      struct.setFornumcol(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol());
      struct.setLb_costee(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee());
      struct.setTipcolcod(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod());
      struct.setLb_colnom(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom());
      if ( gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N == 0 )
      {
         struct.setForultuti(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti());
      }
      struct.setLb_rgb(getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb());
      return struct ;
   }

   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc_N ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti_N ;
   protected short gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum ;
   protected int gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol ;
   protected long gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb ;
   protected java.math.BigDecimal gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb ;
   protected java.math.BigDecimal gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc ;
   protected java.util.Date gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti ;
   protected boolean gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr ;
}

