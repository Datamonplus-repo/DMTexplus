package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtwCCEst_SDT_Item extends GxUserType
{
   public SdtwCCEst_SDT_Item( )
   {
      this(  new ModelContext(SdtwCCEst_SDT_Item.class));
   }

   public SdtwCCEst_SDT_Item( ModelContext context )
   {
      super( context, "SdtwCCEst_SDT_Item");
   }

   public SdtwCCEst_SDT_Item( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtwCCEst_SDT_Item");
   }

   public SdtwCCEst_SDT_Item( StructSdtwCCEst_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barnhdr") )
            {
               gxTv_SdtwCCEst_SDT_Item_Barnhdr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clinom") )
            {
               gxTv_SdtwCCEst_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtwCCEst_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barserdsc") )
            {
               gxTv_SdtwCCEst_SDT_Item_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtwCCEst_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtwCCEst_SDT_Item_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procod") )
            {
               gxTv_SdtwCCEst_SDT_Item_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtwCCEst_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fasdsc") )
            {
               gxTv_SdtwCCEst_SDT_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctcod") )
            {
               gxTv_SdtwCCEst_SDT_Item_Cctcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctdsc") )
            {
               gxTv_SdtwCCEst_SDT_Item_Cctdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccopecod") )
            {
               gxTv_SdtwCCEst_SDT_Item_Ccopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Openom") )
            {
               gxTv_SdtwCCEst_SDT_Item_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtwCCEst_SDT_Item_Ccfch = GXutil.nullDate() ;
                  gxTv_SdtwCCEst_SDT_Item_Ccfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtwCCEst_SDT_Item_Ccfch_N = (byte)(0) ;
                  gxTv_SdtwCCEst_SDT_Item_Ccfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctlin") )
            {
               gxTv_SdtwCCEst_SDT_Item_Cctlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctlindsc") )
            {
               gxTv_SdtwCCEst_SDT_Item_Cctlindsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctval") )
            {
               gxTv_SdtwCCEst_SDT_Item_Cctval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Obs") )
            {
               gxTv_SdtwCCEst_SDT_Item_Obs = oReader.getValue() ;
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
         sName = "wCCEst_SDT.Item" ;
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
      oWriter.writeElement("Barnhdr", gxTv_SdtwCCEst_SDT_Item_Barnhdr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clinom", gxTv_SdtwCCEst_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtwCCEst_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barserdsc", gxTv_SdtwCCEst_SDT_Item_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtwCCEst_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtwCCEst_SDT_Item_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procod", gxTv_SdtwCCEst_SDT_Item_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtwCCEst_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fasdsc", gxTv_SdtwCCEst_SDT_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctcod", GXutil.trim( GXutil.str( gxTv_SdtwCCEst_SDT_Item_Cctcod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctdsc", gxTv_SdtwCCEst_SDT_Item_Cctdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccopecod", GXutil.trim( GXutil.str( gxTv_SdtwCCEst_SDT_Item_Ccopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Openom", gxTv_SdtwCCEst_SDT_Item_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtwCCEst_SDT_Item_Ccfch)) && ( gxTv_SdtwCCEst_SDT_Item_Ccfch_N == 1 ) )
      {
         oWriter.writeElement("Ccfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtwCCEst_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtwCCEst_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtwCCEst_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Ccfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Cctlin", GXutil.trim( GXutil.str( gxTv_SdtwCCEst_SDT_Item_Cctlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctlindsc", gxTv_SdtwCCEst_SDT_Item_Cctlindsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctval", gxTv_SdtwCCEst_SDT_Item_Cctval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Obs", gxTv_SdtwCCEst_SDT_Item_Obs);
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
      AddObjectProperty("Barnhdr", gxTv_SdtwCCEst_SDT_Item_Barnhdr, false, false);
      AddObjectProperty("Clinom", gxTv_SdtwCCEst_SDT_Item_Clinom, false, false);
      AddObjectProperty("Barser", gxTv_SdtwCCEst_SDT_Item_Barser, false, false);
      AddObjectProperty("Barserdsc", gxTv_SdtwCCEst_SDT_Item_Barserdsc, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtwCCEst_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtwCCEst_SDT_Item_Barcolnum, false, false);
      AddObjectProperty("Procod", gxTv_SdtwCCEst_SDT_Item_Procod, false, false);
      AddObjectProperty("Fascod", gxTv_SdtwCCEst_SDT_Item_Fascod, false, false);
      AddObjectProperty("Fasdsc", gxTv_SdtwCCEst_SDT_Item_Fasdsc, false, false);
      AddObjectProperty("Cctcod", gxTv_SdtwCCEst_SDT_Item_Cctcod, false, false);
      AddObjectProperty("Cctdsc", gxTv_SdtwCCEst_SDT_Item_Cctdsc, false, false);
      AddObjectProperty("Ccopecod", gxTv_SdtwCCEst_SDT_Item_Ccopecod, false, false);
      AddObjectProperty("Openom", gxTv_SdtwCCEst_SDT_Item_Openom, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtwCCEst_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtwCCEst_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtwCCEst_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Ccfch", sDateCnv, false, false);
      AddObjectProperty("Cctlin", gxTv_SdtwCCEst_SDT_Item_Cctlin, false, false);
      AddObjectProperty("Cctlindsc", gxTv_SdtwCCEst_SDT_Item_Cctlindsc, false, false);
      AddObjectProperty("Cctval", gxTv_SdtwCCEst_SDT_Item_Cctval, false, false);
      AddObjectProperty("Obs", gxTv_SdtwCCEst_SDT_Item_Obs, false, false);
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Barnhdr( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barnhdr ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Barnhdr( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barnhdr = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Clinom( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Clinom( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Barser( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barser ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Barser( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Barserdsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barserdsc ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Barserdsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barserdsc = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barcolnom = value ;
   }

   public int getgxTv_SdtwCCEst_SDT_Item_Barcolnum( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Barcolnum ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Barcolnum( int value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Barcolnum = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Procod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Procod ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Procod( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Procod = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Fascod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Fascod( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Fascod = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Fasdsc = value ;
   }

   public int getgxTv_SdtwCCEst_SDT_Item_Cctcod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctcod ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Cctcod( int value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctcod = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Cctdsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctdsc ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Cctdsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctdsc = value ;
   }

   public int getgxTv_SdtwCCEst_SDT_Item_Ccopecod( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Ccopecod ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Ccopecod( int value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Ccopecod = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Openom( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Openom ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Openom( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Openom = value ;
   }

   public java.util.Date getgxTv_SdtwCCEst_SDT_Item_Ccfch( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Ccfch ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Ccfch( java.util.Date value )
   {
      gxTv_SdtwCCEst_SDT_Item_Ccfch_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Ccfch = value ;
   }

   public short getgxTv_SdtwCCEst_SDT_Item_Cctlin( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctlin ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Cctlin( short value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctlin = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Cctlindsc( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctlindsc ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Cctlindsc( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctlindsc = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Cctval( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Cctval ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Cctval( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Cctval = value ;
   }

   public String getgxTv_SdtwCCEst_SDT_Item_Obs( )
   {
      return gxTv_SdtwCCEst_SDT_Item_Obs ;
   }

   public void setgxTv_SdtwCCEst_SDT_Item_Obs( String value )
   {
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(0) ;
      gxTv_SdtwCCEst_SDT_Item_Obs = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtwCCEst_SDT_Item_Barnhdr = "" ;
      gxTv_SdtwCCEst_SDT_Item_N = (byte)(1) ;
      gxTv_SdtwCCEst_SDT_Item_Clinom = "" ;
      gxTv_SdtwCCEst_SDT_Item_Barser = "" ;
      gxTv_SdtwCCEst_SDT_Item_Barserdsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Barcolnom = "" ;
      gxTv_SdtwCCEst_SDT_Item_Procod = "" ;
      gxTv_SdtwCCEst_SDT_Item_Fascod = "" ;
      gxTv_SdtwCCEst_SDT_Item_Fasdsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Cctdsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Openom = "" ;
      gxTv_SdtwCCEst_SDT_Item_Ccfch = GXutil.nullDate() ;
      gxTv_SdtwCCEst_SDT_Item_Ccfch_N = (byte)(1) ;
      gxTv_SdtwCCEst_SDT_Item_Cctlindsc = "" ;
      gxTv_SdtwCCEst_SDT_Item_Cctval = "" ;
      gxTv_SdtwCCEst_SDT_Item_Obs = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtwCCEst_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtwCCEst_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtwCCEst_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtwCCEst_SDT_Item struct )
   {
      setgxTv_SdtwCCEst_SDT_Item_Barnhdr(struct.getBarnhdr());
      setgxTv_SdtwCCEst_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtwCCEst_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtwCCEst_SDT_Item_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtwCCEst_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtwCCEst_SDT_Item_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtwCCEst_SDT_Item_Procod(struct.getProcod());
      setgxTv_SdtwCCEst_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtwCCEst_SDT_Item_Fasdsc(struct.getFasdsc());
      setgxTv_SdtwCCEst_SDT_Item_Cctcod(struct.getCctcod());
      setgxTv_SdtwCCEst_SDT_Item_Cctdsc(struct.getCctdsc());
      setgxTv_SdtwCCEst_SDT_Item_Ccopecod(struct.getCcopecod());
      setgxTv_SdtwCCEst_SDT_Item_Openom(struct.getOpenom());
      if ( struct.gxTv_SdtwCCEst_SDT_Item_Ccfch_N == 0 )
      {
         setgxTv_SdtwCCEst_SDT_Item_Ccfch(struct.getCcfch());
      }
      setgxTv_SdtwCCEst_SDT_Item_Cctlin(struct.getCctlin());
      setgxTv_SdtwCCEst_SDT_Item_Cctlindsc(struct.getCctlindsc());
      setgxTv_SdtwCCEst_SDT_Item_Cctval(struct.getCctval());
      setgxTv_SdtwCCEst_SDT_Item_Obs(struct.getObs());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtwCCEst_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtwCCEst_SDT_Item struct = new app.controlcalidadhtd.StructSdtwCCEst_SDT_Item ();
      struct.setBarnhdr(getgxTv_SdtwCCEst_SDT_Item_Barnhdr());
      struct.setClinom(getgxTv_SdtwCCEst_SDT_Item_Clinom());
      struct.setBarser(getgxTv_SdtwCCEst_SDT_Item_Barser());
      struct.setBarserdsc(getgxTv_SdtwCCEst_SDT_Item_Barserdsc());
      struct.setBarcolnom(getgxTv_SdtwCCEst_SDT_Item_Barcolnom());
      struct.setBarcolnum(getgxTv_SdtwCCEst_SDT_Item_Barcolnum());
      struct.setProcod(getgxTv_SdtwCCEst_SDT_Item_Procod());
      struct.setFascod(getgxTv_SdtwCCEst_SDT_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtwCCEst_SDT_Item_Fasdsc());
      struct.setCctcod(getgxTv_SdtwCCEst_SDT_Item_Cctcod());
      struct.setCctdsc(getgxTv_SdtwCCEst_SDT_Item_Cctdsc());
      struct.setCcopecod(getgxTv_SdtwCCEst_SDT_Item_Ccopecod());
      struct.setOpenom(getgxTv_SdtwCCEst_SDT_Item_Openom());
      if ( gxTv_SdtwCCEst_SDT_Item_Ccfch_N == 0 )
      {
         struct.setCcfch(getgxTv_SdtwCCEst_SDT_Item_Ccfch());
      }
      struct.setCctlin(getgxTv_SdtwCCEst_SDT_Item_Cctlin());
      struct.setCctlindsc(getgxTv_SdtwCCEst_SDT_Item_Cctlindsc());
      struct.setCctval(getgxTv_SdtwCCEst_SDT_Item_Cctval());
      struct.setObs(getgxTv_SdtwCCEst_SDT_Item_Obs());
      return struct ;
   }

   protected byte gxTv_SdtwCCEst_SDT_Item_N ;
   protected byte gxTv_SdtwCCEst_SDT_Item_Ccfch_N ;
   protected short gxTv_SdtwCCEst_SDT_Item_Cctlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtwCCEst_SDT_Item_Barcolnum ;
   protected int gxTv_SdtwCCEst_SDT_Item_Cctcod ;
   protected int gxTv_SdtwCCEst_SDT_Item_Ccopecod ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barnhdr ;
   protected String gxTv_SdtwCCEst_SDT_Item_Clinom ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barser ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barserdsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Barcolnom ;
   protected String gxTv_SdtwCCEst_SDT_Item_Procod ;
   protected String gxTv_SdtwCCEst_SDT_Item_Fascod ;
   protected String gxTv_SdtwCCEst_SDT_Item_Fasdsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Cctdsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Openom ;
   protected String gxTv_SdtwCCEst_SDT_Item_Cctlindsc ;
   protected String gxTv_SdtwCCEst_SDT_Item_Cctval ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtwCCEst_SDT_Item_Ccfch ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtwCCEst_SDT_Item_Obs ;
}

