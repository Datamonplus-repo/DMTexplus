package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTOperarios extends GxUserType
{
   public SdtSDTOperarios( )
   {
      this(  new ModelContext(SdtSDTOperarios.class));
   }

   public SdtSDTOperarios( ModelContext context )
   {
      super( context, "SdtSDTOperarios");
   }

   public SdtSDTOperarios( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTOperarios");
   }

   public SdtSDTOperarios( StructSdtSDTOperarios struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeCod") )
            {
               gxTv_SdtSDTOperarios_Opecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeNom") )
            {
               gxTv_SdtSDTOperarios_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosProduccion") )
            {
               gxTv_SdtSDTOperarios_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTOperarios_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTOperarios" ;
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
      oWriter.writeElement("OpeCod", GXutil.trim( GXutil.str( gxTv_SdtSDTOperarios_Opecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeNom", gxTv_SdtSDTOperarios_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTOperarios_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTOperarios_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("OpeCod", gxTv_SdtSDTOperarios_Opecod, false, false);
      AddObjectProperty("OpeNom", gxTv_SdtSDTOperarios_Openom, false, false);
      AddObjectProperty("KilosProduccion", gxTv_SdtSDTOperarios_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTOperarios_Metrosproduccion, false, false);
   }

   public int getgxTv_SdtSDTOperarios_Opecod( )
   {
      return gxTv_SdtSDTOperarios_Opecod ;
   }

   public void setgxTv_SdtSDTOperarios_Opecod( int value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Opecod = value ;
   }

   public String getgxTv_SdtSDTOperarios_Openom( )
   {
      return gxTv_SdtSDTOperarios_Openom ;
   }

   public void setgxTv_SdtSDTOperarios_Openom( String value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Openom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTOperarios_Kilosproduccion( )
   {
      return gxTv_SdtSDTOperarios_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTOperarios_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTOperarios_Metrosproduccion( )
   {
      return gxTv_SdtSDTOperarios_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTOperarios_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTOperarios_N = (byte)(0) ;
      gxTv_SdtSDTOperarios_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTOperarios_N = (byte)(1) ;
      gxTv_SdtSDTOperarios_Openom = "" ;
      gxTv_SdtSDTOperarios_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTOperarios_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTOperarios_N ;
   }

   public app.SdtSDTOperarios Clone( )
   {
      return (app.SdtSDTOperarios)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTOperarios struct )
   {
      setgxTv_SdtSDTOperarios_Opecod(struct.getOpecod());
      setgxTv_SdtSDTOperarios_Openom(struct.getOpenom());
      setgxTv_SdtSDTOperarios_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTOperarios_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTOperarios getStruct( )
   {
      app.StructSdtSDTOperarios struct = new app.StructSdtSDTOperarios ();
      struct.setOpecod(getgxTv_SdtSDTOperarios_Opecod());
      struct.setOpenom(getgxTv_SdtSDTOperarios_Openom());
      struct.setKilosproduccion(getgxTv_SdtSDTOperarios_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTOperarios_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTOperarios_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTOperarios_Opecod ;
   protected java.math.BigDecimal gxTv_SdtSDTOperarios_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTOperarios_Metrosproduccion ;
   protected String gxTv_SdtSDTOperarios_Openom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

