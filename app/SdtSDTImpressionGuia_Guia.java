package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTImpressionGuia_Guia extends GxUserType
{
   public SdtSDTImpressionGuia_Guia( )
   {
      this(  new ModelContext(SdtSDTImpressionGuia_Guia.class));
   }

   public SdtSDTImpressionGuia_Guia( ModelContext context )
   {
      super( context, "SdtSDTImpressionGuia_Guia");
   }

   public SdtSDTImpressionGuia_Guia( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTImpressionGuia_Guia");
   }

   public SdtSDTImpressionGuia_Guia( StructSdtSDTImpressionGuia_Guia struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albprocod") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliValA") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Clivala = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailGr") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Climailgr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailPk") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Climailpk = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCli") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Guiremcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailGrE") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Climailgre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailPkE") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Climailpke = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTImpressionGuia_Guia_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N = (byte)(0) ;
                  gxTv_SdtSDTImpressionGuia_Guia_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTipCor") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Bartipcor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_pais") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Cod_pais = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PDF") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Pdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Excel") )
            {
               gxTv_SdtSDTImpressionGuia_Guia_Excel = oReader.getValue() ;
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
         sName = "SDTImpressionGuia.Guia" ;
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
      oWriter.writeElement("Albprocod", GXutil.trim( GXutil.str( gxTv_SdtSDTImpressionGuia_Guia_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliValA", gxTv_SdtSDTImpressionGuia_Guia_Clivala);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailGr", gxTv_SdtSDTImpressionGuia_Guia_Climailgr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailPk", gxTv_SdtSDTImpressionGuia_Guia_Climailpk);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCli", GXutil.trim( GXutil.str( gxTv_SdtSDTImpressionGuia_Guia_Guiremcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailGrE", gxTv_SdtSDTImpressionGuia_Guia_Climailgre);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailPkE", gxTv_SdtSDTImpressionGuia_Guia_Climailpke);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTImpressionGuia_Guia_Albprofch)) && ( gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N == 1 ) )
      {
         oWriter.writeElement("AlbProfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTImpressionGuia_Guia_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTImpressionGuia_Guia_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTImpressionGuia_Guia_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarTipCor", gxTv_SdtSDTImpressionGuia_Guia_Bartipcor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cod_pais", GXutil.trim( GXutil.str( gxTv_SdtSDTImpressionGuia_Guia_Cod_pais, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PDF", gxTv_SdtSDTImpressionGuia_Guia_Pdf);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Excel", gxTv_SdtSDTImpressionGuia_Guia_Excel);
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
      AddObjectProperty("Albprocod", gxTv_SdtSDTImpressionGuia_Guia_Albprocod, false, false);
      AddObjectProperty("CliValA", gxTv_SdtSDTImpressionGuia_Guia_Clivala, false, false);
      AddObjectProperty("CliMailGr", gxTv_SdtSDTImpressionGuia_Guia_Climailgr, false, false);
      AddObjectProperty("CliMailPk", gxTv_SdtSDTImpressionGuia_Guia_Climailpk, false, false);
      AddObjectProperty("GuiRemCli", gxTv_SdtSDTImpressionGuia_Guia_Guiremcli, false, false);
      AddObjectProperty("CliMailGrE", gxTv_SdtSDTImpressionGuia_Guia_Climailgre, false, false);
      AddObjectProperty("CliMailPkE", gxTv_SdtSDTImpressionGuia_Guia_Climailpke, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTImpressionGuia_Guia_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTImpressionGuia_Guia_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTImpressionGuia_Guia_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, false);
      AddObjectProperty("BarTipCor", gxTv_SdtSDTImpressionGuia_Guia_Bartipcor, false, false);
      AddObjectProperty("Cod_pais", gxTv_SdtSDTImpressionGuia_Guia_Cod_pais, false, false);
      AddObjectProperty("PDF", gxTv_SdtSDTImpressionGuia_Guia_Pdf, false, false);
      AddObjectProperty("Excel", gxTv_SdtSDTImpressionGuia_Guia_Excel, false, false);
   }

   public long getgxTv_SdtSDTImpressionGuia_Guia_Albprocod( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Albprocod ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Albprocod( long value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Albprocod = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Clivala( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Clivala ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Clivala( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Clivala = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Climailgr( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Climailgr ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Climailgr( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailgr = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Climailpk( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Climailpk ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Climailpk( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailpk = value ;
   }

   public int getgxTv_SdtSDTImpressionGuia_Guia_Guiremcli( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Guiremcli ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Guiremcli( int value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Guiremcli = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Climailgre( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Climailgre ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Climailgre( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailgre = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Climailpke( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Climailpke ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Climailpke( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailpke = value ;
   }

   public java.util.Date getgxTv_SdtSDTImpressionGuia_Guia_Albprofch( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Albprofch ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Albprofch( java.util.Date value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Albprofch = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Bartipcor( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Bartipcor ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Bartipcor( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Bartipcor = value ;
   }

   public short getgxTv_SdtSDTImpressionGuia_Guia_Cod_pais( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Cod_pais ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Cod_pais( short value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Cod_pais = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Pdf( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Pdf ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Pdf( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Pdf = value ;
   }

   public String getgxTv_SdtSDTImpressionGuia_Guia_Excel( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_Excel ;
   }

   public void setgxTv_SdtSDTImpressionGuia_Guia_Excel( String value )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(0) ;
      gxTv_SdtSDTImpressionGuia_Guia_Excel = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTImpressionGuia_Guia_N = (byte)(1) ;
      gxTv_SdtSDTImpressionGuia_Guia_Clivala = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailgr = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailpk = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailgre = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Climailpke = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Albprofch = GXutil.nullDate() ;
      gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N = (byte)(1) ;
      gxTv_SdtSDTImpressionGuia_Guia_Bartipcor = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Pdf = "" ;
      gxTv_SdtSDTImpressionGuia_Guia_Excel = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTImpressionGuia_Guia_N ;
   }

   public app.SdtSDTImpressionGuia_Guia Clone( )
   {
      return (app.SdtSDTImpressionGuia_Guia)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTImpressionGuia_Guia struct )
   {
      setgxTv_SdtSDTImpressionGuia_Guia_Albprocod(struct.getAlbprocod());
      setgxTv_SdtSDTImpressionGuia_Guia_Clivala(struct.getClivala());
      setgxTv_SdtSDTImpressionGuia_Guia_Climailgr(struct.getClimailgr());
      setgxTv_SdtSDTImpressionGuia_Guia_Climailpk(struct.getClimailpk());
      setgxTv_SdtSDTImpressionGuia_Guia_Guiremcli(struct.getGuiremcli());
      setgxTv_SdtSDTImpressionGuia_Guia_Climailgre(struct.getClimailgre());
      setgxTv_SdtSDTImpressionGuia_Guia_Climailpke(struct.getClimailpke());
      if ( struct.gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N == 0 )
      {
         setgxTv_SdtSDTImpressionGuia_Guia_Albprofch(struct.getAlbprofch());
      }
      setgxTv_SdtSDTImpressionGuia_Guia_Bartipcor(struct.getBartipcor());
      setgxTv_SdtSDTImpressionGuia_Guia_Cod_pais(struct.getCod_pais());
      setgxTv_SdtSDTImpressionGuia_Guia_Pdf(struct.getPdf());
      setgxTv_SdtSDTImpressionGuia_Guia_Excel(struct.getExcel());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTImpressionGuia_Guia getStruct( )
   {
      app.StructSdtSDTImpressionGuia_Guia struct = new app.StructSdtSDTImpressionGuia_Guia ();
      struct.setAlbprocod(getgxTv_SdtSDTImpressionGuia_Guia_Albprocod());
      struct.setClivala(getgxTv_SdtSDTImpressionGuia_Guia_Clivala());
      struct.setClimailgr(getgxTv_SdtSDTImpressionGuia_Guia_Climailgr());
      struct.setClimailpk(getgxTv_SdtSDTImpressionGuia_Guia_Climailpk());
      struct.setGuiremcli(getgxTv_SdtSDTImpressionGuia_Guia_Guiremcli());
      struct.setClimailgre(getgxTv_SdtSDTImpressionGuia_Guia_Climailgre());
      struct.setClimailpke(getgxTv_SdtSDTImpressionGuia_Guia_Climailpke());
      if ( gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtSDTImpressionGuia_Guia_Albprofch());
      }
      struct.setBartipcor(getgxTv_SdtSDTImpressionGuia_Guia_Bartipcor());
      struct.setCod_pais(getgxTv_SdtSDTImpressionGuia_Guia_Cod_pais());
      struct.setPdf(getgxTv_SdtSDTImpressionGuia_Guia_Pdf());
      struct.setExcel(getgxTv_SdtSDTImpressionGuia_Guia_Excel());
      return struct ;
   }

   protected byte gxTv_SdtSDTImpressionGuia_Guia_N ;
   protected byte gxTv_SdtSDTImpressionGuia_Guia_Albprofch_N ;
   protected short gxTv_SdtSDTImpressionGuia_Guia_Cod_pais ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTImpressionGuia_Guia_Guiremcli ;
   protected long gxTv_SdtSDTImpressionGuia_Guia_Albprocod ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Clivala ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Climailgr ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Climailpk ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Climailgre ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Climailpke ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Bartipcor ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTImpressionGuia_Guia_Albprofch ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Pdf ;
   protected String gxTv_SdtSDTImpressionGuia_Guia_Excel ;
}

