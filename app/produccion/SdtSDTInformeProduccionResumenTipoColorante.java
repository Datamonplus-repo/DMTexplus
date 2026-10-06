package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenTipoColorante extends GxUserType
{
   public SdtSDTInformeProduccionResumenTipoColorante( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenTipoColorante.class));
   }

   public SdtSDTInformeProduccionResumenTipoColorante( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenTipoColorante");
   }

   public SdtSDTInformeProduccionResumenTipoColorante( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenTipoColorante");
   }

   public SdtSDTInformeProduccionResumenTipoColorante( StructSdtSDTInformeProduccionResumenTipoColorante struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoCorante") )
            {
               if ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante == null )
               {
                  gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item>(app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item.class, "SDTInformeProduccionResumenTipoColorante.Item", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante.readxmlcollection(oReader, "TipoCorante", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TipoCorante") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalMt") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalKG") )
            {
               gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenTipoColorante" ;
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
      if ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante != null )
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
         gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante.writexmlcollection(oWriter, "TipoCorante", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeElement("TotalMt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotalKG", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg, 10, 2)));
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
      if ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante != null )
      {
         AddObjectProperty("TipoCorante", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante, false, false);
      }
      AddObjectProperty("TotalMt", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt, false, false);
      AddObjectProperty("TotalKG", gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg, false, false);
   }

   public GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item> getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante == null )
      {
         gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item>(app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item.class, "SDTInformeProduccionResumenTipoColorante.Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante( GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item> value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante = value ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_SetNull( )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante = null ;
   }

   public boolean getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_IsNull( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenTipoColorante_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenTipoColorante Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenTipoColorante)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante struct )
   {
      GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item> gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item>(app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item.class, "SDTInformeProduccionResumenTipoColorante.Item", "TexplusNET", remoteHandle);
      Vector<app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante_Item> gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux1 = struct.getTipocorante();
      if (gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux.add(new app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item(gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante(gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux);
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt(struct.getTotalmt());
      setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg(struct.getTotalkg());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante struct = new app.produccion.StructSdtSDTInformeProduccionResumenTipoColorante ();
      struct.setTipocorante(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante().getStruct());
      struct.setTotalmt(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt());
      struct.setTotalkg(getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenTipoColorante_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item> gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante_aux ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item> gxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante=null ;
}

