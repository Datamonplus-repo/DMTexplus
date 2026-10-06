package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterdocumentotransportecomercial_cabeceraww extends GxUserType
{
   public SdtFilterdocumentotransportecomercial_cabeceraww( )
   {
      this(  new ModelContext(SdtFilterdocumentotransportecomercial_cabeceraww.class));
   }

   public SdtFilterdocumentotransportecomercial_cabeceraww( ModelContext context )
   {
      super( context, "SdtFilterdocumentotransportecomercial_cabeceraww");
   }

   public SdtFilterdocumentotransportecomercial_cabeceraww( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterdocumentotransportecomercial_cabeceraww");
   }

   public SdtFilterdocumentotransportecomercial_cabeceraww( StructSdtFilterdocumentotransportecomercial_cabeceraww struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbComCod") )
            {
               gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbComSt") )
            {
               gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albcomfchfrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom = GXutil.nullDate() ;
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N = (byte)(0) ;
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbComFchto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto = GXutil.nullDate() ;
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N = (byte)(0) ;
                  gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prioridad") )
            {
               gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad = oReader.getValue() ;
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
         sName = "Filterdocumentotransportecomercial_cabeceraww" ;
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
      oWriter.writeElement("AlbComCod", GXutil.trim( GXutil.str( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbComSt", gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom)) && ( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N == 1 ) )
      {
         oWriter.writeElement("Albcomfchfrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albcomfchfrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto)) && ( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N == 1 ) )
      {
         oWriter.writeElement("AlbComFchto", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbComFchto", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Prioridad", gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad);
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
      AddObjectProperty("AlbComCod", gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod, false, false);
      AddObjectProperty("AlbComSt", gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst, false, false);
      AddObjectProperty("Clicod", gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albcomfchfrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbComFchto", sDateCnv, false, false);
      AddObjectProperty("Prioridad", gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad, false, false);
   }

   public int getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod ;
   }

   public void setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod( int value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod = value ;
   }

   public String getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst ;
   }

   public void setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst( String value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst = value ;
   }

   public int getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod ;
   }

   public void setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod( int value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod = value ;
   }

   public java.util.Date getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom ;
   }

   public void setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom( java.util.Date value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto ;
   }

   public void setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto( java.util.Date value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto = value ;
   }

   public String getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad ;
   }

   public void setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad( String value )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(0) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N = (byte)(1) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst = "" ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom = GXutil.nullDate() ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N = (byte)(1) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto = GXutil.nullDate() ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N = (byte)(1) ;
      gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N ;
   }

   public app.documentotransportecomercial.SdtFilterdocumentotransportecomercial_cabeceraww Clone( )
   {
      return (app.documentotransportecomercial.SdtFilterdocumentotransportecomercial_cabeceraww)(clone()) ;
   }

   public void setStruct( app.documentotransportecomercial.StructSdtFilterdocumentotransportecomercial_cabeceraww struct )
   {
      setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod(struct.getAlbcomcod());
      setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst(struct.getAlbcomst());
      setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod(struct.getClicod());
      if ( struct.gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N == 0 )
      {
         setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom(struct.getAlbcomfchfrom());
      }
      if ( struct.gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N == 0 )
      {
         setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto(struct.getAlbcomfchto());
      }
      setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad(struct.getPrioridad());
   }

   @SuppressWarnings("unchecked")
   public app.documentotransportecomercial.StructSdtFilterdocumentotransportecomercial_cabeceraww getStruct( )
   {
      app.documentotransportecomercial.StructSdtFilterdocumentotransportecomercial_cabeceraww struct = new app.documentotransportecomercial.StructSdtFilterdocumentotransportecomercial_cabeceraww ();
      struct.setAlbcomcod(getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod());
      struct.setAlbcomst(getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst());
      struct.setClicod(getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod());
      if ( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N == 0 )
      {
         struct.setAlbcomfchfrom(getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom());
      }
      if ( gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N == 0 )
      {
         struct.setAlbcomfchto(getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto());
      }
      struct.setPrioridad(getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad());
      return struct ;
   }

   protected byte gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_N ;
   protected byte gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom_N ;
   protected byte gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod ;
   protected int gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod ;
   protected String gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst ;
   protected String gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom ;
   protected java.util.Date gxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto ;
   protected boolean readElement ;
   protected boolean formatError ;
}

