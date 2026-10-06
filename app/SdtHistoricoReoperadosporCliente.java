package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtHistoricoReoperadosporCliente extends GxUserType
{
   public SdtHistoricoReoperadosporCliente( )
   {
      this(  new ModelContext(SdtHistoricoReoperadosporCliente.class));
   }

   public SdtHistoricoReoperadosporCliente( ModelContext context )
   {
      super( context, "SdtHistoricoReoperadosporCliente");
   }

   public SdtHistoricoReoperadosporCliente( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtHistoricoReoperadosporCliente");
   }

   public SdtHistoricoReoperadosporCliente( StructSdtHistoricoReoperadosporCliente struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TiposdeDefectos") )
            {
               if ( gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos == null )
               {
                  gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto>(app.SdtHistoricoReoperadosporCliente_TipodeDefecto.class, "HistoricoReoperadosporCliente.TipodeDefecto", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos.readxmlcollection(oReader, "TiposdeDefectos", "TipodeDefecto") ;
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
         sName = "HistoricoReoperadosporCliente" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtHistoricoReoperadosporCliente_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtHistoricoReoperadosporCliente_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos != null )
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
         gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos.writexmlcollection(oWriter, "TiposdeDefectos", sNameSpace1, "TipodeDefecto", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtHistoricoReoperadosporCliente_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtHistoricoReoperadosporCliente_Clinom, false, false);
      if ( gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos != null )
      {
         AddObjectProperty("TiposdeDefectos", gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos, false, false);
      }
   }

   public int getgxTv_SdtHistoricoReoperadosporCliente_Clicod( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_Clicod ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_Clicod( int value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_Clicod = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_Clinom( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_Clinom ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_Clinom( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_Clinom = value ;
   }

   public GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto> getgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos( )
   {
      if ( gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos == null )
      {
         gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto>(app.SdtHistoricoReoperadosporCliente_TipodeDefecto.class, "HistoricoReoperadosporCliente.TipodeDefecto", "TexplusNET", remoteHandle);
      }
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      return gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos( GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto> value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos = value ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_SetNull( )
   {
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N = (byte)(1) ;
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos = null ;
   }

   public boolean getgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_IsNull( )
   {
      if ( gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtHistoricoReoperadosporCliente_N = (byte)(1) ;
      gxTv_SdtHistoricoReoperadosporCliente_Clinom = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_N ;
   }

   public app.SdtHistoricoReoperadosporCliente Clone( )
   {
      return (app.SdtHistoricoReoperadosporCliente)(clone()) ;
   }

   public void setStruct( app.StructSdtHistoricoReoperadosporCliente struct )
   {
      setgxTv_SdtHistoricoReoperadosporCliente_Clicod(struct.getClicod());
      setgxTv_SdtHistoricoReoperadosporCliente_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto> gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto>(app.SdtHistoricoReoperadosporCliente_TipodeDefecto.class, "HistoricoReoperadosporCliente.TipodeDefecto", "TexplusNET", remoteHandle);
      Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto> gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux1 = struct.getTiposdedefectos();
      if (gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux1.size(); i++)
         {
            gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux.add(new app.SdtHistoricoReoperadosporCliente_TipodeDefecto(gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos(gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtHistoricoReoperadosporCliente getStruct( )
   {
      app.StructSdtHistoricoReoperadosporCliente struct = new app.StructSdtHistoricoReoperadosporCliente ();
      struct.setClicod(getgxTv_SdtHistoricoReoperadosporCliente_Clicod());
      struct.setClinom(getgxTv_SdtHistoricoReoperadosporCliente_Clinom());
      struct.setTiposdedefectos(getgxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtHistoricoReoperadosporCliente_N ;
   protected byte gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtHistoricoReoperadosporCliente_Clicod ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto> gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos_aux ;
   protected GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto> gxTv_SdtHistoricoReoperadosporCliente_Tiposdedefectos=null ;
}

