package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClienteResumenEntradas extends GxUserType
{
   public SdtSDTClienteResumenEntradas( )
   {
      this(  new ModelContext(SdtSDTClienteResumenEntradas.class));
   }

   public SdtSDTClienteResumenEntradas( ModelContext context )
   {
      super( context, "SdtSDTClienteResumenEntradas");
   }

   public SdtSDTClienteResumenEntradas( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClienteResumenEntradas");
   }

   public SdtSDTClienteResumenEntradas( StructSdtSDTClienteResumenEntradas struct )
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
               gxTv_SdtSDTClienteResumenEntradas_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTClienteResumenEntradas_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtSDTClienteResumenEntradas_Level1 == null )
               {
                  gxTv_SdtSDTClienteResumenEntradas_Level1 = new GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item>(app.SdtSDTClienteResumenEntradas_Level1Item.class, "SDTClienteResumenEntradas.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTClienteResumenEntradas_Level1.readxmlcollection(oReader, "Level1", "Level1Item") ;
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
         sName = "SDTClienteResumenEntradas" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteResumenEntradas_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTClienteResumenEntradas_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTClienteResumenEntradas_Level1 != null )
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
         gxTv_SdtSDTClienteResumenEntradas_Level1.writexmlcollection(oWriter, "Level1", sNameSpace1, "Level1Item", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTClienteResumenEntradas_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTClienteResumenEntradas_Clinom, false, false);
      if ( gxTv_SdtSDTClienteResumenEntradas_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtSDTClienteResumenEntradas_Level1, false, false);
      }
   }

   public int getgxTv_SdtSDTClienteResumenEntradas_Clicod( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Clicod ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Clicod( int value )
   {
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Clicod = value ;
   }

   public String getgxTv_SdtSDTClienteResumenEntradas_Clinom( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Clinom ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Clinom( String value )
   {
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item> getgxTv_SdtSDTClienteResumenEntradas_Level1( )
   {
      if ( gxTv_SdtSDTClienteResumenEntradas_Level1 == null )
      {
         gxTv_SdtSDTClienteResumenEntradas_Level1 = new GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item>(app.SdtSDTClienteResumenEntradas_Level1Item.class, "SDTClienteResumenEntradas.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTClienteResumenEntradas_Level1_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      return gxTv_SdtSDTClienteResumenEntradas_Level1 ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1( GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item> value )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1 = value ;
   }

   public void setgxTv_SdtSDTClienteResumenEntradas_Level1_SetNull( )
   {
      gxTv_SdtSDTClienteResumenEntradas_Level1_N = (byte)(1) ;
      gxTv_SdtSDTClienteResumenEntradas_Level1 = null ;
   }

   public boolean getgxTv_SdtSDTClienteResumenEntradas_Level1_IsNull( )
   {
      if ( gxTv_SdtSDTClienteResumenEntradas_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTClienteResumenEntradas_Level1_N( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_Level1_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClienteResumenEntradas_N = (byte)(1) ;
      gxTv_SdtSDTClienteResumenEntradas_Clinom = "" ;
      gxTv_SdtSDTClienteResumenEntradas_Level1_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClienteResumenEntradas_N ;
   }

   public app.SdtSDTClienteResumenEntradas Clone( )
   {
      return (app.SdtSDTClienteResumenEntradas)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClienteResumenEntradas struct )
   {
      setgxTv_SdtSDTClienteResumenEntradas_Clicod(struct.getClicod());
      setgxTv_SdtSDTClienteResumenEntradas_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item> gxTv_SdtSDTClienteResumenEntradas_Level1_aux = new GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item>(app.SdtSDTClienteResumenEntradas_Level1Item.class, "SDTClienteResumenEntradas.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTClienteResumenEntradas_Level1Item> gxTv_SdtSDTClienteResumenEntradas_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtSDTClienteResumenEntradas_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTClienteResumenEntradas_Level1_aux1.size(); i++)
         {
            gxTv_SdtSDTClienteResumenEntradas_Level1_aux.add(new app.SdtSDTClienteResumenEntradas_Level1Item(gxTv_SdtSDTClienteResumenEntradas_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTClienteResumenEntradas_Level1(gxTv_SdtSDTClienteResumenEntradas_Level1_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClienteResumenEntradas getStruct( )
   {
      app.StructSdtSDTClienteResumenEntradas struct = new app.StructSdtSDTClienteResumenEntradas ();
      struct.setClicod(getgxTv_SdtSDTClienteResumenEntradas_Clicod());
      struct.setClinom(getgxTv_SdtSDTClienteResumenEntradas_Clinom());
      struct.setLevel1(getgxTv_SdtSDTClienteResumenEntradas_Level1().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTClienteResumenEntradas_N ;
   protected byte gxTv_SdtSDTClienteResumenEntradas_Level1_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTClienteResumenEntradas_Clicod ;
   protected String gxTv_SdtSDTClienteResumenEntradas_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item> gxTv_SdtSDTClienteResumenEntradas_Level1_aux ;
   protected GXBaseCollection<app.SdtSDTClienteResumenEntradas_Level1Item> gxTv_SdtSDTClienteResumenEntradas_Level1=null ;
}

