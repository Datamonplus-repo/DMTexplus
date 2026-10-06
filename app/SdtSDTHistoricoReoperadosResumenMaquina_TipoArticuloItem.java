package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem.class));
   }

   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem");
   }

   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem");
   }

   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtCod") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoColorante") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem>(app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem.class, "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem.TipoColoranteItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante.readxmlcollection(oReader, "TipoColorante", "TipoColoranteItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TipoColorante") )
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
         sName = "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem" ;
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
      oWriter.writeElement("TipArtCod", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtDsc", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante != null )
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
         gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante.writexmlcollection(oWriter, "TipoColorante", sNameSpace1, "TipoColoranteItem", sNameSpace1);
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
      AddObjectProperty("TipArtCod", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod, false, false);
      AddObjectProperty("TipArtDsc", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante != null )
      {
         AddObjectProperty("TipoColorante", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante, false, false);
      }
   }

   public short getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante == null )
      {
         gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem>(app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem.class, "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem.TipoColoranteItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante( GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod(struct.getTipartcod());
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc(struct.getTipartdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem>(app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem.class, "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem.TipoColoranteItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux1 = struct.getTipocolorante();
      if (gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux.add(new app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem(gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante(gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem struct = new app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem ();
      struct.setTipartcod(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod());
      struct.setTipartdsc(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc());
      struct.setTipocolorante(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipartdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_Tipocolorante=null ;
}

