package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem extends GxUserType
{
   public SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem( )
   {
      this(  new ModelContext(SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem.class));
   }

   public SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem( ModelContext context )
   {
      super( context, "SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem");
   }

   public SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem");
   }

   public SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem( StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem struct )
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
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCli") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCln") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliValA") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailGrE") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailGr") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailPkE") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailPk") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk = oReader.getValue() ;
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
                  gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N = (byte)(0) ;
                  gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_pais") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Icon") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Icon_GXI") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Grid_PathPdf") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Grid_NmrCopia") )
            {
               gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "ImpresionGuiawwSDT.ImpresionGuiawwSDTItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCli", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCln", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliValA", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailGrE", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailGr", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailPkE", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailPk", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch)) && ( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarTipCor", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cod_pais", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProEst", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Icon", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Icon_GXI", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Grid_PathPdf", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Grid_NmrCopia", GXutil.trim( GXutil.str( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia, 4, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod, false, false);
      AddObjectProperty("AlbProCod", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar, false, false);
      AddObjectProperty("GuiRemCli", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli, false, false);
      AddObjectProperty("GuiRemCln", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln, false, false);
      AddObjectProperty("CliValA", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala, false, false);
      AddObjectProperty("CliMailGrE", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre, false, false);
      AddObjectProperty("CliMailGr", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr, false, false);
      AddObjectProperty("CliMailPkE", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke, false, false);
      AddObjectProperty("CliMailPk", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, false);
      AddObjectProperty("BarTipCor", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor, false, false);
      AddObjectProperty("Cod_pais", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais, false, false);
      AddObjectProperty("AlbProEst", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest, false, false);
      AddObjectProperty("Icon", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon, false, false);
      AddObjectProperty("Icon_GXI", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi, false, false);
      AddObjectProperty("Grid_PathPdf", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf, false, false);
      AddObjectProperty("Grid_NmrCopia", gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia, false, false);
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod = value ;
   }

   public long getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod( long value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod = value ;
   }

   public int getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod( int value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo( byte value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar = value ;
   }

   public int getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli( int value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk = value ;
   }

   public java.util.Date getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch( java.util.Date value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor = value ;
   }

   public short getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais( short value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais = value ;
   }

   public byte getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest( byte value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest = value ;
   }

   @GxUpload
   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi = value ;
   }

   public String getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf( String value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf = value ;
   }

   public short getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia ;
   }

   public void setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia( short value )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N = (byte)(1) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch = GXutil.nullDate() ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N = (byte)(1) ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi = "" ;
      gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N ;
   }

   public app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem Clone( )
   {
      return (app.SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem struct )
   {
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod(struct.getAlbprocod());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli(struct.getGuiremcli());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln(struct.getGuiremcln());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala(struct.getClivala());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre(struct.getClimailgre());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr(struct.getClimailgr());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke(struct.getClimailpke());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk(struct.getClimailpk());
      if ( struct.gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N == 0 )
      {
         setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch(struct.getAlbprofch());
      }
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor(struct.getBartipcor());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais(struct.getCod_pais());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest(struct.getAlbproest());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon(struct.getIcon());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi(struct.getIcon_gxi());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf(struct.getGrid_pathpdf());
      setgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia(struct.getGrid_nmrcopia());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem getStruct( )
   {
      app.StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem struct = new app.StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem ();
      struct.setEmprcod(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod());
      struct.setAlbprocod(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod());
      struct.setBarcod(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar());
      struct.setGuiremcli(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli());
      struct.setGuiremcln(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln());
      struct.setClivala(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala());
      struct.setClimailgre(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre());
      struct.setClimailgr(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr());
      struct.setClimailpke(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke());
      struct.setClimailpk(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk());
      if ( gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch());
      }
      struct.setBartipcor(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor());
      struct.setCod_pais(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais());
      struct.setAlbproest(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest());
      struct.setIcon(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon());
      struct.setIcon_gxi(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi());
      struct.setGrid_pathpdf(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf());
      struct.setGrid_nmrcopia(getgxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia());
      return struct ;
   }

   protected byte gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_N ;
   protected byte gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodreo ;
   protected byte gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch_N ;
   protected byte gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albproest ;
   protected short gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Cod_pais ;
   protected short gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_nmrcopia ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcod ;
   protected int gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcli ;
   protected long gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprocod ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Emprcod ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Barcodpar ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Guiremcln ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Clivala ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgre ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailgr ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpke ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Climailpk ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Bartipcor ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Albprofch ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon_gxi ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Grid_pathpdf ;
   protected String gxTv_SdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem_Icon ;
}

