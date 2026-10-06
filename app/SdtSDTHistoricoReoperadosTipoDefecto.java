package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosTipoDefecto extends GxUserType
{
   public SdtSDTHistoricoReoperadosTipoDefecto( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosTipoDefecto.class));
   }

   public SdtSDTHistoricoReoperadosTipoDefecto( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosTipoDefecto");
   }

   public SdtSDTHistoricoReoperadosTipoDefecto( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosTipoDefecto");
   }

   public SdtSDTHistoricoReoperadosTipoDefecto( StructSdtSDTHistoricoReoperadosTipoDefecto struct )
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
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clientes") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente>(app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente.class, "SDTHistoricoReoperadosTipoDefecto.Clilente", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes.readxmlcollection(oReader, "Clientes", "Clilente") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Clientes") )
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
         sName = "SDTHistoricoReoperadosTipoDefecto" ;
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
      oWriter.writeElement("TipDefcod", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefDsc", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes != null )
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
         gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes.writexmlcollection(oWriter, "Clientes", sNameSpace1, "Clilente", sNameSpace1);
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
      AddObjectProperty("TipDefcod", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod, false, false);
      AddObjectProperty("TipDefDsc", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes != null )
      {
         AddObjectProperty("Clientes", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes, false, false);
      }
   }

   public short getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente> getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes == null )
      {
         gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente>(app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente.class, "SDTHistoricoReoperadosTipoDefecto.Clilente", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes( GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente> value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N ;
   }

   public app.SdtSDTHistoricoReoperadosTipoDefecto Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosTipoDefecto)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosTipoDefecto struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc(struct.getTipdefdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente>(app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente.class, "SDTHistoricoReoperadosTipoDefecto.Clilente", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux1 = struct.getClientes();
      if (gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux.add(new app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente(gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes(gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosTipoDefecto getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosTipoDefecto struct = new app.StructSdtSDTHistoricoReoperadosTipoDefecto ();
      struct.setTipdefcod(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc());
      struct.setClientes(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clientes=null ;
}

