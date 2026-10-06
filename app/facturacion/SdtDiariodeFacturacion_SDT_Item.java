package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtDiariodeFacturacion_SDT_Item extends GxUserType
{
   public SdtDiariodeFacturacion_SDT_Item( )
   {
      this(  new ModelContext(SdtDiariodeFacturacion_SDT_Item.class));
   }

   public SdtDiariodeFacturacion_SDT_Item( ModelContext context )
   {
      super( context, "SdtDiariodeFacturacion_SDT_Item");
   }

   public SdtDiariodeFacturacion_SDT_Item( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtDiariodeFacturacion_SDT_Item");
   }

   public SdtDiariodeFacturacion_SDT_Item( StructSdtDiariodeFacturacion_SDT_Item struct )
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
                  gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch = GXutil.nullDate() ;
                  gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N = (byte)(0) ;
                  gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImpTot") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImpGen") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacImpPP") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacBasImp") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacIVAImp") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacTot") )
            {
               gxTv_SdtDiariodeFacturacion_SDT_Item_Factot = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "DiariodeFacturacion_SDT.Item" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch)) && ( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Facfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Faccod", GXutil.trim( GXutil.str( gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImpTot", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImpGen", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacImpPP", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacBasImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacIVAImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacTot", GXutil.trim( GXutil.strNoRound( gxTv_SdtDiariodeFacturacion_SDT_Item_Factot, 13, 2)));
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
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Facfch", sDateCnv, false, false);
      AddObjectProperty("Faccod", gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod, false, false);
      AddObjectProperty("Clicod", gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom, false, false);
      AddObjectProperty("FacImpTot", gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot, false, false);
      AddObjectProperty("FacImpGen", gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen, false, false);
      AddObjectProperty("FacImpPP", gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp, false, false);
      AddObjectProperty("FacBasImp", gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp, false, false);
      AddObjectProperty("FacIVAImp", gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp, false, false);
      AddObjectProperty("FacTot", gxTv_SdtDiariodeFacturacion_SDT_Item_Factot, false, false);
   }

   public java.util.Date getgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch( java.util.Date value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch = value ;
   }

   public int getgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod( int value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod = value ;
   }

   public int getgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod( int value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom( String value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_Factot ;
   }

   public void setgxTv_SdtDiariodeFacturacion_SDT_Item_Factot( java.math.BigDecimal value )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Factot = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch = GXutil.nullDate() ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_N = (byte)(1) ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom = "" ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp = DecimalUtil.ZERO ;
      gxTv_SdtDiariodeFacturacion_SDT_Item_Factot = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtDiariodeFacturacion_SDT_Item_N ;
   }

   public app.facturacion.SdtDiariodeFacturacion_SDT_Item Clone( )
   {
      return (app.facturacion.SdtDiariodeFacturacion_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtDiariodeFacturacion_SDT_Item struct )
   {
      if ( struct.gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N == 0 )
      {
         setgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch(struct.getFacfch());
      }
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod(struct.getFaccod());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot(struct.getFacimptot());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen(struct.getFacimpgen());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp(struct.getFacimppp());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp(struct.getFacbasimp());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp(struct.getFacivaimp());
      setgxTv_SdtDiariodeFacturacion_SDT_Item_Factot(struct.getFactot());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtDiariodeFacturacion_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtDiariodeFacturacion_SDT_Item struct = new app.facturacion.StructSdtDiariodeFacturacion_SDT_Item ();
      if ( gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N == 0 )
      {
         struct.setFacfch(getgxTv_SdtDiariodeFacturacion_SDT_Item_Facfch());
      }
      struct.setFaccod(getgxTv_SdtDiariodeFacturacion_SDT_Item_Faccod());
      struct.setClicod(getgxTv_SdtDiariodeFacturacion_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtDiariodeFacturacion_SDT_Item_Clinom());
      struct.setFacimptot(getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot());
      struct.setFacimpgen(getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen());
      struct.setFacimppp(getgxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp());
      struct.setFacbasimp(getgxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp());
      struct.setFacivaimp(getgxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp());
      struct.setFactot(getgxTv_SdtDiariodeFacturacion_SDT_Item_Factot());
      return struct ;
   }

   protected byte gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtDiariodeFacturacion_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtDiariodeFacturacion_SDT_Item_Faccod ;
   protected int gxTv_SdtDiariodeFacturacion_SDT_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facimptot ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facimpgen ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facimppp ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facbasimp ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Facivaimp ;
   protected java.math.BigDecimal gxTv_SdtDiariodeFacturacion_SDT_Item_Factot ;
   protected String gxTv_SdtDiariodeFacturacion_SDT_Item_Clinom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtDiariodeFacturacion_SDT_Item_Facfch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

