package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenMaquina_MaquinaItem extends GxUserType
{
   public SdtSDTInformeProduccionResumenMaquina_MaquinaItem( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenMaquina_MaquinaItem.class));
   }

   public SdtSDTInformeProduccionResumenMaquina_MaquinaItem( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenMaquina_MaquinaItem");
   }

   public SdtSDTInformeProduccionResumenMaquina_MaquinaItem( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenMaquina_MaquinaItem");
   }

   public SdtSDTInformeProduccionResumenMaquina_MaquinaItem( StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem struct )
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
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc = oReader.getValue() ;
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
                  gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProReo") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProLot") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Minutos") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotaltiempoMaquina") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorKilo") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorMetro") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProLotBar") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar = oReader.getValue() ;
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
         sName = "SDTInformeProduccionResumenMaquina.MaquinaItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf) && ( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTF", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ParCod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProReo", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProLot", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Minutos", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotaltiempoMaquina", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorKilo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorMetro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProLotBar", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar);
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
      AddObjectProperty("EmprCod", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc, false, false);
      datetime_STZ = gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf ;
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
      AddObjectProperty("ParCod", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod, false, false);
      AddObjectProperty("HisProReo", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr, false, false);
      AddObjectProperty("HisProLot", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot, false, false);
      AddObjectProperty("Minutos", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos, false, false);
      AddObjectProperty("TotaltiempoMaquina", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina, false, false);
      AddObjectProperty("PorKilo", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo, false, false);
      AddObjectProperty("PorMetro", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro, false, false);
      AddObjectProperty("HisProLotBar", gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar, false, false);
   }

   public String getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf = value ;
   }

   public short getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod = value ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot = value ;
   }

   public int getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos( int value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos = value ;
   }

   public int getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina( int value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot = "" ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem struct )
   {
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc(struct.getMaqdsc());
      if ( struct.gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod(struct.getParcod());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo(struct.getHisproreo());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot(struct.getHisprolot());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos(struct.getMinutos());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina(struct.getTotaltiempomaquina());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo(struct.getPorkilo());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro(struct.getPormetro());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar(struct.getHisprolotbar());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem struct = new app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem ();
      struct.setEmprcod(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod());
      struct.setMaqcod(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc());
      if ( gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf());
      }
      struct.setParcod(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod());
      struct.setHisproreo(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo());
      struct.setHispromtr(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr());
      struct.setHisprokgr(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr());
      struct.setHisprolot(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot());
      struct.setMinutos(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos());
      struct.setTotaltiempomaquina(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina());
      struct.setPorkilo(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo());
      struct.setPormetro(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro());
      struct.setHisprolotbar(getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo ;
   protected short gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos ;
   protected int gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot ;
   protected String gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolotbar ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

