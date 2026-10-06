package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFilterDevolucionTejido_1 extends GxUserType
{
   public SdtFilterDevolucionTejido_1( )
   {
      this(  new ModelContext(SdtFilterDevolucionTejido_1.class));
   }

   public SdtFilterDevolucionTejido_1( ModelContext context )
   {
      super( context, "SdtFilterDevolucionTejido_1");
   }

   public SdtFilterDevolucionTejido_1( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtFilterDevolucionTejido_1");
   }

   public SdtFilterDevolucionTejido_1( StructSdtFilterDevolucionTejido_1 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevCruId") )
            {
               gxTv_SdtFilterDevolucionTejido_1_Devcruid = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevCruStt") )
            {
               gxTv_SdtFilterDevolucionTejido_1_Devcrustt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtFilterDevolucionTejido_1_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevCruFecfrom") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom = GXutil.nullDate() ;
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N = (byte)(0) ;
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevCruFecto") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecto = GXutil.nullDate() ;
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N = (byte)(0) ;
                  gxTv_SdtFilterDevolucionTejido_1_Devcrufecto = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
         sName = "FilterDevolucionTejido_1" ;
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
      oWriter.writeElement("DevCruId", GXutil.trim( GXutil.str( gxTv_SdtFilterDevolucionTejido_1_Devcruid, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevCruStt", gxTv_SdtFilterDevolucionTejido_1_Devcrustt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtFilterDevolucionTejido_1_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom)) && ( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N == 1 ) )
      {
         oWriter.writeElement("DevCruFecfrom", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DevCruFecfrom", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFilterDevolucionTejido_1_Devcrufecto)) && ( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N == 1 ) )
      {
         oWriter.writeElement("DevCruFecto", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DevCruFecto", sDateCnv);
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
      AddObjectProperty("DevCruId", gxTv_SdtFilterDevolucionTejido_1_Devcruid, false, false);
      AddObjectProperty("DevCruStt", gxTv_SdtFilterDevolucionTejido_1_Devcrustt, false, false);
      AddObjectProperty("Clicod", gxTv_SdtFilterDevolucionTejido_1_Clicod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DevCruFecfrom", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DevCruFecto", sDateCnv, false, false);
   }

   public int getgxTv_SdtFilterDevolucionTejido_1_Devcruid( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcruid ;
   }

   public void setgxTv_SdtFilterDevolucionTejido_1_Devcruid( int value )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcruid = value ;
   }

   public String getgxTv_SdtFilterDevolucionTejido_1_Devcrustt( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcrustt ;
   }

   public void setgxTv_SdtFilterDevolucionTejido_1_Devcrustt( String value )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrustt = value ;
   }

   public int getgxTv_SdtFilterDevolucionTejido_1_Clicod( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Clicod ;
   }

   public void setgxTv_SdtFilterDevolucionTejido_1_Clicod( int value )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Clicod = value ;
   }

   public java.util.Date getgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom ;
   }

   public void setgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom( java.util.Date value )
   {
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom = value ;
   }

   public java.util.Date getgxTv_SdtFilterDevolucionTejido_1_Devcrufecto( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_Devcrufecto ;
   }

   public void setgxTv_SdtFilterDevolucionTejido_1_Devcrufecto( java.util.Date value )
   {
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(0) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFilterDevolucionTejido_1_N = (byte)(1) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrustt = "" ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom = GXutil.nullDate() ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N = (byte)(1) ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto = GXutil.nullDate() ;
      gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFilterDevolucionTejido_1_N ;
   }

   public app.almacensindetalle.SdtFilterDevolucionTejido_1 Clone( )
   {
      return (app.almacensindetalle.SdtFilterDevolucionTejido_1)(clone()) ;
   }

   public void setStruct( app.almacensindetalle.StructSdtFilterDevolucionTejido_1 struct )
   {
      setgxTv_SdtFilterDevolucionTejido_1_Devcruid(struct.getDevcruid());
      setgxTv_SdtFilterDevolucionTejido_1_Devcrustt(struct.getDevcrustt());
      setgxTv_SdtFilterDevolucionTejido_1_Clicod(struct.getClicod());
      if ( struct.gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N == 0 )
      {
         setgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom(struct.getDevcrufecfrom());
      }
      if ( struct.gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N == 0 )
      {
         setgxTv_SdtFilterDevolucionTejido_1_Devcrufecto(struct.getDevcrufecto());
      }
   }

   @SuppressWarnings("unchecked")
   public app.almacensindetalle.StructSdtFilterDevolucionTejido_1 getStruct( )
   {
      app.almacensindetalle.StructSdtFilterDevolucionTejido_1 struct = new app.almacensindetalle.StructSdtFilterDevolucionTejido_1 ();
      struct.setDevcruid(getgxTv_SdtFilterDevolucionTejido_1_Devcruid());
      struct.setDevcrustt(getgxTv_SdtFilterDevolucionTejido_1_Devcrustt());
      struct.setClicod(getgxTv_SdtFilterDevolucionTejido_1_Clicod());
      if ( gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N == 0 )
      {
         struct.setDevcrufecfrom(getgxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom());
      }
      if ( gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N == 0 )
      {
         struct.setDevcrufecto(getgxTv_SdtFilterDevolucionTejido_1_Devcrufecto());
      }
      return struct ;
   }

   protected byte gxTv_SdtFilterDevolucionTejido_1_N ;
   protected byte gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom_N ;
   protected byte gxTv_SdtFilterDevolucionTejido_1_Devcrufecto_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFilterDevolucionTejido_1_Devcruid ;
   protected int gxTv_SdtFilterDevolucionTejido_1_Clicod ;
   protected String gxTv_SdtFilterDevolucionTejido_1_Devcrustt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFilterDevolucionTejido_1_Devcrufecfrom ;
   protected java.util.Date gxTv_SdtFilterDevolucionTejido_1_Devcrufecto ;
   protected boolean readElement ;
   protected boolean formatError ;
}

