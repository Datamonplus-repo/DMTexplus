package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClientesDefectosMaquinas_MaqItem extends GxUserType
{
   public SdtSDTClientesDefectosMaquinas_MaqItem( )
   {
      this(  new ModelContext(SdtSDTClientesDefectosMaquinas_MaqItem.class));
   }

   public SdtSDTClientesDefectosMaquinas_MaqItem( ModelContext context )
   {
      super( context, "SdtSDTClientesDefectosMaquinas_MaqItem");
   }

   public SdtSDTClientesDefectosMaquinas_MaqItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClientesDefectosMaquinas_MaqItem");
   }

   public SdtSDTClientesDefectosMaquinas_MaqItem( StructSdtSDTClientesDefectosMaquinas_MaqItem struct )
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
               gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Def") )
            {
               if ( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def == null )
               {
                  gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem>(app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem.class, "SDTClientesDefectosMaquinas.MaqItem.DefItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def.readxmlcollection(oReader, "Def", "DefItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Def") )
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
         sName = "SDTClientesDefectosMaquinas.MaqItem" ;
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
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def != null )
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
         gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def.writexmlcollection(oWriter, "Def", sNameSpace1, "DefItem", sNameSpace1);
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
      AddObjectProperty("MaqDsc", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc, false, false);
      if ( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def != null )
      {
         AddObjectProperty("Def", gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def, false, false);
      }
   }

   public String getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc( String value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem> getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def( )
   {
      if ( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def == null )
      {
         gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem>(app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem.class, "SDTClientesDefectosMaquinas.MaqItem.DefItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N = (byte)(0) ;
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def( GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem> value )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N = (byte)(0) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def = value ;
   }

   public void setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_SetNull( )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def = null ;
   }

   public boolean getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_IsNull( )
   {
      if ( gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc = "" ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N = (byte)(1) ;
      gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N ;
   }

   public app.SdtSDTClientesDefectosMaquinas_MaqItem Clone( )
   {
      return (app.SdtSDTClientesDefectosMaquinas_MaqItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClientesDefectosMaquinas_MaqItem struct )
   {
      setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc(struct.getMaqdsc());
      GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem> gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux = new GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem>(app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem.class, "SDTClientesDefectosMaquinas.MaqItem.DefItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTClientesDefectosMaquinas_MaqItem_DefItem> gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux1 = struct.getDef();
      if (gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux1.size(); i++)
         {
            gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux.add(new app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem(gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def(gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClientesDefectosMaquinas_MaqItem getStruct( )
   {
      app.StructSdtSDTClientesDefectosMaquinas_MaqItem struct = new app.StructSdtSDTClientesDefectosMaquinas_MaqItem ();
      struct.setMaqdsc(getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc());
      struct.setDef(getgxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_N ;
   protected byte gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem> gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def_aux ;
   protected GXBaseCollection<app.SdtSDTClientesDefectosMaquinas_MaqItem_DefItem> gxTv_SdtSDTClientesDefectosMaquinas_MaqItem_Def=null ;
}

