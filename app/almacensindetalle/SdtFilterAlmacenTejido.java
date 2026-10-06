package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterAlmacenTejido extends GxUserType
{
   public SdtFilterAlmacenTejido( )
   {
      this(  new ModelContext(SdtFilterAlmacenTejido.class));
   }

   public SdtFilterAlmacenTejido( ModelContext context )
   {
      super( context, "SdtFilterAlmacenTejido");
   }

   public SdtFilterAlmacenTejido( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterAlmacenTejido");
   }

   public SdtFilterAlmacenTejido( StructSdtFilterAlmacenTejido struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albreccod") )
            {
               gxTv_SdtFilterAlmacenTejido_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFilterAlmacenTejido_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrfenfrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterAlmacenTejido_Albrfenfrom = GXutil.nullDate() ;
                  gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N = (byte)(0) ;
                  gxTv_SdtFilterAlmacenTejido_Albrfenfrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrfento") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterAlmacenTejido_Albrfento = GXutil.nullDate() ;
                  gxTv_SdtFilterAlmacenTejido_Albrfento_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterAlmacenTejido_Albrfento_N = (byte)(0) ;
                  gxTv_SdtFilterAlmacenTejido_Albrfento = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Albrest") )
            {
               gxTv_SdtFilterAlmacenTejido_Albrest = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "FilterAlmacenTejido" ;
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
      oWriter.writeElement("Albreccod", GXutil.trim( GXutil.str( gxTv_SdtFilterAlmacenTejido_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterAlmacenTejido_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterAlmacenTejido_Albrfenfrom)) && ( gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N == 1 ) )
      {
         oWriter.writeElement("Albrfenfrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterAlmacenTejido_Albrfenfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterAlmacenTejido_Albrfenfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterAlmacenTejido_Albrfenfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albrfenfrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterAlmacenTejido_Albrfento)) && ( gxTv_SdtFilterAlmacenTejido_Albrfento_N == 1 ) )
      {
         oWriter.writeElement("Albrfento", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterAlmacenTejido_Albrfento), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterAlmacenTejido_Albrfento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterAlmacenTejido_Albrfento), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Albrfento", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Albrest", GXutil.trim( GXutil.str( gxTv_SdtFilterAlmacenTejido_Albrest, 1, 0)));
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
      AddObjectProperty("Albreccod", gxTv_SdtFilterAlmacenTejido_Albreccod, false, false);
      AddObjectProperty("Clicod", gxTv_SdtFilterAlmacenTejido_Clicod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterAlmacenTejido_Albrfenfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterAlmacenTejido_Albrfenfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterAlmacenTejido_Albrfenfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albrfenfrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterAlmacenTejido_Albrfento), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterAlmacenTejido_Albrfento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterAlmacenTejido_Albrfento), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Albrfento", sDateCnv, false, false);
      AddObjectProperty("Albrest", gxTv_SdtFilterAlmacenTejido_Albrest, false, false);
   }

   public int getgxTv_SdtFilterAlmacenTejido_Albreccod( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albreccod ;
   }

   public void setgxTv_SdtFilterAlmacenTejido_Albreccod( int value )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albreccod = value ;
   }

   public int getgxTv_SdtFilterAlmacenTejido_Clicod( )
   {
      return gxTv_SdtFilterAlmacenTejido_Clicod ;
   }

   public void setgxTv_SdtFilterAlmacenTejido_Clicod( int value )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Clicod = value ;
   }

   public java.util.Date getgxTv_SdtFilterAlmacenTejido_Albrfenfrom( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albrfenfrom ;
   }

   public void setgxTv_SdtFilterAlmacenTejido_Albrfenfrom( java.util.Date value )
   {
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterAlmacenTejido_Albrfento( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albrfento ;
   }

   public void setgxTv_SdtFilterAlmacenTejido_Albrfento( java.util.Date value )
   {
      gxTv_SdtFilterAlmacenTejido_Albrfento_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albrfento = value ;
   }

   public byte getgxTv_SdtFilterAlmacenTejido_Albrest( )
   {
      return gxTv_SdtFilterAlmacenTejido_Albrest ;
   }

   public void setgxTv_SdtFilterAlmacenTejido_Albrest( byte value )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(0) ;
      gxTv_SdtFilterAlmacenTejido_Albrest = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterAlmacenTejido_N = (byte)(1) ;
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom = GXutil.nullDate() ;
      gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N = (byte)(1) ;
      gxTv_SdtFilterAlmacenTejido_Albrfento = GXutil.nullDate() ;
      gxTv_SdtFilterAlmacenTejido_Albrfento_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterAlmacenTejido_N ;
   }

   public app.almacensindetalle.SdtFilterAlmacenTejido Clone( )
   {
      return (app.almacensindetalle.SdtFilterAlmacenTejido)(clone()) ;
   }

   public void setStruct( app.almacensindetalle.StructSdtFilterAlmacenTejido struct )
   {
      setgxTv_SdtFilterAlmacenTejido_Albreccod(struct.getAlbreccod());
      setgxTv_SdtFilterAlmacenTejido_Clicod(struct.getClicod());
      if ( struct.gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N == 0 )
      {
         setgxTv_SdtFilterAlmacenTejido_Albrfenfrom(struct.getAlbrfenfrom());
      }
      if ( struct.gxTv_SdtFilterAlmacenTejido_Albrfento_N == 0 )
      {
         setgxTv_SdtFilterAlmacenTejido_Albrfento(struct.getAlbrfento());
      }
      setgxTv_SdtFilterAlmacenTejido_Albrest(struct.getAlbrest());
   }

   @SuppressWarnings("unchecked")
   public app.almacensindetalle.StructSdtFilterAlmacenTejido getStruct( )
   {
      app.almacensindetalle.StructSdtFilterAlmacenTejido struct = new app.almacensindetalle.StructSdtFilterAlmacenTejido ();
      struct.setAlbreccod(getgxTv_SdtFilterAlmacenTejido_Albreccod());
      struct.setClicod(getgxTv_SdtFilterAlmacenTejido_Clicod());
      if ( gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N == 0 )
      {
         struct.setAlbrfenfrom(getgxTv_SdtFilterAlmacenTejido_Albrfenfrom());
      }
      if ( gxTv_SdtFilterAlmacenTejido_Albrfento_N == 0 )
      {
         struct.setAlbrfento(getgxTv_SdtFilterAlmacenTejido_Albrfento());
      }
      struct.setAlbrest(getgxTv_SdtFilterAlmacenTejido_Albrest());
      return struct ;
   }

   protected byte gxTv_SdtFilterAlmacenTejido_N ;
   protected byte gxTv_SdtFilterAlmacenTejido_Albrfenfrom_N ;
   protected byte gxTv_SdtFilterAlmacenTejido_Albrfento_N ;
   protected byte gxTv_SdtFilterAlmacenTejido_Albrest ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterAlmacenTejido_Albreccod ;
   protected int gxTv_SdtFilterAlmacenTejido_Clicod ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterAlmacenTejido_Albrfenfrom ;
   protected java.util.Date gxTv_SdtFilterAlmacenTejido_Albrfento ;
   protected boolean readElement ;
   protected boolean formatError ;
}

