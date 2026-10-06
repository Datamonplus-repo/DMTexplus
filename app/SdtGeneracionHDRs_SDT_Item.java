package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGeneracionHDRs_SDT_Item extends GxUserType
{
   public SdtGeneracionHDRs_SDT_Item( )
   {
      this(  new ModelContext(SdtGeneracionHDRs_SDT_Item.class));
   }

   public SdtGeneracionHDRs_SDT_Item( ModelContext context )
   {
      super( context, "SdtGeneracionHDRs_SDT_Item");
   }

   public SdtGeneracionHDRs_SDT_Item( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtGeneracionHDRs_SDT_Item");
   }

   public SdtGeneracionHDRs_SDT_Item( StructSdtGeneracionHDRs_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Discod") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Disfec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtGeneracionHDRs_SDT_Item_Disfec = GXutil.nullDate() ;
                  gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N = (byte)(0) ;
                  gxTv_SdtGeneracionHDRs_SDT_Item_Disfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maccod") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Maccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEnccli") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPart") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Dispart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Disartcod") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Disartdsc") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Discolnom") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Discolnum") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Distipcol") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Disnomcli") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUnimed") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DispiePie") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieKgm") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieMtr") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcoddis") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUsrCod") )
            {
               gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod = oReader.getValue() ;
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
         sName = "GeneracionHDRs_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Discod", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtGeneracionHDRs_SDT_Item_Disfec)) && ( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N == 1 ) )
      {
         oWriter.writeElement("Disfec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Disfec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Maccod", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Maccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtGeneracionHDRs_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEnccli", gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPart", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Dispart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Disartcod", gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Disartdsc", gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Discolnom", gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Discolnum", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Distipcol", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Disnomcli", gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUnimed", gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DispiePie", GXutil.trim( GXutil.str( gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maqcoddis", gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUsrCod", gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod);
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
      AddObjectProperty("Seleccionar", gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Discod", gxTv_SdtGeneracionHDRs_SDT_Item_Discod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Disfec", sDateCnv, false, false);
      AddObjectProperty("Maccod", gxTv_SdtGeneracionHDRs_SDT_Item_Maccod, false, false);
      AddObjectProperty("Clicod", gxTv_SdtGeneracionHDRs_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtGeneracionHDRs_SDT_Item_Clinom, false, false);
      AddObjectProperty("DisEnccli", gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli, false, false);
      AddObjectProperty("DisPart", gxTv_SdtGeneracionHDRs_SDT_Item_Dispart, false, false);
      AddObjectProperty("Disartcod", gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod, false, false);
      AddObjectProperty("Disartdsc", gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc, false, false);
      AddObjectProperty("Discolnom", gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom, false, false);
      AddObjectProperty("Discolnum", gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum, false, false);
      AddObjectProperty("Distipcol", gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol, false, false);
      AddObjectProperty("Disnomcli", gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli, false, false);
      AddObjectProperty("DisUnimed", gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed, false, false);
      AddObjectProperty("DispiePie", gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie, false, false);
      AddObjectProperty("DisPieKgm", gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm, false, false);
      AddObjectProperty("DisPieMtr", gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr, false, false);
      AddObjectProperty("Maqcoddis", gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis, false, false);
      AddObjectProperty("DisUsrCod", gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod, false, false);
   }

   public boolean getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtGeneracionHDRs_SDT_Item_Discod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Discod ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Discod( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discod = value ;
   }

   public java.util.Date getgxTv_SdtGeneracionHDRs_SDT_Item_Disfec( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disfec ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disfec( java.util.Date value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec = value ;
   }

   public int getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Maccod ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Maccod( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Maccod = value ;
   }

   public int getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Clicod( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Clinom( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Clinom( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli = value ;
   }

   public short getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispart ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Dispart( short value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispart = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom = value ;
   }

   public int getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum = value ;
   }

   public byte getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol( byte value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed = value ;
   }

   public short getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie( short value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm( java.math.BigDecimal value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr( java.math.BigDecimal value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis = value ;
   }

   public String getgxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod ;
   }

   public void setgxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(1) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec = GXutil.nullDate() ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N = (byte)(1) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Clinom = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm = DecimalUtil.ZERO ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr = DecimalUtil.ZERO ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_N ;
   }

   public app.SdtGeneracionHDRs_SDT_Item Clone( )
   {
      return (app.SdtGeneracionHDRs_SDT_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtGeneracionHDRs_SDT_Item struct )
   {
      setgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Discod(struct.getDiscod());
      if ( struct.gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N == 0 )
      {
         setgxTv_SdtGeneracionHDRs_SDT_Item_Disfec(struct.getDisfec());
      }
      setgxTv_SdtGeneracionHDRs_SDT_Item_Maccod(struct.getMaccod());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli(struct.getDisenccli());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Dispart(struct.getDispart());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod(struct.getDisartcod());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc(struct.getDisartdsc());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom(struct.getDiscolnom());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum(struct.getDiscolnum());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol(struct.getDistipcol());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli(struct.getDisnomcli());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed(struct.getDisunimed());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie(struct.getDispiepie());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(struct.getDispiekgm());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(struct.getDispiemtr());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis(struct.getMaqcoddis());
      setgxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod(struct.getDisusrcod());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtGeneracionHDRs_SDT_Item getStruct( )
   {
      app.StructSdtGeneracionHDRs_SDT_Item struct = new app.StructSdtGeneracionHDRs_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar());
      struct.setDiscod(getgxTv_SdtGeneracionHDRs_SDT_Item_Discod());
      if ( gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N == 0 )
      {
         struct.setDisfec(getgxTv_SdtGeneracionHDRs_SDT_Item_Disfec());
      }
      struct.setMaccod(getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod());
      struct.setClicod(getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtGeneracionHDRs_SDT_Item_Clinom());
      struct.setDisenccli(getgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli());
      struct.setDispart(getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart());
      struct.setDisartcod(getgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod());
      struct.setDisartdsc(getgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc());
      struct.setDiscolnom(getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom());
      struct.setDiscolnum(getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum());
      struct.setDistipcol(getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol());
      struct.setDisnomcli(getgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli());
      struct.setDisunimed(getgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed());
      struct.setDispiepie(getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie());
      struct.setDispiekgm(getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm());
      struct.setDispiemtr(getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr());
      struct.setMaqcoddis(getgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis());
      struct.setDisusrcod(getgxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod());
      return struct ;
   }

   protected byte gxTv_SdtGeneracionHDRs_SDT_Item_N ;
   protected byte gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N ;
   protected byte gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol ;
   protected short gxTv_SdtGeneracionHDRs_SDT_Item_Dispart ;
   protected short gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Discod ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Maccod ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Clicod ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum ;
   protected java.math.BigDecimal gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm ;
   protected java.math.BigDecimal gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Clinom ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtGeneracionHDRs_SDT_Item_Disfec ;
   protected boolean gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

