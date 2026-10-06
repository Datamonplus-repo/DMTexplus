package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem extends GxUserType
{
   public SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem( )
   {
      this(  new ModelContext(SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem.class));
   }

   public SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem( ModelContext context )
   {
      super( context, "SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem");
   }

   public SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem( int remoteHandle ,
                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem");
   }

   public SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem( StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarOrdLin") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProCod") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNHdr") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasCod") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCodBis") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFasKgm") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFasMtr") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTieRea") )
            {
               gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecRea") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea = GXutil.nullDate() ;
                  gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N = (byte)(0) ;
                  gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
         sName = "MantenimientoRollosPiezaSDT.MantenimientoRollosPiezaSDTItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarOrdLin", GXutil.trim( GXutil.str( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNHdr", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCodBis", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarFasKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarFasMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTieRea", GXutil.trim( GXutil.strNoRound( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea)) && ( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N == 1 ) )
      {
         oWriter.writeElement("BarFecRea", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecRea", sDateCnv);
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
      AddObjectProperty("EmprCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar, false, false);
      AddObjectProperty("BarOrdLin", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin, false, false);
      AddObjectProperty("ProCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod, false, false);
      AddObjectProperty("BarNHdr", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr, false, false);
      AddObjectProperty("FasCod", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc, false, false);
      AddObjectProperty("MaqCodBis", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis, false, false);
      AddObjectProperty("BarFasKgm", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm, false, false);
      AddObjectProperty("BarFasMtr", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr, false, false);
      AddObjectProperty("BarTieRea", gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecRea", sDateCnv, false, false);
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod = value ;
   }

   public int getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod( int value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo( byte value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar = value ;
   }

   public short getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin( short value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin = value ;
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod = value ;
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr = value ;
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod = value ;
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc = value ;
   }

   public String getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis( String value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm( java.math.BigDecimal value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr( java.math.BigDecimal value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea( java.math.BigDecimal value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea = value ;
   }

   public java.util.Date getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea ;
   }

   public void setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea( java.util.Date value )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(0) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N = (byte)(1) ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis = "" ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm = DecimalUtil.ZERO ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr = DecimalUtil.ZERO ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea = DecimalUtil.ZERO ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea = GXutil.nullDate() ;
      gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N ;
   }

   public app.SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem Clone( )
   {
      return (app.SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem struct )
   {
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin(struct.getBarordlin());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod(struct.getProcod());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod(struct.getFascod());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc(struct.getFasdsc());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis(struct.getMaqcodbis());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm(struct.getBarfaskgm());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr(struct.getBarfasmtr());
      setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea(struct.getBartierea());
      if ( struct.gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N == 0 )
      {
         setgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea(struct.getBarfecrea());
      }
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem getStruct( )
   {
      app.StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem struct = new app.StructSdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem ();
      struct.setEmprcod(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod());
      struct.setBarcod(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar());
      struct.setBarordlin(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin());
      struct.setProcod(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod());
      struct.setBarnhdr(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr());
      struct.setFascod(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod());
      struct.setFasdsc(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc());
      struct.setMaqcodbis(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis());
      struct.setBarfaskgm(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm());
      struct.setBarfasmtr(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr());
      struct.setBartierea(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea());
      if ( gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N == 0 )
      {
         struct.setBarfecrea(getgxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea());
      }
      return struct ;
   }

   protected byte gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_N ;
   protected byte gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodreo ;
   protected byte gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea_N ;
   protected short gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barordlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcod ;
   protected java.math.BigDecimal gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfaskgm ;
   protected java.math.BigDecimal gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfasmtr ;
   protected java.math.BigDecimal gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Bartierea ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Emprcod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barcodpar ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Procod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barnhdr ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fascod ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Fasdsc ;
   protected String gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Maqcodbis ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtMantenimientoRollosPiezaSDT_MantenimientoRollosPiezaSDTItem_Barfecrea ;
   protected boolean readElement ;
   protected boolean formatError ;
}

