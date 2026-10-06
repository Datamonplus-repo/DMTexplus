package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionParosResumen extends GxUserType
{
   public SdtSDTProduccionParosResumen( )
   {
      this(  new ModelContext(SdtSDTProduccionParosResumen.class));
   }

   public SdtSDTProduccionParosResumen( ModelContext context )
   {
      super( context, "SdtSDTProduccionParosResumen");
   }

   public SdtSDTProduccionParosResumen( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionParosResumen");
   }

   public SdtSDTProduccionParosResumen( StructSdtSDTProduccionParosResumen struct )
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
               gxTv_SdtSDTProduccionParosResumen_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTProduccionParosResumen_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Paros") )
            {
               if ( gxTv_SdtSDTProduccionParosResumen_Paros == null )
               {
                  gxTv_SdtSDTProduccionParosResumen_Paros = new GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem>(app.SdtSDTProduccionParosResumen_ParosItem.class, "SDTProduccionParosResumen.ParosItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTProduccionParosResumen_Paros.readxmlcollection(oReader, "Paros", "ParosItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Paros") )
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
         sName = "SDTProduccionParosResumen" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTProduccionParosResumen_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTProduccionParosResumen_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTProduccionParosResumen_Paros != null )
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
         gxTv_SdtSDTProduccionParosResumen_Paros.writexmlcollection(oWriter, "Paros", sNameSpace1, "ParosItem", sNameSpace1);
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTProduccionParosResumen_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTProduccionParosResumen_Maqdsc, false, false);
      if ( gxTv_SdtSDTProduccionParosResumen_Paros != null )
      {
         AddObjectProperty("Paros", gxTv_SdtSDTProduccionParosResumen_Paros, false, false);
      }
   }

   public String getgxTv_SdtSDTProduccionParosResumen_Maqcod( )
   {
      return gxTv_SdtSDTProduccionParosResumen_Maqcod ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_Maqcod( String value )
   {
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_Maqcod = value ;
   }

   public String getgxTv_SdtSDTProduccionParosResumen_Maqdsc( )
   {
      return gxTv_SdtSDTProduccionParosResumen_Maqdsc ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_Maqdsc( String value )
   {
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem> getgxTv_SdtSDTProduccionParosResumen_Paros( )
   {
      if ( gxTv_SdtSDTProduccionParosResumen_Paros == null )
      {
         gxTv_SdtSDTProduccionParosResumen_Paros = new GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem>(app.SdtSDTProduccionParosResumen_ParosItem.class, "SDTProduccionParosResumen.ParosItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTProduccionParosResumen_Paros_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      return gxTv_SdtSDTProduccionParosResumen_Paros ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_Paros( GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem> value )
   {
      gxTv_SdtSDTProduccionParosResumen_Paros_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_Paros = value ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_Paros_SetNull( )
   {
      gxTv_SdtSDTProduccionParosResumen_Paros_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParosResumen_Paros = null ;
   }

   public boolean getgxTv_SdtSDTProduccionParosResumen_Paros_IsNull( )
   {
      if ( gxTv_SdtSDTProduccionParosResumen_Paros == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTProduccionParosResumen_Paros_N( )
   {
      return gxTv_SdtSDTProduccionParosResumen_Paros_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionParosResumen_Maqcod = "" ;
      gxTv_SdtSDTProduccionParosResumen_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParosResumen_Maqdsc = "" ;
      gxTv_SdtSDTProduccionParosResumen_Paros_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionParosResumen_N ;
   }

   public app.SdtSDTProduccionParosResumen Clone( )
   {
      return (app.SdtSDTProduccionParosResumen)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionParosResumen struct )
   {
      setgxTv_SdtSDTProduccionParosResumen_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTProduccionParosResumen_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem> gxTv_SdtSDTProduccionParosResumen_Paros_aux = new GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem>(app.SdtSDTProduccionParosResumen_ParosItem.class, "SDTProduccionParosResumen.ParosItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTProduccionParosResumen_ParosItem> gxTv_SdtSDTProduccionParosResumen_Paros_aux1 = struct.getParos();
      if (gxTv_SdtSDTProduccionParosResumen_Paros_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTProduccionParosResumen_Paros_aux1.size(); i++)
         {
            gxTv_SdtSDTProduccionParosResumen_Paros_aux.add(new app.SdtSDTProduccionParosResumen_ParosItem(gxTv_SdtSDTProduccionParosResumen_Paros_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTProduccionParosResumen_Paros(gxTv_SdtSDTProduccionParosResumen_Paros_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionParosResumen getStruct( )
   {
      app.StructSdtSDTProduccionParosResumen struct = new app.StructSdtSDTProduccionParosResumen ();
      struct.setMaqcod(getgxTv_SdtSDTProduccionParosResumen_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTProduccionParosResumen_Maqdsc());
      struct.setParos(getgxTv_SdtSDTProduccionParosResumen_Paros().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionParosResumen_N ;
   protected byte gxTv_SdtSDTProduccionParosResumen_Paros_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTProduccionParosResumen_Maqcod ;
   protected String gxTv_SdtSDTProduccionParosResumen_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem> gxTv_SdtSDTProduccionParosResumen_Paros_aux ;
   protected GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem> gxTv_SdtSDTProduccionParosResumen_Paros=null ;
}

