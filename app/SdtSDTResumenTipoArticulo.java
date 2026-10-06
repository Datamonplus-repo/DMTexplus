package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTResumenTipoArticulo extends GxUserType
{
   public SdtSDTResumenTipoArticulo( )
   {
      this(  new ModelContext(SdtSDTResumenTipoArticulo.class));
   }

   public SdtSDTResumenTipoArticulo( ModelContext context )
   {
      super( context, "SdtSDTResumenTipoArticulo");
   }

   public SdtSDTResumenTipoArticulo( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTResumenTipoArticulo");
   }

   public SdtSDTResumenTipoArticulo( StructSdtSDTResumenTipoArticulo struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTip") )
            {
               gxTv_SdtSDTResumenTipoArticulo_Hisprotip = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipARtDsc") )
            {
               gxTv_SdtSDTResumenTipoArticulo_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosProduccion") )
            {
               gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTResumenTipoArticulo" ;
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
      oWriter.writeElement("HisProTip", GXutil.trim( GXutil.str( gxTv_SdtSDTResumenTipoArticulo_Hisprotip, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipARtDsc", gxTv_SdtSDTResumenTipoArticulo_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("HisProTip", gxTv_SdtSDTResumenTipoArticulo_Hisprotip, false, false);
      AddObjectProperty("TipARtDsc", gxTv_SdtSDTResumenTipoArticulo_Tipartdsc, false, false);
      AddObjectProperty("KilosProduccion", gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion, false, false);
   }

   public short getgxTv_SdtSDTResumenTipoArticulo_Hisprotip( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Hisprotip ;
   }

   public void setgxTv_SdtSDTResumenTipoArticulo_Hisprotip( short value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Hisprotip = value ;
   }

   public String getgxTv_SdtSDTResumenTipoArticulo_Tipartdsc( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Tipartdsc ;
   }

   public void setgxTv_SdtSDTResumenTipoArticulo_Tipartdsc( String value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Tipartdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTResumenTipoArticulo_Kilosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTResumenTipoArticulo_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTResumenTipoArticulo_Metrosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTResumenTipoArticulo_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTResumenTipoArticulo_N = (byte)(1) ;
      gxTv_SdtSDTResumenTipoArticulo_Tipartdsc = "" ;
      gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTResumenTipoArticulo_N ;
   }

   public app.SdtSDTResumenTipoArticulo Clone( )
   {
      return (app.SdtSDTResumenTipoArticulo)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTResumenTipoArticulo struct )
   {
      setgxTv_SdtSDTResumenTipoArticulo_Hisprotip(struct.getHisprotip());
      setgxTv_SdtSDTResumenTipoArticulo_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtSDTResumenTipoArticulo_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTResumenTipoArticulo_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTResumenTipoArticulo getStruct( )
   {
      app.StructSdtSDTResumenTipoArticulo struct = new app.StructSdtSDTResumenTipoArticulo ();
      struct.setHisprotip(getgxTv_SdtSDTResumenTipoArticulo_Hisprotip());
      struct.setTipartdsc(getgxTv_SdtSDTResumenTipoArticulo_Tipartdsc());
      struct.setKilosproduccion(getgxTv_SdtSDTResumenTipoArticulo_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTResumenTipoArticulo_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTResumenTipoArticulo_N ;
   protected short gxTv_SdtSDTResumenTipoArticulo_Hisprotip ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoArticulo_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoArticulo_Metrosproduccion ;
   protected String gxTv_SdtSDTResumenTipoArticulo_Tipartdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

