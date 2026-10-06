package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenOperario_OperarioItem extends GxUserType
{
   public SdtSDTInformeProduccionResumenOperario_OperarioItem( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenOperario_OperarioItem.class));
   }

   public SdtSDTInformeProduccionResumenOperario_OperarioItem( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenOperario_OperarioItem");
   }

   public SdtSDTInformeProduccionResumenOperario_OperarioItem( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenOperario_OperarioItem");
   }

   public SdtSDTInformeProduccionResumenOperario_OperarioItem( StructSdtSDTInformeProduccionResumenOperario_OperarioItem struct )
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
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod = oReader.getValue() ;
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
                  gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProReo") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Openom") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Gruopecod") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorKilo") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorMetro") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenOperario.OperarioItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf) && ( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTF", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ParCod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProReo", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Openom", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Gruopecod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorKilo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorMetro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro, 6, 2)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod, false, false);
      datetime_STZ = gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf ;
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
      AddObjectProperty("ParCod", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod, false, false);
      AddObjectProperty("HisProReo", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr, false, false);
      AddObjectProperty("Openom", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom, false, false);
      AddObjectProperty("Gruopecod", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod, false, false);
      AddObjectProperty("PorKilo", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo, false, false);
      AddObjectProperty("PorMetro", gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro, false, false);
   }

   public String getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf = value ;
   }

   public short getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod = value ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom = value ;
   }

   public int getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod( int value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom = "" ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem struct )
   {
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod(struct.getEmprcod());
      if ( struct.gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod(struct.getParcod());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo(struct.getHisproreo());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom(struct.getOpenom());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod(struct.getGruopecod());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo(struct.getPorkilo());
      setgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro(struct.getPormetro());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem struct = new app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem ();
      struct.setEmprcod(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod());
      if ( gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf());
      }
      struct.setParcod(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod());
      struct.setHisproreo(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo());
      struct.setHisprokgr(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr());
      struct.setOpenom(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom());
      struct.setGruopecod(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod());
      struct.setPorkilo(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo());
      struct.setPormetro(getgxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisproreo ;
   protected short gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Gruopecod ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Pormetro ;
   protected String gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Openom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenOperario_OperarioItem_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

