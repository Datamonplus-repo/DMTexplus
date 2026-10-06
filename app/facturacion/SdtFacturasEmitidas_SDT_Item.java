package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFacturasEmitidas_SDT_Item extends GxUserType
{
   public SdtFacturasEmitidas_SDT_Item( )
   {
      this(  new ModelContext(SdtFacturasEmitidas_SDT_Item.class));
   }

   public SdtFacturasEmitidas_SDT_Item( ModelContext context )
   {
      super( context, "SdtFacturasEmitidas_SDT_Item");
   }

   public SdtFacturasEmitidas_SDT_Item( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtFacturasEmitidas_SDT_Item");
   }

   public SdtFacturasEmitidas_SDT_Item( StructSdtFacturasEmitidas_SDT_Item struct )
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
               gxTv_SdtFacturasEmitidas_SDT_Item_Faccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Facfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFacturasEmitidas_SDT_Item_Facfch = GXutil.nullDate() ;
                  gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N = (byte)(0) ;
                  gxTv_SdtFacturasEmitidas_SDT_Item_Facfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNif") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Clinif = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Factot") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Factot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacBasImp") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacIvaPor") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacIVAImp") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fac_kgs") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fac_mts") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacTipo") )
            {
               gxTv_SdtFacturasEmitidas_SDT_Item_Factipo = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "FacturasEmitidas_SDT.Item" ;
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
      oWriter.writeElement("Faccod", GXutil.trim( GXutil.str( gxTv_SdtFacturasEmitidas_SDT_Item_Faccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFacturasEmitidas_SDT_Item_Facfch)) && ( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Facfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFacturasEmitidas_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtFacturasEmitidas_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNif", gxTv_SdtFacturasEmitidas_SDT_Item_Clinif);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Factot", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturasEmitidas_SDT_Item_Factot, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacBasImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacIvaPor", GXutil.trim( GXutil.str( gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacIVAImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fac_kgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fac_mts", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacTipo", GXutil.trim( GXutil.str( gxTv_SdtFacturasEmitidas_SDT_Item_Factipo, 1, 0)));
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
      AddObjectProperty("Faccod", gxTv_SdtFacturasEmitidas_SDT_Item_Faccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Facfch", sDateCnv, false, false);
      AddObjectProperty("Clicod", gxTv_SdtFacturasEmitidas_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtFacturasEmitidas_SDT_Item_Clinom, false, false);
      AddObjectProperty("CliNif", gxTv_SdtFacturasEmitidas_SDT_Item_Clinif, false, false);
      AddObjectProperty("Factot", gxTv_SdtFacturasEmitidas_SDT_Item_Factot, false, false);
      AddObjectProperty("FacBasImp", gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp, false, false);
      AddObjectProperty("FacIvaPor", gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor, false, false);
      AddObjectProperty("FacIVAImp", gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp, false, false);
      AddObjectProperty("Fac_kgs", gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs, false, false);
      AddObjectProperty("Fac_mts", gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts, false, false);
      AddObjectProperty("FacTipo", gxTv_SdtFacturasEmitidas_SDT_Item_Factipo, false, false);
   }

   public int getgxTv_SdtFacturasEmitidas_SDT_Item_Faccod( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Faccod ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Faccod( int value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Faccod = value ;
   }

   public java.util.Date getgxTv_SdtFacturasEmitidas_SDT_Item_Facfch( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facfch ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Facfch( java.util.Date value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch = value ;
   }

   public int getgxTv_SdtFacturasEmitidas_SDT_Item_Clicod( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Clicod( int value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtFacturasEmitidas_SDT_Item_Clinom( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Clinom( String value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtFacturasEmitidas_SDT_Item_Clinif( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Clinif ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Clinif( String value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinif = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturasEmitidas_SDT_Item_Factot( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Factot ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Factot( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Factot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp = value ;
   }

   public byte getgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor( byte value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts = value ;
   }

   public byte getgxTv_SdtFacturasEmitidas_SDT_Item_Factipo( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Factipo ;
   }

   public void setgxTv_SdtFacturasEmitidas_SDT_Item_Factipo( byte value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Factipo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(1) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch = GXutil.nullDate() ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinom = "" ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinif = "" ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Factot = DecimalUtil.ZERO ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp = DecimalUtil.ZERO ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp = DecimalUtil.ZERO ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs = DecimalUtil.ZERO ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_N ;
   }

   public app.facturacion.SdtFacturasEmitidas_SDT_Item Clone( )
   {
      return (app.facturacion.SdtFacturasEmitidas_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtFacturasEmitidas_SDT_Item struct )
   {
      setgxTv_SdtFacturasEmitidas_SDT_Item_Faccod(struct.getFaccod());
      if ( struct.gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N == 0 )
      {
         setgxTv_SdtFacturasEmitidas_SDT_Item_Facfch(struct.getFacfch());
      }
      setgxTv_SdtFacturasEmitidas_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Clinif(struct.getClinif());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Factot(struct.getFactot());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp(struct.getFacbasimp());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor(struct.getFacivapor());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp(struct.getFacivaimp());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs(struct.getFac_kgs());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts(struct.getFac_mts());
      setgxTv_SdtFacturasEmitidas_SDT_Item_Factipo(struct.getFactipo());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtFacturasEmitidas_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtFacturasEmitidas_SDT_Item struct = new app.facturacion.StructSdtFacturasEmitidas_SDT_Item ();
      struct.setFaccod(getgxTv_SdtFacturasEmitidas_SDT_Item_Faccod());
      if ( gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N == 0 )
      {
         struct.setFacfch(getgxTv_SdtFacturasEmitidas_SDT_Item_Facfch());
      }
      struct.setClicod(getgxTv_SdtFacturasEmitidas_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtFacturasEmitidas_SDT_Item_Clinom());
      struct.setClinif(getgxTv_SdtFacturasEmitidas_SDT_Item_Clinif());
      struct.setFactot(getgxTv_SdtFacturasEmitidas_SDT_Item_Factot());
      struct.setFacbasimp(getgxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp());
      struct.setFacivapor(getgxTv_SdtFacturasEmitidas_SDT_Item_Facivapor());
      struct.setFacivaimp(getgxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp());
      struct.setFac_kgs(getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs());
      struct.setFac_mts(getgxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts());
      struct.setFactipo(getgxTv_SdtFacturasEmitidas_SDT_Item_Factipo());
      return struct ;
   }

   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_N ;
   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor ;
   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_Factipo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFacturasEmitidas_SDT_Item_Faccod ;
   protected int gxTv_SdtFacturasEmitidas_SDT_Item_Clicod ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Factot ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts ;
   protected String gxTv_SdtFacturasEmitidas_SDT_Item_Clinom ;
   protected String gxTv_SdtFacturasEmitidas_SDT_Item_Clinif ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFacturasEmitidas_SDT_Item_Facfch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

