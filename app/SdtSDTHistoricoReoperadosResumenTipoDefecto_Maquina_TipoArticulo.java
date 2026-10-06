package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo.class));
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo");
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( int remoteHandle ,
                                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo");
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo( StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisTipArt") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisTipArtDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TiposColorantes") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo.TipoColorante", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes.readxmlcollection(oReader, "TiposColorantes", "TipoColorante") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TiposColorantes") )
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
         sName = "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo" ;
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
      oWriter.writeElement("HisTipArt", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisTipArtDsc", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes != null )
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
         gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes.writexmlcollection(oWriter, "TiposColorantes", sNameSpace1, "TipoColorante", sNameSpace1);
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
      AddObjectProperty("HisTipArt", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart, false, false);
      AddObjectProperty("HisTipArtDsc", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes != null )
      {
         AddObjectProperty("TiposColorantes", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes, false, false);
      }
   }

   public short getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes == null )
      {
         gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo.TipoColorante", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes( GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart(struct.getHistipart());
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc(struct.getHistipartdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina.TipoArticulo.TipoColorante", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux1 = struct.getTiposcolorantes();
      if (gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux.add(new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante(gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes(gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo struct = new app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo ();
      struct.setHistipart(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart());
      struct.setHistipartdsc(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc());
      struct.setTiposcolorantes(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipart ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Histipartdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_TipoColorante> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina_TipoArticulo_Tiposcolorantes=null ;
}

