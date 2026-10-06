package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia extends GxUserType
{
   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia.class));
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia( int remoteHandle ,
                                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRef") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRefDsc") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUni") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesEntradas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesUtilizadas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesLibres") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasEntradas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasUtilizadas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasDisponibles") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia.Referencia" ;
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
      oWriter.writeElement("AlbRef", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRefDsc", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUni", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesEntradas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesUtilizadas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesLibres", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasEntradas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasUtilizadas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasDisponibles", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles, 6, 0)));
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
      AddObjectProperty("AlbRef", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref, false, false);
      AddObjectProperty("AlbRefDsc", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc, false, false);
      AddObjectProperty("AlbRUni", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni, false, false);
      AddObjectProperty("UnidadesEntradas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas, false, false);
      AddObjectProperty("UnidadesUtilizadas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas, false, false);
      AddObjectProperty("UnidadesLibres", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres, false, false);
      AddObjectProperty("PiezasEntradas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas, false, false);
      AddObjectProperty("PiezasUtilizadas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas, false, false);
      AddObjectProperty("PiezasDisponibles", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles, false, false);
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N ;
   }

   public app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia Clone( )
   {
      return (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia struct )
   {
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref(struct.getAlbref());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc(struct.getAlbrefdsc());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni(struct.getAlbruni());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas(struct.getUnidadesentradas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas(struct.getUnidadesutilizadas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres(struct.getUnidadeslibres());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas(struct.getPiezasentradas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas(struct.getPiezasutilizadas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles(struct.getPiezasdisponibles());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia getStruct( )
   {
      app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia struct = new app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia ();
      struct.setAlbref(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref());
      struct.setAlbrefdsc(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc());
      struct.setAlbruni(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni());
      struct.setUnidadesentradas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas());
      struct.setUnidadesutilizadas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas());
      struct.setUnidadeslibres(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres());
      struct.setPiezasentradas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas());
      struct.setPiezasutilizadas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas());
      struct.setPiezasdisponibles(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasentradas ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasutilizadas ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Piezasdisponibles ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesentradas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadesutilizadas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Unidadeslibres ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albref ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albrefdsc ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia_Albruni ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

