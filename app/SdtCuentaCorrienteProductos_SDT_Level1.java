package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCuentaCorrienteProductos_SDT_Level1 extends GxUserType
{
   public SdtCuentaCorrienteProductos_SDT_Level1( )
   {
      this(  new ModelContext(SdtCuentaCorrienteProductos_SDT_Level1.class));
   }

   public SdtCuentaCorrienteProductos_SDT_Level1( ModelContext context )
   {
      super( context, "SdtCuentaCorrienteProductos_SDT_Level1");
   }

   public SdtCuentaCorrienteProductos_SDT_Level1( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtCuentaCorrienteProductos_SDT_Level1");
   }

   public SdtCuentaCorrienteProductos_SDT_Level1( StructSdtCuentaCorrienteProductos_SDT_Level1 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Compras") )
            {
               gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Consumos") )
            {
               gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Devoluciones") )
            {
               gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "CuentaCorrienteProductos_SDT.Level1" ;
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
      oWriter.writeElement("Compras", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Consumos", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Devoluciones", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones, 12, 4)));
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
      AddObjectProperty("Compras", gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras, false, false);
      AddObjectProperty("Consumos", gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos, false, false);
      AddObjectProperty("Devoluciones", gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N ;
   }

   public app.SdtCuentaCorrienteProductos_SDT_Level1 Clone( )
   {
      return (app.SdtCuentaCorrienteProductos_SDT_Level1)(clone()) ;
   }

   public void setStruct( app.StructSdtCuentaCorrienteProductos_SDT_Level1 struct )
   {
      setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras(struct.getCompras());
      setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos(struct.getConsumos());
      setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones(struct.getDevoluciones());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtCuentaCorrienteProductos_SDT_Level1 getStruct( )
   {
      app.StructSdtCuentaCorrienteProductos_SDT_Level1 struct = new app.StructSdtCuentaCorrienteProductos_SDT_Level1 ();
      struct.setCompras(getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras());
      struct.setConsumos(getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos());
      struct.setDevoluciones(getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones());
      return struct ;
   }

   protected byte gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Compras ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Consumos ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Level1_Devoluciones ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

