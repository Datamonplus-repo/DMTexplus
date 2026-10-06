package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTConsultaMaquina extends GxUserType
{
   public SdtSDTConsultaMaquina( )
   {
      this(  new ModelContext(SdtSDTConsultaMaquina.class));
   }

   public SdtSDTConsultaMaquina( ModelContext context )
   {
      super( context, "SdtSDTConsultaMaquina");
   }

   public SdtSDTConsultaMaquina( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTConsultaMaquina");
   }

   public SdtSDTConsultaMaquina( StructSdtSDTConsultaMaquina struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "OMMaqCod") )
            {
               gxTv_SdtSDTConsultaMaquina_Ommaqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OMDscMqPla") )
            {
               gxTv_SdtSDTConsultaMaquina_Omdscmqpla = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MinimaOMFchCre") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTConsultaMaquina_Minimaomfchcre = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N = (byte)(0) ;
                  gxTv_SdtSDTConsultaMaquina_Minimaomfchcre = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaximaOMFchCre") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTConsultaMaquina_Maximaomfchcre = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N = (byte)(0) ;
                  gxTv_SdtSDTConsultaMaquina_Maximaomfchcre = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalOrdenes") )
            {
               gxTv_SdtSDTConsultaMaquina_Totalordenes = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ordenes") )
            {
               if ( gxTv_SdtSDTConsultaMaquina_Ordenes == null )
               {
                  gxTv_SdtSDTConsultaMaquina_Ordenes = new GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem>(app.SdtSDTConsultaMaquina_OrdenesItem.class, "SDTConsultaMaquina.OrdenesItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTConsultaMaquina_Ordenes.readxmlcollection(oReader, "Ordenes", "OrdenesItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Ordenes") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SDTConsultaMaquina" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("OMMaqCod", gxTv_SdtSDTConsultaMaquina_Ommaqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OMDscMqPla", gxTv_SdtSDTConsultaMaquina_Omdscmqpla);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTConsultaMaquina_Minimaomfchcre) && ( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N == 1 ) )
      {
         oWriter.writeElement("MinimaOMFchCre", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MinimaOMFchCre", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTConsultaMaquina_Maximaomfchcre) && ( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N == 1 ) )
      {
         oWriter.writeElement("MaximaOMFchCre", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MaximaOMFchCre", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("TotalOrdenes", GXutil.trim( GXutil.str( gxTv_SdtSDTConsultaMaquina_Totalordenes, 18, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTConsultaMaquina_Ordenes != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSDTConsultaMaquina_Ordenes.writexmlcollection(oWriter, "Ordenes", sNameSpace1, "OrdenesItem", sNameSpace1);
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
      AddObjectProperty("OMMaqCod", gxTv_SdtSDTConsultaMaquina_Ommaqcod, false, false);
      AddObjectProperty("OMDscMqPla", gxTv_SdtSDTConsultaMaquina_Omdscmqpla, false, false);
      datetime_STZ = gxTv_SdtSDTConsultaMaquina_Minimaomfchcre ;
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
      AddObjectProperty("MinimaOMFchCre", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtSDTConsultaMaquina_Maximaomfchcre ;
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
      AddObjectProperty("MaximaOMFchCre", sDateCnv, false, false);
      AddObjectProperty("TotalOrdenes", GXutil.ltrim( GXutil.str( gxTv_SdtSDTConsultaMaquina_Totalordenes, 18, 0)), false, false);
      if ( gxTv_SdtSDTConsultaMaquina_Ordenes != null )
      {
         AddObjectProperty("Ordenes", gxTv_SdtSDTConsultaMaquina_Ordenes, false, false);
      }
   }

   public String getgxTv_SdtSDTConsultaMaquina_Ommaqcod( )
   {
      return gxTv_SdtSDTConsultaMaquina_Ommaqcod ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Ommaqcod( String value )
   {
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Ommaqcod = value ;
   }

   public String getgxTv_SdtSDTConsultaMaquina_Omdscmqpla( )
   {
      return gxTv_SdtSDTConsultaMaquina_Omdscmqpla ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Omdscmqpla( String value )
   {
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Omdscmqpla = value ;
   }

   public java.util.Date getgxTv_SdtSDTConsultaMaquina_Minimaomfchcre( )
   {
      return gxTv_SdtSDTConsultaMaquina_Minimaomfchcre ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Minimaomfchcre( java.util.Date value )
   {
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre = value ;
   }

   public java.util.Date getgxTv_SdtSDTConsultaMaquina_Maximaomfchcre( )
   {
      return gxTv_SdtSDTConsultaMaquina_Maximaomfchcre ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Maximaomfchcre( java.util.Date value )
   {
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre = value ;
   }

   public long getgxTv_SdtSDTConsultaMaquina_Totalordenes( )
   {
      return gxTv_SdtSDTConsultaMaquina_Totalordenes ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Totalordenes( long value )
   {
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Totalordenes = value ;
   }

   public GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem> getgxTv_SdtSDTConsultaMaquina_Ordenes( )
   {
      if ( gxTv_SdtSDTConsultaMaquina_Ordenes == null )
      {
         gxTv_SdtSDTConsultaMaquina_Ordenes = new GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem>(app.SdtSDTConsultaMaquina_OrdenesItem.class, "SDTConsultaMaquina.OrdenesItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTConsultaMaquina_Ordenes_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTConsultaMaquina_Ordenes ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Ordenes( GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem> value )
   {
      gxTv_SdtSDTConsultaMaquina_Ordenes_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_Ordenes = value ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_Ordenes_SetNull( )
   {
      gxTv_SdtSDTConsultaMaquina_Ordenes_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_Ordenes = null ;
   }

   public boolean getgxTv_SdtSDTConsultaMaquina_Ordenes_IsNull( )
   {
      if ( gxTv_SdtSDTConsultaMaquina_Ordenes == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTConsultaMaquina_Ordenes_N( )
   {
      return gxTv_SdtSDTConsultaMaquina_Ordenes_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTConsultaMaquina_Ommaqcod = "" ;
      gxTv_SdtSDTConsultaMaquina_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_Omdscmqpla = "" ;
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_Ordenes_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTConsultaMaquina_N ;
   }

   public app.SdtSDTConsultaMaquina Clone( )
   {
      return (app.SdtSDTConsultaMaquina)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTConsultaMaquina struct )
   {
      setgxTv_SdtSDTConsultaMaquina_Ommaqcod(struct.getOmmaqcod());
      setgxTv_SdtSDTConsultaMaquina_Omdscmqpla(struct.getOmdscmqpla());
      if ( struct.gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N == 0 )
      {
         setgxTv_SdtSDTConsultaMaquina_Minimaomfchcre(struct.getMinimaomfchcre());
      }
      if ( struct.gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N == 0 )
      {
         setgxTv_SdtSDTConsultaMaquina_Maximaomfchcre(struct.getMaximaomfchcre());
      }
      setgxTv_SdtSDTConsultaMaquina_Totalordenes(struct.getTotalordenes());
      GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem> gxTv_SdtSDTConsultaMaquina_Ordenes_aux = new GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem>(app.SdtSDTConsultaMaquina_OrdenesItem.class, "SDTConsultaMaquina.OrdenesItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTConsultaMaquina_OrdenesItem> gxTv_SdtSDTConsultaMaquina_Ordenes_aux1 = struct.getOrdenes();
      if (gxTv_SdtSDTConsultaMaquina_Ordenes_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTConsultaMaquina_Ordenes_aux1.size(); i++)
         {
            gxTv_SdtSDTConsultaMaquina_Ordenes_aux.add(new app.SdtSDTConsultaMaquina_OrdenesItem(gxTv_SdtSDTConsultaMaquina_Ordenes_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTConsultaMaquina_Ordenes(gxTv_SdtSDTConsultaMaquina_Ordenes_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTConsultaMaquina getStruct( )
   {
      app.StructSdtSDTConsultaMaquina struct = new app.StructSdtSDTConsultaMaquina ();
      struct.setOmmaqcod(getgxTv_SdtSDTConsultaMaquina_Ommaqcod());
      struct.setOmdscmqpla(getgxTv_SdtSDTConsultaMaquina_Omdscmqpla());
      if ( gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N == 0 )
      {
         struct.setMinimaomfchcre(getgxTv_SdtSDTConsultaMaquina_Minimaomfchcre());
      }
      if ( gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N == 0 )
      {
         struct.setMaximaomfchcre(getgxTv_SdtSDTConsultaMaquina_Maximaomfchcre());
      }
      struct.setTotalordenes(getgxTv_SdtSDTConsultaMaquina_Totalordenes());
      struct.setOrdenes(getgxTv_SdtSDTConsultaMaquina_Ordenes().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTConsultaMaquina_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_Minimaomfchcre_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_Maximaomfchcre_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_Ordenes_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDTConsultaMaquina_Totalordenes ;
   protected String gxTv_SdtSDTConsultaMaquina_Ommaqcod ;
   protected String gxTv_SdtSDTConsultaMaquina_Omdscmqpla ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTConsultaMaquina_Minimaomfchcre ;
   protected java.util.Date gxTv_SdtSDTConsultaMaquina_Maximaomfchcre ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem> gxTv_SdtSDTConsultaMaquina_Ordenes_aux ;
   protected GXBaseCollection<app.SdtSDTConsultaMaquina_OrdenesItem> gxTv_SdtSDTConsultaMaquina_Ordenes=null ;
}

