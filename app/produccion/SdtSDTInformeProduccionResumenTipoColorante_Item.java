package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenTipoColorante_Item extends GxUserType
{
   public SdtSDTInformeProduccionResumenTipoColorante_Item( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenTipoColorante_Item.class));
   }

   public SdtSDTInformeProduccionResumenTipoColorante_Item( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenTipoColorante_Item");
   }

   public SdtSDTInformeProduccionResumenTipoColorante_Item( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenTipoColorante_Item");
   }

   public SdtSDTInformeProduccionResumenTipoColorante_Item( StructSdtSDTInformeProduccionResumenTipoColorante_Item struct )
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
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod = oReader.getValue() ;
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
                  gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProReo") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColDsc") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorKilo") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorMetro") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenTipoColorante.Item" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf) && ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTF", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ParCod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProReo", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColDsc", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorKilo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorMetro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro, 6, 2)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod, false, false);
      datetime_STZ = gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf ;
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
      AddObjectProperty("ParCod", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod, false, false);
      AddObjectProperty("HisProReo", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr, false, false);
      AddObjectProperty("TipColDsc", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc, false, false);
      AddObjectProperty("PorKilo", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo, false, false);
      AddObjectProperty("PorMetro", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro, false, false);
   }

   public String getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf = value ;
   }

   public short getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod = value ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item struct )
   {
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod(struct.getMaqcod());
      if ( struct.gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod(struct.getParcod());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo(struct.getHisproreo());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc(struct.getTipcoldsc());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo(struct.getPorkilo());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro(struct.getPormetro());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item struct = new app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item ();
      struct.setEmprcod(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod());
      struct.setMaqcod(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod());
      if ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf());
      }
      struct.setParcod(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod());
      struct.setHisproreo(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo());
      struct.setHisprokgr(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr());
      struct.setTipcoldsc(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc());
      struct.setPorkilo(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo());
      struct.setPormetro(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo ;
   protected short gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

