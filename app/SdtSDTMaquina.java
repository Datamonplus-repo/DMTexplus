package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTMaquina extends GxUserType
{
   public SdtSDTMaquina( )
   {
      this(  new ModelContext(SdtSDTMaquina.class));
   }

   public SdtSDTMaquina( ModelContext context )
   {
      super( context, "SdtSDTMaquina");
   }

   public SdtSDTMaquina( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTMaquina");
   }

   public SdtSDTMaquina( StructSdtSDTMaquina struct )
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
               gxTv_SdtSDTMaquina_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTMaquina_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SDTHdrsporMaquina") )
            {
               if ( gxTv_SdtSDTMaquina_Sdthdrspormaquina == null )
               {
                  gxTv_SdtSDTMaquina_Sdthdrspormaquina = new GXBaseCollection<app.SdtSDTHdrsporMaquina>(app.SdtSDTHdrsporMaquina.class, "SDTHdrsporMaquina", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTMaquina_Sdthdrspormaquina.readxmlcollection(oReader, "SDTHdrsporMaquina", "Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "SDTHdrsporMaquina") )
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
         sName = "SDTMaquina" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTMaquina_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTMaquina_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTMaquina_Sdthdrspormaquina != null )
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
         gxTv_SdtSDTMaquina_Sdthdrspormaquina.writexmlcollection(oWriter, "SDTHdrsporMaquina", sNameSpace1, "Item", sNameSpace1);
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTMaquina_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTMaquina_Maqdsc, false, false);
      if ( gxTv_SdtSDTMaquina_Sdthdrspormaquina != null )
      {
         AddObjectProperty("SDTHdrsporMaquina", gxTv_SdtSDTMaquina_Sdthdrspormaquina, false, false);
      }
   }

   public String getgxTv_SdtSDTMaquina_Maqcod( )
   {
      return gxTv_SdtSDTMaquina_Maqcod ;
   }

   public void setgxTv_SdtSDTMaquina_Maqcod( String value )
   {
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_Maqcod = value ;
   }

   public String getgxTv_SdtSDTMaquina_Maqdsc( )
   {
      return gxTv_SdtSDTMaquina_Maqdsc ;
   }

   public void setgxTv_SdtSDTMaquina_Maqdsc( String value )
   {
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHdrsporMaquina> getgxTv_SdtSDTMaquina_Sdthdrspormaquina( )
   {
      if ( gxTv_SdtSDTMaquina_Sdthdrspormaquina == null )
      {
         gxTv_SdtSDTMaquina_Sdthdrspormaquina = new GXBaseCollection<app.SdtSDTHdrsporMaquina>(app.SdtSDTHdrsporMaquina.class, "SDTHdrsporMaquina", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTMaquina_Sdthdrspormaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTMaquina_Sdthdrspormaquina ;
   }

   public void setgxTv_SdtSDTMaquina_Sdthdrspormaquina( GXBaseCollection<app.SdtSDTHdrsporMaquina> value )
   {
      gxTv_SdtSDTMaquina_Sdthdrspormaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_N = (byte)(0) ;
      gxTv_SdtSDTMaquina_Sdthdrspormaquina = value ;
   }

   public void setgxTv_SdtSDTMaquina_Sdthdrspormaquina_SetNull( )
   {
      gxTv_SdtSDTMaquina_Sdthdrspormaquina_N = (byte)(1) ;
      gxTv_SdtSDTMaquina_Sdthdrspormaquina = null ;
   }

   public boolean getgxTv_SdtSDTMaquina_Sdthdrspormaquina_IsNull( )
   {
      if ( gxTv_SdtSDTMaquina_Sdthdrspormaquina == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTMaquina_Sdthdrspormaquina_N( )
   {
      return gxTv_SdtSDTMaquina_Sdthdrspormaquina_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTMaquina_Maqcod = "" ;
      gxTv_SdtSDTMaquina_N = (byte)(1) ;
      gxTv_SdtSDTMaquina_Maqdsc = "" ;
      gxTv_SdtSDTMaquina_Sdthdrspormaquina_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTMaquina_N ;
   }

   public app.SdtSDTMaquina Clone( )
   {
      return (app.SdtSDTMaquina)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTMaquina struct )
   {
      setgxTv_SdtSDTMaquina_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTMaquina_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTHdrsporMaquina> gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux = new GXBaseCollection<app.SdtSDTHdrsporMaquina>(app.SdtSDTHdrsporMaquina.class, "SDTHdrsporMaquina", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHdrsporMaquina> gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux1 = struct.getSdthdrspormaquina();
      if (gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux1.size(); i++)
         {
            gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux.add(new app.SdtSDTHdrsporMaquina(gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTMaquina_Sdthdrspormaquina(gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTMaquina getStruct( )
   {
      app.StructSdtSDTMaquina struct = new app.StructSdtSDTMaquina ();
      struct.setMaqcod(getgxTv_SdtSDTMaquina_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTMaquina_Maqdsc());
      struct.setSdthdrspormaquina(getgxTv_SdtSDTMaquina_Sdthdrspormaquina().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTMaquina_N ;
   protected byte gxTv_SdtSDTMaquina_Sdthdrspormaquina_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTMaquina_Maqcod ;
   protected String gxTv_SdtSDTMaquina_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHdrsporMaquina> gxTv_SdtSDTMaquina_Sdthdrspormaquina_aux ;
   protected GXBaseCollection<app.SdtSDTHdrsporMaquina> gxTv_SdtSDTMaquina_Sdthdrspormaquina=null ;
}

