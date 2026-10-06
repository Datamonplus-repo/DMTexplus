package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterDocumentodeTransporteProduccion_1 extends GxUserType
{
   public SdtFilterDocumentodeTransporteProduccion_1( )
   {
      this(  new ModelContext(SdtFilterDocumentodeTransporteProduccion_1.class));
   }

   public SdtFilterDocumentodeTransporteProduccion_1( ModelContext context )
   {
      super( context, "SdtFilterDocumentodeTransporteProduccion_1");
   }

   public SdtFilterDocumentodeTransporteProduccion_1( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterDocumentodeTransporteProduccion_1");
   }

   public SdtFilterDocumentodeTransporteProduccion_1( StructSdtFilterDocumentodeTransporteProduccion_1 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarca") )
            {
               gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albprofchfrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom = GXutil.nullDate() ;
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N = (byte)(0) ;
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbproFchto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto = GXutil.nullDate() ;
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N = (byte)(0) ;
                  gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad = oReader.getValue() ;
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
         sName = "FilterDocumentodeTransporteProduccion_1" ;
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
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarca", gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom)) && ( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N == 1 ) )
      {
         oWriter.writeElement("Albprofchfrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albprofchfrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto)) && ( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N == 1 ) )
      {
         oWriter.writeElement("AlbproFchto", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbproFchto", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Prioridad", gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad);
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
      AddObjectProperty("AlbProCod", gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod, false, false);
      AddObjectProperty("AlbMarca", gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca, false, false);
      AddObjectProperty("Clicod", gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albprofchfrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbproFchto", sDateCnv, false, false);
      AddObjectProperty("Prioridad", gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad, false, false);
   }

   public long getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod ;
   }

   public void setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod( long value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod = value ;
   }

   public String getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca ;
   }

   public void setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca( String value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca = value ;
   }

   public int getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod ;
   }

   public void setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod( int value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod = value ;
   }

   public java.util.Date getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom ;
   }

   public void setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom( java.util.Date value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto ;
   }

   public void setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto( java.util.Date value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto = value ;
   }

   public String getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad ;
   }

   public void setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad( String value )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_N = (byte)(1) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca = "" ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom = GXutil.nullDate() ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N = (byte)(1) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto = GXutil.nullDate() ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N = (byte)(1) ;
      gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterDocumentodeTransporteProduccion_1_N ;
   }

   public app.documentotransporteproduccion.SdtFilterDocumentodeTransporteProduccion_1 Clone( )
   {
      return (app.documentotransporteproduccion.SdtFilterDocumentodeTransporteProduccion_1)(clone()) ;
   }

   public void setStruct( app.documentotransporteproduccion.StructSdtFilterDocumentodeTransporteProduccion_1 struct )
   {
      setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod(struct.getAlbprocod());
      setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca(struct.getAlbmarca());
      setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod(struct.getClicod());
      if ( struct.gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N == 0 )
      {
         setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom(struct.getAlbprofchfrom());
      }
      if ( struct.gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N == 0 )
      {
         setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto(struct.getAlbprofchto());
      }
      setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad(struct.getPrioridad());
   }

   @SuppressWarnings("unchecked")
   public app.documentotransporteproduccion.StructSdtFilterDocumentodeTransporteProduccion_1 getStruct( )
   {
      app.documentotransporteproduccion.StructSdtFilterDocumentodeTransporteProduccion_1 struct = new app.documentotransporteproduccion.StructSdtFilterDocumentodeTransporteProduccion_1 ();
      struct.setAlbprocod(getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod());
      struct.setAlbmarca(getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca());
      struct.setClicod(getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod());
      if ( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N == 0 )
      {
         struct.setAlbprofchfrom(getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom());
      }
      if ( gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N == 0 )
      {
         struct.setAlbprofchto(getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto());
      }
      struct.setPrioridad(getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad());
      return struct ;
   }

   protected byte gxTv_SdtFilterDocumentodeTransporteProduccion_1_N ;
   protected byte gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom_N ;
   protected byte gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod ;
   protected long gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod ;
   protected String gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca ;
   protected String gxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom ;
   protected java.util.Date gxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto ;
   protected boolean readElement ;
   protected boolean formatError ;
}

