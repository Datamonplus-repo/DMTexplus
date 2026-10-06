package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDiariodeFacturacion_lineas_SDT_Item extends GxUserType
{
   public SdtDiariodeFacturacion_lineas_SDT_Item( )
   {
      this(  new ModelContext(SdtDiariodeFacturacion_lineas_SDT_Item.class));
   }

   public SdtDiariodeFacturacion_lineas_SDT_Item( ModelContext context )
   {
      super( context, "SdtDiariodeFacturacion_lineas_SDT_Item");
   }

   public SdtDiariodeFacturacion_lineas_SDT_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtDiariodeFacturacion_lineas_SDT_Item");
   }

   public SdtDiariodeFacturacion_lineas_SDT_Item( StructSdtDiariodeFacturacion_lineas_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Facfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch = GXutil.nullDate() ;
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N = (byte)(0) ;
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Faccod") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Facalbcod") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N = (byte)(0) ;
                  gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacSer") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Color") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacKgs") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacPreKgs") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacMts") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacPremts") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAlbPie") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImp") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr = oReader.getValue() ;
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
         sName = "DiariodeFacturacion_lineas_SDT.Item" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch)) && ( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N == 1 ) )
      {
         oWriter.writeElement("Facfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Facfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Faccod", GXutil.trim( GXutil.str( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Facalbcod", GXutil.trim( GXutil.str( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch)) && ( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N == 1 ) )
      {
         oWriter.writeElement("AlbProfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("FacSer", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Color", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacPreKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacPremts", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAlbPie", GXutil.trim( GXutil.str( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp, 14, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barnhdr", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr);
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
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Facfch", sDateCnv, false, false);
      AddObjectProperty("Faccod", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod, false, false);
      AddObjectProperty("Clicod", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom, false, false);
      AddObjectProperty("Facalbcod", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, false);
      AddObjectProperty("FacSer", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser, false, false);
      AddObjectProperty("Color", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color, false, false);
      AddObjectProperty("FacKgs", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs, false, false);
      AddObjectProperty("FacPreKgs", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs, false, false);
      AddObjectProperty("FacMts", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts, false, false);
      AddObjectProperty("FacPremts", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts, false, false);
      AddObjectProperty("BarAlbPie", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie, false, false);
      AddObjectProperty("FacImp", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp, false, false);
      AddObjectProperty("Barnhdr", gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr, false, false);
   }

   public java.util.Date getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch( java.util.Date value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch = value ;
   }

   public int getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod( int value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod = value ;
   }

   public int getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod( int value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom = value ;
   }

   public long getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod( long value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod = value ;
   }

   public java.util.Date getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch( java.util.Date value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch = value ;
   }

   public String getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser = value ;
   }

   public String getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts = value ;
   }

   public int getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie( int value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp = value ;
   }

   public String getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr ;
   }

   public void setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr( String value )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch = GXutil.nullDate() ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N = (byte)(1) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch = GXutil.nullDate() ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N = (byte)(1) ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color = "" ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N ;
   }

   public app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item Clone( )
   {
      return (app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtDiariodeFacturacion_lineas_SDT_Item struct )
   {
      if ( struct.gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N == 0 )
      {
         setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch(struct.getFacfch());
      }
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod(struct.getFaccod());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod(struct.getFacalbcod());
      if ( struct.gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N == 0 )
      {
         setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch(struct.getAlbprofch());
      }
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser(struct.getFacser());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color(struct.getColor());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs(struct.getFackgs());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs(struct.getFacprekgs());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts(struct.getFacmts());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts(struct.getFacpremts());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie(struct.getBaralbpie());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp(struct.getFacimp());
      setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr(struct.getBarnhdr());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtDiariodeFacturacion_lineas_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtDiariodeFacturacion_lineas_SDT_Item struct = new app.facturacion.StructSdtDiariodeFacturacion_lineas_SDT_Item ();
      if ( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N == 0 )
      {
         struct.setFacfch(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch());
      }
      struct.setFaccod(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod());
      struct.setClicod(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom());
      struct.setFacalbcod(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod());
      if ( gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch());
      }
      struct.setFacser(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser());
      struct.setColor(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color());
      struct.setFackgs(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs());
      struct.setFacprekgs(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs());
      struct.setFacmts(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts());
      struct.setFacpremts(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts());
      struct.setBaralbpie(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie());
      struct.setFacimp(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp());
      struct.setBarnhdr(getgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr());
      return struct ;
   }

   protected byte gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_N ;
   protected byte gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod ;
   protected int gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod ;
   protected int gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie ;
   protected long gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color ;
   protected String gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch ;
   protected java.util.Date gxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

