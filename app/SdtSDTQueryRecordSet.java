package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTQueryRecordSet extends GxUserType
{
   public SdtSDTQueryRecordSet( )
   {
      this(  new ModelContext(SdtSDTQueryRecordSet.class));
   }

   public SdtSDTQueryRecordSet( ModelContext context )
   {
      super( context, "SdtSDTQueryRecordSet");
   }

   public SdtSDTQueryRecordSet( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTQueryRecordSet");
   }

   public SdtSDTQueryRecordSet( StructSdtSDTQueryRecordSet struct )
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
               if ( gxTv_SdtSDTQueryRecordSet_Atributo == null )
               {
                  gxTv_SdtSDTQueryRecordSet_Atributo = new GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem>(app.SdtSDTQueryRecordSet_AtributoItem.class, "SDTQueryRecordSet.AtributoItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTQueryRecordSet_Atributo.readxmlcollection(oReader, "Atributo", "AtributoItem") ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Registro") )
            {
               if ( gxTv_SdtSDTQueryRecordSet_Registro == null )
               {
                  gxTv_SdtSDTQueryRecordSet_Registro = new GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem>(app.SdtSDTQueryRecordSet_RegistroItem.class, "SDTQueryRecordSet.RegistroItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTQueryRecordSet_Registro.readxmlcollection(oReader, "Registro", "RegistroItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Registro") )
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
         sName = "SDTQueryRecordSet" ;
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
      if ( gxTv_SdtSDTQueryRecordSet_Atributo != null )
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
         gxTv_SdtSDTQueryRecordSet_Atributo.writexmlcollection(oWriter, "Atributo", sNameSpace1, "AtributoItem", sNameSpace1);
      }
      if ( gxTv_SdtSDTQueryRecordSet_Registro != null )
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
         gxTv_SdtSDTQueryRecordSet_Registro.writexmlcollection(oWriter, "Registro", sNameSpace1, "RegistroItem", sNameSpace1);
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
      if ( gxTv_SdtSDTQueryRecordSet_Atributo != null )
      {
         AddObjectProperty("Atributo", gxTv_SdtSDTQueryRecordSet_Atributo, false, false);
      }
      if ( gxTv_SdtSDTQueryRecordSet_Registro != null )
      {
         AddObjectProperty("Registro", gxTv_SdtSDTQueryRecordSet_Registro, false, false);
      }
   }

   public GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem> getgxTv_SdtSDTQueryRecordSet_Atributo( )
   {
      if ( gxTv_SdtSDTQueryRecordSet_Atributo == null )
      {
         gxTv_SdtSDTQueryRecordSet_Atributo = new GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem>(app.SdtSDTQueryRecordSet_AtributoItem.class, "SDTQueryRecordSet.AtributoItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTQueryRecordSet_Atributo_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(0) ;
      return gxTv_SdtSDTQueryRecordSet_Atributo ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_Atributo( GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem> value )
   {
      gxTv_SdtSDTQueryRecordSet_Atributo_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_Atributo = value ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_Atributo_SetNull( )
   {
      gxTv_SdtSDTQueryRecordSet_Atributo_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_Atributo = null ;
   }

   public boolean getgxTv_SdtSDTQueryRecordSet_Atributo_IsNull( )
   {
      if ( gxTv_SdtSDTQueryRecordSet_Atributo == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTQueryRecordSet_Atributo_N( )
   {
      return gxTv_SdtSDTQueryRecordSet_Atributo_N ;
   }

   public GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem> getgxTv_SdtSDTQueryRecordSet_Registro( )
   {
      if ( gxTv_SdtSDTQueryRecordSet_Registro == null )
      {
         gxTv_SdtSDTQueryRecordSet_Registro = new GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem>(app.SdtSDTQueryRecordSet_RegistroItem.class, "SDTQueryRecordSet.RegistroItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTQueryRecordSet_Registro_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(0) ;
      return gxTv_SdtSDTQueryRecordSet_Registro ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_Registro( GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem> value )
   {
      gxTv_SdtSDTQueryRecordSet_Registro_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_Registro = value ;
   }

   public void setgxTv_SdtSDTQueryRecordSet_Registro_SetNull( )
   {
      gxTv_SdtSDTQueryRecordSet_Registro_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_Registro = null ;
   }

   public boolean getgxTv_SdtSDTQueryRecordSet_Registro_IsNull( )
   {
      if ( gxTv_SdtSDTQueryRecordSet_Registro == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTQueryRecordSet_Registro_N( )
   {
      return gxTv_SdtSDTQueryRecordSet_Registro_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTQueryRecordSet_Atributo_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_Registro_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTQueryRecordSet_N ;
   }

   public app.SdtSDTQueryRecordSet Clone( )
   {
      return (app.SdtSDTQueryRecordSet)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTQueryRecordSet struct )
   {
      GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem> gxTv_SdtSDTQueryRecordSet_Atributo_aux = new GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem>(app.SdtSDTQueryRecordSet_AtributoItem.class, "SDTQueryRecordSet.AtributoItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTQueryRecordSet_AtributoItem> gxTv_SdtSDTQueryRecordSet_Atributo_aux1 = struct.getAtributo();
      if (gxTv_SdtSDTQueryRecordSet_Atributo_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTQueryRecordSet_Atributo_aux1.size(); i++)
         {
            gxTv_SdtSDTQueryRecordSet_Atributo_aux.add(new app.SdtSDTQueryRecordSet_AtributoItem(gxTv_SdtSDTQueryRecordSet_Atributo_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTQueryRecordSet_Atributo(gxTv_SdtSDTQueryRecordSet_Atributo_aux);
      GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem> gxTv_SdtSDTQueryRecordSet_Registro_aux = new GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem>(app.SdtSDTQueryRecordSet_RegistroItem.class, "SDTQueryRecordSet.RegistroItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTQueryRecordSet_RegistroItem> gxTv_SdtSDTQueryRecordSet_Registro_aux1 = struct.getRegistro();
      if (gxTv_SdtSDTQueryRecordSet_Registro_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTQueryRecordSet_Registro_aux1.size(); i++)
         {
            gxTv_SdtSDTQueryRecordSet_Registro_aux.add(new app.SdtSDTQueryRecordSet_RegistroItem(gxTv_SdtSDTQueryRecordSet_Registro_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTQueryRecordSet_Registro(gxTv_SdtSDTQueryRecordSet_Registro_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTQueryRecordSet getStruct( )
   {
      app.StructSdtSDTQueryRecordSet struct = new app.StructSdtSDTQueryRecordSet ();
      struct.setAtributo(getgxTv_SdtSDTQueryRecordSet_Atributo().getStruct());
      struct.setRegistro(getgxTv_SdtSDTQueryRecordSet_Registro().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_Atributo_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_Registro_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem> gxTv_SdtSDTQueryRecordSet_Atributo_aux ;
   protected GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem> gxTv_SdtSDTQueryRecordSet_Registro_aux ;
   protected GXBaseCollection<app.SdtSDTQueryRecordSet_AtributoItem> gxTv_SdtSDTQueryRecordSet_Atributo=null ;
   protected GXBaseCollection<app.SdtSDTQueryRecordSet_RegistroItem> gxTv_SdtSDTQueryRecordSet_Registro=null ;
}

