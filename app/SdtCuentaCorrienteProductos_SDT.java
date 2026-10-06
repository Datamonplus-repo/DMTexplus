package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCuentaCorrienteProductos_SDT extends GxUserType
{
   public SdtCuentaCorrienteProductos_SDT( )
   {
      this(  new ModelContext(SdtCuentaCorrienteProductos_SDT.class));
   }

   public SdtCuentaCorrienteProductos_SDT( ModelContext context )
   {
      super( context, "SdtCuentaCorrienteProductos_SDT");
   }

   public SdtCuentaCorrienteProductos_SDT( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtCuentaCorrienteProductos_SDT");
   }

   public SdtCuentaCorrienteProductos_SDT( StructSdtCuentaCorrienteProductos_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ComprasT") )
            {
               gxTv_SdtCuentaCorrienteProductos_SDT_Comprast = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ConsumosT") )
            {
               gxTv_SdtCuentaCorrienteProductos_SDT_Consumost = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevolucionesT") )
            {
               gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtCuentaCorrienteProductos_SDT_Level1 == null )
               {
                  gxTv_SdtCuentaCorrienteProductos_SDT_Level1 = new app.SdtCuentaCorrienteProductos_SDT_Level1(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtCuentaCorrienteProductos_SDT_Level1.readxml(oReader, "Level1") ;
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
         sName = "CuentaCorrienteProductos_SDT" ;
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
      oWriter.writeElement("ComprasT", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos_SDT_Comprast, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ConsumosT", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos_SDT_Consumost, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevolucionesT", GXutil.trim( GXutil.strNoRound( gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtCuentaCorrienteProductos_SDT_Level1 != null )
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
         gxTv_SdtCuentaCorrienteProductos_SDT_Level1.writexml(oWriter, "Level1", sNameSpace1);
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
      AddObjectProperty("ComprasT", gxTv_SdtCuentaCorrienteProductos_SDT_Comprast, false, false);
      AddObjectProperty("ConsumosT", gxTv_SdtCuentaCorrienteProductos_SDT_Consumost, false, false);
      AddObjectProperty("DevolucionesT", gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest, false, false);
      if ( gxTv_SdtCuentaCorrienteProductos_SDT_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtCuentaCorrienteProductos_SDT_Level1, false, false);
      }
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos_SDT_Comprast( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Comprast ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Comprast( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Comprast = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos_SDT_Consumost( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Consumost ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Consumost( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Consumost = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest( java.math.BigDecimal value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest = value ;
   }

   public app.SdtCuentaCorrienteProductos_SDT_Level1 getgxTv_SdtCuentaCorrienteProductos_SDT_Level1( )
   {
      if ( gxTv_SdtCuentaCorrienteProductos_SDT_Level1 == null )
      {
         gxTv_SdtCuentaCorrienteProductos_SDT_Level1 = new app.SdtCuentaCorrienteProductos_SDT_Level1(remoteHandle, context);
      }
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1 ;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Level1( app.SdtCuentaCorrienteProductos_SDT_Level1 value )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(0) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1 = value;
   }

   public void setgxTv_SdtCuentaCorrienteProductos_SDT_Level1_SetNull( )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1 = (app.SdtCuentaCorrienteProductos_SDT_Level1)null;
   }

   public boolean getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_IsNull( )
   {
      if ( gxTv_SdtCuentaCorrienteProductos_SDT_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtCuentaCorrienteProductos_SDT_Level1_N( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCuentaCorrienteProductos_SDT_Comprast = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos_SDT_N = (byte)(1) ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Consumost = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest = DecimalUtil.ZERO ;
      gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtCuentaCorrienteProductos_SDT_N ;
   }

   public app.SdtCuentaCorrienteProductos_SDT Clone( )
   {
      return (app.SdtCuentaCorrienteProductos_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtCuentaCorrienteProductos_SDT struct )
   {
      setgxTv_SdtCuentaCorrienteProductos_SDT_Comprast(struct.getComprast());
      setgxTv_SdtCuentaCorrienteProductos_SDT_Consumost(struct.getConsumost());
      setgxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest(struct.getDevolucionest());
      setgxTv_SdtCuentaCorrienteProductos_SDT_Level1(new app.SdtCuentaCorrienteProductos_SDT_Level1(struct.getLevel1()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtCuentaCorrienteProductos_SDT getStruct( )
   {
      app.StructSdtCuentaCorrienteProductos_SDT struct = new app.StructSdtCuentaCorrienteProductos_SDT ();
      struct.setComprast(getgxTv_SdtCuentaCorrienteProductos_SDT_Comprast());
      struct.setConsumost(getgxTv_SdtCuentaCorrienteProductos_SDT_Consumost());
      struct.setDevolucionest(getgxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest());
      struct.setLevel1(getgxTv_SdtCuentaCorrienteProductos_SDT_Level1().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtCuentaCorrienteProductos_SDT_N ;
   protected byte gxTv_SdtCuentaCorrienteProductos_SDT_Level1_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Comprast ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Consumost ;
   protected java.math.BigDecimal gxTv_SdtCuentaCorrienteProductos_SDT_Devolucionest ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected app.SdtCuentaCorrienteProductos_SDT_Level1 gxTv_SdtCuentaCorrienteProductos_SDT_Level1=null ;
}

