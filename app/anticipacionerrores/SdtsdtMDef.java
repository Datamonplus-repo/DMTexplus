package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtMDef extends GxUserType
{
   public SdtsdtMDef( )
   {
      this(  new ModelContext(SdtsdtMDef.class));
   }

   public SdtsdtMDef( ModelContext context )
   {
      super( context, "SdtsdtMDef");
   }

   public SdtsdtMDef( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtMDef");
   }

   public SdtsdtMDef( StructSdtsdtMDef struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefId") )
            {
               gxTv_SdtsdtMDef_Mdefid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefEmprCod") )
            {
               gxTv_SdtsdtMDef_Mdefemprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefCliCod") )
            {
               gxTv_SdtsdtMDef_Mdefclicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefCliNom") )
            {
               gxTv_SdtsdtMDef_Mdefclinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefArtCod") )
            {
               gxTv_SdtsdtMDef_Mdefartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefArtDsc") )
            {
               gxTv_SdtsdtMDef_Mdefartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefColNum") )
            {
               gxTv_SdtsdtMDef_Mdefcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefColCod") )
            {
               gxTv_SdtsdtMDef_Mdefcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefColNom") )
            {
               gxTv_SdtsdtMDef_Mdefcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefMaqCod") )
            {
               gxTv_SdtsdtMDef_Mdefmaqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefMaqDsc") )
            {
               gxTv_SdtsdtMDef_Mdefmaqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefTipMCo") )
            {
               gxTv_SdtsdtMDef_Mdeftipmco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefTipMDs") )
            {
               gxTv_SdtsdtMDef_Mdeftipmds = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefDefCod") )
            {
               gxTv_SdtsdtMDef_Mdefdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefDefDsc") )
            {
               gxTv_SdtsdtMDef_Mdefdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefCatCod") )
            {
               gxTv_SdtsdtMDef_Mdefcatcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefCatDsc") )
            {
               gxTv_SdtsdtMDef_Mdefcatdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefKilTot") )
            {
               gxTv_SdtsdtMDef_Mdefkiltot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefKilPro") )
            {
               gxTv_SdtsdtMDef_Mdefkilpro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefKilReo") )
            {
               gxTv_SdtsdtMDef_Mdefkilreo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefPorc") )
            {
               gxTv_SdtsdtMDef_Mdefporc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefUsu") )
            {
               gxTv_SdtsdtMDef_Mdefusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefTkn") )
            {
               gxTv_SdtsdtMDef_Mdeftkn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefMetTot") )
            {
               gxTv_SdtsdtMDef_Mdefmettot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefMetPro") )
            {
               gxTv_SdtsdtMDef_Mdefmetpro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefMetReo") )
            {
               gxTv_SdtsdtMDef_Mdefmetreo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MDefMetPor") )
            {
               gxTv_SdtsdtMDef_Mdefmetpor = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "sdtMDef" ;
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
      oWriter.writeElement("MDefId", GXutil.trim( GXutil.str( gxTv_SdtsdtMDef_Mdefid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefEmprCod", gxTv_SdtsdtMDef_Mdefemprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefCliCod", GXutil.trim( GXutil.str( gxTv_SdtsdtMDef_Mdefclicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefCliNom", gxTv_SdtsdtMDef_Mdefclinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefArtCod", gxTv_SdtsdtMDef_Mdefartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefArtDsc", gxTv_SdtsdtMDef_Mdefartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefColNum", GXutil.trim( GXutil.str( gxTv_SdtsdtMDef_Mdefcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefColCod", GXutil.trim( GXutil.str( gxTv_SdtsdtMDef_Mdefcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefColNom", gxTv_SdtsdtMDef_Mdefcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefMaqCod", gxTv_SdtsdtMDef_Mdefmaqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefMaqDsc", gxTv_SdtsdtMDef_Mdefmaqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefTipMCo", gxTv_SdtsdtMDef_Mdeftipmco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefTipMDs", gxTv_SdtsdtMDef_Mdeftipmds);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefDefCod", GXutil.trim( GXutil.str( gxTv_SdtsdtMDef_Mdefdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefDefDsc", gxTv_SdtsdtMDef_Mdefdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefCatCod", GXutil.trim( GXutil.str( gxTv_SdtsdtMDef_Mdefcatcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefCatDsc", gxTv_SdtsdtMDef_Mdefcatdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefKilTot", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefkiltot, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefKilPro", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefkilpro, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefKilReo", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefkilreo, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefPorc", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefporc, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefUsu", gxTv_SdtsdtMDef_Mdefusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefTkn", gxTv_SdtsdtMDef_Mdeftkn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefMetTot", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefmettot, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefMetPro", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefmetpro, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefMetReo", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefmetreo, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MDefMetPor", GXutil.trim( GXutil.strNoRound( gxTv_SdtsdtMDef_Mdefmetpor, 7, 2)));
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
      AddObjectProperty("MDefId", gxTv_SdtsdtMDef_Mdefid, false, false);
      AddObjectProperty("MDefEmprCod", gxTv_SdtsdtMDef_Mdefemprcod, false, false);
      AddObjectProperty("MDefCliCod", gxTv_SdtsdtMDef_Mdefclicod, false, false);
      AddObjectProperty("MDefCliNom", gxTv_SdtsdtMDef_Mdefclinom, false, false);
      AddObjectProperty("MDefArtCod", gxTv_SdtsdtMDef_Mdefartcod, false, false);
      AddObjectProperty("MDefArtDsc", gxTv_SdtsdtMDef_Mdefartdsc, false, false);
      AddObjectProperty("MDefColNum", gxTv_SdtsdtMDef_Mdefcolnum, false, false);
      AddObjectProperty("MDefColCod", gxTv_SdtsdtMDef_Mdefcolcod, false, false);
      AddObjectProperty("MDefColNom", gxTv_SdtsdtMDef_Mdefcolnom, false, false);
      AddObjectProperty("MDefMaqCod", gxTv_SdtsdtMDef_Mdefmaqcod, false, false);
      AddObjectProperty("MDefMaqDsc", gxTv_SdtsdtMDef_Mdefmaqdsc, false, false);
      AddObjectProperty("MDefTipMCo", gxTv_SdtsdtMDef_Mdeftipmco, false, false);
      AddObjectProperty("MDefTipMDs", gxTv_SdtsdtMDef_Mdeftipmds, false, false);
      AddObjectProperty("MDefDefCod", gxTv_SdtsdtMDef_Mdefdefcod, false, false);
      AddObjectProperty("MDefDefDsc", gxTv_SdtsdtMDef_Mdefdefdsc, false, false);
      AddObjectProperty("MDefCatCod", gxTv_SdtsdtMDef_Mdefcatcod, false, false);
      AddObjectProperty("MDefCatDsc", gxTv_SdtsdtMDef_Mdefcatdsc, false, false);
      AddObjectProperty("MDefKilTot", gxTv_SdtsdtMDef_Mdefkiltot, false, false);
      AddObjectProperty("MDefKilPro", gxTv_SdtsdtMDef_Mdefkilpro, false, false);
      AddObjectProperty("MDefKilReo", gxTv_SdtsdtMDef_Mdefkilreo, false, false);
      AddObjectProperty("MDefPorc", gxTv_SdtsdtMDef_Mdefporc, false, false);
      AddObjectProperty("MDefUsu", gxTv_SdtsdtMDef_Mdefusu, false, false);
      AddObjectProperty("MDefTkn", gxTv_SdtsdtMDef_Mdeftkn, false, false);
      AddObjectProperty("MDefMetTot", gxTv_SdtsdtMDef_Mdefmettot, false, false);
      AddObjectProperty("MDefMetPro", gxTv_SdtsdtMDef_Mdefmetpro, false, false);
      AddObjectProperty("MDefMetReo", gxTv_SdtsdtMDef_Mdefmetreo, false, false);
      AddObjectProperty("MDefMetPor", gxTv_SdtsdtMDef_Mdefmetpor, false, false);
   }

   public long getgxTv_SdtsdtMDef_Mdefid( )
   {
      return gxTv_SdtsdtMDef_Mdefid ;
   }

   public void setgxTv_SdtsdtMDef_Mdefid( long value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefid = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefemprcod( )
   {
      return gxTv_SdtsdtMDef_Mdefemprcod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefemprcod( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefemprcod = value ;
   }

   public int getgxTv_SdtsdtMDef_Mdefclicod( )
   {
      return gxTv_SdtsdtMDef_Mdefclicod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefclicod( int value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefclicod = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefclinom( )
   {
      return gxTv_SdtsdtMDef_Mdefclinom ;
   }

   public void setgxTv_SdtsdtMDef_Mdefclinom( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefclinom = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefartcod( )
   {
      return gxTv_SdtsdtMDef_Mdefartcod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefartcod( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefartcod = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefartdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefartdsc ;
   }

   public void setgxTv_SdtsdtMDef_Mdefartdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefartdsc = value ;
   }

   public int getgxTv_SdtsdtMDef_Mdefcolnum( )
   {
      return gxTv_SdtsdtMDef_Mdefcolnum ;
   }

   public void setgxTv_SdtsdtMDef_Mdefcolnum( int value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcolnum = value ;
   }

   public byte getgxTv_SdtsdtMDef_Mdefcolcod( )
   {
      return gxTv_SdtsdtMDef_Mdefcolcod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefcolcod( byte value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcolcod = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefcolnom( )
   {
      return gxTv_SdtsdtMDef_Mdefcolnom ;
   }

   public void setgxTv_SdtsdtMDef_Mdefcolnom( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcolnom = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefmaqcod( )
   {
      return gxTv_SdtsdtMDef_Mdefmaqcod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefmaqcod( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmaqcod = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefmaqdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefmaqdsc ;
   }

   public void setgxTv_SdtsdtMDef_Mdefmaqdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmaqdsc = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdeftipmco( )
   {
      return gxTv_SdtsdtMDef_Mdeftipmco ;
   }

   public void setgxTv_SdtsdtMDef_Mdeftipmco( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdeftipmco = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdeftipmds( )
   {
      return gxTv_SdtsdtMDef_Mdeftipmds ;
   }

   public void setgxTv_SdtsdtMDef_Mdeftipmds( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdeftipmds = value ;
   }

   public short getgxTv_SdtsdtMDef_Mdefdefcod( )
   {
      return gxTv_SdtsdtMDef_Mdefdefcod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefdefcod( short value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefdefcod = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefdefdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefdefdsc ;
   }

   public void setgxTv_SdtsdtMDef_Mdefdefdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefdefdsc = value ;
   }

   public short getgxTv_SdtsdtMDef_Mdefcatcod( )
   {
      return gxTv_SdtsdtMDef_Mdefcatcod ;
   }

   public void setgxTv_SdtsdtMDef_Mdefcatcod( short value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcatcod = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefcatdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefcatdsc ;
   }

   public void setgxTv_SdtsdtMDef_Mdefcatdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcatdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefkiltot( )
   {
      return gxTv_SdtsdtMDef_Mdefkiltot ;
   }

   public void setgxTv_SdtsdtMDef_Mdefkiltot( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefkiltot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefkilpro( )
   {
      return gxTv_SdtsdtMDef_Mdefkilpro ;
   }

   public void setgxTv_SdtsdtMDef_Mdefkilpro( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefkilpro = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefkilreo( )
   {
      return gxTv_SdtsdtMDef_Mdefkilreo ;
   }

   public void setgxTv_SdtsdtMDef_Mdefkilreo( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefkilreo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefporc( )
   {
      return gxTv_SdtsdtMDef_Mdefporc ;
   }

   public void setgxTv_SdtsdtMDef_Mdefporc( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefporc = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdefusu( )
   {
      return gxTv_SdtsdtMDef_Mdefusu ;
   }

   public void setgxTv_SdtsdtMDef_Mdefusu( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefusu = value ;
   }

   public String getgxTv_SdtsdtMDef_Mdeftkn( )
   {
      return gxTv_SdtsdtMDef_Mdeftkn ;
   }

   public void setgxTv_SdtsdtMDef_Mdeftkn( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdeftkn = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefmettot( )
   {
      return gxTv_SdtsdtMDef_Mdefmettot ;
   }

   public void setgxTv_SdtsdtMDef_Mdefmettot( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmettot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefmetpro( )
   {
      return gxTv_SdtsdtMDef_Mdefmetpro ;
   }

   public void setgxTv_SdtsdtMDef_Mdefmetpro( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmetpro = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefmetreo( )
   {
      return gxTv_SdtsdtMDef_Mdefmetreo ;
   }

   public void setgxTv_SdtsdtMDef_Mdefmetreo( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmetreo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtsdtMDef_Mdefmetpor( )
   {
      return gxTv_SdtsdtMDef_Mdefmetpor ;
   }

   public void setgxTv_SdtsdtMDef_Mdefmetpor( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmetpor = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtMDef_N = (byte)(1) ;
      gxTv_SdtsdtMDef_Mdefemprcod = "" ;
      gxTv_SdtsdtMDef_Mdefclinom = "" ;
      gxTv_SdtsdtMDef_Mdefartcod = "" ;
      gxTv_SdtsdtMDef_Mdefartdsc = "" ;
      gxTv_SdtsdtMDef_Mdefcolnom = "" ;
      gxTv_SdtsdtMDef_Mdefmaqcod = "" ;
      gxTv_SdtsdtMDef_Mdefmaqdsc = "" ;
      gxTv_SdtsdtMDef_Mdeftipmco = "" ;
      gxTv_SdtsdtMDef_Mdeftipmds = "" ;
      gxTv_SdtsdtMDef_Mdefdefdsc = "" ;
      gxTv_SdtsdtMDef_Mdefcatdsc = "" ;
      gxTv_SdtsdtMDef_Mdefkiltot = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefkilpro = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefkilreo = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefporc = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefusu = "" ;
      gxTv_SdtsdtMDef_Mdeftkn = "" ;
      gxTv_SdtsdtMDef_Mdefmettot = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefmetpro = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefmetreo = DecimalUtil.ZERO ;
      gxTv_SdtsdtMDef_Mdefmetpor = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtMDef_N ;
   }

   public app.anticipacionerrores.SdtsdtMDef Clone( )
   {
      return (app.anticipacionerrores.SdtsdtMDef)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtsdtMDef struct )
   {
      setgxTv_SdtsdtMDef_Mdefid(struct.getMdefid());
      setgxTv_SdtsdtMDef_Mdefemprcod(struct.getMdefemprcod());
      setgxTv_SdtsdtMDef_Mdefclicod(struct.getMdefclicod());
      setgxTv_SdtsdtMDef_Mdefclinom(struct.getMdefclinom());
      setgxTv_SdtsdtMDef_Mdefartcod(struct.getMdefartcod());
      setgxTv_SdtsdtMDef_Mdefartdsc(struct.getMdefartdsc());
      setgxTv_SdtsdtMDef_Mdefcolnum(struct.getMdefcolnum());
      setgxTv_SdtsdtMDef_Mdefcolcod(struct.getMdefcolcod());
      setgxTv_SdtsdtMDef_Mdefcolnom(struct.getMdefcolnom());
      setgxTv_SdtsdtMDef_Mdefmaqcod(struct.getMdefmaqcod());
      setgxTv_SdtsdtMDef_Mdefmaqdsc(struct.getMdefmaqdsc());
      setgxTv_SdtsdtMDef_Mdeftipmco(struct.getMdeftipmco());
      setgxTv_SdtsdtMDef_Mdeftipmds(struct.getMdeftipmds());
      setgxTv_SdtsdtMDef_Mdefdefcod(struct.getMdefdefcod());
      setgxTv_SdtsdtMDef_Mdefdefdsc(struct.getMdefdefdsc());
      setgxTv_SdtsdtMDef_Mdefcatcod(struct.getMdefcatcod());
      setgxTv_SdtsdtMDef_Mdefcatdsc(struct.getMdefcatdsc());
      setgxTv_SdtsdtMDef_Mdefkiltot(struct.getMdefkiltot());
      setgxTv_SdtsdtMDef_Mdefkilpro(struct.getMdefkilpro());
      setgxTv_SdtsdtMDef_Mdefkilreo(struct.getMdefkilreo());
      setgxTv_SdtsdtMDef_Mdefporc(struct.getMdefporc());
      setgxTv_SdtsdtMDef_Mdefusu(struct.getMdefusu());
      setgxTv_SdtsdtMDef_Mdeftkn(struct.getMdeftkn());
      setgxTv_SdtsdtMDef_Mdefmettot(struct.getMdefmettot());
      setgxTv_SdtsdtMDef_Mdefmetpro(struct.getMdefmetpro());
      setgxTv_SdtsdtMDef_Mdefmetreo(struct.getMdefmetreo());
      setgxTv_SdtsdtMDef_Mdefmetpor(struct.getMdefmetpor());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtsdtMDef getStruct( )
   {
      app.anticipacionerrores.StructSdtsdtMDef struct = new app.anticipacionerrores.StructSdtsdtMDef ();
      struct.setMdefid(getgxTv_SdtsdtMDef_Mdefid());
      struct.setMdefemprcod(getgxTv_SdtsdtMDef_Mdefemprcod());
      struct.setMdefclicod(getgxTv_SdtsdtMDef_Mdefclicod());
      struct.setMdefclinom(getgxTv_SdtsdtMDef_Mdefclinom());
      struct.setMdefartcod(getgxTv_SdtsdtMDef_Mdefartcod());
      struct.setMdefartdsc(getgxTv_SdtsdtMDef_Mdefartdsc());
      struct.setMdefcolnum(getgxTv_SdtsdtMDef_Mdefcolnum());
      struct.setMdefcolcod(getgxTv_SdtsdtMDef_Mdefcolcod());
      struct.setMdefcolnom(getgxTv_SdtsdtMDef_Mdefcolnom());
      struct.setMdefmaqcod(getgxTv_SdtsdtMDef_Mdefmaqcod());
      struct.setMdefmaqdsc(getgxTv_SdtsdtMDef_Mdefmaqdsc());
      struct.setMdeftipmco(getgxTv_SdtsdtMDef_Mdeftipmco());
      struct.setMdeftipmds(getgxTv_SdtsdtMDef_Mdeftipmds());
      struct.setMdefdefcod(getgxTv_SdtsdtMDef_Mdefdefcod());
      struct.setMdefdefdsc(getgxTv_SdtsdtMDef_Mdefdefdsc());
      struct.setMdefcatcod(getgxTv_SdtsdtMDef_Mdefcatcod());
      struct.setMdefcatdsc(getgxTv_SdtsdtMDef_Mdefcatdsc());
      struct.setMdefkiltot(getgxTv_SdtsdtMDef_Mdefkiltot());
      struct.setMdefkilpro(getgxTv_SdtsdtMDef_Mdefkilpro());
      struct.setMdefkilreo(getgxTv_SdtsdtMDef_Mdefkilreo());
      struct.setMdefporc(getgxTv_SdtsdtMDef_Mdefporc());
      struct.setMdefusu(getgxTv_SdtsdtMDef_Mdefusu());
      struct.setMdeftkn(getgxTv_SdtsdtMDef_Mdeftkn());
      struct.setMdefmettot(getgxTv_SdtsdtMDef_Mdefmettot());
      struct.setMdefmetpro(getgxTv_SdtsdtMDef_Mdefmetpro());
      struct.setMdefmetreo(getgxTv_SdtsdtMDef_Mdefmetreo());
      struct.setMdefmetpor(getgxTv_SdtsdtMDef_Mdefmetpor());
      return struct ;
   }

   protected byte gxTv_SdtsdtMDef_N ;
   protected byte gxTv_SdtsdtMDef_Mdefcolcod ;
   protected short gxTv_SdtsdtMDef_Mdefdefcod ;
   protected short gxTv_SdtsdtMDef_Mdefcatcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtsdtMDef_Mdefclicod ;
   protected int gxTv_SdtsdtMDef_Mdefcolnum ;
   protected long gxTv_SdtsdtMDef_Mdefid ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefkiltot ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefkilpro ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefkilreo ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefporc ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmettot ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmetpro ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmetreo ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmetpor ;
   protected String gxTv_SdtsdtMDef_Mdefemprcod ;
   protected String gxTv_SdtsdtMDef_Mdefartcod ;
   protected String gxTv_SdtsdtMDef_Mdefcolnom ;
   protected String gxTv_SdtsdtMDef_Mdefmaqcod ;
   protected String gxTv_SdtsdtMDef_Mdeftipmco ;
   protected String gxTv_SdtsdtMDef_Mdefusu ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtMDef_Mdefclinom ;
   protected String gxTv_SdtsdtMDef_Mdefartdsc ;
   protected String gxTv_SdtsdtMDef_Mdefmaqdsc ;
   protected String gxTv_SdtsdtMDef_Mdeftipmds ;
   protected String gxTv_SdtsdtMDef_Mdefdefdsc ;
   protected String gxTv_SdtsdtMDef_Mdefcatdsc ;
   protected String gxTv_SdtsdtMDef_Mdeftkn ;
}

