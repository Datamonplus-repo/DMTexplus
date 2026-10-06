package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosTipoDefecto_Clilente extends GxUserType
{
   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosTipoDefecto_Clilente.class));
   }

   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosTipoDefecto_Clilente");
   }

   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosTipoDefecto_Clilente");
   }

   public SdtSDTHistoricoReoperadosTipoDefecto_Clilente( StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente struct )
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
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HDRs") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr>(app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr.class, "SDTHistoricoReoperadosTipoDefecto.Clilente.Hdr", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs.readxmlcollection(oReader, "HDRs", "Hdr") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "HDRs") )
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
         sName = "SDTHistoricoReoperadosTipoDefecto.Clilente" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs != null )
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
         gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs.writexmlcollection(oWriter, "HDRs", sNameSpace1, "Hdr", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs != null )
      {
         AddObjectProperty("HDRs", gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs, false, false);
      }
   }

   public int getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod( int value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs == null )
      {
         gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr>(app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr.class, "SDTHistoricoReoperadosTipoDefecto.Clilente.Hdr", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs( GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> value )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom = "" ;
      gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N ;
   }

   public app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod(struct.getClicod());
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr>(app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr.class, "SDTHistoricoReoperadosTipoDefecto.Clilente.Hdr", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux1 = struct.getHdrs();
      if (gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux.add(new app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr(gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs(gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente struct = new app.StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente ();
      struct.setClicod(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod());
      struct.setClinom(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom());
      struct.setHdrs(getgxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clicod ;
   protected String gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdr> gxTv_SdtSDTHistoricoReoperadosTipoDefecto_Clilente_Hdrs=null ;
}

