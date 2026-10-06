package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_AlertaGraficaSDT extends GxUserType
{
   public SdtMRec_AlertaGraficaSDT( )
   {
      this(  new ModelContext(SdtMRec_AlertaGraficaSDT.class));
   }

   public SdtMRec_AlertaGraficaSDT( ModelContext context )
   {
      super( context, "SdtMRec_AlertaGraficaSDT");
   }

   public SdtMRec_AlertaGraficaSDT( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_AlertaGraficaSDT");
   }

   public SdtMRec_AlertaGraficaSDT( StructSdtMRec_AlertaGraficaSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "GraficaFecha") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N = (byte)(0) ;
                  gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_1") )
            {
               gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_2") )
            {
               gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_3") )
            {
               gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "MRec_AlertaGraficaSDT" ;
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
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha) && ( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N == 1 ) )
      {
         oWriter.writeElement("GraficaFecha", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("GraficaFecha", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MPRecPLC_1", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_2", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_3", GXutil.trim( GXutil.strNoRound( gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      datetime_STZ = gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha ;
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
      AddObjectProperty("GraficaFecha", sDateCnv, false, false);
      AddObjectProperty("MPRecPLC_1", gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1, false, false);
      AddObjectProperty("MPRecPLC_2", gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2, false, false);
      AddObjectProperty("MPRecPLC_3", gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3, false, false);
   }

   public java.util.Date getgxTv_SdtMRec_AlertaGraficaSDT_Graficafecha( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha ;
   }

   public void setgxTv_SdtMRec_AlertaGraficaSDT_Graficafecha( java.util.Date value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 ;
   }

   public void setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 ;
   }

   public void setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 ;
   }

   public void setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3( java.math.BigDecimal value )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N = (byte)(1) ;
      gxTv_SdtMRec_AlertaGraficaSDT_N = (byte)(1) ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 = DecimalUtil.ZERO ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 = DecimalUtil.ZERO ;
      gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_AlertaGraficaSDT_N ;
   }

   public app.ingenieria.SdtMRec_AlertaGraficaSDT Clone( )
   {
      return (app.ingenieria.SdtMRec_AlertaGraficaSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_AlertaGraficaSDT struct )
   {
      if ( struct.gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N == 0 )
      {
         setgxTv_SdtMRec_AlertaGraficaSDT_Graficafecha(struct.getGraficafecha());
      }
      setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1(struct.getMprecplc_1());
      setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2(struct.getMprecplc_2());
      setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3(struct.getMprecplc_3());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_AlertaGraficaSDT getStruct( )
   {
      app.ingenieria.StructSdtMRec_AlertaGraficaSDT struct = new app.ingenieria.StructSdtMRec_AlertaGraficaSDT ();
      if ( gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N == 0 )
      {
         struct.setGraficafecha(getgxTv_SdtMRec_AlertaGraficaSDT_Graficafecha());
      }
      struct.setMprecplc_1(getgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1());
      struct.setMprecplc_2(getgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2());
      struct.setMprecplc_3(getgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3());
      return struct ;
   }

   protected byte gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha_N ;
   protected byte gxTv_SdtMRec_AlertaGraficaSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1 ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2 ;
   protected java.math.BigDecimal gxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3 ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtMRec_AlertaGraficaSDT_Graficafecha ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

