package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDistribuciondeUnidades extends GxUserType
{
   public SdtSDTDistribuciondeUnidades( )
   {
      this(  new ModelContext(SdtSDTDistribuciondeUnidades.class));
   }

   public SdtSDTDistribuciondeUnidades( ModelContext context )
   {
      super( context, "SdtSDTDistribuciondeUnidades");
   }

   public SdtSDTDistribuciondeUnidades( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDistribuciondeUnidades");
   }

   public SdtSDTDistribuciondeUnidades( StructSdtSDTDistribuciondeUnidades struct )
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
               gxTv_SdtSDTDistribuciondeUnidades_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albref") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrefdsc") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albreccod") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtSDTDistribuciondeUnidades_Albrfen = GXutil.nullDate() ;
                  gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N = (byte)(0) ;
                  gxTv_SdtSDTDistribuciondeUnidades_Albrfen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtSDTDistribuciondeUnidades_Albrent2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbruni") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbrUnient") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albrunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "albrpieent") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albrpieent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albrunidis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbrPieDis") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRLoc") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Albrloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procenom") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Procenom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Obs") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_Obs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hdrs") )
            {
               if ( gxTv_SdtSDTDistribuciondeUnidades_Hdrs == null )
               {
                  gxTv_SdtSDTDistribuciondeUnidades_Hdrs = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem>(app.SdtSDTDistribuciondeUnidades_HdrsItem.class, "SDTDistribuciondeUnidades.HdrsItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTDistribuciondeUnidades_Hdrs.readxmlcollection(oReader, "Hdrs", "HdrsItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Hdrs") )
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
         sName = "SDTDistribuciondeUnidades" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTDistribuciondeUnidades_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albref", gxTv_SdtSDTDistribuciondeUnidades_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albrefdsc", gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Albreccod", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDistribuciondeUnidades_Albrfen)) && ( gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDistribuciondeUnidades_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDistribuciondeUnidades_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDistribuciondeUnidades_Albrfen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("albrfen", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbREnt2", gxTv_SdtSDTDistribuciondeUnidades_Albrent2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbruni", gxTv_SdtSDTDistribuciondeUnidades_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbrUnient", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDistribuciondeUnidades_Albrunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("albrpieent", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_Albrpieent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniDis", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDistribuciondeUnidades_Albrunidis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbrPieDis", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRLoc", gxTv_SdtSDTDistribuciondeUnidades_Albrloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procenom", gxTv_SdtSDTDistribuciondeUnidades_Procenom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtSDTDistribuciondeUnidades_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Obs", gxTv_SdtSDTDistribuciondeUnidades_Obs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTDistribuciondeUnidades_Hdrs != null )
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
         gxTv_SdtSDTDistribuciondeUnidades_Hdrs.writexmlcollection(oWriter, "Hdrs", sNameSpace1, "HdrsItem", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTDistribuciondeUnidades_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTDistribuciondeUnidades_Clinom, false, false);
      AddObjectProperty("Albref", gxTv_SdtSDTDistribuciondeUnidades_Albref, false, false);
      AddObjectProperty("Albrefdsc", gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc, false, false);
      AddObjectProperty("Albreccod", gxTv_SdtSDTDistribuciondeUnidades_Albreccod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDistribuciondeUnidades_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDistribuciondeUnidades_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDistribuciondeUnidades_Albrfen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("albrfen", sDateCnv, false, false);
      AddObjectProperty("AlbREnt2", gxTv_SdtSDTDistribuciondeUnidades_Albrent2, false, false);
      AddObjectProperty("ALbruni", gxTv_SdtSDTDistribuciondeUnidades_Albruni, false, false);
      AddObjectProperty("AlbrUnient", gxTv_SdtSDTDistribuciondeUnidades_Albrunient, false, false);
      AddObjectProperty("albrpieent", gxTv_SdtSDTDistribuciondeUnidades_Albrpieent, false, false);
      AddObjectProperty("AlbRUniDis", gxTv_SdtSDTDistribuciondeUnidades_Albrunidis, false, false);
      AddObjectProperty("ALbrPieDis", gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis, false, false);
      AddObjectProperty("AlbRLoc", gxTv_SdtSDTDistribuciondeUnidades_Albrloc, false, false);
      AddObjectProperty("Procenom", gxTv_SdtSDTDistribuciondeUnidades_Procenom, false, false);
      AddObjectProperty("TrnNom", gxTv_SdtSDTDistribuciondeUnidades_Trnnom, false, false);
      AddObjectProperty("Obs", gxTv_SdtSDTDistribuciondeUnidades_Obs, false, false);
      if ( gxTv_SdtSDTDistribuciondeUnidades_Hdrs != null )
      {
         AddObjectProperty("Hdrs", gxTv_SdtSDTDistribuciondeUnidades_Hdrs, false, false);
      }
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_Clicod( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Clicod ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Clicod( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Clicod = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Clinom( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Clinom ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Clinom( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Clinom = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Albref( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albref ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albref( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albref = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Albrefdsc( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrefdsc( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc = value ;
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_Albreccod( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albreccod ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albreccod( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albreccod = value ;
   }

   public java.util.Date getgxTv_SdtSDTDistribuciondeUnidades_Albrfen( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrfen ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrfen( java.util.Date value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Albrent2( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrent2 ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrent2( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrent2 = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Albruni( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albruni ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albruni( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDistribuciondeUnidades_Albrunient( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrunient ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrunient( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunient = value ;
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_Albrpieent( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrpieent ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrpieent( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrpieent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDistribuciondeUnidades_Albrunidis( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrunidis ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunidis = value ;
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_Albrpiedis( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrpiedis( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Albrloc( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Albrloc ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Albrloc( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrloc = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Procenom( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Procenom ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Procenom( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Procenom = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Trnnom( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Trnnom ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Trnnom( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Trnnom = value ;
   }

   public String getgxTv_SdtSDTDistribuciondeUnidades_Obs( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Obs ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Obs( String value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Obs = value ;
   }

   public GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem> getgxTv_SdtSDTDistribuciondeUnidades_Hdrs( )
   {
      if ( gxTv_SdtSDTDistribuciondeUnidades_Hdrs == null )
      {
         gxTv_SdtSDTDistribuciondeUnidades_Hdrs = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem>(app.SdtSDTDistribuciondeUnidades_HdrsItem.class, "SDTDistribuciondeUnidades.HdrsItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      return gxTv_SdtSDTDistribuciondeUnidades_Hdrs ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Hdrs( GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem> value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs = value ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_Hdrs_SetNull( )
   {
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs = null ;
   }

   public boolean getgxTv_SdtSDTDistribuciondeUnidades_Hdrs_IsNull( )
   {
      if ( gxTv_SdtSDTDistribuciondeUnidades_Hdrs == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTDistribuciondeUnidades_Hdrs_N( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDistribuciondeUnidades_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_Clinom = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albref = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen = GXutil.nullDate() ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrent2 = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albruni = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunient = DecimalUtil.ZERO ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrunidis = DecimalUtil.ZERO ;
      gxTv_SdtSDTDistribuciondeUnidades_Albrloc = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Procenom = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Trnnom = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Obs = "" ;
      gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_N ;
   }

   public app.SdtSDTDistribuciondeUnidades Clone( )
   {
      return (app.SdtSDTDistribuciondeUnidades)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTDistribuciondeUnidades struct )
   {
      setgxTv_SdtSDTDistribuciondeUnidades_Clicod(struct.getClicod());
      setgxTv_SdtSDTDistribuciondeUnidades_Clinom(struct.getClinom());
      setgxTv_SdtSDTDistribuciondeUnidades_Albref(struct.getAlbref());
      setgxTv_SdtSDTDistribuciondeUnidades_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtSDTDistribuciondeUnidades_Albreccod(struct.getAlbreccod());
      if ( struct.gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N == 0 )
      {
         setgxTv_SdtSDTDistribuciondeUnidades_Albrfen(struct.getAlbrfen());
      }
      setgxTv_SdtSDTDistribuciondeUnidades_Albrent2(struct.getAlbrent2());
      setgxTv_SdtSDTDistribuciondeUnidades_Albruni(struct.getAlbruni());
      setgxTv_SdtSDTDistribuciondeUnidades_Albrunient(struct.getAlbrunient());
      setgxTv_SdtSDTDistribuciondeUnidades_Albrpieent(struct.getAlbrpieent());
      setgxTv_SdtSDTDistribuciondeUnidades_Albrunidis(struct.getAlbrunidis());
      setgxTv_SdtSDTDistribuciondeUnidades_Albrpiedis(struct.getAlbrpiedis());
      setgxTv_SdtSDTDistribuciondeUnidades_Albrloc(struct.getAlbrloc());
      setgxTv_SdtSDTDistribuciondeUnidades_Procenom(struct.getProcenom());
      setgxTv_SdtSDTDistribuciondeUnidades_Trnnom(struct.getTrnnom());
      setgxTv_SdtSDTDistribuciondeUnidades_Obs(struct.getObs());
      GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem> gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux = new GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem>(app.SdtSDTDistribuciondeUnidades_HdrsItem.class, "SDTDistribuciondeUnidades.HdrsItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTDistribuciondeUnidades_HdrsItem> gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux1 = struct.getHdrs();
      if (gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux1.size(); i++)
         {
            gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux.add(new app.SdtSDTDistribuciondeUnidades_HdrsItem(gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTDistribuciondeUnidades_Hdrs(gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTDistribuciondeUnidades getStruct( )
   {
      app.StructSdtSDTDistribuciondeUnidades struct = new app.StructSdtSDTDistribuciondeUnidades ();
      struct.setClicod(getgxTv_SdtSDTDistribuciondeUnidades_Clicod());
      struct.setClinom(getgxTv_SdtSDTDistribuciondeUnidades_Clinom());
      struct.setAlbref(getgxTv_SdtSDTDistribuciondeUnidades_Albref());
      struct.setAlbrefdsc(getgxTv_SdtSDTDistribuciondeUnidades_Albrefdsc());
      struct.setAlbreccod(getgxTv_SdtSDTDistribuciondeUnidades_Albreccod());
      if ( gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N == 0 )
      {
         struct.setAlbrfen(getgxTv_SdtSDTDistribuciondeUnidades_Albrfen());
      }
      struct.setAlbrent2(getgxTv_SdtSDTDistribuciondeUnidades_Albrent2());
      struct.setAlbruni(getgxTv_SdtSDTDistribuciondeUnidades_Albruni());
      struct.setAlbrunient(getgxTv_SdtSDTDistribuciondeUnidades_Albrunient());
      struct.setAlbrpieent(getgxTv_SdtSDTDistribuciondeUnidades_Albrpieent());
      struct.setAlbrunidis(getgxTv_SdtSDTDistribuciondeUnidades_Albrunidis());
      struct.setAlbrpiedis(getgxTv_SdtSDTDistribuciondeUnidades_Albrpiedis());
      struct.setAlbrloc(getgxTv_SdtSDTDistribuciondeUnidades_Albrloc());
      struct.setProcenom(getgxTv_SdtSDTDistribuciondeUnidades_Procenom());
      struct.setTrnnom(getgxTv_SdtSDTDistribuciondeUnidades_Trnnom());
      struct.setObs(getgxTv_SdtSDTDistribuciondeUnidades_Obs());
      struct.setHdrs(getgxTv_SdtSDTDistribuciondeUnidades_Hdrs().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTDistribuciondeUnidades_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_Albrfen_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_Hdrs_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Clicod ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Albreccod ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Albrpieent ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_Albrpiedis ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_Albrunidis ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Clinom ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albref ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albrefdsc ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albrent2 ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albruni ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Albrloc ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Procenom ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Trnnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTDistribuciondeUnidades_Albrfen ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTDistribuciondeUnidades_Obs ;
   protected GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem> gxTv_SdtSDTDistribuciondeUnidades_Hdrs_aux ;
   protected GXBaseCollection<app.SdtSDTDistribuciondeUnidades_HdrsItem> gxTv_SdtSDTDistribuciondeUnidades_Hdrs=null ;
}

