package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr extends GxUserType
{
   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr.class));
   }

   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr");
   }

   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr");
   }

   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr( StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisbarser") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisreodsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hiscolnom") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hiscolnum") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisNomcli") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisreohdr") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisreofec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec = GXutil.nullDate() ;
                  gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N = (byte)(0) ;
                  gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hiskgmori") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisbarkgm") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisMtrori") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisbarmtr") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTHistoricoReoperadosTipoDefecto.Clilente.Hdr" ;
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
      oWriter.writeElement("Hisbarser", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisreodsc", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hiscolnom", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hiscolnum", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisNomcli", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisreohdr", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec)) && ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N == 1 ) )
      {
         oWriter.writeElement("Hisreofec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisreofec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Hiskgmori", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisbarkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisMtrori", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisbarmtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr, 9, 2)));
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
      AddObjectProperty("Hisbarser", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser, false, false);
      AddObjectProperty("Hisreodsc", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc, false, false);
      AddObjectProperty("Hiscolnom", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom, false, false);
      AddObjectProperty("Hiscolnum", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum, false, false);
      AddObjectProperty("HisNomcli", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli, false, false);
      AddObjectProperty("Hisreohdr", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Hisreofec", sDateCnv, false, false);
      AddObjectProperty("Hiskgmori", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori, false, false);
      AddObjectProperty("Hisbarkgm", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm, false, false);
      AddObjectProperty("HisMtrori", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori, false, false);
      AddObjectProperty("Hisbarmtr", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr, false, false);
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom = value ;
   }

   public int getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum( int value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr = value ;
   }

   public java.util.Date getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec( java.util.Date value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec = GXutil.nullDate() ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori = DecimalUtil.ZERO ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori = DecimalUtil.ZERO ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N ;
   }

   public app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser(struct.getHisbarser());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc(struct.getHisreodsc());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom(struct.getHiscolnom());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum(struct.getHiscolnum());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli(struct.getHisnomcli());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr(struct.getHisreohdr());
      if ( struct.gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N == 0 )
      {
         setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec(struct.getHisreofec());
      }
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori(struct.getHiskgmori());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm(struct.getHisbarkgm());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori(struct.getHismtrori());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr(struct.getHisbarmtr());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr struct = new app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr ();
      struct.setHisbarser(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser());
      struct.setHisreodsc(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc());
      struct.setHiscolnom(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom());
      struct.setHiscolnum(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum());
      struct.setHisnomcli(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli());
      struct.setHisreohdr(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr());
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N == 0 )
      {
         struct.setHisreofec(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec());
      }
      struct.setHiskgmori(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori());
      struct.setHisbarkgm(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm());
      struct.setHismtrori(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori());
      struct.setHisbarmtr(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnum ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiskgmori ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hismtrori ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarmtr ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisbarser ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreodsc ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hiscolnom ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisnomcli ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreohdr ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr_Hisreofec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

