package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTEntregasResumenCliente extends GxUserType
{
   public SdtSDTEntregasResumenCliente( )
   {
      this(  new ModelContext(SdtSDTEntregasResumenCliente.class));
   }

   public SdtSDTEntregasResumenCliente( ModelContext context )
   {
      super( context, "SdtSDTEntregasResumenCliente");
   }

   public SdtSDTEntregasResumenCliente( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTEntregasResumenCliente");
   }

   public SdtSDTEntregasResumenCliente( StructSdtSDTEntregasResumenCliente struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtSDTEntregasResumenCliente_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTEntregasResumenCliente_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtSDTEntregasResumenCliente_Level1 == null )
               {
                  gxTv_SdtSDTEntregasResumenCliente_Level1 = new GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item>(app.SdtSDTEntregasResumenCliente_Level1Item.class, "SDTEntregasResumenCliente.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTEntregasResumenCliente_Level1.readxmlcollection(oReader, "Level1", "Level1Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
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
         sName = "SDTEntregasResumenCliente" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTEntregasResumenCliente_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTEntregasResumenCliente_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTEntregasResumenCliente_Level1 != null )
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
         gxTv_SdtSDTEntregasResumenCliente_Level1.writexmlcollection(oWriter, "Level1", sNameSpace1, "Level1Item", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTEntregasResumenCliente_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTEntregasResumenCliente_Clinom, false, false);
      if ( gxTv_SdtSDTEntregasResumenCliente_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtSDTEntregasResumenCliente_Level1, false, false);
      }
   }

   public int getgxTv_SdtSDTEntregasResumenCliente_Clicod( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Clicod ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Clicod( int value )
   {
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Clicod = value ;
   }

   public String getgxTv_SdtSDTEntregasResumenCliente_Clinom( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Clinom ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Clinom( String value )
   {
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item> getgxTv_SdtSDTEntregasResumenCliente_Level1( )
   {
      if ( gxTv_SdtSDTEntregasResumenCliente_Level1 == null )
      {
         gxTv_SdtSDTEntregasResumenCliente_Level1 = new GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item>(app.SdtSDTEntregasResumenCliente_Level1Item.class, "SDTEntregasResumenCliente.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTEntregasResumenCliente_Level1_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      return gxTv_SdtSDTEntregasResumenCliente_Level1 ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Level1( GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item> value )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1 = value ;
   }

   public void setgxTv_SdtSDTEntregasResumenCliente_Level1_SetNull( )
   {
      gxTv_SdtSDTEntregasResumenCliente_Level1_N = (byte)(1) ;
      gxTv_SdtSDTEntregasResumenCliente_Level1 = null ;
   }

   public boolean getgxTv_SdtSDTEntregasResumenCliente_Level1_IsNull( )
   {
      if ( gxTv_SdtSDTEntregasResumenCliente_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTEntregasResumenCliente_Level1_N( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_Level1_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTEntregasResumenCliente_N = (byte)(1) ;
      gxTv_SdtSDTEntregasResumenCliente_Clinom = "" ;
      gxTv_SdtSDTEntregasResumenCliente_Level1_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTEntregasResumenCliente_N ;
   }

   public app.SdtSDTEntregasResumenCliente Clone( )
   {
      return (app.SdtSDTEntregasResumenCliente)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTEntregasResumenCliente struct )
   {
      setgxTv_SdtSDTEntregasResumenCliente_Clicod(struct.getClicod());
      setgxTv_SdtSDTEntregasResumenCliente_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item> gxTv_SdtSDTEntregasResumenCliente_Level1_aux = new GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item>(app.SdtSDTEntregasResumenCliente_Level1Item.class, "SDTEntregasResumenCliente.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTEntregasResumenCliente_Level1Item> gxTv_SdtSDTEntregasResumenCliente_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtSDTEntregasResumenCliente_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTEntregasResumenCliente_Level1_aux1.size(); i++)
         {
            gxTv_SdtSDTEntregasResumenCliente_Level1_aux.add(new app.SdtSDTEntregasResumenCliente_Level1Item(gxTv_SdtSDTEntregasResumenCliente_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTEntregasResumenCliente_Level1(gxTv_SdtSDTEntregasResumenCliente_Level1_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTEntregasResumenCliente getStruct( )
   {
      app.StructSdtSDTEntregasResumenCliente struct = new app.StructSdtSDTEntregasResumenCliente ();
      struct.setClicod(getgxTv_SdtSDTEntregasResumenCliente_Clicod());
      struct.setClinom(getgxTv_SdtSDTEntregasResumenCliente_Clinom());
      struct.setLevel1(getgxTv_SdtSDTEntregasResumenCliente_Level1().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTEntregasResumenCliente_N ;
   protected byte gxTv_SdtSDTEntregasResumenCliente_Level1_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTEntregasResumenCliente_Clicod ;
   protected String gxTv_SdtSDTEntregasResumenCliente_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item> gxTv_SdtSDTEntregasResumenCliente_Level1_aux ;
   protected GXBaseCollection<app.SdtSDTEntregasResumenCliente_Level1Item> gxTv_SdtSDTEntregasResumenCliente_Level1=null ;
}

