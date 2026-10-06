package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenTipoArticulo extends GxUserType
{
   public SdtSDTInformeProduccionResumenTipoArticulo( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenTipoArticulo.class));
   }

   public SdtSDTInformeProduccionResumenTipoArticulo( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenTipoArticulo");
   }

   public SdtSDTInformeProduccionResumenTipoArticulo( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenTipoArticulo");
   }

   public SdtSDTInformeProduccionResumenTipoArticulo( StructSdtSDTInformeProduccionResumenTipoArticulo struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Articulo") )
            {
               if ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo == null )
               {
                  gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem>(app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem.class, "SDTInformeProduccionResumenTipoArticulo.ArticuloItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo.readxmlcollection(oReader, "Articulo", "ArticuloItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Articulo") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalMt") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalKG") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenTipoArticulo" ;
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
      if ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo != null )
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
         gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo.writexmlcollection(oWriter, "Articulo", sNameSpace1, "ArticuloItem", sNameSpace1);
      }
      oWriter.writeElement("TotalMt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotalKG", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg, 10, 2)));
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
      if ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo != null )
      {
         AddObjectProperty("Articulo", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo, false, false);
      }
      AddObjectProperty("TotalMt", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt, false, false);
      AddObjectProperty("TotalKG", gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg, false, false);
   }

   public GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo == null )
      {
         gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem>(app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem.class, "SDTInformeProduccionResumenTipoArticulo.ArticuloItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo( GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo = value ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_SetNull( )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo = null ;
   }

   public boolean getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_IsNull( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenTipoArticulo Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenTipoArticulo)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo struct )
   {
      GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem>(app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem.class, "SDTInformeProduccionResumenTipoArticulo.ArticuloItem", "TexplusNET", remoteHandle);
      Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux1 = struct.getArticulo();
      if (gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux.add(new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem(gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo(gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux);
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt(struct.getTotalmt());
      setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg(struct.getTotalkg());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo struct = new app.produccion.StructSdtSDTInformeProduccionResumenTipoArticulo ();
      struct.setArticulo(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().getStruct());
      struct.setTotalmt(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt());
      struct.setTotalkg(getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoArticulo_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo_aux ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> gxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo=null ;
}

