package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPrecioporColor_Cliente_SDT_Item extends GxUserType
{
   public SdtPrecioporColor_Cliente_SDT_Item( )
   {
      this(  new ModelContext(SdtPrecioporColor_Cliente_SDT_Item.class));
   }

   public SdtPrecioporColor_Cliente_SDT_Item( ModelContext context )
   {
      super( context, "SdtPrecioporColor_Cliente_SDT_Item");
   }

   public SdtPrecioporColor_Cliente_SDT_Item( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtPrecioporColor_Cliente_SDT_Item");
   }

   public SdtPrecioporColor_Cliente_SDT_Item( StructSdtPrecioporColor_Cliente_SDT_Item struct )
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
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forser") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnum") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForColnom") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColCod") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForNomCli") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForNumCli") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "New_ForPreKgm") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPreKgm") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
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
                  gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec = GXutil.nullDate() ;
                  gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N = (byte)(0) ;
                  gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPredef") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OldForPredef") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForCosForm") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrdTipARt") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Coste_general") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Coste_total") )
            {
               gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "PrecioporColor_Cliente_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forser", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnum", GXutil.trim( GXutil.str( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForColnom", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColCod", GXutil.trim( GXutil.str( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForNomCli", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForNumCli", GXutil.trim( GXutil.str( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("New_ForPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm, 12, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec)) && ( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForPrefec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ForPredef", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OldForPredef", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForCosForm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform, 11, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GrdTipARt", GXutil.trim( GXutil.str( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Coste_general", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general, 6, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Coste_total", GXutil.trim( GXutil.strNoRound( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total, 6, 3)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Forser", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser, false, false);
      AddObjectProperty("Forcolnum", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum, false, false);
      AddObjectProperty("ForColnom", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom, false, false);
      AddObjectProperty("TipColCod", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod, false, false);
      AddObjectProperty("ForNomCli", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli, false, false);
      AddObjectProperty("ForNumCli", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli, false, false);
      AddObjectProperty("New_ForPreKgm", gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm, false, false);
      AddObjectProperty("ForPreKgm", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForPrefec", sDateCnv, false, false);
      AddObjectProperty("ForPredef", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef, false, false);
      AddObjectProperty("OldForPredef", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef, false, false);
      AddObjectProperty("ForCosForm", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform, false, false);
      AddObjectProperty("GrdTipARt", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart, false, false);
      AddObjectProperty("Coste_general", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general, false, false);
      AddObjectProperty("Coste_total", gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total, false, false);
   }

   public boolean getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar = value ;
   }

   public String getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser = value ;
   }

   public int getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum( int value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum = value ;
   }

   public String getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom = value ;
   }

   public byte getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod( byte value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod = value ;
   }

   public String getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli = value ;
   }

   public int getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli( int value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm = value ;
   }

   public java.util.Date getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec( java.util.Date value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec = value ;
   }

   public String getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef = value ;
   }

   public String getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform = value ;
   }

   public short getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart( short value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total ;
   }

   public void setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(1) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm = DecimalUtil.ZERO ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm = DecimalUtil.ZERO ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec = GXutil.nullDate() ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N = (byte)(1) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform = DecimalUtil.ZERO ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general = DecimalUtil.ZERO ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_N ;
   }

   public app.facturacion.SdtPrecioporColor_Cliente_SDT_Item Clone( )
   {
      return (app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtPrecioporColor_Cliente_SDT_Item struct )
   {
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser(struct.getForser());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum(struct.getForcolnum());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom(struct.getForcolnom());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod(struct.getTipcolcod());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli(struct.getFornomcli());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli(struct.getFornumcli());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm(struct.getNew_forprekgm());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm(struct.getForprekgm());
      if ( struct.gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N == 0 )
      {
         setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec(struct.getForprefec());
      }
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef(struct.getForpredef());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef(struct.getOldforpredef());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform(struct.getForcosform());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart(struct.getGrdtipart());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general(struct.getCoste_general());
      setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total(struct.getCoste_total());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtPrecioporColor_Cliente_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtPrecioporColor_Cliente_SDT_Item struct = new app.facturacion.StructSdtPrecioporColor_Cliente_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar());
      struct.setForser(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser());
      struct.setForcolnum(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum());
      struct.setForcolnom(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom());
      struct.setTipcolcod(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod());
      struct.setFornomcli(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli());
      struct.setFornumcli(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli());
      struct.setNew_forprekgm(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm());
      struct.setForprekgm(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm());
      if ( gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N == 0 )
      {
         struct.setForprefec(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec());
      }
      struct.setForpredef(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef());
      struct.setOldforpredef(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef());
      struct.setForcosform(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform());
      struct.setGrdtipart(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart());
      struct.setCoste_general(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general());
      struct.setCoste_total(getgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total());
      return struct ;
   }

   protected byte gxTv_SdtPrecioporColor_Cliente_SDT_Item_N ;
   protected byte gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N ;
   protected short gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum ;
   protected int gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec ;
   protected boolean gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

