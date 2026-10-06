package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClientesDefectos extends GxUserType
{
   public SdtSDTClientesDefectos( )
   {
      this(  new ModelContext(SdtSDTClientesDefectos.class));
   }

   public SdtSDTClientesDefectos( ModelContext context )
   {
      super( context, "SdtSDTClientesDefectos");
   }

   public SdtSDTClientesDefectos( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClientesDefectos");
   }

   public SdtSDTClientesDefectos( StructSdtSDTClientesDefectos struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTClientesDefectos_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Defectos") )
            {
               if ( gxTv_SdtSDTClientesDefectos_Defectos == null )
               {
                  gxTv_SdtSDTClientesDefectos_Defectos = new GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem>(app.SdtSDTClientesDefectos_DefectosItem.class, "SDTClientesDefectos.DefectosItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTClientesDefectos_Defectos.readxmlcollection(oReader, "Defectos", "DefectosItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Defectos") )
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
         sName = "SDTClientesDefectos" ;
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
      oWriter.writeElement("CliNom", gxTv_SdtSDTClientesDefectos_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTClientesDefectos_Defectos != null )
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
         gxTv_SdtSDTClientesDefectos_Defectos.writexmlcollection(oWriter, "Defectos", sNameSpace1, "DefectosItem", sNameSpace1);
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
      AddObjectProperty("CliNom", gxTv_SdtSDTClientesDefectos_Clinom, false, false);
      if ( gxTv_SdtSDTClientesDefectos_Defectos != null )
      {
         AddObjectProperty("Defectos", gxTv_SdtSDTClientesDefectos_Defectos, false, false);
      }
   }

   public String getgxTv_SdtSDTClientesDefectos_Clinom( )
   {
      return gxTv_SdtSDTClientesDefectos_Clinom ;
   }

   public void setgxTv_SdtSDTClientesDefectos_Clinom( String value )
   {
      gxTv_SdtSDTClientesDefectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem> getgxTv_SdtSDTClientesDefectos_Defectos( )
   {
      if ( gxTv_SdtSDTClientesDefectos_Defectos == null )
      {
         gxTv_SdtSDTClientesDefectos_Defectos = new GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem>(app.SdtSDTClientesDefectos_DefectosItem.class, "SDTClientesDefectos.DefectosItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTClientesDefectos_Defectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_N = (byte)(0) ;
      return gxTv_SdtSDTClientesDefectos_Defectos ;
   }

   public void setgxTv_SdtSDTClientesDefectos_Defectos( GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem> value )
   {
      gxTv_SdtSDTClientesDefectos_Defectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectos_Defectos = value ;
   }

   public void setgxTv_SdtSDTClientesDefectos_Defectos_SetNull( )
   {
      gxTv_SdtSDTClientesDefectos_Defectos_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectos_Defectos = null ;
   }

   public boolean getgxTv_SdtSDTClientesDefectos_Defectos_IsNull( )
   {
      if ( gxTv_SdtSDTClientesDefectos_Defectos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTClientesDefectos_Defectos_N( )
   {
      return gxTv_SdtSDTClientesDefectos_Defectos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClientesDefectos_Clinom = "" ;
      gxTv_SdtSDTClientesDefectos_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectos_Defectos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClientesDefectos_N ;
   }

   public app.SdtSDTClientesDefectos Clone( )
   {
      return (app.SdtSDTClientesDefectos)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClientesDefectos struct )
   {
      setgxTv_SdtSDTClientesDefectos_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem> gxTv_SdtSDTClientesDefectos_Defectos_aux = new GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem>(app.SdtSDTClientesDefectos_DefectosItem.class, "SDTClientesDefectos.DefectosItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTClientesDefectos_DefectosItem> gxTv_SdtSDTClientesDefectos_Defectos_aux1 = struct.getDefectos();
      if (gxTv_SdtSDTClientesDefectos_Defectos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTClientesDefectos_Defectos_aux1.size(); i++)
         {
            gxTv_SdtSDTClientesDefectos_Defectos_aux.add(new app.SdtSDTClientesDefectos_DefectosItem(gxTv_SdtSDTClientesDefectos_Defectos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTClientesDefectos_Defectos(gxTv_SdtSDTClientesDefectos_Defectos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClientesDefectos getStruct( )
   {
      app.StructSdtSDTClientesDefectos struct = new app.StructSdtSDTClientesDefectos ();
      struct.setClinom(getgxTv_SdtSDTClientesDefectos_Clinom());
      struct.setDefectos(getgxTv_SdtSDTClientesDefectos_Defectos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTClientesDefectos_N ;
   protected byte gxTv_SdtSDTClientesDefectos_Defectos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTClientesDefectos_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem> gxTv_SdtSDTClientesDefectos_Defectos_aux ;
   protected GXBaseCollection<app.SdtSDTClientesDefectos_DefectosItem> gxTv_SdtSDTClientesDefectos_Defectos=null ;
}

