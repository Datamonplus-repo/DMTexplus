package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTPiezasaReoperar extends GxUserType
{
   public SdtSDTPiezasaReoperar( )
   {
      this(  new ModelContext(SdtSDTPiezasaReoperar.class));
   }

   public SdtSDTPiezasaReoperar( ModelContext context )
   {
      super( context, "SdtSDTPiezasaReoperar");
   }

   public SdtSDTPiezasaReoperar( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPiezasaReoperar");
   }

   public SdtSDTPiezasaReoperar( StructSdtSDTPiezasaReoperar struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPiecod") )
            {
               gxTv_SdtSDTPiezasaReoperar_Barpiecod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPieKil") )
            {
               gxTv_SdtSDTPiezasaReoperar_Barpiekil = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosDisponibles") )
            {
               gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPiemet") )
            {
               gxTv_SdtSDTPiezasaReoperar_Barpiemet = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosDispobibles") )
            {
               gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPieCodDestino") )
            {
               gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPieloc") )
            {
               gxTv_SdtSDTPiezasaReoperar_Barpieloc = oReader.getValue() ;
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
         sName = "SDTPiezasaReoperar" ;
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
      oWriter.writeElement("BarPiecod", gxTv_SdtSDTPiezasaReoperar_Barpiecod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPieKil", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPiezasaReoperar_Barpiekil, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosDisponibles", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPiemet", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPiezasaReoperar_Barpiemet, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosDispobibles", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPieCodDestino", gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPieloc", gxTv_SdtSDTPiezasaReoperar_Barpieloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("BarPiecod", gxTv_SdtSDTPiezasaReoperar_Barpiecod, false, false);
      AddObjectProperty("BarPieKil", gxTv_SdtSDTPiezasaReoperar_Barpiekil, false, false);
      AddObjectProperty("KilosDisponibles", gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles, false, false);
      AddObjectProperty("BarPiemet", gxTv_SdtSDTPiezasaReoperar_Barpiemet, false, false);
      AddObjectProperty("MetrosDispobibles", gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles, false, false);
      AddObjectProperty("BarPieCodDestino", gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino, false, false);
      AddObjectProperty("BarPieloc", gxTv_SdtSDTPiezasaReoperar_Barpieloc, false, false);
   }

   public String getgxTv_SdtSDTPiezasaReoperar_Barpiecod( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiecod ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Barpiecod( String value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiecod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPiezasaReoperar_Barpiekil( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiekil ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Barpiekil( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiekil = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPiezasaReoperar_Kilosdisponibles( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Kilosdisponibles( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPiezasaReoperar_Barpiemet( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiemet ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Barpiemet( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiemet = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTPiezasaReoperar_Metrosdispobibles( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Metrosdispobibles( java.math.BigDecimal value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles = value ;
   }

   public String getgxTv_SdtSDTPiezasaReoperar_Barpiecoddestino( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Barpiecoddestino( String value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino = value ;
   }

   public String getgxTv_SdtSDTPiezasaReoperar_Barpieloc( )
   {
      return gxTv_SdtSDTPiezasaReoperar_Barpieloc ;
   }

   public void setgxTv_SdtSDTPiezasaReoperar_Barpieloc( String value )
   {
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(0) ;
      gxTv_SdtSDTPiezasaReoperar_Barpieloc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTPiezasaReoperar_Barpiecod = "" ;
      gxTv_SdtSDTPiezasaReoperar_N = (byte)(1) ;
      gxTv_SdtSDTPiezasaReoperar_Barpiekil = DecimalUtil.ZERO ;
      gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles = DecimalUtil.ZERO ;
      gxTv_SdtSDTPiezasaReoperar_Barpiemet = DecimalUtil.ZERO ;
      gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles = DecimalUtil.ZERO ;
      gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino = "" ;
      gxTv_SdtSDTPiezasaReoperar_Barpieloc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTPiezasaReoperar_N ;
   }

   public app.SdtSDTPiezasaReoperar Clone( )
   {
      return (app.SdtSDTPiezasaReoperar)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTPiezasaReoperar struct )
   {
      setgxTv_SdtSDTPiezasaReoperar_Barpiecod(struct.getBarpiecod());
      setgxTv_SdtSDTPiezasaReoperar_Barpiekil(struct.getBarpiekil());
      setgxTv_SdtSDTPiezasaReoperar_Kilosdisponibles(struct.getKilosdisponibles());
      setgxTv_SdtSDTPiezasaReoperar_Barpiemet(struct.getBarpiemet());
      setgxTv_SdtSDTPiezasaReoperar_Metrosdispobibles(struct.getMetrosdispobibles());
      setgxTv_SdtSDTPiezasaReoperar_Barpiecoddestino(struct.getBarpiecoddestino());
      setgxTv_SdtSDTPiezasaReoperar_Barpieloc(struct.getBarpieloc());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTPiezasaReoperar getStruct( )
   {
      app.StructSdtSDTPiezasaReoperar struct = new app.StructSdtSDTPiezasaReoperar ();
      struct.setBarpiecod(getgxTv_SdtSDTPiezasaReoperar_Barpiecod());
      struct.setBarpiekil(getgxTv_SdtSDTPiezasaReoperar_Barpiekil());
      struct.setKilosdisponibles(getgxTv_SdtSDTPiezasaReoperar_Kilosdisponibles());
      struct.setBarpiemet(getgxTv_SdtSDTPiezasaReoperar_Barpiemet());
      struct.setMetrosdispobibles(getgxTv_SdtSDTPiezasaReoperar_Metrosdispobibles());
      struct.setBarpiecoddestino(getgxTv_SdtSDTPiezasaReoperar_Barpiecoddestino());
      struct.setBarpieloc(getgxTv_SdtSDTPiezasaReoperar_Barpieloc());
      return struct ;
   }

   protected byte gxTv_SdtSDTPiezasaReoperar_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Barpiekil ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Kilosdisponibles ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Barpiemet ;
   protected java.math.BigDecimal gxTv_SdtSDTPiezasaReoperar_Metrosdispobibles ;
   protected String gxTv_SdtSDTPiezasaReoperar_Barpiecod ;
   protected String gxTv_SdtSDTPiezasaReoperar_Barpiecoddestino ;
   protected String gxTv_SdtSDTPiezasaReoperar_Barpieloc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

