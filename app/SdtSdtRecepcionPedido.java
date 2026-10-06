package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtRecepcionPedido extends GxUserType
{
   public SdtSdtRecepcionPedido( )
   {
      this(  new ModelContext(SdtSdtRecepcionPedido.class));
   }

   public SdtSdtRecepcionPedido( ModelContext context )
   {
      super( context, "SdtSdtRecepcionPedido");
   }

   public SdtSdtRecepcionPedido( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtRecepcionPedido");
   }

   public SdtSdtRecepcionPedido( StructSdtSdtRecepcionPedido struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod") )
            {
               gxTv_SdtSdtRecepcionPedido_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Piezas") )
            {
               gxTv_SdtSdtRecepcionPedido_Piezas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos") )
            {
               gxTv_SdtSdtRecepcionPedido_Kilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros") )
            {
               gxTv_SdtSdtRecepcionPedido_Metros = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosUti") )
            {
               gxTv_SdtSdtRecepcionPedido_Kilosuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosUti") )
            {
               gxTv_SdtSdtRecepcionPedido_Metrosuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasUti") )
            {
               gxTv_SdtSdtRecepcionPedido_Piezasuti = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Detalle") )
            {
               if ( gxTv_SdtSdtRecepcionPedido_Detalle == null )
               {
                  gxTv_SdtSdtRecepcionPedido_Detalle = new GXBaseCollection<app.SdtSdtPiezasPedido>(app.SdtSdtPiezasPedido.class, "SdtPiezasPedido", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSdtRecepcionPedido_Detalle.readxmlcollection(oReader, "Detalle", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Detalle") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SdtRecepcionPedido" ;
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
      oWriter.writeElement("AlbRecCod", GXutil.trim( GXutil.str( gxTv_SdtSdtRecepcionPedido_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Piezas", GXutil.trim( GXutil.str( gxTv_SdtSdtRecepcionPedido_Piezas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtRecepcionPedido_Kilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metros", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtRecepcionPedido_Metros, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtRecepcionPedido_Kilosuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtSdtRecepcionPedido_Metrosuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasUti", GXutil.trim( GXutil.str( gxTv_SdtSdtRecepcionPedido_Piezasuti, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSdtRecepcionPedido_Detalle != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSdtRecepcionPedido_Detalle.writexmlcollection(oWriter, "Detalle", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("AlbRecCod", gxTv_SdtSdtRecepcionPedido_Albreccod, false, false);
      AddObjectProperty("Piezas", gxTv_SdtSdtRecepcionPedido_Piezas, false, false);
      AddObjectProperty("Kilos", gxTv_SdtSdtRecepcionPedido_Kilos, false, false);
      AddObjectProperty("Metros", gxTv_SdtSdtRecepcionPedido_Metros, false, false);
      AddObjectProperty("KilosUti", gxTv_SdtSdtRecepcionPedido_Kilosuti, false, false);
      AddObjectProperty("MetrosUti", gxTv_SdtSdtRecepcionPedido_Metrosuti, false, false);
      AddObjectProperty("PiezasUti", gxTv_SdtSdtRecepcionPedido_Piezasuti, false, false);
      if ( gxTv_SdtSdtRecepcionPedido_Detalle != null )
      {
         AddObjectProperty("Detalle", gxTv_SdtSdtRecepcionPedido_Detalle, false, false);
      }
   }

   public int getgxTv_SdtSdtRecepcionPedido_Albreccod( )
   {
      return gxTv_SdtSdtRecepcionPedido_Albreccod ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Albreccod( int value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Albreccod = value ;
   }

   public int getgxTv_SdtSdtRecepcionPedido_Piezas( )
   {
      return gxTv_SdtSdtRecepcionPedido_Piezas ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Piezas( int value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Piezas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtRecepcionPedido_Kilos( )
   {
      return gxTv_SdtSdtRecepcionPedido_Kilos ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Kilos( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Kilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtRecepcionPedido_Metros( )
   {
      return gxTv_SdtSdtRecepcionPedido_Metros ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Metros( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Metros = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtRecepcionPedido_Kilosuti( )
   {
      return gxTv_SdtSdtRecepcionPedido_Kilosuti ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Kilosuti( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Kilosuti = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSdtRecepcionPedido_Metrosuti( )
   {
      return gxTv_SdtSdtRecepcionPedido_Metrosuti ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Metrosuti( java.math.BigDecimal value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Metrosuti = value ;
   }

   public short getgxTv_SdtSdtRecepcionPedido_Piezasuti( )
   {
      return gxTv_SdtSdtRecepcionPedido_Piezasuti ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Piezasuti( short value )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Piezasuti = value ;
   }

   public GXBaseCollection<app.SdtSdtPiezasPedido> getgxTv_SdtSdtRecepcionPedido_Detalle( )
   {
      if ( gxTv_SdtSdtRecepcionPedido_Detalle == null )
      {
         gxTv_SdtSdtRecepcionPedido_Detalle = new GXBaseCollection<app.SdtSdtPiezasPedido>(app.SdtSdtPiezasPedido.class, "SdtPiezasPedido", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSdtRecepcionPedido_Detalle_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      return gxTv_SdtSdtRecepcionPedido_Detalle ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Detalle( GXBaseCollection<app.SdtSdtPiezasPedido> value )
   {
      gxTv_SdtSdtRecepcionPedido_Detalle_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_N = (byte)(0) ;
      gxTv_SdtSdtRecepcionPedido_Detalle = value ;
   }

   public void setgxTv_SdtSdtRecepcionPedido_Detalle_SetNull( )
   {
      gxTv_SdtSdtRecepcionPedido_Detalle_N = (byte)(1) ;
      gxTv_SdtSdtRecepcionPedido_Detalle = null ;
   }

   public boolean getgxTv_SdtSdtRecepcionPedido_Detalle_IsNull( )
   {
      if ( gxTv_SdtSdtRecepcionPedido_Detalle == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtRecepcionPedido_Detalle_N( )
   {
      return gxTv_SdtSdtRecepcionPedido_Detalle_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtRecepcionPedido_N = (byte)(1) ;
      gxTv_SdtSdtRecepcionPedido_Kilos = DecimalUtil.ZERO ;
      gxTv_SdtSdtRecepcionPedido_Metros = DecimalUtil.ZERO ;
      gxTv_SdtSdtRecepcionPedido_Kilosuti = DecimalUtil.ZERO ;
      gxTv_SdtSdtRecepcionPedido_Metrosuti = DecimalUtil.ZERO ;
      gxTv_SdtSdtRecepcionPedido_Detalle_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtRecepcionPedido_N ;
   }

   public app.SdtSdtRecepcionPedido Clone( )
   {
      return (app.SdtSdtRecepcionPedido)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtRecepcionPedido struct )
   {
      setgxTv_SdtSdtRecepcionPedido_Albreccod(struct.getAlbreccod());
      setgxTv_SdtSdtRecepcionPedido_Piezas(struct.getPiezas());
      setgxTv_SdtSdtRecepcionPedido_Kilos(struct.getKilos());
      setgxTv_SdtSdtRecepcionPedido_Metros(struct.getMetros());
      setgxTv_SdtSdtRecepcionPedido_Kilosuti(struct.getKilosuti());
      setgxTv_SdtSdtRecepcionPedido_Metrosuti(struct.getMetrosuti());
      setgxTv_SdtSdtRecepcionPedido_Piezasuti(struct.getPiezasuti());
      GXBaseCollection<app.SdtSdtPiezasPedido> gxTv_SdtSdtRecepcionPedido_Detalle_aux = new GXBaseCollection<app.SdtSdtPiezasPedido>(app.SdtSdtPiezasPedido.class, "SdtPiezasPedido", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSdtPiezasPedido> gxTv_SdtSdtRecepcionPedido_Detalle_aux1 = struct.getDetalle();
      if (gxTv_SdtSdtRecepcionPedido_Detalle_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSdtRecepcionPedido_Detalle_aux1.size(); i++)
         {
            gxTv_SdtSdtRecepcionPedido_Detalle_aux.add(new app.SdtSdtPiezasPedido(gxTv_SdtSdtRecepcionPedido_Detalle_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSdtRecepcionPedido_Detalle(gxTv_SdtSdtRecepcionPedido_Detalle_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtRecepcionPedido getStruct( )
   {
      app.StructSdtSdtRecepcionPedido struct = new app.StructSdtSdtRecepcionPedido ();
      struct.setAlbreccod(getgxTv_SdtSdtRecepcionPedido_Albreccod());
      struct.setPiezas(getgxTv_SdtSdtRecepcionPedido_Piezas());
      struct.setKilos(getgxTv_SdtSdtRecepcionPedido_Kilos());
      struct.setMetros(getgxTv_SdtSdtRecepcionPedido_Metros());
      struct.setKilosuti(getgxTv_SdtSdtRecepcionPedido_Kilosuti());
      struct.setMetrosuti(getgxTv_SdtSdtRecepcionPedido_Metrosuti());
      struct.setPiezasuti(getgxTv_SdtSdtRecepcionPedido_Piezasuti());
      struct.setDetalle(getgxTv_SdtSdtRecepcionPedido_Detalle().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSdtRecepcionPedido_N ;
   protected byte gxTv_SdtSdtRecepcionPedido_Detalle_N ;
   protected short gxTv_SdtSdtRecepcionPedido_Piezasuti ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSdtRecepcionPedido_Albreccod ;
   protected int gxTv_SdtSdtRecepcionPedido_Piezas ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Kilos ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Metros ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Kilosuti ;
   protected java.math.BigDecimal gxTv_SdtSdtRecepcionPedido_Metrosuti ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSdtPiezasPedido> gxTv_SdtSdtRecepcionPedido_Detalle_aux ;
   protected GXBaseCollection<app.SdtSdtPiezasPedido> gxTv_SdtSdtRecepcionPedido_Detalle=null ;
}

