package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlCalidad_CC_CC1_SDT_Item extends GxUserType
{
   public SdtControlCalidad_CC_CC1_SDT_Item( )
   {
      this(  new ModelContext(SdtControlCalidad_CC_CC1_SDT_Item.class));
   }

   public SdtControlCalidad_CC_CC1_SDT_Item( ModelContext context )
   {
      super( context, "SdtControlCalidad_CC_CC1_SDT_Item");
   }

   public SdtControlCalidad_CC_CC1_SDT_Item( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtControlCalidad_CC_CC1_SDT_Item");
   }

   public SdtControlCalidad_CC_CC1_SDT_Item( StructSdtControlCalidad_CC_CC1_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barordlin") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procod") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prodsc") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fasdsc") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCtcod") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCtdsc") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCfas") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ErrControl") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCopecod") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFasest") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch = GXutil.nullDate() ;
                  gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N = (byte)(0) ;
                  gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccser1") )
            {
               gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "ControlCalidad_CC_CC1_SDT.Item" ;
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
      oWriter.writeElement("Barordlin", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procod", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Prodsc", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fasdsc", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCtcod", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCtdsc", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCfas", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ErrControl", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCopecod", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarFasest", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch)) && ( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N == 1 ) )
      {
         oWriter.writeElement("CCfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CCfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("CC", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccser1", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1, 4, 0)));
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
      AddObjectProperty("Barordlin", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin, false, false);
      AddObjectProperty("Procod", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod, false, false);
      AddObjectProperty("Prodsc", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc, false, false);
      AddObjectProperty("Fascod", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod, false, false);
      AddObjectProperty("Fasdsc", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc, false, false);
      AddObjectProperty("CCtcod", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod, false, false);
      AddObjectProperty("CCtdsc", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc, false, false);
      AddObjectProperty("CCfas", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas, false, false);
      AddObjectProperty("ErrControl", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol, false, false);
      AddObjectProperty("CCopecod", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod, false, false);
      AddObjectProperty("BarFasest", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CCfch", sDateCnv, false, false);
      AddObjectProperty("CC", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc, false, false);
      AddObjectProperty("Ccser1", gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1, false, false);
   }

   public short getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin = value ;
   }

   public String getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod = value ;
   }

   public String getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc = value ;
   }

   public String getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod = value ;
   }

   public String getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc = value ;
   }

   public int getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod( int value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod = value ;
   }

   public String getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc( String value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc = value ;
   }

   public short getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas = value ;
   }

   public short getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol = value ;
   }

   public int getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod( int value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod = value ;
   }

   public byte getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest( byte value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest = value ;
   }

   public java.util.Date getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch( java.util.Date value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch = value ;
   }

   public short getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc = value ;
   }

   public short getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 ;
   }

   public void setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1( short value )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N = (byte)(1) ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc = "" ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch = GXutil.nullDate() ;
      gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtControlCalidad_CC_CC1_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtControlCalidad_CC_CC1_SDT_Item struct )
   {
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin(struct.getBarordlin());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod(struct.getProcod());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc(struct.getProdsc());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc(struct.getFasdsc());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod(struct.getCctcod());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc(struct.getCctdsc());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas(struct.getCcfas());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol(struct.getErrcontrol());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod(struct.getCcopecod());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest(struct.getBarfasest());
      if ( struct.gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N == 0 )
      {
         setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch(struct.getCcfch());
      }
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc(struct.getCc());
      setgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1(struct.getCcser1());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtControlCalidad_CC_CC1_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtControlCalidad_CC_CC1_SDT_Item struct = new app.controlcalidadhtd.StructSdtControlCalidad_CC_CC1_SDT_Item ();
      struct.setBarordlin(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin());
      struct.setProcod(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod());
      struct.setProdsc(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc());
      struct.setFascod(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc());
      struct.setCctcod(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod());
      struct.setCctdsc(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc());
      struct.setCcfas(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas());
      struct.setErrcontrol(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol());
      struct.setCcopecod(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod());
      struct.setBarfasest(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest());
      if ( gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N == 0 )
      {
         struct.setCcfch(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch());
      }
      struct.setCc(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc());
      struct.setCcser1(getgxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1());
      return struct ;
   }

   protected byte gxTv_SdtControlCalidad_CC_CC1_SDT_Item_N ;
   protected byte gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barfasest ;
   protected byte gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch_N ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Barordlin ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfas ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Errcontrol ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cc ;
   protected short gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccser1 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctcod ;
   protected int gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccopecod ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Procod ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Prodsc ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fascod ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Fasdsc ;
   protected String gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Cctdsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtControlCalidad_CC_CC1_SDT_Item_Ccfch ;
   protected boolean readElement ;
   protected boolean formatError ;
}

