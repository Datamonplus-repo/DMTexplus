package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionMaquinasTurnos extends GxUserType
{
   public SdtSDTProduccionMaquinasTurnos( )
   {
      this(  new ModelContext(SdtSDTProduccionMaquinasTurnos.class));
   }

   public SdtSDTProduccionMaquinasTurnos( ModelContext context )
   {
      super( context, "SdtSDTProduccionMaquinasTurnos");
   }

   public SdtSDTProduccionMaquinasTurnos( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionMaquinasTurnos");
   }

   public SdtSDTProduccionMaquinasTurnos( StructSdtSDTProduccionMaquinasTurnos struct )
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
               gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Turnos") )
            {
               if ( gxTv_SdtSDTProduccionMaquinasTurnos_Turnos == null )
               {
                  gxTv_SdtSDTProduccionMaquinasTurnos_Turnos = new GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem>(app.SdtSDTProduccionMaquinasTurnos_TurnosItem.class, "SDTProduccionMaquinasTurnos.TurnosItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTProduccionMaquinasTurnos_Turnos.readxmlcollection(oReader, "Turnos", "TurnosItem") ;
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
         sName = "SDTProduccionMaquinasTurnos" ;
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
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTProduccionMaquinasTurnos_Turnos != null )
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
         gxTv_SdtSDTProduccionMaquinasTurnos_Turnos.writexmlcollection(oWriter, "Turnos", sNameSpace1, "TurnosItem", sNameSpace1);
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
      AddObjectProperty("MaqDsc", gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc, false, false);
      if ( gxTv_SdtSDTProduccionMaquinasTurnos_Turnos != null )
      {
         AddObjectProperty("Turnos", gxTv_SdtSDTProduccionMaquinasTurnos_Turnos, false, false);
      }
   }

   public String getgxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc( String value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem> getgxTv_SdtSDTProduccionMaquinasTurnos_Turnos( )
   {
      if ( gxTv_SdtSDTProduccionMaquinasTurnos_Turnos == null )
      {
         gxTv_SdtSDTProduccionMaquinasTurnos_Turnos = new GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem>(app.SdtSDTProduccionMaquinasTurnos_TurnosItem.class, "SDTProduccionMaquinasTurnos.TurnosItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_N = (byte)(0) ;
      return gxTv_SdtSDTProduccionMaquinasTurnos_Turnos ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasTurnos_Turnos( GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem> value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos = value ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasTurnos_Turnos_SetNull( )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N = (byte)(1) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos = null ;
   }

   public boolean getgxTv_SdtSDTProduccionMaquinasTurnos_Turnos_IsNull( )
   {
      if ( gxTv_SdtSDTProduccionMaquinasTurnos_Turnos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc = "" ;
      gxTv_SdtSDTProduccionMaquinasTurnos_N = (byte)(1) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_N ;
   }

   public app.SdtSDTProduccionMaquinasTurnos Clone( )
   {
      return (app.SdtSDTProduccionMaquinasTurnos)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionMaquinasTurnos struct )
   {
      setgxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem> gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux = new GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem>(app.SdtSDTProduccionMaquinasTurnos_TurnosItem.class, "SDTProduccionMaquinasTurnos.TurnosItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem> gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux1 = struct.getTurnos();
      if (gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux1.size(); i++)
         {
            gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux.add(new app.SdtSDTProduccionMaquinasTurnos_TurnosItem(gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTProduccionMaquinasTurnos_Turnos(gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionMaquinasTurnos getStruct( )
   {
      app.StructSdtSDTProduccionMaquinasTurnos struct = new app.StructSdtSDTProduccionMaquinasTurnos ();
      struct.setMaqdsc(getgxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc());
      struct.setTurnos(getgxTv_SdtSDTProduccionMaquinasTurnos_Turnos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_N ;
   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTProduccionMaquinasTurnos_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem> gxTv_SdtSDTProduccionMaquinasTurnos_Turnos_aux ;
   protected GXBaseCollection<app.SdtSDTProduccionMaquinasTurnos_TurnosItem> gxTv_SdtSDTProduccionMaquinasTurnos_Turnos=null ;
}

