package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTResumenTipoColorante extends GxUserType
{
   public SdtSDTResumenTipoColorante( )
   {
      this(  new ModelContext(SdtSDTResumenTipoColorante.class));
   }

   public SdtSDTResumenTipoColorante( ModelContext context )
   {
      super( context, "SdtSDTResumenTipoColorante");
   }

   public SdtSDTResumenTipoColorante( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTResumenTipoColorante");
   }

   public SdtSDTResumenTipoColorante( StructSdtSDTResumenTipoColorante struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTc") )
            {
               gxTv_SdtSDTResumenTipoColorante_Hisprotc = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColDsc") )
            {
               gxTv_SdtSDTResumenTipoColorante_Tipcoldsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosProduccion") )
            {
               gxTv_SdtSDTResumenTipoColorante_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTResumenTipoColorante_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTResumenTipoColorante" ;
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
      oWriter.writeElement("HisProTc", GXutil.trim( GXutil.str( gxTv_SdtSDTResumenTipoColorante_Hisprotc, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColDsc", gxTv_SdtSDTResumenTipoColorante_Tipcoldsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTResumenTipoColorante_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTResumenTipoColorante_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("HisProTc", gxTv_SdtSDTResumenTipoColorante_Hisprotc, false, false);
      AddObjectProperty("TipColDsc", gxTv_SdtSDTResumenTipoColorante_Tipcoldsc, false, false);
      AddObjectProperty("KilosProduccion", gxTv_SdtSDTResumenTipoColorante_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTResumenTipoColorante_Metrosproduccion, false, false);
   }

   public byte getgxTv_SdtSDTResumenTipoColorante_Hisprotc( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Hisprotc ;
   }

   public void setgxTv_SdtSDTResumenTipoColorante_Hisprotc( byte value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Hisprotc = value ;
   }

   public String getgxTv_SdtSDTResumenTipoColorante_Tipcoldsc( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Tipcoldsc ;
   }

   public void setgxTv_SdtSDTResumenTipoColorante_Tipcoldsc( String value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Tipcoldsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTResumenTipoColorante_Kilosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTResumenTipoColorante_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTResumenTipoColorante_Metrosproduccion( )
   {
      return gxTv_SdtSDTResumenTipoColorante_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTResumenTipoColorante_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTResumenTipoColorante_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTResumenTipoColorante_N = (byte)(1) ;
      gxTv_SdtSDTResumenTipoColorante_Tipcoldsc = "" ;
      gxTv_SdtSDTResumenTipoColorante_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTResumenTipoColorante_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTResumenTipoColorante_N ;
   }

   public app.SdtSDTResumenTipoColorante Clone( )
   {
      return (app.SdtSDTResumenTipoColorante)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTResumenTipoColorante struct )
   {
      setgxTv_SdtSDTResumenTipoColorante_Hisprotc(struct.getHisprotc());
      setgxTv_SdtSDTResumenTipoColorante_Tipcoldsc(struct.getTipcoldsc());
      setgxTv_SdtSDTResumenTipoColorante_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTResumenTipoColorante_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTResumenTipoColorante getStruct( )
   {
      app.StructSdtSDTResumenTipoColorante struct = new app.StructSdtSDTResumenTipoColorante ();
      struct.setHisprotc(getgxTv_SdtSDTResumenTipoColorante_Hisprotc());
      struct.setTipcoldsc(getgxTv_SdtSDTResumenTipoColorante_Tipcoldsc());
      struct.setKilosproduccion(getgxTv_SdtSDTResumenTipoColorante_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTResumenTipoColorante_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTResumenTipoColorante_Hisprotc ;
   protected byte gxTv_SdtSDTResumenTipoColorante_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoColorante_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenTipoColorante_Metrosproduccion ;
   protected String gxTv_SdtSDTResumenTipoColorante_Tipcoldsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

