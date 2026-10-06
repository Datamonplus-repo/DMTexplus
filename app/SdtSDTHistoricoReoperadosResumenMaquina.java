package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenMaquina extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenMaquina( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenMaquina.class));
   }

   public SdtSDTHistoricoReoperadosResumenMaquina( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenMaquina");
   }

   public SdtSDTHistoricoReoperadosResumenMaquina( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenMaquina");
   }

   public SdtSDTHistoricoReoperadosResumenMaquina( StructSdtSDTHistoricoReoperadosResumenMaquina struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipoArticulo") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem>(app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem.class, "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo.readxmlcollection(oReader, "TipoArticulo", "TipoArticuloItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TipoArticulo") )
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
         sName = "SDTHistoricoReoperadosResumenMaquina" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo != null )
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
         gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo.writexmlcollection(oWriter, "TipoArticulo", sNameSpace1, "TipoArticuloItem", sNameSpace1);
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo != null )
      {
         AddObjectProperty("TipoArticulo", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo, false, false);
      }
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo == null )
      {
         gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem>(app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem.class, "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo( GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenMaquina Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenMaquina)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenMaquina struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem>(app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem.class, "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux1 = struct.getTipoarticulo();
      if (gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux.add(new app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem(gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo(gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenMaquina getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenMaquina struct = new app.StructSdtSDTHistoricoReoperadosResumenMaquina ();
      struct.setMaqcod(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc());
      struct.setTipoarticulo(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> gxTv_SdtSDTHistoricoReoperadosResumenMaquina_Tipoarticulo=null ;
}

