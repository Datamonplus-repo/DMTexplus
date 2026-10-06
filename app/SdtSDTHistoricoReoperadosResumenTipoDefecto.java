package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenTipoDefecto extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenTipoDefecto( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenTipoDefecto.class));
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenTipoDefecto");
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenTipoDefecto");
   }

   public SdtSDTHistoricoReoperadosResumenTipoDefecto( StructSdtSDTHistoricoReoperadosResumenTipoDefecto struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefcod") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefdsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maquinas") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas.readxmlcollection(oReader, "Maquinas", "Maquina") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Maquinas") )
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
         sName = "SDTHistoricoReoperadosResumenTipoDefecto" ;
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
      oWriter.writeElement("TipDefcod", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefdsc", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas != null )
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
         gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas.writexmlcollection(oWriter, "Maquinas", sNameSpace1, "Maquina", sNameSpace1);
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
      AddObjectProperty("TipDefcod", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod, false, false);
      AddObjectProperty("TipDefdsc", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas != null )
      {
         AddObjectProperty("Maquinas", gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas, false, false);
      }
   }

   public short getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas == null )
      {
         gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas( GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenTipoDefecto Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenTipoDefecto)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc(struct.getTipdefdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina>(app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina.class, "SDTHistoricoReoperadosResumenTipoDefecto.Maquina", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux1 = struct.getMaquinas();
      if (gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux.add(new app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina(gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas(gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto struct = new app.StructSdtSDTHistoricoReoperadosResumenTipoDefecto ();
      struct.setTipdefcod(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc());
      struct.setMaquinas(getgxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquina> gxTv_SdtSDTHistoricoReoperadosResumenTipoDefecto_Maquinas=null ;
}

