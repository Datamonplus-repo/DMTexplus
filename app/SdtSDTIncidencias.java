package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTIncidencias extends GxUserType
{
   public SdtSDTIncidencias( )
   {
      this(  new ModelContext(SdtSDTIncidencias.class));
   }

   public SdtSDTIncidencias( ModelContext context )
   {
      super( context, "SdtSDTIncidencias");
   }

   public SdtSDTIncidencias( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTIncidencias");
   }

   public SdtSDTIncidencias( StructSdtSDTIncidencias struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_dia") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTIncidencias_Inc_dia = GXutil.nullDate() ;
                  gxTv_SdtSDTIncidencias_Inc_dia_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTIncidencias_Inc_dia_N = (byte)(0) ;
                  gxTv_SdtSDTIncidencias_Inc_dia = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_linea") )
            {
               gxTv_SdtSDTIncidencias_Inc_linea = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_hora") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTIncidencias_Inc_hora = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTIncidencias_Inc_hora_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTIncidencias_Inc_hora_N = (byte)(0) ;
                  gxTv_SdtSDTIncidencias_Inc_hora = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_Usuario") )
            {
               gxTv_SdtSDTIncidencias_Inc_usuario = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_terminal") )
            {
               gxTv_SdtSDTIncidencias_Inc_terminal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_prog") )
            {
               gxTv_SdtSDTIncidencias_Inc_prog = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_obsTXT") )
            {
               gxTv_SdtSDTIncidencias_Inc_obstxt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_Barcod") )
            {
               gxTv_SdtSDTIncidencias_Inc_barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_Barreo") )
            {
               gxTv_SdtSDTIncidencias_Inc_barreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_BarPar") )
            {
               gxTv_SdtSDTIncidencias_Inc_barpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_Hdr") )
            {
               gxTv_SdtSDTIncidencias_Inc_hdr = oReader.getValue() ;
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
         sName = "SDTIncidencias" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTIncidencias_Inc_dia)) && ( gxTv_SdtSDTIncidencias_Inc_dia_N == 1 ) )
      {
         oWriter.writeElement("Inc_dia", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTIncidencias_Inc_dia), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTIncidencias_Inc_dia), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTIncidencias_Inc_dia), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Inc_dia", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Inc_linea", GXutil.trim( GXutil.str( gxTv_SdtSDTIncidencias_Inc_linea, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTIncidencias_Inc_hora) && ( gxTv_SdtSDTIncidencias_Inc_hora_N == 1 ) )
      {
         oWriter.writeElement("Inc_hora", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTIncidencias_Inc_hora), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTIncidencias_Inc_hora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTIncidencias_Inc_hora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTIncidencias_Inc_hora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTIncidencias_Inc_hora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTIncidencias_Inc_hora), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Inc_hora", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Inc_Usuario", gxTv_SdtSDTIncidencias_Inc_usuario);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_terminal", gxTv_SdtSDTIncidencias_Inc_terminal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_prog", gxTv_SdtSDTIncidencias_Inc_prog);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_obsTXT", gxTv_SdtSDTIncidencias_Inc_obstxt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_Barcod", GXutil.trim( GXutil.str( gxTv_SdtSDTIncidencias_Inc_barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_Barreo", GXutil.trim( GXutil.str( gxTv_SdtSDTIncidencias_Inc_barreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_BarPar", gxTv_SdtSDTIncidencias_Inc_barpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Inc_Hdr", gxTv_SdtSDTIncidencias_Inc_hdr);
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
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTIncidencias_Inc_dia), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTIncidencias_Inc_dia), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTIncidencias_Inc_dia), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Inc_dia", sDateCnv, false, false);
      AddObjectProperty("Inc_linea", gxTv_SdtSDTIncidencias_Inc_linea, false, false);
      datetime_STZ = gxTv_SdtSDTIncidencias_Inc_hora ;
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
      AddObjectProperty("Inc_hora", sDateCnv, false, false);
      AddObjectProperty("Inc_Usuario", gxTv_SdtSDTIncidencias_Inc_usuario, false, false);
      AddObjectProperty("Inc_terminal", gxTv_SdtSDTIncidencias_Inc_terminal, false, false);
      AddObjectProperty("Inc_prog", gxTv_SdtSDTIncidencias_Inc_prog, false, false);
      AddObjectProperty("Inc_obsTXT", gxTv_SdtSDTIncidencias_Inc_obstxt, false, false);
      AddObjectProperty("Inc_Barcod", gxTv_SdtSDTIncidencias_Inc_barcod, false, false);
      AddObjectProperty("Inc_Barreo", gxTv_SdtSDTIncidencias_Inc_barreo, false, false);
      AddObjectProperty("Inc_BarPar", gxTv_SdtSDTIncidencias_Inc_barpar, false, false);
      AddObjectProperty("Inc_Hdr", gxTv_SdtSDTIncidencias_Inc_hdr, false, false);
   }

   public java.util.Date getgxTv_SdtSDTIncidencias_Inc_dia( )
   {
      return gxTv_SdtSDTIncidencias_Inc_dia ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_dia( java.util.Date value )
   {
      gxTv_SdtSDTIncidencias_Inc_dia_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_dia = value ;
   }

   public long getgxTv_SdtSDTIncidencias_Inc_linea( )
   {
      return gxTv_SdtSDTIncidencias_Inc_linea ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_linea( long value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_linea = value ;
   }

   public java.util.Date getgxTv_SdtSDTIncidencias_Inc_hora( )
   {
      return gxTv_SdtSDTIncidencias_Inc_hora ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_hora( java.util.Date value )
   {
      gxTv_SdtSDTIncidencias_Inc_hora_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_hora = value ;
   }

   public String getgxTv_SdtSDTIncidencias_Inc_usuario( )
   {
      return gxTv_SdtSDTIncidencias_Inc_usuario ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_usuario( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_usuario = value ;
   }

   public String getgxTv_SdtSDTIncidencias_Inc_terminal( )
   {
      return gxTv_SdtSDTIncidencias_Inc_terminal ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_terminal( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_terminal = value ;
   }

   public String getgxTv_SdtSDTIncidencias_Inc_prog( )
   {
      return gxTv_SdtSDTIncidencias_Inc_prog ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_prog( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_prog = value ;
   }

   public String getgxTv_SdtSDTIncidencias_Inc_obstxt( )
   {
      return gxTv_SdtSDTIncidencias_Inc_obstxt ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_obstxt( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_obstxt = value ;
   }

   public int getgxTv_SdtSDTIncidencias_Inc_barcod( )
   {
      return gxTv_SdtSDTIncidencias_Inc_barcod ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_barcod( int value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_barcod = value ;
   }

   public byte getgxTv_SdtSDTIncidencias_Inc_barreo( )
   {
      return gxTv_SdtSDTIncidencias_Inc_barreo ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_barreo( byte value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_barreo = value ;
   }

   public String getgxTv_SdtSDTIncidencias_Inc_barpar( )
   {
      return gxTv_SdtSDTIncidencias_Inc_barpar ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_barpar( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_barpar = value ;
   }

   public String getgxTv_SdtSDTIncidencias_Inc_hdr( )
   {
      return gxTv_SdtSDTIncidencias_Inc_hdr ;
   }

   public void setgxTv_SdtSDTIncidencias_Inc_hdr( String value )
   {
      gxTv_SdtSDTIncidencias_N = (byte)(0) ;
      gxTv_SdtSDTIncidencias_Inc_hdr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTIncidencias_Inc_dia = GXutil.nullDate() ;
      gxTv_SdtSDTIncidencias_Inc_dia_N = (byte)(1) ;
      gxTv_SdtSDTIncidencias_N = (byte)(1) ;
      gxTv_SdtSDTIncidencias_Inc_hora = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTIncidencias_Inc_hora_N = (byte)(1) ;
      gxTv_SdtSDTIncidencias_Inc_usuario = "" ;
      gxTv_SdtSDTIncidencias_Inc_terminal = "" ;
      gxTv_SdtSDTIncidencias_Inc_prog = "" ;
      gxTv_SdtSDTIncidencias_Inc_obstxt = "" ;
      gxTv_SdtSDTIncidencias_Inc_barpar = "" ;
      gxTv_SdtSDTIncidencias_Inc_hdr = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTIncidencias_N ;
   }

   public app.SdtSDTIncidencias Clone( )
   {
      return (app.SdtSDTIncidencias)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTIncidencias struct )
   {
      if ( struct.gxTv_SdtSDTIncidencias_Inc_dia_N == 0 )
      {
         setgxTv_SdtSDTIncidencias_Inc_dia(struct.getInc_dia());
      }
      setgxTv_SdtSDTIncidencias_Inc_linea(struct.getInc_linea());
      if ( struct.gxTv_SdtSDTIncidencias_Inc_hora_N == 0 )
      {
         setgxTv_SdtSDTIncidencias_Inc_hora(struct.getInc_hora());
      }
      setgxTv_SdtSDTIncidencias_Inc_usuario(struct.getInc_usuario());
      setgxTv_SdtSDTIncidencias_Inc_terminal(struct.getInc_terminal());
      setgxTv_SdtSDTIncidencias_Inc_prog(struct.getInc_prog());
      setgxTv_SdtSDTIncidencias_Inc_obstxt(struct.getInc_obstxt());
      setgxTv_SdtSDTIncidencias_Inc_barcod(struct.getInc_barcod());
      setgxTv_SdtSDTIncidencias_Inc_barreo(struct.getInc_barreo());
      setgxTv_SdtSDTIncidencias_Inc_barpar(struct.getInc_barpar());
      setgxTv_SdtSDTIncidencias_Inc_hdr(struct.getInc_hdr());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTIncidencias getStruct( )
   {
      app.StructSdtSDTIncidencias struct = new app.StructSdtSDTIncidencias ();
      if ( gxTv_SdtSDTIncidencias_Inc_dia_N == 0 )
      {
         struct.setInc_dia(getgxTv_SdtSDTIncidencias_Inc_dia());
      }
      struct.setInc_linea(getgxTv_SdtSDTIncidencias_Inc_linea());
      if ( gxTv_SdtSDTIncidencias_Inc_hora_N == 0 )
      {
         struct.setInc_hora(getgxTv_SdtSDTIncidencias_Inc_hora());
      }
      struct.setInc_usuario(getgxTv_SdtSDTIncidencias_Inc_usuario());
      struct.setInc_terminal(getgxTv_SdtSDTIncidencias_Inc_terminal());
      struct.setInc_prog(getgxTv_SdtSDTIncidencias_Inc_prog());
      struct.setInc_obstxt(getgxTv_SdtSDTIncidencias_Inc_obstxt());
      struct.setInc_barcod(getgxTv_SdtSDTIncidencias_Inc_barcod());
      struct.setInc_barreo(getgxTv_SdtSDTIncidencias_Inc_barreo());
      struct.setInc_barpar(getgxTv_SdtSDTIncidencias_Inc_barpar());
      struct.setInc_hdr(getgxTv_SdtSDTIncidencias_Inc_hdr());
      return struct ;
   }

   protected byte gxTv_SdtSDTIncidencias_Inc_dia_N ;
   protected byte gxTv_SdtSDTIncidencias_N ;
   protected byte gxTv_SdtSDTIncidencias_Inc_hora_N ;
   protected byte gxTv_SdtSDTIncidencias_Inc_barreo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTIncidencias_Inc_barcod ;
   protected long gxTv_SdtSDTIncidencias_Inc_linea ;
   protected String gxTv_SdtSDTIncidencias_Inc_usuario ;
   protected String gxTv_SdtSDTIncidencias_Inc_terminal ;
   protected String gxTv_SdtSDTIncidencias_Inc_prog ;
   protected String gxTv_SdtSDTIncidencias_Inc_barpar ;
   protected String gxTv_SdtSDTIncidencias_Inc_hdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTIncidencias_Inc_hora ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSDTIncidencias_Inc_dia ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTIncidencias_Inc_obstxt ;
}

