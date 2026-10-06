package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTQueryRecordSet_RegistroItem extends GxUserType
{
   public SdtSDTQueryRecordSet_RegistroItem( )
   {
      this(  new ModelContext(SdtSDTQueryRecordSet_RegistroItem.class));
   }

   public SdtSDTQueryRecordSet_RegistroItem( ModelContext context )
   {
      super( context, "SdtSDTQueryRecordSet_RegistroItem");
   }

   public SdtSDTQueryRecordSet_RegistroItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTQueryRecordSet_RegistroItem");
   }

   public SdtSDTQueryRecordSet_RegistroItem( StructSdtSDTQueryRecordSet_RegistroItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Atributo") )
            {
               if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo == null )
               {
                  gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo = new GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem>(app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem.class, "SDTQueryRecordSet.RegistroItem.AtributoItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo.readxmlcollection(oReader, "Atributo", "AtributoItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Atributo") )
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
         sName = "SDTQueryRecordSet.RegistroItem" ;
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
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo != null )
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
         gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo.writexmlcollection(oWriter, "Atributo", sNameSpace1, "AtributoItem", sNameSpace1);
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
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo != null )
      {
         AddObjectProperty("Atributo", gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo, false, false);
      }
   }

   public GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem> getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo( )
   {
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo == null )
      {
         gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo = new GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem>(app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem.class, "SDTQueryRecordSet.RegistroItem.AtributoItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_N = (byte)(0) ;
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo( GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem> value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo = value ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_SetNull( )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo = null ;
   }

   public boolean getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_IsNull( )
   {
      if ( gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_N ;
   }

   public app.SdtSDTQueryRecordSet_RegistroItem Clone( )
   {
      return (app.SdtSDTQueryRecordSet_RegistroItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTQueryRecordSet_RegistroItem struct )
   {
      GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem> gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux = new GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem>(app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem.class, "SDTQueryRecordSet.RegistroItem.AtributoItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux1 = struct.getAtributo();
      if (gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux1.size(); i++)
         {
            gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux.add(new app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem(gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo(gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTQueryRecordSet_RegistroItem getStruct( )
   {
      app.StructSdtSDTQueryRecordSet_RegistroItem struct = new app.StructSdtSDTQueryRecordSet_RegistroItem ();
      struct.setAtributo(getgxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem> gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_aux ;
   protected GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem_AtributoItem> gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo=null ;
}

