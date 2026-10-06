package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionParosResumen_ParosItem extends GxUserType
{
   public SdtSDTProduccionParosResumen_ParosItem( )
   {
      this(  new ModelContext(SdtSDTProduccionParosResumen_ParosItem.class));
   }

   public SdtSDTProduccionParosResumen_ParosItem( ModelContext context )
   {
      super( context, "SdtSDTProduccionParosResumen_ParosItem");
   }

   public SdtSDTProduccionParosResumen_ParosItem( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionParosResumen_ParosItem");
   }

   public SdtSDTProduccionParosResumen_ParosItem( StructSdtSDTProduccionParosResumen_ParosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcod") )
            {
               gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCodNom") )
            {
               gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Repeticiones") )
            {
               if ( gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones == null )
               {
                  gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones = new GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem>(app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem.class, "SDTProduccionParosResumen.ParosItem.RepeticionesItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones.readxmlcollection(oReader, "Repeticiones", "RepeticionesItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Repeticiones") )
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
         sName = "SDTProduccionParosResumen.ParosItem" ;
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
      oWriter.writeElement("Parcod", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParCodNom", gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones != null )
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
         gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones.writexmlcollection(oWriter, "Repeticiones", sNameSpace1, "RepeticionesItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
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
      AddObjectProperty("Parcod", gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod, false, false);
      AddObjectProperty("ParCodNom", gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom, false, false);
      if ( gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones != null )
      {
         AddObjectProperty("Repeticiones", gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones, false, false);
      }
   }

   public short getgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod( short value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod = value ;
   }

   public String getgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom( String value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom = value ;
   }

   public GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> getgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones( )
   {
      if ( gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones == null )
      {
         gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones = new GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem>(app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem.class, "SDTProduccionParosResumen.ParosItem.RepeticionesItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones( GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones = value ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_SetNull( )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones = null ;
   }

   public boolean getgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_IsNull( )
   {
      if ( gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom = "" ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_N ;
   }

   public app.SdtSDTProduccionParosResumen_ParosItem Clone( )
   {
      return (app.SdtSDTProduccionParosResumen_ParosItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionParosResumen_ParosItem struct )
   {
      setgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod(struct.getParcod());
      setgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom(struct.getParcodnom());
      GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux = new GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem>(app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem.class, "SDTProduccionParosResumen.ParosItem.RepeticionesItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux1 = struct.getRepeticiones();
      if (gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux1.size(); i++)
         {
            gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux.add(new app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem(gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones(gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionParosResumen_ParosItem getStruct( )
   {
      app.StructSdtSDTProduccionParosResumen_ParosItem struct = new app.StructSdtSDTProduccionParosResumen_ParosItem ();
      struct.setParcod(getgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod());
      struct.setParcodnom(getgxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom());
      struct.setRepeticiones(getgxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionParosResumen_ParosItem_N ;
   protected byte gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_N ;
   protected short gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTProduccionParosResumen_ParosItem_Parcodnom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones_aux ;
   protected GXBaseCollection<app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> gxTv_SdtSDTProduccionParosResumen_ParosItem_Repeticiones=null ;
}

