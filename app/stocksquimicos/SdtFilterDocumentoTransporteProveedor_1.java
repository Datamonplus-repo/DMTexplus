package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterDocumentoTransporteProveedor_1 extends GxUserType
{
   public SdtFilterDocumentoTransporteProveedor_1( )
   {
      this(  new ModelContext(SdtFilterDocumentoTransporteProveedor_1.class));
   }

   public SdtFilterDocumentoTransporteProveedor_1( ModelContext context )
   {
      super( context, "SdtFilterDocumentoTransporteProveedor_1");
   }

   public SdtFilterDocumentoTransporteProveedor_1( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterDocumentoTransporteProveedor_1");
   }

   public SdtFilterDocumentoTransporteProveedor_1( StructSdtFilterDocumentoTransporteProveedor_1 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProID") )
            {
               gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProAnulado") )
            {
               gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProPrvID") )
            {
               gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProDatefrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom = GXutil.nullDate() ;
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N = (byte)(0) ;
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProDateto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto = GXutil.nullDate() ;
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N = (byte)(0) ;
                  gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
         sName = "FilterDocumentoTransporteProveedor_1" ;
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
      oWriter.writeElement("AlbProID", GXutil.trim( GXutil.str( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProAnulado", gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProPrvID", GXutil.trim( GXutil.str( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom)) && ( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N == 1 ) )
      {
         oWriter.writeElement("AlbProDatefrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProDatefrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto)) && ( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N == 1 ) )
      {
         oWriter.writeElement("AlbProDateto", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProDateto", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("AlbProID", gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid, false, false);
      AddObjectProperty("AlbProAnulado", gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado, false, false);
      AddObjectProperty("AlbProPrvID", gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProDatefrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProDateto", sDateCnv, false, false);
   }

   public int getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid ;
   }

   public void setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid( int value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid = value ;
   }

   public String getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado ;
   }

   public void setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado( String value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado = value ;
   }

   public int getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid ;
   }

   public void setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid( int value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid = value ;
   }

   public java.util.Date getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom ;
   }

   public void setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom( java.util.Date value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto ;
   }

   public void setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto( java.util.Date value )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(0) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterDocumentoTransporteProveedor_1_N = (byte)(1) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado = "" ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom = GXutil.nullDate() ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N = (byte)(1) ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto = GXutil.nullDate() ;
      gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterDocumentoTransporteProveedor_1_N ;
   }

   public app.stocksquimicos.SdtFilterDocumentoTransporteProveedor_1 Clone( )
   {
      return (app.stocksquimicos.SdtFilterDocumentoTransporteProveedor_1)(clone()) ;
   }

   public void setStruct( app.stocksquimicos.StructSdtFilterDocumentoTransporteProveedor_1 struct )
   {
      setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid(struct.getAlbproid());
      setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado(struct.getAlbproanulado());
      setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid(struct.getAlbproprvid());
      if ( struct.gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N == 0 )
      {
         setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom(struct.getAlbprodatefrom());
      }
      if ( struct.gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N == 0 )
      {
         setgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto(struct.getAlbprodateto());
      }
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtFilterDocumentoTransporteProveedor_1 getStruct( )
   {
      app.stocksquimicos.StructSdtFilterDocumentoTransporteProveedor_1 struct = new app.stocksquimicos.StructSdtFilterDocumentoTransporteProveedor_1 ();
      struct.setAlbproid(getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid());
      struct.setAlbproanulado(getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado());
      struct.setAlbproprvid(getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid());
      if ( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N == 0 )
      {
         struct.setAlbprodatefrom(getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom());
      }
      if ( gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N == 0 )
      {
         struct.setAlbprodateto(getgxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto());
      }
      return struct ;
   }

   protected byte gxTv_SdtFilterDocumentoTransporteProveedor_1_N ;
   protected byte gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom_N ;
   protected byte gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproid ;
   protected int gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproprvid ;
   protected String gxTv_SdtFilterDocumentoTransporteProveedor_1_Albproanulado ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodatefrom ;
   protected java.util.Date gxTv_SdtFilterDocumentoTransporteProveedor_1_Albprodateto ;
   protected boolean readElement ;
   protected boolean formatError ;
}

