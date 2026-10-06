package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDetalleEntradas extends GxUserType
{
   public SdtSDTDetalleEntradas( )
   {
      this(  new ModelContext(SdtSDTDetalleEntradas.class));
   }

   public SdtSDTDetalleEntradas( ModelContext context )
   {
      super( context, "SdtSDTDetalleEntradas");
   }

   public SdtSDTDetalleEntradas( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDetalleEntradas");
   }

   public SdtSDTDetalleEntradas( StructSdtSDTDetalleEntradas struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtSDTDetalleEntradas_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTDetalleEntradas_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albref") )
            {
               gxTv_SdtSDTDetalleEntradas_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrefdsc") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albreccod") )
            {
               gxTv_SdtSDTDetalleEntradas_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrfen") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDetalleEntradas_Albrfen = GXutil.nullDate() ;
                  gxTv_SdtSDTDetalleEntradas_Albrfen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDetalleEntradas_Albrfen_N = (byte)(0) ;
                  gxTv_SdtSDTDetalleEntradas_Albrfen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREnt2") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrent2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbruni") )
            {
               gxTv_SdtSDTDetalleEntradas_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrUnient") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrpieent") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrpieent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbruniuti") )
            {
               gxTv_SdtSDTDetalleEntradas_Albruniuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrpieuti") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrpieuti = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrunidis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbrPieDis") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrpiedis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLoc") )
            {
               gxTv_SdtSDTDetalleEntradas_Albrloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procenom") )
            {
               gxTv_SdtSDTDetalleEntradas_Procenom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtSDTDetalleEntradas_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Obs") )
            {
               gxTv_SdtSDTDetalleEntradas_Obs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KgsExp") )
            {
               gxTv_SdtSDTDetalleEntradas_Kgsexp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MtsExp") )
            {
               gxTv_SdtSDTDetalleEntradas_Mtsexp = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PzsExp") )
            {
               gxTv_SdtSDTDetalleEntradas_Pzsexp = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTDetalleEntradas" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleEntradas_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTDetalleEntradas_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albref", gxTv_SdtSDTDetalleEntradas_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albrefdsc", gxTv_SdtSDTDetalleEntradas_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albreccod", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleEntradas_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDetalleEntradas_Albrfen)) && ( gxTv_SdtSDTDetalleEntradas_Albrfen_N == 1 ) )
      {
         oWriter.writeElement("albrfen", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDetalleEntradas_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDetalleEntradas_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDetalleEntradas_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("albrfen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbREnt2", gxTv_SdtSDTDetalleEntradas_Albrent2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbruni", gxTv_SdtSDTDetalleEntradas_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrUnient", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleEntradas_Albrunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albrpieent", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleEntradas_Albrpieent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbruniuti", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleEntradas_Albruniuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albrpieuti", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleEntradas_Albrpieuti, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniDis", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleEntradas_Albrunidis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbrPieDis", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleEntradas_Albrpiedis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLoc", gxTv_SdtSDTDetalleEntradas_Albrloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procenom", gxTv_SdtSDTDetalleEntradas_Procenom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtSDTDetalleEntradas_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Obs", gxTv_SdtSDTDetalleEntradas_Obs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KgsExp", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleEntradas_Kgsexp, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MtsExp", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDetalleEntradas_Mtsexp, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PzsExp", GXutil.trim( GXutil.str( gxTv_SdtSDTDetalleEntradas_Pzsexp, 6, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtSDTDetalleEntradas_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTDetalleEntradas_Clinom, false, false);
      AddObjectProperty("Albref", gxTv_SdtSDTDetalleEntradas_Albref, false, false);
      AddObjectProperty("Albrefdsc", gxTv_SdtSDTDetalleEntradas_Albrefdsc, false, false);
      AddObjectProperty("Albreccod", gxTv_SdtSDTDetalleEntradas_Albreccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDetalleEntradas_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDetalleEntradas_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDetalleEntradas_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("albrfen", sDateCnv, false, false);
      AddObjectProperty("AlbREnt2", gxTv_SdtSDTDetalleEntradas_Albrent2, false, false);
      AddObjectProperty("ALbruni", gxTv_SdtSDTDetalleEntradas_Albruni, false, false);
      AddObjectProperty("AlbrUnient", gxTv_SdtSDTDetalleEntradas_Albrunient, false, false);
      AddObjectProperty("albrpieent", gxTv_SdtSDTDetalleEntradas_Albrpieent, false, false);
      AddObjectProperty("ALbruniuti", gxTv_SdtSDTDetalleEntradas_Albruniuti, false, false);
      AddObjectProperty("Albrpieuti", gxTv_SdtSDTDetalleEntradas_Albrpieuti, false, false);
      AddObjectProperty("AlbRUniDis", gxTv_SdtSDTDetalleEntradas_Albrunidis, false, false);
      AddObjectProperty("ALbrPieDis", gxTv_SdtSDTDetalleEntradas_Albrpiedis, false, false);
      AddObjectProperty("AlbRLoc", gxTv_SdtSDTDetalleEntradas_Albrloc, false, false);
      AddObjectProperty("Procenom", gxTv_SdtSDTDetalleEntradas_Procenom, false, false);
      AddObjectProperty("TrnNom", gxTv_SdtSDTDetalleEntradas_Trnnom, false, false);
      AddObjectProperty("Obs", gxTv_SdtSDTDetalleEntradas_Obs, false, false);
      AddObjectProperty("KgsExp", gxTv_SdtSDTDetalleEntradas_Kgsexp, false, false);
      AddObjectProperty("MtsExp", gxTv_SdtSDTDetalleEntradas_Mtsexp, false, false);
      AddObjectProperty("PzsExp", gxTv_SdtSDTDetalleEntradas_Pzsexp, false, false);
   }

   public int getgxTv_SdtSDTDetalleEntradas_Clicod( )
   {
      return gxTv_SdtSDTDetalleEntradas_Clicod ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Clicod( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Clicod = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Clinom( )
   {
      return gxTv_SdtSDTDetalleEntradas_Clinom ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Clinom( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Clinom = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Albref( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albref ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albref( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albref = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Albrefdsc( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrefdsc ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrefdsc( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrefdsc = value ;
   }

   public int getgxTv_SdtSDTDetalleEntradas_Albreccod( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albreccod ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albreccod( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albreccod = value ;
   }

   public java.util.Date getgxTv_SdtSDTDetalleEntradas_Albrfen( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrfen ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrfen( java.util.Date value )
   {
      gxTv_SdtSDTDetalleEntradas_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrfen = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Albrent2( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrent2 ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrent2( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrent2 = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Albruni( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albruni ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albruni( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleEntradas_Albrunient( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrunient ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrunient( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrunient = value ;
   }

   public int getgxTv_SdtSDTDetalleEntradas_Albrpieent( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrpieent ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrpieent( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrpieent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleEntradas_Albruniuti( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albruniuti ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albruniuti = value ;
   }

   public int getgxTv_SdtSDTDetalleEntradas_Albrpieuti( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrpieuti ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrpieuti( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrpieuti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleEntradas_Albrunidis( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrunidis ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrunidis = value ;
   }

   public int getgxTv_SdtSDTDetalleEntradas_Albrpiedis( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrpiedis ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrpiedis( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrpiedis = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Albrloc( )
   {
      return gxTv_SdtSDTDetalleEntradas_Albrloc ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Albrloc( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Albrloc = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Procenom( )
   {
      return gxTv_SdtSDTDetalleEntradas_Procenom ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Procenom( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Procenom = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Trnnom( )
   {
      return gxTv_SdtSDTDetalleEntradas_Trnnom ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Trnnom( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Trnnom = value ;
   }

   public String getgxTv_SdtSDTDetalleEntradas_Obs( )
   {
      return gxTv_SdtSDTDetalleEntradas_Obs ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Obs( String value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Obs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleEntradas_Kgsexp( )
   {
      return gxTv_SdtSDTDetalleEntradas_Kgsexp ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Kgsexp( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Kgsexp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDetalleEntradas_Mtsexp( )
   {
      return gxTv_SdtSDTDetalleEntradas_Mtsexp ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Mtsexp( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Mtsexp = value ;
   }

   public int getgxTv_SdtSDTDetalleEntradas_Pzsexp( )
   {
      return gxTv_SdtSDTDetalleEntradas_Pzsexp ;
   }

   public void setgxTv_SdtSDTDetalleEntradas_Pzsexp( int value )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(0) ;
      gxTv_SdtSDTDetalleEntradas_Pzsexp = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDetalleEntradas_N = (byte)(1) ;
      gxTv_SdtSDTDetalleEntradas_Clinom = "" ;
      gxTv_SdtSDTDetalleEntradas_Albref = "" ;
      gxTv_SdtSDTDetalleEntradas_Albrefdsc = "" ;
      gxTv_SdtSDTDetalleEntradas_Albrfen = GXutil.nullDate() ;
      gxTv_SdtSDTDetalleEntradas_Albrfen_N = (byte)(1) ;
      gxTv_SdtSDTDetalleEntradas_Albrent2 = "" ;
      gxTv_SdtSDTDetalleEntradas_Albruni = "" ;
      gxTv_SdtSDTDetalleEntradas_Albrunient = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleEntradas_Albruniuti = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleEntradas_Albrunidis = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleEntradas_Albrloc = "" ;
      gxTv_SdtSDTDetalleEntradas_Procenom = "" ;
      gxTv_SdtSDTDetalleEntradas_Trnnom = "" ;
      gxTv_SdtSDTDetalleEntradas_Obs = "" ;
      gxTv_SdtSDTDetalleEntradas_Kgsexp = DecimalUtil.ZERO ;
      gxTv_SdtSDTDetalleEntradas_Mtsexp = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDetalleEntradas_N ;
   }

   public app.SdtSDTDetalleEntradas Clone( )
   {
      return (app.SdtSDTDetalleEntradas)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTDetalleEntradas struct )
   {
      setgxTv_SdtSDTDetalleEntradas_Clicod(struct.getClicod());
      setgxTv_SdtSDTDetalleEntradas_Clinom(struct.getClinom());
      setgxTv_SdtSDTDetalleEntradas_Albref(struct.getAlbref());
      setgxTv_SdtSDTDetalleEntradas_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtSDTDetalleEntradas_Albreccod(struct.getAlbreccod());
      if ( struct.gxTv_SdtSDTDetalleEntradas_Albrfen_N == 0 )
      {
         setgxTv_SdtSDTDetalleEntradas_Albrfen(struct.getAlbrfen());
      }
      setgxTv_SdtSDTDetalleEntradas_Albrent2(struct.getAlbrent2());
      setgxTv_SdtSDTDetalleEntradas_Albruni(struct.getAlbruni());
      setgxTv_SdtSDTDetalleEntradas_Albrunient(struct.getAlbrunient());
      setgxTv_SdtSDTDetalleEntradas_Albrpieent(struct.getAlbrpieent());
      setgxTv_SdtSDTDetalleEntradas_Albruniuti(struct.getAlbruniuti());
      setgxTv_SdtSDTDetalleEntradas_Albrpieuti(struct.getAlbrpieuti());
      setgxTv_SdtSDTDetalleEntradas_Albrunidis(struct.getAlbrunidis());
      setgxTv_SdtSDTDetalleEntradas_Albrpiedis(struct.getAlbrpiedis());
      setgxTv_SdtSDTDetalleEntradas_Albrloc(struct.getAlbrloc());
      setgxTv_SdtSDTDetalleEntradas_Procenom(struct.getProcenom());
      setgxTv_SdtSDTDetalleEntradas_Trnnom(struct.getTrnnom());
      setgxTv_SdtSDTDetalleEntradas_Obs(struct.getObs());
      setgxTv_SdtSDTDetalleEntradas_Kgsexp(struct.getKgsexp());
      setgxTv_SdtSDTDetalleEntradas_Mtsexp(struct.getMtsexp());
      setgxTv_SdtSDTDetalleEntradas_Pzsexp(struct.getPzsexp());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTDetalleEntradas getStruct( )
   {
      app.StructSdtSDTDetalleEntradas struct = new app.StructSdtSDTDetalleEntradas ();
      struct.setClicod(getgxTv_SdtSDTDetalleEntradas_Clicod());
      struct.setClinom(getgxTv_SdtSDTDetalleEntradas_Clinom());
      struct.setAlbref(getgxTv_SdtSDTDetalleEntradas_Albref());
      struct.setAlbrefdsc(getgxTv_SdtSDTDetalleEntradas_Albrefdsc());
      struct.setAlbreccod(getgxTv_SdtSDTDetalleEntradas_Albreccod());
      if ( gxTv_SdtSDTDetalleEntradas_Albrfen_N == 0 )
      {
         struct.setAlbrfen(getgxTv_SdtSDTDetalleEntradas_Albrfen());
      }
      struct.setAlbrent2(getgxTv_SdtSDTDetalleEntradas_Albrent2());
      struct.setAlbruni(getgxTv_SdtSDTDetalleEntradas_Albruni());
      struct.setAlbrunient(getgxTv_SdtSDTDetalleEntradas_Albrunient());
      struct.setAlbrpieent(getgxTv_SdtSDTDetalleEntradas_Albrpieent());
      struct.setAlbruniuti(getgxTv_SdtSDTDetalleEntradas_Albruniuti());
      struct.setAlbrpieuti(getgxTv_SdtSDTDetalleEntradas_Albrpieuti());
      struct.setAlbrunidis(getgxTv_SdtSDTDetalleEntradas_Albrunidis());
      struct.setAlbrpiedis(getgxTv_SdtSDTDetalleEntradas_Albrpiedis());
      struct.setAlbrloc(getgxTv_SdtSDTDetalleEntradas_Albrloc());
      struct.setProcenom(getgxTv_SdtSDTDetalleEntradas_Procenom());
      struct.setTrnnom(getgxTv_SdtSDTDetalleEntradas_Trnnom());
      struct.setObs(getgxTv_SdtSDTDetalleEntradas_Obs());
      struct.setKgsexp(getgxTv_SdtSDTDetalleEntradas_Kgsexp());
      struct.setMtsexp(getgxTv_SdtSDTDetalleEntradas_Mtsexp());
      struct.setPzsexp(getgxTv_SdtSDTDetalleEntradas_Pzsexp());
      return struct ;
   }

   protected byte gxTv_SdtSDTDetalleEntradas_N ;
   protected byte gxTv_SdtSDTDetalleEntradas_Albrfen_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTDetalleEntradas_Clicod ;
   protected int gxTv_SdtSDTDetalleEntradas_Albreccod ;
   protected int gxTv_SdtSDTDetalleEntradas_Albrpieent ;
   protected int gxTv_SdtSDTDetalleEntradas_Albrpieuti ;
   protected int gxTv_SdtSDTDetalleEntradas_Albrpiedis ;
   protected int gxTv_SdtSDTDetalleEntradas_Pzsexp ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Albrunidis ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Kgsexp ;
   protected java.math.BigDecimal gxTv_SdtSDTDetalleEntradas_Mtsexp ;
   protected String gxTv_SdtSDTDetalleEntradas_Clinom ;
   protected String gxTv_SdtSDTDetalleEntradas_Albref ;
   protected String gxTv_SdtSDTDetalleEntradas_Albrefdsc ;
   protected String gxTv_SdtSDTDetalleEntradas_Albrent2 ;
   protected String gxTv_SdtSDTDetalleEntradas_Albruni ;
   protected String gxTv_SdtSDTDetalleEntradas_Albrloc ;
   protected String gxTv_SdtSDTDetalleEntradas_Procenom ;
   protected String gxTv_SdtSDTDetalleEntradas_Trnnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTDetalleEntradas_Albrfen ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTDetalleEntradas_Obs ;
}

