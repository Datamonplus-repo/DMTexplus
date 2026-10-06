package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item extends GxUserType
{
   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item.class));
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesEntradas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesUtilizadas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesLibres") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasEntradas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasUtilizadas") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasDisponibles") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTInformeAlmacenTejidoCrudo_Cliente.Level1Item" ;
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
      oWriter.writeElement("UnidadesEntradas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesUtilizadas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnidadesLibres", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasEntradas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasUtilizadas", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasDisponibles", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles, 6, 0)));
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
      AddObjectProperty("UnidadesEntradas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas, false, false);
      AddObjectProperty("UnidadesUtilizadas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas, false, false);
      AddObjectProperty("UnidadesLibres", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres, false, false);
      AddObjectProperty("PiezasEntradas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas, false, false);
      AddObjectProperty("PiezasUtilizadas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas, false, false);
      AddObjectProperty("PiezasDisponibles", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas = value ;
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N ;
   }

   public app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item Clone( )
   {
      return (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item struct )
   {
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas(struct.getUnidadesentradas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas(struct.getUnidadesutilizadas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres(struct.getUnidadeslibres());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas(struct.getPiezasentradas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas(struct.getPiezasutilizadas());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles(struct.getPiezasdisponibles());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item getStruct( )
   {
      app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item struct = new app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item ();
      struct.setUnidadesentradas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas());
      struct.setUnidadesutilizadas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas());
      struct.setUnidadeslibres(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres());
      struct.setPiezasentradas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas());
      struct.setPiezasutilizadas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas());
      struct.setPiezasdisponibles(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasentradas ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasutilizadas ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Piezasdisponibles ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesentradas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadesutilizadas ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item_Unidadeslibres ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

