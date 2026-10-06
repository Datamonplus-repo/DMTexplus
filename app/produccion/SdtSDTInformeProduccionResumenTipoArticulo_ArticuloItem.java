package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem extends GxUserType
{
   public SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem.class));
   }

   public SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem");
   }

   public SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem( int remoteHandle ,
                                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem");
   }

   public SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem( StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem struct )
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
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDTF") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCod") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProReo") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprotip") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorKilo") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorMetro") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenTipoArticulo.ArticuloItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf) && ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("HisProDTF", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTF", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ParCod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProReo", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisprotip", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorKilo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorMetro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro, 6, 2)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod, false, false);
      datetime_STZ = gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf ;
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
      AddObjectProperty("HisProDTF", sDateCnv, false, false);
      AddObjectProperty("ParCod", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod, false, false);
      AddObjectProperty("HisProReo", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr, false, false);
      AddObjectProperty("Hisprotip", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip, false, false);
      AddObjectProperty("TipArtDsc", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc, false, false);
      AddObjectProperty("PorKilo", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo, false, false);
      AddObjectProperty("PorMetro", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro, false, false);
   }

   public String getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf = value ;
   }

   public short getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod = value ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr = value ;
   }

   public short getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem struct )
   {
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod(struct.getMaqcod());
      if ( struct.gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod(struct.getParcod());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo(struct.getHisproreo());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip(struct.getHisprotip());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo(struct.getPorkilo());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro(struct.getPormetro());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem struct = new app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem ();
      struct.setEmprcod(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod());
      struct.setMaqcod(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod());
      if ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf());
      }
      struct.setParcod(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod());
      struct.setHisproreo(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo());
      struct.setHisprokgr(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr());
      struct.setHisprotip(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip());
      struct.setTipartdsc(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc());
      struct.setPorkilo(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo());
      struct.setPormetro(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo ;
   protected short gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod ;
   protected short gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

