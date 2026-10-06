package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTFases extends GxUserType
{
   public SdtSDTFases( )
   {
      this(  new ModelContext(SdtSDTFases.class));
   }

   public SdtSDTFases( ModelContext context )
   {
      super( context, "SdtSDTFases");
   }

   public SdtSDTFases( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTFases");
   }

   public SdtSDTFases( StructSdtSDTFases struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               gxTv_SdtSDTFases_Fase = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSDTFases_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosProduccion") )
            {
               gxTv_SdtSDTFases_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTFases_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTFases" ;
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
      oWriter.writeElement("Fase", gxTv_SdtSDTFases_Fase);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtSDTFases_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTFases_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTFases_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("Fase", gxTv_SdtSDTFases_Fase, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtSDTFases_Fasdsc, false, false);
      AddObjectProperty("KilosProduccion", gxTv_SdtSDTFases_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTFases_Metrosproduccion, false, false);
   }

   public String getgxTv_SdtSDTFases_Fase( )
   {
      return gxTv_SdtSDTFases_Fase ;
   }

   public void setgxTv_SdtSDTFases_Fase( String value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Fase = value ;
   }

   public String getgxTv_SdtSDTFases_Fasdsc( )
   {
      return gxTv_SdtSDTFases_Fasdsc ;
   }

   public void setgxTv_SdtSDTFases_Fasdsc( String value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Fasdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTFases_Kilosproduccion( )
   {
      return gxTv_SdtSDTFases_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTFases_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTFases_Metrosproduccion( )
   {
      return gxTv_SdtSDTFases_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTFases_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTFases_N = (byte)(0) ;
      gxTv_SdtSDTFases_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTFases_Fase = "" ;
      gxTv_SdtSDTFases_N = (byte)(1) ;
      gxTv_SdtSDTFases_Fasdsc = "" ;
      gxTv_SdtSDTFases_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTFases_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTFases_N ;
   }

   public app.SdtSDTFases Clone( )
   {
      return (app.SdtSDTFases)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTFases struct )
   {
      setgxTv_SdtSDTFases_Fase(struct.getFase());
      setgxTv_SdtSDTFases_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSDTFases_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTFases_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTFases getStruct( )
   {
      app.StructSdtSDTFases struct = new app.StructSdtSDTFases ();
      struct.setFase(getgxTv_SdtSDTFases_Fase());
      struct.setFasdsc(getgxTv_SdtSDTFases_Fasdsc());
      struct.setKilosproduccion(getgxTv_SdtSDTFases_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTFases_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTFases_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTFases_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTFases_Metrosproduccion ;
   protected String gxTv_SdtSDTFases_Fase ;
   protected String gxTv_SdtSDTFases_Fasdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

