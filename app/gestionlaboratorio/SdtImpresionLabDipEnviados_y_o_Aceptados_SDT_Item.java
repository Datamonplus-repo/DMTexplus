package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item extends GxUserType
{
   public SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item( )
   {
      this(  new ModelContext(SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item.class));
   }

   public SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item( ModelContext context )
   {
      super( context, "SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item");
   }

   public SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item");
   }

   public SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item( StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item struct )
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
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numero") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Artcod") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_colnomc") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_rb") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Opcion") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numop") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Cartaz") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_fechae") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae = GXutil.nullDate() ;
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N = (byte)(0) ;
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_fechaen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen = GXutil.nullDate() ;
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N = (byte)(0) ;
                  gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Obs") )
            {
               gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs = oReader.getValue() ;
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
         sName = "ImpresionLabDipEnviados_y_o_Aceptados_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_numero", GXutil.trim( GXutil.str( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_Artcod", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_colnomc", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_rb", GXutil.trim( GXutil.strNoRound( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_Opcion", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_numop", GXutil.trim( GXutil.str( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_Cartaz", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae)) && ( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N == 1 ) )
      {
         oWriter.writeElement("Lb_fechae", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_fechae", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen)) && ( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N == 1 ) )
      {
         oWriter.writeElement("Lb_fechaen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_fechaen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Lb_estado", GXutil.trim( GXutil.str( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Obs", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs);
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
      AddObjectProperty("Seleccionar", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Lb_numero", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero, false, false);
      AddObjectProperty("Clicod", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod, false, false);
      AddObjectProperty("Lb_Artcod", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod, false, false);
      AddObjectProperty("Lb_colnomc", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc, false, false);
      AddObjectProperty("Lb_rb", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb, false, false);
      AddObjectProperty("Lb_Opcion", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion, false, false);
      AddObjectProperty("Lb_numop", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop, false, false);
      AddObjectProperty("Lb_Cartaz", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_fechae", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_fechaen", sDateCnv, false, false);
      AddObjectProperty("Lb_estado", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado, false, false);
      AddObjectProperty("Obs", gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs, false, false);
   }

   public boolean getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero( int value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero = value ;
   }

   public int getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod( int value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod = value ;
   }

   public String getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb( java.math.BigDecimal value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb = value ;
   }

   public String getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion = value ;
   }

   public byte getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop( byte value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop = value ;
   }

   public String getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz = value ;
   }

   public java.util.Date getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae( java.util.Date value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae = value ;
   }

   public java.util.Date getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen( java.util.Date value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen = value ;
   }

   public byte getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado( byte value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado = value ;
   }

   public String getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs ;
   }

   public void setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs( String value )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(0) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N = (byte)(1) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb = DecimalUtil.ZERO ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz = "" ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae = GXutil.nullDate() ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen = GXutil.nullDate() ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N = (byte)(1) ;
      gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N ;
   }

   public app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item Clone( )
   {
      return (app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(clone()) ;
   }

   public void setStruct( app.gestionlaboratorio.StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item struct )
   {
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero(struct.getLb_numero());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod(struct.getLb_artcod());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc(struct.getLb_colnomc());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb(struct.getLb_rb());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion(struct.getLb_opcion());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop(struct.getLb_numop());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz(struct.getLb_cartaz());
      if ( struct.gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N == 0 )
      {
         setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae(struct.getLb_fechae());
      }
      if ( struct.gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N == 0 )
      {
         setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen(struct.getLb_fechaen());
      }
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado(struct.getLb_estado());
      setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(struct.getObs());
   }

   @SuppressWarnings("unchecked")
   public app.gestionlaboratorio.StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item getStruct( )
   {
      app.gestionlaboratorio.StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item struct = new app.gestionlaboratorio.StructSdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar());
      struct.setLb_numero(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero());
      struct.setClicod(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod());
      struct.setLb_artcod(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod());
      struct.setLb_colnomc(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc());
      struct.setLb_rb(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb());
      struct.setLb_opcion(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion());
      struct.setLb_numop(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop());
      struct.setLb_cartaz(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz());
      if ( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N == 0 )
      {
         struct.setLb_fechae(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae());
      }
      if ( gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N == 0 )
      {
         struct.setLb_fechaen(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen());
      }
      struct.setLb_estado(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado());
      struct.setObs(getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs());
      return struct ;
   }

   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_N ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae_N ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen_N ;
   protected byte gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero ;
   protected int gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz ;
   protected String gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae ;
   protected java.util.Date gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen ;
   protected boolean gxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

