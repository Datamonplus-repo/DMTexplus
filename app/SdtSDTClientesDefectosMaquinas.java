package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClientesDefectosMaquinas extends GxUserType
{
   public SdtSDTClientesDefectosMaquinas( )
   {
      this(  new ModelContext(SdtSDTClientesDefectosMaquinas.class));
   }

   public SdtSDTClientesDefectosMaquinas( ModelContext context )
   {
      super( context, "SdtSDTClientesDefectosMaquinas");
   }

   public SdtSDTClientesDefectosMaquinas( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClientesDefectosMaquinas");
   }

   public SdtSDTClientesDefectosMaquinas( StructSdtSDTClientesDefectosMaquinas struct )
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
               gxTv_SdtSDTClientesDefectosMaquinas_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maq") )
            {
               if ( gxTv_SdtSDTClientesDefectosMaquinas_Maq == null )
               {
                  gxTv_SdtSDTClientesDefectosMaquinas_Maq = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem>(app.SdtSDTClientesDefectosMaquinas_MaqItem.class, "SDTClientesDefectosMaquinas.MaqItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTClientesDefectosMaquinas_Maq.readxmlcollection(oReader, "Maq", "MaqItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Maq") )
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
         sName = "SDTClientesDefectosMaquinas" ;
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
      oWriter.writeElement("CliNom", gxTv_SdtSDTClientesDefectosMaquinas_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTClientesDefectosMaquinas_Maq != null )
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
         gxTv_SdtSDTClientesDefectosMaquinas_Maq.writexmlcollection(oWriter, "Maq", sNameSpace1, "MaqItem", sNameSpace1);
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
      AddObjectProperty("CliNom", gxTv_SdtSDTClientesDefectosMaquinas_Clinom, false, false);
      if ( gxTv_SdtSDTClientesDefectosMaquinas_Maq != null )
      {
         AddObjectProperty("Maq", gxTv_SdtSDTClientesDefectosMaquinas_Maq, false, false);
      }
   }

   public String getgxTv_SdtSDTClientesDefectosMaquinas_Clinom( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_Clinom ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_Clinom( String value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem> getgxTv_SdtSDTClientesDefectosMaquinas_Maq( )
   {
      if ( gxTv_SdtSDTClientesDefectosMaquinas_Maq == null )
      {
         gxTv_SdtSDTClientesDefectosMaquinas_Maq = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem>(app.SdtSDTClientesDefectosMaquinas_MaqItem.class, "SDTClientesDefectosMaquinas.MaqItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTClientesDefectosMaquinas_Maq_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_N = (byte)(0) ;
      return gxTv_SdtSDTClientesDefectosMaquinas_Maq ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_Maq( GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem> value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_Maq_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_Maq = value ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_Maq_SetNull( )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_Maq_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectosMaquinas_Maq = null ;
   }

   public boolean getgxTv_SdtSDTClientesDefectosMaquinas_Maq_IsNull( )
   {
      if ( gxTv_SdtSDTClientesDefectosMaquinas_Maq == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTClientesDefectosMaquinas_Maq_N( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_Maq_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_Clinom = "" ;
      gxTv_SdtSDTClientesDefectosMaquinas_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectosMaquinas_Maq_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_N ;
   }

   public app.SdtSDTClientesDefectosMaquinas Clone( )
   {
      return (app.SdtSDTClientesDefectosMaquinas)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClientesDefectosMaquinas struct )
   {
      setgxTv_SdtSDTClientesDefectosMaquinas_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem> gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem>(app.SdtSDTClientesDefectosMaquinas_MaqItem.class, "SDTClientesDefectosMaquinas.MaqItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem> gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux1 = struct.getMaq();
      if (gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux1.size(); i++)
         {
            gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux.add(new app.SdtSDTClientesDefectosMaquinas_MaqItem(gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTClientesDefectosMaquinas_Maq(gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClientesDefectosMaquinas getStruct( )
   {
      app.StructSdtSDTClientesDefectosMaquinas struct = new app.StructSdtSDTClientesDefectosMaquinas ();
      struct.setClinom(getgxTv_SdtSDTClientesDefectosMaquinas_Clinom());
      struct.setMaq(getgxTv_SdtSDTClientesDefectosMaquinas_Maq().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTClientesDefectosMaquinas_N ;
   protected byte gxTv_SdtSDTClientesDefectosMaquinas_Maq_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTClientesDefectosMaquinas_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem> gxTv_SdtSDTClientesDefectosMaquinas_Maq_aux ;
   protected GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem> gxTv_SdtSDTClientesDefectosMaquinas_Maq=null ;
}

