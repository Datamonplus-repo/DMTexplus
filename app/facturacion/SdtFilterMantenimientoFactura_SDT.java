package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterMantenimientoFactura_SDT extends GxUserType
{
   public SdtFilterMantenimientoFactura_SDT( )
   {
      this(  new ModelContext(SdtFilterMantenimientoFactura_SDT.class));
   }

   public SdtFilterMantenimientoFactura_SDT( ModelContext context )
   {
      super( context, "SdtFilterMantenimientoFactura_SDT");
   }

   public SdtFilterMantenimientoFactura_SDT( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterMantenimientoFactura_SDT");
   }

   public SdtFilterMantenimientoFactura_SDT( StructSdtFilterMantenimientoFactura_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Faccod") )
            {
               gxTv_SdtFilterMantenimientoFactura_SDT_Faccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFilterMantenimientoFactura_SDT_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Facfchfrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom = GXutil.nullDate() ;
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N = (byte)(0) ;
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacFchto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto = GXutil.nullDate() ;
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N = (byte)(0) ;
                  gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FacPri") )
            {
               gxTv_SdtFilterMantenimientoFactura_SDT_Facpri = oReader.getValue() ;
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
         sName = "FilterMantenimientoFactura_SDT" ;
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
      oWriter.writeElement("Faccod", GXutil.trim( GXutil.str( gxTv_SdtFilterMantenimientoFactura_SDT_Faccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterMantenimientoFactura_SDT_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom)) && ( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N == 1 ) )
      {
         oWriter.writeElement("Facfchfrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Facfchfrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto)) && ( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N == 1 ) )
      {
         oWriter.writeElement("FacFchto", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FacFchto", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("FacPri", gxTv_SdtFilterMantenimientoFactura_SDT_Facpri);
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
      AddObjectProperty("Faccod", gxTv_SdtFilterMantenimientoFactura_SDT_Faccod, false, false);
      AddObjectProperty("Clicod", gxTv_SdtFilterMantenimientoFactura_SDT_Clicod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Facfchfrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FacFchto", sDateCnv, false, false);
      AddObjectProperty("FacPri", gxTv_SdtFilterMantenimientoFactura_SDT_Facpri, false, false);
   }

   public int getgxTv_SdtFilterMantenimientoFactura_SDT_Faccod( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Faccod ;
   }

   public void setgxTv_SdtFilterMantenimientoFactura_SDT_Faccod( int value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Faccod = value ;
   }

   public int getgxTv_SdtFilterMantenimientoFactura_SDT_Clicod( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Clicod ;
   }

   public void setgxTv_SdtFilterMantenimientoFactura_SDT_Clicod( int value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Clicod = value ;
   }

   public java.util.Date getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom ;
   }

   public void setgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom( java.util.Date value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto ;
   }

   public void setgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto( java.util.Date value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto = value ;
   }

   public String getgxTv_SdtFilterMantenimientoFactura_SDT_Facpri( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_Facpri ;
   }

   public void setgxTv_SdtFilterMantenimientoFactura_SDT_Facpri( String value )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(0) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facpri = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterMantenimientoFactura_SDT_N = (byte)(1) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom = GXutil.nullDate() ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N = (byte)(1) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto = GXutil.nullDate() ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N = (byte)(1) ;
      gxTv_SdtFilterMantenimientoFactura_SDT_Facpri = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterMantenimientoFactura_SDT_N ;
   }

   public app.facturacion.SdtFilterMantenimientoFactura_SDT Clone( )
   {
      return (app.facturacion.SdtFilterMantenimientoFactura_SDT)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtFilterMantenimientoFactura_SDT struct )
   {
      setgxTv_SdtFilterMantenimientoFactura_SDT_Faccod(struct.getFaccod());
      setgxTv_SdtFilterMantenimientoFactura_SDT_Clicod(struct.getClicod());
      if ( struct.gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N == 0 )
      {
         setgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom(struct.getFacfchfrom());
      }
      if ( struct.gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N == 0 )
      {
         setgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto(struct.getFacfchto());
      }
      setgxTv_SdtFilterMantenimientoFactura_SDT_Facpri(struct.getFacpri());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtFilterMantenimientoFactura_SDT getStruct( )
   {
      app.facturacion.StructSdtFilterMantenimientoFactura_SDT struct = new app.facturacion.StructSdtFilterMantenimientoFactura_SDT ();
      struct.setFaccod(getgxTv_SdtFilterMantenimientoFactura_SDT_Faccod());
      struct.setClicod(getgxTv_SdtFilterMantenimientoFactura_SDT_Clicod());
      if ( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N == 0 )
      {
         struct.setFacfchfrom(getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom());
      }
      if ( gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N == 0 )
      {
         struct.setFacfchto(getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto());
      }
      struct.setFacpri(getgxTv_SdtFilterMantenimientoFactura_SDT_Facpri());
      return struct ;
   }

   protected byte gxTv_SdtFilterMantenimientoFactura_SDT_N ;
   protected byte gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom_N ;
   protected byte gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterMantenimientoFactura_SDT_Faccod ;
   protected int gxTv_SdtFilterMantenimientoFactura_SDT_Clicod ;
   protected String gxTv_SdtFilterMantenimientoFactura_SDT_Facpri ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom ;
   protected java.util.Date gxTv_SdtFilterMantenimientoFactura_SDT_Facfchto ;
   protected boolean readElement ;
   protected boolean formatError ;
}

