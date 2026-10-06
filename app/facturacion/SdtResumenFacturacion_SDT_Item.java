package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtResumenFacturacion_SDT_Item extends GxUserType
{
   public SdtResumenFacturacion_SDT_Item( )
   {
      this(  new ModelContext(SdtResumenFacturacion_SDT_Item.class));
   }

   public SdtResumenFacturacion_SDT_Item( ModelContext context )
   {
      super( context, "SdtResumenFacturacion_SDT_Item");
   }

   public SdtResumenFacturacion_SDT_Item( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtResumenFacturacion_SDT_Item");
   }

   public SdtResumenFacturacion_SDT_Item( StructSdtResumenFacturacion_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Faccod") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Faccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacFch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtResumenFacturacion_SDT_Item_Facfch = GXutil.nullDate() ;
                  gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N = (byte)(0) ;
                  gxTv_SdtResumenFacturacion_SDT_Item_Facfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImpTot") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Facimptot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImpPP") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Facimppp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacIVAImp") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImpGen") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacTot") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Factot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kgs_Fra") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kgs_otros") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Pre_medio") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Pzs_fra") )
            {
               gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "ResumenFacturacion_SDT.Item" ;
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
      oWriter.writeElement("Faccod", GXutil.trim( GXutil.str( gxTv_SdtResumenFacturacion_SDT_Item_Faccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtResumenFacturacion_SDT_Item_Facfch)) && ( gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N == 1 ) )
      {
         oWriter.writeElement("FacFch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResumenFacturacion_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResumenFacturacion_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResumenFacturacion_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FacFch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtResumenFacturacion_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtResumenFacturacion_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImpTot", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Facimptot, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImpPP", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Facimppp, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacIVAImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImpGen", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacTot", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Factot, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kgs_Fra", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kgs_otros", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Pre_medio", GXutil.trim( GXutil.strNoRound( gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Pzs_fra", GXutil.trim( GXutil.str( gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra, 6, 0)));
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
      AddObjectProperty("Faccod", gxTv_SdtResumenFacturacion_SDT_Item_Faccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtResumenFacturacion_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtResumenFacturacion_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtResumenFacturacion_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FacFch", sDateCnv, false, false);
      AddObjectProperty("CliCod", gxTv_SdtResumenFacturacion_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtResumenFacturacion_SDT_Item_Clinom, false, false);
      AddObjectProperty("FacImpTot", gxTv_SdtResumenFacturacion_SDT_Item_Facimptot, false, false);
      AddObjectProperty("FacImpPP", gxTv_SdtResumenFacturacion_SDT_Item_Facimppp, false, false);
      AddObjectProperty("FacIVAImp", gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp, false, false);
      AddObjectProperty("FacImpGen", gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen, false, false);
      AddObjectProperty("FacTot", gxTv_SdtResumenFacturacion_SDT_Item_Factot, false, false);
      AddObjectProperty("Kgs_Fra", gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra, false, false);
      AddObjectProperty("Kgs_otros", gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros, false, false);
      AddObjectProperty("Pre_medio", gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio, false, false);
      AddObjectProperty("Pzs_fra", gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra, false, false);
   }

   public int getgxTv_SdtResumenFacturacion_SDT_Item_Faccod( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Faccod ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Faccod( int value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Faccod = value ;
   }

   public java.util.Date getgxTv_SdtResumenFacturacion_SDT_Item_Facfch( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facfch ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Facfch( java.util.Date value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch = value ;
   }

   public int getgxTv_SdtResumenFacturacion_SDT_Item_Clicod( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Clicod( int value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtResumenFacturacion_SDT_Item_Clinom( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Clinom( String value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facimptot ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Facimptot( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimptot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facimppp ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Facimppp( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimppp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Factot( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Factot ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Factot( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Factot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros = value ;
   }

   public java.math.BigDecimal getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio( java.math.BigDecimal value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio = value ;
   }

   public int getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra ;
   }

   public void setgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra( int value )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtResumenFacturacion_SDT_Item_N = (byte)(1) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch = GXutil.nullDate() ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtResumenFacturacion_SDT_Item_Clinom = "" ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimptot = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimppp = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Factot = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros = DecimalUtil.ZERO ;
      gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtResumenFacturacion_SDT_Item_N ;
   }

   public app.facturacion.SdtResumenFacturacion_SDT_Item Clone( )
   {
      return (app.facturacion.SdtResumenFacturacion_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtResumenFacturacion_SDT_Item struct )
   {
      setgxTv_SdtResumenFacturacion_SDT_Item_Faccod(struct.getFaccod());
      if ( struct.gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N == 0 )
      {
         setgxTv_SdtResumenFacturacion_SDT_Item_Facfch(struct.getFacfch());
      }
      setgxTv_SdtResumenFacturacion_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtResumenFacturacion_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtResumenFacturacion_SDT_Item_Facimptot(struct.getFacimptot());
      setgxTv_SdtResumenFacturacion_SDT_Item_Facimppp(struct.getFacimppp());
      setgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp(struct.getFacivaimp());
      setgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen(struct.getFacimpgen());
      setgxTv_SdtResumenFacturacion_SDT_Item_Factot(struct.getFactot());
      setgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra(struct.getKgs_fra());
      setgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros(struct.getKgs_otros());
      setgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio(struct.getPre_medio());
      setgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra(struct.getPzs_fra());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtResumenFacturacion_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtResumenFacturacion_SDT_Item struct = new app.facturacion.StructSdtResumenFacturacion_SDT_Item ();
      struct.setFaccod(getgxTv_SdtResumenFacturacion_SDT_Item_Faccod());
      if ( gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N == 0 )
      {
         struct.setFacfch(getgxTv_SdtResumenFacturacion_SDT_Item_Facfch());
      }
      struct.setClicod(getgxTv_SdtResumenFacturacion_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtResumenFacturacion_SDT_Item_Clinom());
      struct.setFacimptot(getgxTv_SdtResumenFacturacion_SDT_Item_Facimptot());
      struct.setFacimppp(getgxTv_SdtResumenFacturacion_SDT_Item_Facimppp());
      struct.setFacivaimp(getgxTv_SdtResumenFacturacion_SDT_Item_Facivaimp());
      struct.setFacimpgen(getgxTv_SdtResumenFacturacion_SDT_Item_Facimpgen());
      struct.setFactot(getgxTv_SdtResumenFacturacion_SDT_Item_Factot());
      struct.setKgs_fra(getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra());
      struct.setKgs_otros(getgxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros());
      struct.setPre_medio(getgxTv_SdtResumenFacturacion_SDT_Item_Pre_medio());
      struct.setPzs_fra(getgxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra());
      return struct ;
   }

   protected byte gxTv_SdtResumenFacturacion_SDT_Item_N ;
   protected byte gxTv_SdtResumenFacturacion_SDT_Item_Facfch_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtResumenFacturacion_SDT_Item_Faccod ;
   protected int gxTv_SdtResumenFacturacion_SDT_Item_Clicod ;
   protected int gxTv_SdtResumenFacturacion_SDT_Item_Pzs_fra ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facimptot ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facimppp ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facivaimp ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Facimpgen ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Factot ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Kgs_fra ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Kgs_otros ;
   protected java.math.BigDecimal gxTv_SdtResumenFacturacion_SDT_Item_Pre_medio ;
   protected String gxTv_SdtResumenFacturacion_SDT_Item_Clinom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtResumenFacturacion_SDT_Item_Facfch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

