package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtNoAceptacionEnsayo_SDT_Item extends GxUserType
{
   public SdtNoAceptacionEnsayo_SDT_Item( )
   {
      this(  new ModelContext(SdtNoAceptacionEnsayo_SDT_Item.class));
   }

   public SdtNoAceptacionEnsayo_SDT_Item( ModelContext context )
   {
      super( context, "SdtNoAceptacionEnsayo_SDT_Item");
   }

   public SdtNoAceptacionEnsayo_SDT_Item( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtNoAceptacionEnsayo_SDT_Item");
   }

   public SdtNoAceptacionEnsayo_SDT_Item( StructSdtNoAceptacionEnsayo_SDT_Item struct )
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
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numero") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_opcion") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_ColNom") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_colnum") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Cartaz") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Cartazf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf = GXutil.nullDate() ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N = (byte)(0) ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen = GXutil.nullDate() ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N = (byte)(0) ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_FechaR") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar = GXutil.nullDate() ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N = (byte)(0) ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Estado") )
            {
               gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_FecNoa1") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 = GXutil.nullDate() ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N = (byte)(0) ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Hhnoa1") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N = (byte)(0) ;
                  gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
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
         sName = "NoAceptacionEnsayo_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_numero", GXutil.trim( GXutil.str( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_opcion", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_ColNom", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_colnum", GXutil.trim( GXutil.str( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_Cartaz", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf)) && ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N == 1 ) )
      {
         oWriter.writeElement("Lb_Cartazf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_Cartazf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen)) && ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_FechaEn", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar)) && ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N == 1 ) )
      {
         oWriter.writeElement("Lb_FechaR", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_FechaR", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Lb_Estado", GXutil.trim( GXutil.str( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1)) && ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N == 1 ) )
      {
         oWriter.writeElement("Lb_FecNoa1", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_FecNoa1", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1) && ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N == 1 ) )
      {
         oWriter.writeElement("Lb_Hhnoa1", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_Hhnoa1", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("Seleccionar", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Lb_numero", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero, false, false);
      AddObjectProperty("Lb_opcion", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion, false, false);
      AddObjectProperty("Lb_ColNom", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom, false, false);
      AddObjectProperty("Lb_colnum", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum, false, false);
      AddObjectProperty("Clicod", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom, false, false);
      AddObjectProperty("Lb_Cartaz", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_Cartazf", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_FechaEn", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_FechaR", sDateCnv, false, false);
      AddObjectProperty("Lb_Estado", gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_FecNoa1", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 ;
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
      AddObjectProperty("Lb_Hhnoa1", sDateCnv, false, false);
   }

   public boolean getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero( int value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero = value ;
   }

   public String getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion = value ;
   }

   public String getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom = value ;
   }

   public int getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum( int value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum = value ;
   }

   public int getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod( int value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz( String value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf = value ;
   }

   public java.util.Date getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen = value ;
   }

   public java.util.Date getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar = value ;
   }

   public byte getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado( byte value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado = value ;
   }

   public java.util.Date getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 = value ;
   }

   public java.util.Date getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 ;
   }

   public void setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1( java.util.Date value )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(0) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf = GXutil.nullDate() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen = GXutil.nullDate() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar = GXutil.nullDate() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 = GXutil.nullDate() ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N = (byte)(1) ;
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtNoAceptacionEnsayo_SDT_Item_N ;
   }

   public app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item Clone( )
   {
      return (app.gestionlaboratorio.SdtNoAceptacionEnsayo_SDT_Item)(clone()) ;
   }

   public void setStruct( app.gestionlaboratorio.StructSdtNoAceptacionEnsayo_SDT_Item struct )
   {
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero(struct.getLb_numero());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion(struct.getLb_opcion());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom(struct.getLb_colnom());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum(struct.getLb_colnum());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz(struct.getLb_cartaz());
      if ( struct.gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N == 0 )
      {
         setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf(struct.getLb_cartazf());
      }
      if ( struct.gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N == 0 )
      {
         setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen(struct.getLb_fechaen());
      }
      if ( struct.gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N == 0 )
      {
         setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar(struct.getLb_fechar());
      }
      setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado(struct.getLb_estado());
      if ( struct.gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N == 0 )
      {
         setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1(struct.getLb_fecnoa1());
      }
      if ( struct.gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N == 0 )
      {
         setgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1(struct.getLb_hhnoa1());
      }
   }

   @SuppressWarnings("unchecked")
   public app.gestionlaboratorio.StructSdtNoAceptacionEnsayo_SDT_Item getStruct( )
   {
      app.gestionlaboratorio.StructSdtNoAceptacionEnsayo_SDT_Item struct = new app.gestionlaboratorio.StructSdtNoAceptacionEnsayo_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar());
      struct.setLb_numero(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero());
      struct.setLb_opcion(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion());
      struct.setLb_colnom(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom());
      struct.setLb_colnum(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum());
      struct.setClicod(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom());
      struct.setLb_cartaz(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz());
      if ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N == 0 )
      {
         struct.setLb_cartazf(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf());
      }
      if ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N == 0 )
      {
         struct.setLb_fechaen(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen());
      }
      if ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N == 0 )
      {
         struct.setLb_fechar(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar());
      }
      struct.setLb_estado(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado());
      if ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N == 0 )
      {
         struct.setLb_fecnoa1(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1());
      }
      if ( gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N == 0 )
      {
         struct.setLb_hhnoa1(getgxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1());
      }
      return struct ;
   }

   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_estado ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1_N ;
   protected byte gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_numero ;
   protected int gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnum ;
   protected int gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clicod ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_colnom ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Clinom ;
   protected String gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartaz ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_hhnoa1 ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_cartazf ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechaen ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fechar ;
   protected java.util.Date gxTv_SdtNoAceptacionEnsayo_SDT_Item_Lb_fecnoa1 ;
   protected boolean gxTv_SdtNoAceptacionEnsayo_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

