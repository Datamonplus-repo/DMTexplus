package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionMaquinasFases extends GxUserType
{
   public SdtSDTProduccionMaquinasFases( )
   {
      this(  new ModelContext(SdtSDTProduccionMaquinasFases.class));
   }

   public SdtSDTProduccionMaquinasFases( ModelContext context )
   {
      super( context, "SdtSDTProduccionMaquinasFases");
   }

   public SdtSDTProduccionMaquinasFases( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionMaquinasFases");
   }

   public SdtSDTProduccionMaquinasFases( StructSdtSDTProduccionMaquinasFases struct )
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
               gxTv_SdtSDTProduccionMaquinasFases_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fases") )
            {
               if ( gxTv_SdtSDTProduccionMaquinasFases_Fases == null )
               {
                  gxTv_SdtSDTProduccionMaquinasFases_Fases = new GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem>(app.SdtSDTProduccionMaquinasFases_FasesItem.class, "SDTProduccionMaquinasFases.FasesItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTProduccionMaquinasFases_Fases.readxmlcollection(oReader, "Fases", "FasesItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Fases") )
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
         sName = "SDTProduccionMaquinasFases" ;
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
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTProduccionMaquinasFases_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTProduccionMaquinasFases_Fases != null )
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
         gxTv_SdtSDTProduccionMaquinasFases_Fases.writexmlcollection(oWriter, "Fases", sNameSpace1, "FasesItem", sNameSpace1);
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
      AddObjectProperty("MaqDsc", gxTv_SdtSDTProduccionMaquinasFases_Maqdsc, false, false);
      if ( gxTv_SdtSDTProduccionMaquinasFases_Fases != null )
      {
         AddObjectProperty("Fases", gxTv_SdtSDTProduccionMaquinasFases_Fases, false, false);
      }
   }

   public String getgxTv_SdtSDTProduccionMaquinasFases_Maqdsc( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_Maqdsc ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_Maqdsc( String value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem> getgxTv_SdtSDTProduccionMaquinasFases_Fases( )
   {
      if ( gxTv_SdtSDTProduccionMaquinasFases_Fases == null )
      {
         gxTv_SdtSDTProduccionMaquinasFases_Fases = new GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem>(app.SdtSDTProduccionMaquinasFases_FasesItem.class, "SDTProduccionMaquinasFases.FasesItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTProduccionMaquinasFases_Fases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_N = (byte)(0) ;
      return gxTv_SdtSDTProduccionMaquinasFases_Fases ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_Fases( GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem> value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_Fases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_Fases = value ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_Fases_SetNull( )
   {
      gxTv_SdtSDTProduccionMaquinasFases_Fases_N = (byte)(1) ;
      gxTv_SdtSDTProduccionMaquinasFases_Fases = null ;
   }

   public boolean getgxTv_SdtSDTProduccionMaquinasFases_Fases_IsNull( )
   {
      if ( gxTv_SdtSDTProduccionMaquinasFases_Fases == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTProduccionMaquinasFases_Fases_N( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_Fases_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionMaquinasFases_Maqdsc = "" ;
      gxTv_SdtSDTProduccionMaquinasFases_N = (byte)(1) ;
      gxTv_SdtSDTProduccionMaquinasFases_Fases_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_N ;
   }

   public app.SdtSDTProduccionMaquinasFases Clone( )
   {
      return (app.SdtSDTProduccionMaquinasFases)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionMaquinasFases struct )
   {
      setgxTv_SdtSDTProduccionMaquinasFases_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem> gxTv_SdtSDTProduccionMaquinasFases_Fases_aux = new GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem>(app.SdtSDTProduccionMaquinasFases_FasesItem.class, "SDTProduccionMaquinasFases.FasesItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTProduccionMaquinasFases_FasesItem> gxTv_SdtSDTProduccionMaquinasFases_Fases_aux1 = struct.getFases();
      if (gxTv_SdtSDTProduccionMaquinasFases_Fases_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTProduccionMaquinasFases_Fases_aux1.size(); i++)
         {
            gxTv_SdtSDTProduccionMaquinasFases_Fases_aux.add(new app.SdtSDTProduccionMaquinasFases_FasesItem(gxTv_SdtSDTProduccionMaquinasFases_Fases_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTProduccionMaquinasFases_Fases(gxTv_SdtSDTProduccionMaquinasFases_Fases_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionMaquinasFases getStruct( )
   {
      app.StructSdtSDTProduccionMaquinasFases struct = new app.StructSdtSDTProduccionMaquinasFases ();
      struct.setMaqdsc(getgxTv_SdtSDTProduccionMaquinasFases_Maqdsc());
      struct.setFases(getgxTv_SdtSDTProduccionMaquinasFases_Fases().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasFases_N ;
   protected byte gxTv_SdtSDTProduccionMaquinasFases_Fases_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTProduccionMaquinasFases_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem> gxTv_SdtSDTProduccionMaquinasFases_Fases_aux ;
   protected GXBaseCollection<app.SdtSDTProduccionMaquinasFases_FasesItem> gxTv_SdtSDTProduccionMaquinasFases_Fases=null ;
}

