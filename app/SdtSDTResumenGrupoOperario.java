package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTResumenGrupoOperario extends GxUserType
{
   public SdtSDTResumenGrupoOperario( )
   {
      this(  new ModelContext(SdtSDTResumenGrupoOperario.class));
   }

   public SdtSDTResumenGrupoOperario( ModelContext context )
   {
      super( context, "SdtSDTResumenGrupoOperario");
   }

   public SdtSDTResumenGrupoOperario( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTResumenGrupoOperario");
   }

   public SdtSDTResumenGrupoOperario( StructSdtSDTResumenGrupoOperario struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "GruOpeCod") )
            {
               gxTv_SdtSDTResumenGrupoOperario_Gruopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OpeNom") )
            {
               gxTv_SdtSDTResumenGrupoOperario_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosProduccion") )
            {
               gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTResumenGrupoOperario" ;
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
      oWriter.writeElement("GruOpeCod", GXutil.trim( GXutil.str( gxTv_SdtSDTResumenGrupoOperario_Gruopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OpeNom", gxTv_SdtSDTResumenGrupoOperario_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("GruOpeCod", gxTv_SdtSDTResumenGrupoOperario_Gruopecod, false, false);
      AddObjectProperty("OpeNom", gxTv_SdtSDTResumenGrupoOperario_Openom, false, false);
      AddObjectProperty("KilosProduccion", gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion, false, false);
   }

   public int getgxTv_SdtSDTResumenGrupoOperario_Gruopecod( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Gruopecod ;
   }

   public void setgxTv_SdtSDTResumenGrupoOperario_Gruopecod( int value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Gruopecod = value ;
   }

   public String getgxTv_SdtSDTResumenGrupoOperario_Openom( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Openom ;
   }

   public void setgxTv_SdtSDTResumenGrupoOperario_Openom( String value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Openom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTResumenGrupoOperario_Kilosproduccion( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTResumenGrupoOperario_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTResumenGrupoOperario_Metrosproduccion( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTResumenGrupoOperario_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(0) ;
      gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTResumenGrupoOperario_N = (byte)(1) ;
      gxTv_SdtSDTResumenGrupoOperario_Openom = "" ;
      gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTResumenGrupoOperario_N ;
   }

   public app.SdtSDTResumenGrupoOperario Clone( )
   {
      return (app.SdtSDTResumenGrupoOperario)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTResumenGrupoOperario struct )
   {
      setgxTv_SdtSDTResumenGrupoOperario_Gruopecod(struct.getGruopecod());
      setgxTv_SdtSDTResumenGrupoOperario_Openom(struct.getOpenom());
      setgxTv_SdtSDTResumenGrupoOperario_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTResumenGrupoOperario_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTResumenGrupoOperario getStruct( )
   {
      app.StructSdtSDTResumenGrupoOperario struct = new app.StructSdtSDTResumenGrupoOperario ();
      struct.setGruopecod(getgxTv_SdtSDTResumenGrupoOperario_Gruopecod());
      struct.setOpenom(getgxTv_SdtSDTResumenGrupoOperario_Openom());
      struct.setKilosproduccion(getgxTv_SdtSDTResumenGrupoOperario_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTResumenGrupoOperario_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTResumenGrupoOperario_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTResumenGrupoOperario_Gruopecod ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenGrupoOperario_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTResumenGrupoOperario_Metrosproduccion ;
   protected String gxTv_SdtSDTResumenGrupoOperario_Openom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

