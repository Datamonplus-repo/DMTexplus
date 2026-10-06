package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterHojadeRuta__WW extends GxUserType
{
   public SdtFilterHojadeRuta__WW( )
   {
      this(  new ModelContext(SdtFilterHojadeRuta__WW.class));
   }

   public SdtFilterHojadeRuta__WW( ModelContext context )
   {
      super( context, "SdtFilterHojadeRuta__WW");
   }

   public SdtFilterHojadeRuta__WW( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterHojadeRuta__WW");
   }

   public SdtFilterHojadeRuta__WW( StructSdtFilterHojadeRuta__WW struct )
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
               gxTv_SdtFilterHojadeRuta__WW_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtFilterHojadeRuta__WW_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtFilterHojadeRuta__WW_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtFilterHojadeRuta__WW_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecGenfrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom = GXutil.nullDate() ;
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N = (byte)(0) ;
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarFecGento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgento = GXutil.nullDate() ;
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N = (byte)(0) ;
                  gxTv_SdtFilterHojadeRuta__WW_Barfecgento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSitfrom") )
            {
               gxTv_SdtFilterHojadeRuta__WW_Barsitfrom = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSitto") )
            {
               gxTv_SdtFilterHojadeRuta__WW_Barsitto = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "FilterHojadeRuta__WW" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterHojadeRuta__WW_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtFilterHojadeRuta__WW_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtFilterHojadeRuta__WW_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtFilterHojadeRuta__WW_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom)) && ( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N == 1 ) )
      {
         oWriter.writeElement("BarFecGenfrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecGenfrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterHojadeRuta__WW_Barfecgento)) && ( gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N == 1 ) )
      {
         oWriter.writeElement("BarFecGento", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterHojadeRuta__WW_Barfecgento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterHojadeRuta__WW_Barfecgento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterHojadeRuta__WW_Barfecgento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BarFecGento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("BarSitfrom", GXutil.trim( GXutil.str( gxTv_SdtFilterHojadeRuta__WW_Barsitfrom, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSitto", GXutil.trim( GXutil.str( gxTv_SdtFilterHojadeRuta__WW_Barsitto, 2, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtFilterHojadeRuta__WW_Clicod, false, false);
      AddObjectProperty("Barcod", gxTv_SdtFilterHojadeRuta__WW_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtFilterHojadeRuta__WW_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtFilterHojadeRuta__WW_Barcodpar, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecGenfrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterHojadeRuta__WW_Barfecgento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterHojadeRuta__WW_Barfecgento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterHojadeRuta__WW_Barfecgento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("BarFecGento", sDateCnv, false, false);
      AddObjectProperty("BarSitfrom", gxTv_SdtFilterHojadeRuta__WW_Barsitfrom, false, false);
      AddObjectProperty("BarSitto", gxTv_SdtFilterHojadeRuta__WW_Barsitto, false, false);
   }

   public int getgxTv_SdtFilterHojadeRuta__WW_Clicod( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Clicod ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Clicod( int value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Clicod = value ;
   }

   public int getgxTv_SdtFilterHojadeRuta__WW_Barcod( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barcod ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barcod( int value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcod = value ;
   }

   public byte getgxTv_SdtFilterHojadeRuta__WW_Barcodreo( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barcodreo ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barcodreo( byte value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcodreo = value ;
   }

   public String getgxTv_SdtFilterHojadeRuta__WW_Barcodpar( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barcodpar ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barcodpar( String value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcodpar = value ;
   }

   public java.util.Date getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom( java.util.Date value )
   {
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterHojadeRuta__WW_Barfecgento( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barfecgento ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barfecgento( java.util.Date value )
   {
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento = value ;
   }

   public byte getgxTv_SdtFilterHojadeRuta__WW_Barsitfrom( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barsitfrom ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barsitfrom( byte value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barsitfrom = value ;
   }

   public byte getgxTv_SdtFilterHojadeRuta__WW_Barsitto( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_Barsitto ;
   }

   public void setgxTv_SdtFilterHojadeRuta__WW_Barsitto( byte value )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(0) ;
      gxTv_SdtFilterHojadeRuta__WW_Barsitto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterHojadeRuta__WW_N = (byte)(1) ;
      gxTv_SdtFilterHojadeRuta__WW_Barcodpar = "" ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom = GXutil.nullDate() ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N = (byte)(1) ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento = GXutil.nullDate() ;
      gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterHojadeRuta__WW_N ;
   }

   public app.pedidosclientesindetalle.SdtFilterHojadeRuta__WW Clone( )
   {
      return (app.pedidosclientesindetalle.SdtFilterHojadeRuta__WW)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtFilterHojadeRuta__WW struct )
   {
      setgxTv_SdtFilterHojadeRuta__WW_Clicod(struct.getClicod());
      setgxTv_SdtFilterHojadeRuta__WW_Barcod(struct.getBarcod());
      setgxTv_SdtFilterHojadeRuta__WW_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtFilterHojadeRuta__WW_Barcodpar(struct.getBarcodpar());
      if ( struct.gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N == 0 )
      {
         setgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom(struct.getBarfecgenfrom());
      }
      if ( struct.gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N == 0 )
      {
         setgxTv_SdtFilterHojadeRuta__WW_Barfecgento(struct.getBarfecgento());
      }
      setgxTv_SdtFilterHojadeRuta__WW_Barsitfrom(struct.getBarsitfrom());
      setgxTv_SdtFilterHojadeRuta__WW_Barsitto(struct.getBarsitto());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtFilterHojadeRuta__WW getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtFilterHojadeRuta__WW struct = new app.pedidosclientesindetalle.StructSdtFilterHojadeRuta__WW ();
      struct.setClicod(getgxTv_SdtFilterHojadeRuta__WW_Clicod());
      struct.setBarcod(getgxTv_SdtFilterHojadeRuta__WW_Barcod());
      struct.setBarcodreo(getgxTv_SdtFilterHojadeRuta__WW_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtFilterHojadeRuta__WW_Barcodpar());
      if ( gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N == 0 )
      {
         struct.setBarfecgenfrom(getgxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom());
      }
      if ( gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N == 0 )
      {
         struct.setBarfecgento(getgxTv_SdtFilterHojadeRuta__WW_Barfecgento());
      }
      struct.setBarsitfrom(getgxTv_SdtFilterHojadeRuta__WW_Barsitfrom());
      struct.setBarsitto(getgxTv_SdtFilterHojadeRuta__WW_Barsitto());
      return struct ;
   }

   protected byte gxTv_SdtFilterHojadeRuta__WW_N ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barcodreo ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom_N ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barfecgento_N ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barsitfrom ;
   protected byte gxTv_SdtFilterHojadeRuta__WW_Barsitto ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterHojadeRuta__WW_Clicod ;
   protected int gxTv_SdtFilterHojadeRuta__WW_Barcod ;
   protected String gxTv_SdtFilterHojadeRuta__WW_Barcodpar ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterHojadeRuta__WW_Barfecgenfrom ;
   protected java.util.Date gxTv_SdtFilterHojadeRuta__WW_Barfecgento ;
   protected boolean readElement ;
   protected boolean formatError ;
}

