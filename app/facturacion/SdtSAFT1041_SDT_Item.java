package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSAFT1041_SDT_Item extends GxUserType
{
   public SdtSAFT1041_SDT_Item( )
   {
      this(  new ModelContext(SdtSAFT1041_SDT_Item.class));
   }

   public SdtSAFT1041_SDT_Item( ModelContext context )
   {
      super( context, "SdtSAFT1041_SDT_Item");
   }

   public SdtSAFT1041_SDT_Item( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSAFT1041_SDT_Item");
   }

   public SdtSAFT1041_SDT_Item( StructSdtSAFT1041_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar1") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar2") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Facest") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Facest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacCod") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Faccod = (int)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtSAFT1041_SDT_Item_Facfch = GXutil.nullDate() ;
                  gxTv_SdtSAFT1041_SDT_Item_Facfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSAFT1041_SDT_Item_Facfch_N = (byte)(0) ;
                  gxTv_SdtSAFT1041_SDT_Item_Facfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Factot") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Factot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Factot1") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Factot1 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacHor") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSAFT1041_SDT_Item_Fachor = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSAFT1041_SDT_Item_Fachor_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSAFT1041_SDT_Item_Fachor_N = (byte)(0) ;
                  gxTv_SdtSAFT1041_SDT_Item_Fachor = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hhdt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSAFT1041_SDT_Item_Hhdt = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSAFT1041_SDT_Item_Hhdt_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSAFT1041_SDT_Item_Hhdt_N = (byte)(0) ;
                  gxTv_SdtSAFT1041_SDT_Item_Hhdt = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "facfirdg") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Facfirdg = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DiaS") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Dias = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TimeS") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Times = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hhmmss") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Hhmmss = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacFirma") )
            {
               gxTv_SdtSAFT1041_SDT_Item_Facfirma = oReader.getValue() ;
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
         sName = "SAFT1041_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar1", GXutil.booltostr( gxTv_SdtSAFT1041_SDT_Item_Seleccionar1));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Seleccionar2", GXutil.booltostr( gxTv_SdtSAFT1041_SDT_Item_Seleccionar2));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Facest", GXutil.trim( GXutil.str( gxTv_SdtSAFT1041_SDT_Item_Facest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacCod", GXutil.trim( GXutil.str( gxTv_SdtSAFT1041_SDT_Item_Faccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSAFT1041_SDT_Item_Facfch)) && ( gxTv_SdtSAFT1041_SDT_Item_Facfch_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSAFT1041_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSAFT1041_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSAFT1041_SDT_Item_Facfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FacFch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Factot", GXutil.trim( GXutil.strNoRound( gxTv_SdtSAFT1041_SDT_Item_Factot, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Factot1", GXutil.trim( GXutil.strNoRound( gxTv_SdtSAFT1041_SDT_Item_Factot1, 16, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSAFT1041_SDT_Item_Fachor) && ( gxTv_SdtSAFT1041_SDT_Item_Fachor_N == 1 ) )
      {
         oWriter.writeElement("FacHor", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSAFT1041_SDT_Item_Fachor), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSAFT1041_SDT_Item_Fachor), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSAFT1041_SDT_Item_Fachor), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSAFT1041_SDT_Item_Fachor), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSAFT1041_SDT_Item_Fachor), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSAFT1041_SDT_Item_Fachor), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FacHor", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSAFT1041_SDT_Item_Hhdt) && ( gxTv_SdtSAFT1041_SDT_Item_Hhdt_N == 1 ) )
      {
         oWriter.writeElement("Hhdt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSAFT1041_SDT_Item_Hhdt), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSAFT1041_SDT_Item_Hhdt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSAFT1041_SDT_Item_Hhdt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSAFT1041_SDT_Item_Hhdt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSAFT1041_SDT_Item_Hhdt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSAFT1041_SDT_Item_Hhdt), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hhdt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("facfirdg", gxTv_SdtSAFT1041_SDT_Item_Facfirdg);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DiaS", gxTv_SdtSAFT1041_SDT_Item_Dias);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TimeS", gxTv_SdtSAFT1041_SDT_Item_Times);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hhmmss", gxTv_SdtSAFT1041_SDT_Item_Hhmmss);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FacFirma", gxTv_SdtSAFT1041_SDT_Item_Facfirma);
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
      AddObjectProperty("Seleccionar1", gxTv_SdtSAFT1041_SDT_Item_Seleccionar1, false, false);
      AddObjectProperty("Seleccionar2", gxTv_SdtSAFT1041_SDT_Item_Seleccionar2, false, false);
      AddObjectProperty("Facest", gxTv_SdtSAFT1041_SDT_Item_Facest, false, false);
      AddObjectProperty("FacCod", gxTv_SdtSAFT1041_SDT_Item_Faccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSAFT1041_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSAFT1041_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSAFT1041_SDT_Item_Facfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FacFch", sDateCnv, false, false);
      AddObjectProperty("Factot", gxTv_SdtSAFT1041_SDT_Item_Factot, false, false);
      AddObjectProperty("Factot1", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtSAFT1041_SDT_Item_Factot1, 16, 5)), false, false);
      datetime_STZ = gxTv_SdtSAFT1041_SDT_Item_Fachor ;
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
      AddObjectProperty("FacHor", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtSAFT1041_SDT_Item_Hhdt ;
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
      AddObjectProperty("Hhdt", sDateCnv, false, false);
      AddObjectProperty("facfirdg", gxTv_SdtSAFT1041_SDT_Item_Facfirdg, false, false);
      AddObjectProperty("DiaS", gxTv_SdtSAFT1041_SDT_Item_Dias, false, false);
      AddObjectProperty("TimeS", gxTv_SdtSAFT1041_SDT_Item_Times, false, false);
      AddObjectProperty("Hhmmss", gxTv_SdtSAFT1041_SDT_Item_Hhmmss, false, false);
      AddObjectProperty("FacFirma", gxTv_SdtSAFT1041_SDT_Item_Facfirma, false, false);
   }

   public boolean getgxTv_SdtSAFT1041_SDT_Item_Seleccionar1( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Seleccionar1( boolean value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 = value ;
   }

   public boolean getgxTv_SdtSAFT1041_SDT_Item_Seleccionar2( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Seleccionar2( boolean value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 = value ;
   }

   public byte getgxTv_SdtSAFT1041_SDT_Item_Facest( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facest ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Facest( byte value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facest = value ;
   }

   public int getgxTv_SdtSAFT1041_SDT_Item_Faccod( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Faccod ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Faccod( int value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Faccod = value ;
   }

   public java.util.Date getgxTv_SdtSAFT1041_SDT_Item_Facfch( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facfch ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Facfch( java.util.Date value )
   {
      gxTv_SdtSAFT1041_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfch = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSAFT1041_SDT_Item_Factot( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Factot ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Factot( java.math.BigDecimal value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Factot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSAFT1041_SDT_Item_Factot1( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Factot1 ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Factot1( java.math.BigDecimal value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Factot1 = value ;
   }

   public java.util.Date getgxTv_SdtSAFT1041_SDT_Item_Fachor( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Fachor ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Fachor( java.util.Date value )
   {
      gxTv_SdtSAFT1041_SDT_Item_Fachor_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Fachor = value ;
   }

   public java.util.Date getgxTv_SdtSAFT1041_SDT_Item_Hhdt( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Hhdt ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Hhdt( java.util.Date value )
   {
      gxTv_SdtSAFT1041_SDT_Item_Hhdt_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Hhdt = value ;
   }

   public String getgxTv_SdtSAFT1041_SDT_Item_Facfirdg( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facfirdg ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Facfirdg( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirdg = value ;
   }

   public String getgxTv_SdtSAFT1041_SDT_Item_Dias( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Dias ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Dias( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Dias = value ;
   }

   public String getgxTv_SdtSAFT1041_SDT_Item_Times( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Times ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Times( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Times = value ;
   }

   public String getgxTv_SdtSAFT1041_SDT_Item_Hhmmss( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Hhmmss ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Hhmmss( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Hhmmss = value ;
   }

   public String getgxTv_SdtSAFT1041_SDT_Item_Facfirma( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_Facfirma ;
   }

   public void setgxTv_SdtSAFT1041_SDT_Item_Facfirma( String value )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(0) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirma = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSAFT1041_SDT_Item_N = (byte)(1) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfch = GXutil.nullDate() ;
      gxTv_SdtSAFT1041_SDT_Item_Facfch_N = (byte)(1) ;
      gxTv_SdtSAFT1041_SDT_Item_Factot = DecimalUtil.ZERO ;
      gxTv_SdtSAFT1041_SDT_Item_Factot1 = DecimalUtil.ZERO ;
      gxTv_SdtSAFT1041_SDT_Item_Fachor = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSAFT1041_SDT_Item_Fachor_N = (byte)(1) ;
      gxTv_SdtSAFT1041_SDT_Item_Hhdt = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSAFT1041_SDT_Item_Hhdt_N = (byte)(1) ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirdg = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Dias = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Times = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Hhmmss = "" ;
      gxTv_SdtSAFT1041_SDT_Item_Facfirma = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSAFT1041_SDT_Item_N ;
   }

   public app.facturacion.SdtSAFT1041_SDT_Item Clone( )
   {
      return (app.facturacion.SdtSAFT1041_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtSAFT1041_SDT_Item struct )
   {
      setgxTv_SdtSAFT1041_SDT_Item_Seleccionar1(struct.getSeleccionar1());
      setgxTv_SdtSAFT1041_SDT_Item_Seleccionar2(struct.getSeleccionar2());
      setgxTv_SdtSAFT1041_SDT_Item_Facest(struct.getFacest());
      setgxTv_SdtSAFT1041_SDT_Item_Faccod(struct.getFaccod());
      if ( struct.gxTv_SdtSAFT1041_SDT_Item_Facfch_N == 0 )
      {
         setgxTv_SdtSAFT1041_SDT_Item_Facfch(struct.getFacfch());
      }
      setgxTv_SdtSAFT1041_SDT_Item_Factot(struct.getFactot());
      setgxTv_SdtSAFT1041_SDT_Item_Factot1(struct.getFactot1());
      if ( struct.gxTv_SdtSAFT1041_SDT_Item_Fachor_N == 0 )
      {
         setgxTv_SdtSAFT1041_SDT_Item_Fachor(struct.getFachor());
      }
      if ( struct.gxTv_SdtSAFT1041_SDT_Item_Hhdt_N == 0 )
      {
         setgxTv_SdtSAFT1041_SDT_Item_Hhdt(struct.getHhdt());
      }
      setgxTv_SdtSAFT1041_SDT_Item_Facfirdg(struct.getFacfirdg());
      setgxTv_SdtSAFT1041_SDT_Item_Dias(struct.getDias());
      setgxTv_SdtSAFT1041_SDT_Item_Times(struct.getTimes());
      setgxTv_SdtSAFT1041_SDT_Item_Hhmmss(struct.getHhmmss());
      setgxTv_SdtSAFT1041_SDT_Item_Facfirma(struct.getFacfirma());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtSAFT1041_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtSAFT1041_SDT_Item struct = new app.facturacion.StructSdtSAFT1041_SDT_Item ();
      struct.setSeleccionar1(getgxTv_SdtSAFT1041_SDT_Item_Seleccionar1());
      struct.setSeleccionar2(getgxTv_SdtSAFT1041_SDT_Item_Seleccionar2());
      struct.setFacest(getgxTv_SdtSAFT1041_SDT_Item_Facest());
      struct.setFaccod(getgxTv_SdtSAFT1041_SDT_Item_Faccod());
      if ( gxTv_SdtSAFT1041_SDT_Item_Facfch_N == 0 )
      {
         struct.setFacfch(getgxTv_SdtSAFT1041_SDT_Item_Facfch());
      }
      struct.setFactot(getgxTv_SdtSAFT1041_SDT_Item_Factot());
      struct.setFactot1(getgxTv_SdtSAFT1041_SDT_Item_Factot1());
      if ( gxTv_SdtSAFT1041_SDT_Item_Fachor_N == 0 )
      {
         struct.setFachor(getgxTv_SdtSAFT1041_SDT_Item_Fachor());
      }
      if ( gxTv_SdtSAFT1041_SDT_Item_Hhdt_N == 0 )
      {
         struct.setHhdt(getgxTv_SdtSAFT1041_SDT_Item_Hhdt());
      }
      struct.setFacfirdg(getgxTv_SdtSAFT1041_SDT_Item_Facfirdg());
      struct.setDias(getgxTv_SdtSAFT1041_SDT_Item_Dias());
      struct.setTimes(getgxTv_SdtSAFT1041_SDT_Item_Times());
      struct.setHhmmss(getgxTv_SdtSAFT1041_SDT_Item_Hhmmss());
      struct.setFacfirma(getgxTv_SdtSAFT1041_SDT_Item_Facfirma());
      return struct ;
   }

   protected byte gxTv_SdtSAFT1041_SDT_Item_N ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Facest ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Fachor_N ;
   protected byte gxTv_SdtSAFT1041_SDT_Item_Hhdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSAFT1041_SDT_Item_Faccod ;
   protected java.math.BigDecimal gxTv_SdtSAFT1041_SDT_Item_Factot ;
   protected java.math.BigDecimal gxTv_SdtSAFT1041_SDT_Item_Factot1 ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Facfirdg ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Dias ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Times ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Hhmmss ;
   protected String gxTv_SdtSAFT1041_SDT_Item_Facfirma ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSAFT1041_SDT_Item_Fachor ;
   protected java.util.Date gxTv_SdtSAFT1041_SDT_Item_Hhdt ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSAFT1041_SDT_Item_Facfch ;
   protected boolean gxTv_SdtSAFT1041_SDT_Item_Seleccionar1 ;
   protected boolean gxTv_SdtSAFT1041_SDT_Item_Seleccionar2 ;
   protected boolean readElement ;
   protected boolean formatError ;
}

