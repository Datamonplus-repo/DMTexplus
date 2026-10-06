package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTSelectionHDR_Item extends GxUserType
{
   public SdtSDTSelectionHDR_Item( )
   {
      this(  new ModelContext(SdtSDTSelectionHDR_Item.class));
   }

   public SdtSDTSelectionHDR_Item( ModelContext context )
   {
      super( context, "SdtSDTSelectionHDR_Item");
   }

   public SdtSDTSelectionHDR_Item( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTSelectionHDR_Item");
   }

   public SdtSDTSelectionHDR_Item( StructSdtSDTSelectionHDR_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Selected") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Selected = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNHdr") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barkgm") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barmtr") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barpie") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarUnimed") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSit") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barsit = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilAct") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Kilact = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MtrAct") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Mtract = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcosany") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcosany = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcospro") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcospro = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPri") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barpri = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsurCod") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Usurcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Discod") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barmdlcod") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barmdlcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarDisNum") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Bardisnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSer") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNom") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNum") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarNomCli") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Macrop") )
            {
               gxTv_SdtSDTSelectionHDR_Item_Macrop = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTSelectionHDR.Item" ;
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
      oWriter.writeElement("Selected", GXutil.booltostr( gxTv_SdtSDTSelectionHDR_Item_Selected));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtSDTSelectionHDR_Item_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNHdr", gxTv_SdtSDTSelectionHDR_Item_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtSDTSelectionHDR_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTSelectionHDR_Item_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barmtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTSelectionHDR_Item_Barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barpie", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarUnimed", gxTv_SdtSDTSelectionHDR_Item_Barunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSit", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Barsit, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTSelectionHDR_Item_Kilact, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MtrAct", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTSelectionHDR_Item_Mtract, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcosany", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTSelectionHDR_Item_Barcosany, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcospro", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTSelectionHDR_Item_Barcospro, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPri", gxTv_SdtSDTSelectionHDR_Item_Barpri);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsurCod", gxTv_SdtSDTSelectionHDR_Item_Usurcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Discod", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barmdlcod", gxTv_SdtSDTSelectionHDR_Item_Barmdlcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarDisNum", gxTv_SdtSDTSelectionHDR_Item_Bardisnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSer", gxTv_SdtSDTSelectionHDR_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNom", gxTv_SdtSDTSelectionHDR_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNum", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarNomCli", gxTv_SdtSDTSelectionHDR_Item_Barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Macrop", GXutil.trim( GXutil.str( gxTv_SdtSDTSelectionHDR_Item_Macrop, 4, 0)));
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
      AddObjectProperty("Selected", gxTv_SdtSDTSelectionHDR_Item_Selected, false, false);
      AddObjectProperty("EmprCod", gxTv_SdtSDTSelectionHDR_Item_Emprcod, false, false);
      AddObjectProperty("BarNHdr", gxTv_SdtSDTSelectionHDR_Item_Barnhdr, false, false);
      AddObjectProperty("BarCod", gxTv_SdtSDTSelectionHDR_Item_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtSDTSelectionHDR_Item_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtSDTSelectionHDR_Item_Barcodpar, false, false);
      AddObjectProperty("Barkgm", gxTv_SdtSDTSelectionHDR_Item_Barkgm, false, false);
      AddObjectProperty("Barmtr", gxTv_SdtSDTSelectionHDR_Item_Barmtr, false, false);
      AddObjectProperty("Barpie", gxTv_SdtSDTSelectionHDR_Item_Barpie, false, false);
      AddObjectProperty("BarUnimed", gxTv_SdtSDTSelectionHDR_Item_Barunimed, false, false);
      AddObjectProperty("BarSit", gxTv_SdtSDTSelectionHDR_Item_Barsit, false, false);
      AddObjectProperty("KilAct", gxTv_SdtSDTSelectionHDR_Item_Kilact, false, false);
      AddObjectProperty("MtrAct", gxTv_SdtSDTSelectionHDR_Item_Mtract, false, false);
      AddObjectProperty("Barcosany", gxTv_SdtSDTSelectionHDR_Item_Barcosany, false, false);
      AddObjectProperty("Barcospro", gxTv_SdtSDTSelectionHDR_Item_Barcospro, false, false);
      AddObjectProperty("BarPri", gxTv_SdtSDTSelectionHDR_Item_Barpri, false, false);
      AddObjectProperty("UsurCod", gxTv_SdtSDTSelectionHDR_Item_Usurcod, false, false);
      AddObjectProperty("Discod", gxTv_SdtSDTSelectionHDR_Item_Discod, false, false);
      AddObjectProperty("Barmdlcod", gxTv_SdtSDTSelectionHDR_Item_Barmdlcod, false, false);
      AddObjectProperty("BarDisNum", gxTv_SdtSDTSelectionHDR_Item_Bardisnum, false, false);
      AddObjectProperty("BarSer", gxTv_SdtSDTSelectionHDR_Item_Barser, false, false);
      AddObjectProperty("BarColNom", gxTv_SdtSDTSelectionHDR_Item_Barcolnom, false, false);
      AddObjectProperty("BarColNum", gxTv_SdtSDTSelectionHDR_Item_Barcolnum, false, false);
      AddObjectProperty("BarNomCli", gxTv_SdtSDTSelectionHDR_Item_Barnomcli, false, false);
      AddObjectProperty("Macrop", gxTv_SdtSDTSelectionHDR_Item_Macrop, false, false);
   }

   public boolean getgxTv_SdtSDTSelectionHDR_Item_Selected( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Selected ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Selected( boolean value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Selected = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Emprcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Emprcod ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Emprcod( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Emprcod = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barnhdr( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barnhdr ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barnhdr( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barnhdr = value ;
   }

   public int getgxTv_SdtSDTSelectionHDR_Item_Barcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcod ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcod( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcod = value ;
   }

   public byte getgxTv_SdtSDTSelectionHDR_Item_Barcodreo( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcodreo ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcodreo( byte value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barcodpar( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcodpar ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcodpar( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcodpar = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTSelectionHDR_Item_Barkgm( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barkgm ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTSelectionHDR_Item_Barmtr( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barmtr ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barmtr = value ;
   }

   public int getgxTv_SdtSDTSelectionHDR_Item_Barpie( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barpie ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barpie( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barpie = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barunimed( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barunimed ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barunimed( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barunimed = value ;
   }

   public byte getgxTv_SdtSDTSelectionHDR_Item_Barsit( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barsit ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barsit( byte value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barsit = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTSelectionHDR_Item_Kilact( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Kilact ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Kilact( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Kilact = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTSelectionHDR_Item_Mtract( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Mtract ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Mtract( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Mtract = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTSelectionHDR_Item_Barcosany( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcosany ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcosany( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcosany = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTSelectionHDR_Item_Barcospro( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcospro ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcospro = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barpri( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barpri ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barpri( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barpri = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Usurcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Usurcod ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Usurcod( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Usurcod = value ;
   }

   public int getgxTv_SdtSDTSelectionHDR_Item_Discod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Discod ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Discod( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Discod = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barmdlcod( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barmdlcod ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barmdlcod( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barmdlcod = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Bardisnum( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Bardisnum ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Bardisnum( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Bardisnum = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barser( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barser ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barser( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barser = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barcolnom( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcolnom ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcolnom( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcolnom = value ;
   }

   public int getgxTv_SdtSDTSelectionHDR_Item_Barcolnum( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barcolnum ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barcolnum( int value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barcolnum = value ;
   }

   public String getgxTv_SdtSDTSelectionHDR_Item_Barnomcli( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Barnomcli ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Barnomcli( String value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Barnomcli = value ;
   }

   public short getgxTv_SdtSDTSelectionHDR_Item_Macrop( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_Macrop ;
   }

   public void setgxTv_SdtSDTSelectionHDR_Item_Macrop( short value )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(0) ;
      gxTv_SdtSDTSelectionHDR_Item_Macrop = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTSelectionHDR_Item_N = (byte)(1) ;
      gxTv_SdtSDTSelectionHDR_Item_Emprcod = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barnhdr = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barcodpar = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTSelectionHDR_Item_Barmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTSelectionHDR_Item_Barunimed = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Kilact = DecimalUtil.ZERO ;
      gxTv_SdtSDTSelectionHDR_Item_Mtract = DecimalUtil.ZERO ;
      gxTv_SdtSDTSelectionHDR_Item_Barcosany = DecimalUtil.ZERO ;
      gxTv_SdtSDTSelectionHDR_Item_Barcospro = DecimalUtil.ZERO ;
      gxTv_SdtSDTSelectionHDR_Item_Barpri = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Usurcod = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barmdlcod = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Bardisnum = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barser = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barcolnom = "" ;
      gxTv_SdtSDTSelectionHDR_Item_Barnomcli = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTSelectionHDR_Item_N ;
   }

   public app.SdtSDTSelectionHDR_Item Clone( )
   {
      return (app.SdtSDTSelectionHDR_Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTSelectionHDR_Item struct )
   {
      setgxTv_SdtSDTSelectionHDR_Item_Selected(struct.getSelected());
      setgxTv_SdtSDTSelectionHDR_Item_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTSelectionHDR_Item_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtSDTSelectionHDR_Item_Barcod(struct.getBarcod());
      setgxTv_SdtSDTSelectionHDR_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtSDTSelectionHDR_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtSDTSelectionHDR_Item_Barkgm(struct.getBarkgm());
      setgxTv_SdtSDTSelectionHDR_Item_Barmtr(struct.getBarmtr());
      setgxTv_SdtSDTSelectionHDR_Item_Barpie(struct.getBarpie());
      setgxTv_SdtSDTSelectionHDR_Item_Barunimed(struct.getBarunimed());
      setgxTv_SdtSDTSelectionHDR_Item_Barsit(struct.getBarsit());
      setgxTv_SdtSDTSelectionHDR_Item_Kilact(struct.getKilact());
      setgxTv_SdtSDTSelectionHDR_Item_Mtract(struct.getMtract());
      setgxTv_SdtSDTSelectionHDR_Item_Barcosany(struct.getBarcosany());
      setgxTv_SdtSDTSelectionHDR_Item_Barcospro(struct.getBarcospro());
      setgxTv_SdtSDTSelectionHDR_Item_Barpri(struct.getBarpri());
      setgxTv_SdtSDTSelectionHDR_Item_Usurcod(struct.getUsurcod());
      setgxTv_SdtSDTSelectionHDR_Item_Discod(struct.getDiscod());
      setgxTv_SdtSDTSelectionHDR_Item_Barmdlcod(struct.getBarmdlcod());
      setgxTv_SdtSDTSelectionHDR_Item_Bardisnum(struct.getBardisnum());
      setgxTv_SdtSDTSelectionHDR_Item_Barser(struct.getBarser());
      setgxTv_SdtSDTSelectionHDR_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDTSelectionHDR_Item_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtSDTSelectionHDR_Item_Barnomcli(struct.getBarnomcli());
      setgxTv_SdtSDTSelectionHDR_Item_Macrop(struct.getMacrop());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTSelectionHDR_Item getStruct( )
   {
      app.StructSdtSDTSelectionHDR_Item struct = new app.StructSdtSDTSelectionHDR_Item ();
      struct.setSelected(getgxTv_SdtSDTSelectionHDR_Item_Selected());
      struct.setEmprcod(getgxTv_SdtSDTSelectionHDR_Item_Emprcod());
      struct.setBarnhdr(getgxTv_SdtSDTSelectionHDR_Item_Barnhdr());
      struct.setBarcod(getgxTv_SdtSDTSelectionHDR_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtSDTSelectionHDR_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtSDTSelectionHDR_Item_Barcodpar());
      struct.setBarkgm(getgxTv_SdtSDTSelectionHDR_Item_Barkgm());
      struct.setBarmtr(getgxTv_SdtSDTSelectionHDR_Item_Barmtr());
      struct.setBarpie(getgxTv_SdtSDTSelectionHDR_Item_Barpie());
      struct.setBarunimed(getgxTv_SdtSDTSelectionHDR_Item_Barunimed());
      struct.setBarsit(getgxTv_SdtSDTSelectionHDR_Item_Barsit());
      struct.setKilact(getgxTv_SdtSDTSelectionHDR_Item_Kilact());
      struct.setMtract(getgxTv_SdtSDTSelectionHDR_Item_Mtract());
      struct.setBarcosany(getgxTv_SdtSDTSelectionHDR_Item_Barcosany());
      struct.setBarcospro(getgxTv_SdtSDTSelectionHDR_Item_Barcospro());
      struct.setBarpri(getgxTv_SdtSDTSelectionHDR_Item_Barpri());
      struct.setUsurcod(getgxTv_SdtSDTSelectionHDR_Item_Usurcod());
      struct.setDiscod(getgxTv_SdtSDTSelectionHDR_Item_Discod());
      struct.setBarmdlcod(getgxTv_SdtSDTSelectionHDR_Item_Barmdlcod());
      struct.setBardisnum(getgxTv_SdtSDTSelectionHDR_Item_Bardisnum());
      struct.setBarser(getgxTv_SdtSDTSelectionHDR_Item_Barser());
      struct.setBarcolnom(getgxTv_SdtSDTSelectionHDR_Item_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtSDTSelectionHDR_Item_Barcolnum());
      struct.setBarnomcli(getgxTv_SdtSDTSelectionHDR_Item_Barnomcli());
      struct.setMacrop(getgxTv_SdtSDTSelectionHDR_Item_Macrop());
      return struct ;
   }

   protected byte gxTv_SdtSDTSelectionHDR_Item_N ;
   protected byte gxTv_SdtSDTSelectionHDR_Item_Barcodreo ;
   protected byte gxTv_SdtSDTSelectionHDR_Item_Barsit ;
   protected short gxTv_SdtSDTSelectionHDR_Item_Macrop ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Barcod ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Barpie ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Discod ;
   protected int gxTv_SdtSDTSelectionHDR_Item_Barcolnum ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Kilact ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Mtract ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barcosany ;
   protected java.math.BigDecimal gxTv_SdtSDTSelectionHDR_Item_Barcospro ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Emprcod ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barnhdr ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barcodpar ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barunimed ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barpri ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Usurcod ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barmdlcod ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Bardisnum ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barser ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barcolnom ;
   protected String gxTv_SdtSDTSelectionHDR_Item_Barnomcli ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTSelectionHDR_Item_Selected ;
   protected boolean readElement ;
   protected boolean formatError ;
}

