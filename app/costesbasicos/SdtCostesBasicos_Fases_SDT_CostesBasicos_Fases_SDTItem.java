package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem extends GxUserType
{
   public SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem( )
   {
      this(  new ModelContext(SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem.class));
   }

   public SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem( ModelContext context )
   {
      super( context, "SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem");
   }

   public SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem( int remoteHandle ,
                                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem");
   }

   public SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem( StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barfassec") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barordlin") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fasdsc") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Unidades") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesT") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUnimed") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HorIni_5") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HorFin_5") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTieRea") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TieTeo") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TTeo") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCosMin") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Coste_m") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Coste_tm") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mmod") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mmoi") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Menergia") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mgas") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Magua") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mgi") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Madc") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mam") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tiempo_m") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lhipro") )
            {
               gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "CostesBasicos_Fases_SDT.CostesBasicos_Fases_SDTItem" ;
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
      oWriter.writeElement("Barfassec", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barordlin", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fasdsc", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maqcod", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Unidades", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesT", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUnimed", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HorIni_5", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HorFin_5", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTieRea", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TieTeo", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TTeo", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCosMin", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Coste_m", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m, 16, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Coste_tm", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mmod", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mmoi", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Menergia", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mgas", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Magua", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mgi", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Madc", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Mam", GXutil.trim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam, 12, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tiempo_m", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lhipro", GXutil.trim( GXutil.str( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro, 1, 0)));
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
      AddObjectProperty("Barfassec", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec, false, false);
      AddObjectProperty("Barordlin", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin, false, false);
      AddObjectProperty("Fascod", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod, false, false);
      AddObjectProperty("Fasdsc", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc, false, false);
      AddObjectProperty("Maqcod", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc, false, false);
      AddObjectProperty("Unidades", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades, false, false);
      AddObjectProperty("UnidadesT", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest, false, false);
      AddObjectProperty("BarUnimed", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed, false, false);
      AddObjectProperty("HorIni_5", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5, false, false);
      AddObjectProperty("HorFin_5", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5, false, false);
      AddObjectProperty("BarTieRea", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea, false, false);
      AddObjectProperty("TieTeo", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo, false, false);
      AddObjectProperty("TTeo", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo, false, false);
      AddObjectProperty("MaqCosMin", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin, false, false);
      AddObjectProperty("Coste_m", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m, 16, 2)), false, false);
      AddObjectProperty("Coste_tm", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm, false, false);
      AddObjectProperty("Mmod", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod, false, false);
      AddObjectProperty("Mmoi", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi, false, false);
      AddObjectProperty("Menergia", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia, false, false);
      AddObjectProperty("Mgas", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas, false, false);
      AddObjectProperty("Magua", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua, false, false);
      AddObjectProperty("Mgi", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi, false, false);
      AddObjectProperty("Madc", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc, false, false);
      AddObjectProperty("Mam", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam, false, false);
      AddObjectProperty("Tiempo_m", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m, false, false);
      AddObjectProperty("Lhipro", gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro, false, false);
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec = value ;
   }

   public short getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin( short value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5 ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5 = value ;
   }

   public String getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5 ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5( String value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam = value ;
   }

   public int getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m( int value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m = value ;
   }

   public byte getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro ;
   }

   public void setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro( byte value )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N = (byte)(1) ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5 = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5 = "" ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc = DecimalUtil.ZERO ;
      gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N ;
   }

   public app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem Clone( )
   {
      return (app.costesbasicos.SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem)(clone()) ;
   }

   public void setStruct( app.costesbasicos.StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem struct )
   {
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec(struct.getBarfassec());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin(struct.getBarordlin());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod(struct.getFascod());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc(struct.getFasdsc());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod(struct.getMaqcod());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades(struct.getUnidades());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest(struct.getUnidadest());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed(struct.getBarunimed());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5(struct.getHorini_5());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5(struct.getHorfin_5());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea(struct.getBartierea());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo(struct.getTieteo());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo(struct.getTteo());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin(struct.getMaqcosmin());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m(struct.getCoste_m());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm(struct.getCoste_tm());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod(struct.getMmod());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi(struct.getMmoi());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia(struct.getMenergia());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas(struct.getMgas());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua(struct.getMagua());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi(struct.getMgi());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc(struct.getMadc());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam(struct.getMam());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m(struct.getTiempo_m());
      setgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro(struct.getLhipro());
   }

   @SuppressWarnings("unchecked")
   public app.costesbasicos.StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem getStruct( )
   {
      app.costesbasicos.StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem struct = new app.costesbasicos.StructSdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem ();
      struct.setBarfassec(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec());
      struct.setBarordlin(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin());
      struct.setFascod(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod());
      struct.setFasdsc(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc());
      struct.setMaqcod(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod());
      struct.setMaqdsc(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc());
      struct.setUnidades(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades());
      struct.setUnidadest(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest());
      struct.setBarunimed(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed());
      struct.setHorini_5(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5());
      struct.setHorfin_5(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5());
      struct.setBartierea(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea());
      struct.setTieteo(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo());
      struct.setTteo(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo());
      struct.setMaqcosmin(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin());
      struct.setCoste_m(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m());
      struct.setCoste_tm(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm());
      struct.setMmod(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod());
      struct.setMmoi(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi());
      struct.setMenergia(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia());
      struct.setMgas(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas());
      struct.setMagua(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua());
      struct.setMgi(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi());
      struct.setMadc(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc());
      struct.setMam(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam());
      struct.setTiempo_m(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m());
      struct.setLhipro(getgxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro());
      return struct ;
   }

   protected byte gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_N ;
   protected byte gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Lhipro ;
   protected short gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barordlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tiempo_m ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidades ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Unidadest ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Bartierea ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tieteo ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Tteo ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcosmin ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_m ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Coste_tm ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmod ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mmoi ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Menergia ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgas ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Magua ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mgi ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Madc ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Mam ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barfassec ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fascod ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Fasdsc ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqcod ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Maqdsc ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Barunimed ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horini_5 ;
   protected String gxTv_SdtCostesBasicos_Fases_SDT_CostesBasicos_Fases_SDTItem_Horfin_5 ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

