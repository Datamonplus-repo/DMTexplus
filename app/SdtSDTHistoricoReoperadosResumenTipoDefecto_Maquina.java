package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina.class));
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina");
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina");
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina( StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina struct )
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
               gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TiposArticulos") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos.readxmlcollection(oReader, "TiposArticulos", "TipoArticulo") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TiposArticulos") )
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
         sName = "SDTHistoricoReoperadosResumenTipoDefecto.Maquina" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos != null )
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
         gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos.writexmlcollection(oWriter, "TiposArticulos", sNameSpace1, "TipoArticulo", sNameSpace1);
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos != null )
      {
         AddObjectProperty("TiposArticulos", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos, false, false);
      }
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos == null )
      {
         gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos( GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux1 = struct.getTiposarticulos();
      if (gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux.add(new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo(gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos(gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina struct = new app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina ();
      struct.setMaqcod(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc());
      struct.setTiposarticulos(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_Tiposarticulos=null ;
}

