package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTMaquinas extends GxUserType
{
   public SdtSDTMaquinas( )
   {
      this(  new ModelContext(SdtSDTMaquinas.class));
   }

   public SdtSDTMaquinas( ModelContext context )
   {
      super( context, "SdtSDTMaquinas");
   }

   public SdtSDTMaquinas( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTMaquinas");
   }

   public SdtSDTMaquinas( StructSdtSDTMaquinas struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTMaquinas_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTMaquinas_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosProduccion") )
            {
               gxTv_SdtSDTMaquinas_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTMaquinas_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTMaquinas" ;
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
      oWriter.writeElement("MaqCod", gxTv_SdtSDTMaquinas_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTMaquinas_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMaquinas_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMaquinas_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("MaqCod", gxTv_SdtSDTMaquinas_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTMaquinas_Maqdsc, false, false);
      AddObjectProperty("KilosProduccion", gxTv_SdtSDTMaquinas_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTMaquinas_Metrosproduccion, false, false);
   }

   public String getgxTv_SdtSDTMaquinas_Maqcod( )
   {
      return gxTv_SdtSDTMaquinas_Maqcod ;
   }

   public void setgxTv_SdtSDTMaquinas_Maqcod( String value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Maqcod = value ;
   }

   public String getgxTv_SdtSDTMaquinas_Maqdsc( )
   {
      return gxTv_SdtSDTMaquinas_Maqdsc ;
   }

   public void setgxTv_SdtSDTMaquinas_Maqdsc( String value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Maqdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMaquinas_Kilosproduccion( )
   {
      return gxTv_SdtSDTMaquinas_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTMaquinas_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMaquinas_Metrosproduccion( )
   {
      return gxTv_SdtSDTMaquinas_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTMaquinas_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTMaquinas_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTMaquinas_Maqcod = "" ;
      gxTv_SdtSDTMaquinas_N = (byte)(1) ;
      gxTv_SdtSDTMaquinas_Maqdsc = "" ;
      gxTv_SdtSDTMaquinas_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTMaquinas_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTMaquinas_N ;
   }

   public app.SdtSDTMaquinas Clone( )
   {
      return (app.SdtSDTMaquinas)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTMaquinas struct )
   {
      setgxTv_SdtSDTMaquinas_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTMaquinas_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDTMaquinas_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTMaquinas_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTMaquinas getStruct( )
   {
      app.StructSdtSDTMaquinas struct = new app.StructSdtSDTMaquinas ();
      struct.setMaqcod(getgxTv_SdtSDTMaquinas_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTMaquinas_Maqdsc());
      struct.setKilosproduccion(getgxTv_SdtSDTMaquinas_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTMaquinas_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTMaquinas_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinas_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinas_Metrosproduccion ;
   protected String gxTv_SdtSDTMaquinas_Maqcod ;
   protected String gxTv_SdtSDTMaquinas_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

