package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosMaquina extends GxUserType
{
   public SdtSDTHistoricoReoperadosMaquina( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosMaquina.class));
   }

   public SdtSDTHistoricoReoperadosMaquina( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosMaquina");
   }

   public SdtSDTHistoricoReoperadosMaquina( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosMaquina");
   }

   public SdtSDTHistoricoReoperadosMaquina( StructSdtSDTHistoricoReoperadosMaquina struct )
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
               gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TiposdeDefectos") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto>(app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto.class, "SDTHistoricoReoperadosMaquina.TipoDefecto", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos.readxmlcollection(oReader, "TiposdeDefectos", "TipoDefecto") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TiposdeDefectos") )
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
         sName = "SDTHistoricoReoperadosMaquina" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos != null )
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
         gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos.writexmlcollection(oWriter, "TiposdeDefectos", sNameSpace1, "TipoDefecto", sNameSpace1);
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos != null )
      {
         AddObjectProperty("TiposdeDefectos", gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos, false, false);
      }
   }

   public String getgxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto> getgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos == null )
      {
         gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto>(app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto.class, "SDTHistoricoReoperadosMaquina.TipoDefecto", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos( GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto> value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_N ;
   }

   public app.SdtSDTHistoricoReoperadosMaquina Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosMaquina)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosMaquina struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto> gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto>(app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto.class, "SDTHistoricoReoperadosMaquina.TipoDefecto", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto> gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux1 = struct.getTiposdedefectos();
      if (gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux.add(new app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto(gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos(gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosMaquina getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosMaquina struct = new app.StructSdtSDTHistoricoReoperadosMaquina ();
      struct.setMaqcod(getgxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc());
      struct.setTiposdedefectos(getgxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_Maqcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto> gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto> gxTv_SdtSDTHistoricoReoperadosMaquina_Tiposdedefectos=null ;
}

