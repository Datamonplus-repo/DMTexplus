package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtProduccionResumenTurno_SDT extends GxUserType
{
   public SdtProduccionResumenTurno_SDT( )
   {
      this(  new ModelContext(SdtProduccionResumenTurno_SDT.class));
   }

   public SdtProduccionResumenTurno_SDT( ModelContext context )
   {
      super( context, "SdtProduccionResumenTurno_SDT");
   }

   public SdtProduccionResumenTurno_SDT( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtProduccionResumenTurno_SDT");
   }

   public SdtProduccionResumenTurno_SDT( StructSdtProduccionResumenTurno_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtProduccionResumenTurno_SDT_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Turnos") )
            {
               if ( gxTv_SdtProduccionResumenTurno_SDT_Turnos == null )
               {
                  gxTv_SdtProduccionResumenTurno_SDT_Turnos = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem>(app.SdtProduccionResumenTurno_SDT_TurnosItem.class, "ProduccionResumenTurno_SDT.TurnosItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtProduccionResumenTurno_SDT_Turnos.readxmlcollection(oReader, "Turnos", "TurnosItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Turnos") )
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
         sName = "ProduccionResumenTurno_SDT" ;
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
      oWriter.writeElement("MaqDsc", gxTv_SdtProduccionResumenTurno_SDT_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtProduccionResumenTurno_SDT_Turnos != null )
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
         gxTv_SdtProduccionResumenTurno_SDT_Turnos.writexmlcollection(oWriter, "Turnos", sNameSpace1, "TurnosItem", sNameSpace1);
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
      AddObjectProperty("MaqDsc", gxTv_SdtProduccionResumenTurno_SDT_Maqdsc, false, false);
      if ( gxTv_SdtProduccionResumenTurno_SDT_Turnos != null )
      {
         AddObjectProperty("Turnos", gxTv_SdtProduccionResumenTurno_SDT_Turnos, false, false);
      }
   }

   public String getgxTv_SdtProduccionResumenTurno_SDT_Maqdsc( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_Maqdsc ;
   }

   public void setgxTv_SdtProduccionResumenTurno_SDT_Maqdsc( String value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem> getgxTv_SdtProduccionResumenTurno_SDT_Turnos( )
   {
      if ( gxTv_SdtProduccionResumenTurno_SDT_Turnos == null )
      {
         gxTv_SdtProduccionResumenTurno_SDT_Turnos = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem>(app.SdtProduccionResumenTurno_SDT_TurnosItem.class, "ProduccionResumenTurno_SDT.TurnosItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtProduccionResumenTurno_SDT_Turnos_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_N = (byte)(0) ;
      return gxTv_SdtProduccionResumenTurno_SDT_Turnos ;
   }

   public void setgxTv_SdtProduccionResumenTurno_SDT_Turnos( GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem> value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_Turnos_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_Turnos = value ;
   }

   public void setgxTv_SdtProduccionResumenTurno_SDT_Turnos_SetNull( )
   {
      gxTv_SdtProduccionResumenTurno_SDT_Turnos_N = (byte)(1) ;
      gxTv_SdtProduccionResumenTurno_SDT_Turnos = null ;
   }

   public boolean getgxTv_SdtProduccionResumenTurno_SDT_Turnos_IsNull( )
   {
      if ( gxTv_SdtProduccionResumenTurno_SDT_Turnos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtProduccionResumenTurno_SDT_Turnos_N( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_Turnos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtProduccionResumenTurno_SDT_Maqdsc = "" ;
      gxTv_SdtProduccionResumenTurno_SDT_N = (byte)(1) ;
      gxTv_SdtProduccionResumenTurno_SDT_Turnos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_N ;
   }

   public app.SdtProduccionResumenTurno_SDT Clone( )
   {
      return (app.SdtProduccionResumenTurno_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtProduccionResumenTurno_SDT struct )
   {
      setgxTv_SdtProduccionResumenTurno_SDT_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem> gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem>(app.SdtProduccionResumenTurno_SDT_TurnosItem.class, "ProduccionResumenTurno_SDT.TurnosItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtProduccionResumenTurno_SDT_TurnosItem> gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux1 = struct.getTurnos();
      if (gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux1.size(); i++)
         {
            gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux.add(new app.SdtProduccionResumenTurno_SDT_TurnosItem(gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtProduccionResumenTurno_SDT_Turnos(gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtProduccionResumenTurno_SDT getStruct( )
   {
      app.StructSdtProduccionResumenTurno_SDT struct = new app.StructSdtProduccionResumenTurno_SDT ();
      struct.setMaqdsc(getgxTv_SdtProduccionResumenTurno_SDT_Maqdsc());
      struct.setTurnos(getgxTv_SdtProduccionResumenTurno_SDT_Turnos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtProduccionResumenTurno_SDT_N ;
   protected byte gxTv_SdtProduccionResumenTurno_SDT_Turnos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtProduccionResumenTurno_SDT_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem> gxTv_SdtProduccionResumenTurno_SDT_Turnos_aux ;
   protected GXBaseCollection<app.SdtProduccionResumenTurno_SDT_TurnosItem> gxTv_SdtProduccionResumenTurno_SDT_Turnos=null ;
}

