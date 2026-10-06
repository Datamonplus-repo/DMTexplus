package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem extends GxUserType
{
   public SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem( )
   {
      this(  new ModelContext(SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem.class));
   }

   public SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem( ModelContext context )
   {
      super( context, "SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem");
   }

   public SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem");
   }

   public SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem( StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisReoTn") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisReoFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec = GXutil.nullDate() ;
                  gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N = (byte)(0) ;
                  gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisBarCod") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisCodReo") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisCodPar") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisBarSer") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Est_r") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisColNom") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisColNum") )
            {
               gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "wwImprimirRCNCGrid1SDT.wwImprimirRCNCGrid1SDTItem" ;
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
      oWriter.writeElement("HisReoTn", GXutil.trim( GXutil.str( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec)) && ( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N == 1 ) )
      {
         oWriter.writeElement("HisReoFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisReoFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisBarCod", GXutil.trim( GXutil.str( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisCodReo", GXutil.trim( GXutil.str( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisCodPar", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisBarSer", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Est_r", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisColNom", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisColNum", GXutil.trim( GXutil.str( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum, 6, 0)));
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
      AddObjectProperty("HisReoTn", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HisReoFec", sDateCnv, false, false);
      AddObjectProperty("CliCod", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod, false, false);
      AddObjectProperty("HisBarCod", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod, false, false);
      AddObjectProperty("HisCodReo", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo, false, false);
      AddObjectProperty("HisCodPar", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar, false, false);
      AddObjectProperty("HisBarSer", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser, false, false);
      AddObjectProperty("Est_r", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r, false, false);
      AddObjectProperty("HisColNom", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom, false, false);
      AddObjectProperty("HisColNum", gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum, false, false);
   }

   public int getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn( int value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn = value ;
   }

   public java.util.Date getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec( java.util.Date value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec = value ;
   }

   public int getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod( int value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod = value ;
   }

   public int getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod( int value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod = value ;
   }

   public byte getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo( byte value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo = value ;
   }

   public String getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar( String value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar = value ;
   }

   public String getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser( String value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser = value ;
   }

   public String getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r( String value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r = value ;
   }

   public String getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom( String value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom = value ;
   }

   public int getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum ;
   }

   public void setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum( int value )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(0) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N = (byte)(1) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec = GXutil.nullDate() ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N = (byte)(1) ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar = "" ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser = "" ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r = "" ;
      gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N ;
   }

   public app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem Clone( )
   {
      return (app.calidad.SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem)(clone()) ;
   }

   public void setStruct( app.calidad.StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem struct )
   {
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn(struct.getHisreotn());
      if ( struct.gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N == 0 )
      {
         setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec(struct.getHisreofec());
      }
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod(struct.getHisbarcod());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo(struct.getHiscodreo());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar(struct.getHiscodpar());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser(struct.getHisbarser());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r(struct.getEst_r());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom(struct.getHiscolnom());
      setgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum(struct.getHiscolnum());
   }

   @SuppressWarnings("unchecked")
   public app.calidad.StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem getStruct( )
   {
      app.calidad.StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem struct = new app.calidad.StructSdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem ();
      struct.setHisreotn(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn());
      if ( gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N == 0 )
      {
         struct.setHisreofec(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec());
      }
      struct.setClicod(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod());
      struct.setHisbarcod(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod());
      struct.setHiscodreo(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo());
      struct.setHiscodpar(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar());
      struct.setHisbarser(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser());
      struct.setEst_r(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r());
      struct.setHiscolnom(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom());
      struct.setHiscolnum(getgxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum());
      return struct ;
   }

   protected byte gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_N ;
   protected byte gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec_N ;
   protected byte gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodreo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreotn ;
   protected int gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Clicod ;
   protected int gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarcod ;
   protected int gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnum ;
   protected String gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscodpar ;
   protected String gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisbarser ;
   protected String gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Est_r ;
   protected String gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hiscolnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtwwImprimirRCNCGrid1SDT_wwImprimirRCNCGrid1SDTItem_Hisreofec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

