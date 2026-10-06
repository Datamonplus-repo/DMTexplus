package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR extends GxUserType
{
   public SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR( )
   {
      this(  new ModelContext(SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR.class));
   }

   public SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR( ModelContext context )
   {
      super( context, "SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR");
   }

   public SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR");
   }

   public SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR( StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR struct )
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
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisreodsc") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hiscolnom") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hiscolnum") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisnomcli") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisreohdr") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr = oReader.getValue() ;
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
                  gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec = GXutil.nullDate() ;
                  gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N = (byte)(0) ;
                  gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisbarkgm") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hismtrori") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisbarmtr") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc = oReader.getValue() ;
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
         sName = "HistoricoReoperadosporCliente.TipodeDefecto.HDR" ;
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
      oWriter.writeElement("Hisbarser", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisreodsc", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hiscolnom", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hiscolnum", GXutil.trim( GXutil.str( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisnomcli", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisreohdr", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec)) && ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisreofec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Hiskgmori", GXutil.trim( GXutil.strNoRound( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisbarkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hismtrori", GXutil.trim( GXutil.strNoRound( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Hisbarmtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc);
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
      AddObjectProperty("Hisbarser", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser, false, false);
      AddObjectProperty("Hisreodsc", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc, false, false);
      AddObjectProperty("Hiscolnom", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom, false, false);
      AddObjectProperty("Hiscolnum", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum, false, false);
      AddObjectProperty("Hisnomcli", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli, false, false);
      AddObjectProperty("Hisreohdr", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Hisreofec", sDateCnv, false, false);
      AddObjectProperty("Hiskgmori", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori, false, false);
      AddObjectProperty("Hisbarkgm", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm, false, false);
      AddObjectProperty("Hismtrori", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori, false, false);
      AddObjectProperty("Hisbarmtr", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc, false, false);
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom = value ;
   }

   public int getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum( int value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr = value ;
   }

   public java.util.Date getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec( java.util.Date value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec = value ;
   }

   public java.math.BigDecimal getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori = value ;
   }

   public java.math.BigDecimal getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori = value ;
   }

   public java.math.BigDecimal getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N = (byte)(1) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec = GXutil.nullDate() ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N = (byte)(1) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori = DecimalUtil.ZERO ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm = DecimalUtil.ZERO ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori = DecimalUtil.ZERO ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr = DecimalUtil.ZERO ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N ;
   }

   public app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR Clone( )
   {
      return (app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR)(clone()) ;
   }

   public void setStruct( app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR struct )
   {
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser(struct.getHisbarser());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc(struct.getHisreodsc());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom(struct.getHiscolnom());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum(struct.getHiscolnum());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli(struct.getHisnomcli());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr(struct.getHisreohdr());
      if ( struct.gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N == 0 )
      {
         setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec(struct.getHisreofec());
      }
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori(struct.getHiskgmori());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm(struct.getHisbarkgm());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori(struct.getHismtrori());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr(struct.getHisbarmtr());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod(struct.getMaqcod());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc(struct.getMaqdsc());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR getStruct( )
   {
      app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR struct = new app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR ();
      struct.setHisbarser(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser());
      struct.setHisreodsc(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc());
      struct.setHiscolnom(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom());
      struct.setHiscolnum(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum());
      struct.setHisnomcli(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli());
      struct.setHisreohdr(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr());
      if ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N == 0 )
      {
         struct.setHisreofec(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec());
      }
      struct.setHiskgmori(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori());
      struct.setHisbarkgm(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm());
      struct.setHismtrori(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori());
      struct.setHisbarmtr(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr());
      struct.setMaqcod(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod());
      struct.setMaqdsc(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc());
      return struct ;
   }

   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_N ;
   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnum ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiskgmori ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarkgm ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hismtrori ;
   protected java.math.BigDecimal gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarmtr ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisbarser ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreodsc ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hiscolnom ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisnomcli ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreohdr ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqcod ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Maqdsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR_Hisreofec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

