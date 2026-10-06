package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosMaquina_TipoDefecto extends GxUserType
{
   public SdtSDTHistoricoReoperadosMaquina_TipoDefecto( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosMaquina_TipoDefecto.class));
   }

   public SdtSDTHistoricoReoperadosMaquina_TipoDefecto( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosMaquina_TipoDefecto");
   }

   public SdtSDTHistoricoReoperadosMaquina_TipoDefecto( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosMaquina_TipoDefecto");
   }

   public SdtSDTHistoricoReoperadosMaquina_TipoDefecto( StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipdefcod") )
            {
               gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HDRs") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr>(app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr.class, "SDTHistoricoReoperadosMaquina.TipoDefecto.Hdr", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs.readxmlcollection(oReader, "HDRs", "Hdr") ;
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
         sName = "SDTHistoricoReoperadosMaquina.TipoDefecto" ;
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
      oWriter.writeElement("Tipdefcod", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefDsc", gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs != null )
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
         gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs.writexmlcollection(oWriter, "HDRs", sNameSpace1, "Hdr", sNameSpace1);
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
      AddObjectProperty("Tipdefcod", gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod, false, false);
      AddObjectProperty("TipDefDsc", gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs != null )
      {
         AddObjectProperty("HDRs", gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs, false, false);
      }
   }

   public short getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod( short value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc = value ;
   }

   public GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs == null )
      {
         gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr>(app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr.class, "SDTHistoricoReoperadosMaquina.TipoDefecto.Hdr", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs( GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> value )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs = value ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs = null ;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N ;
   }

   public app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc(struct.getTipdefdsc());
      GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux = new GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr>(app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr.class, "SDTHistoricoReoperadosMaquina.TipoDefecto.Hdr", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux1 = struct.getHdrs();
      if (gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux1.size(); i++)
         {
            gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux.add(new app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr(gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs(gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto struct = new app.StructSdtSDTHistoricoReoperadosMaquina_TipoDefecto ();
      struct.setTipdefcod(getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc());
      struct.setHdrs(getgxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_N ;
   protected short gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs_aux ;
   protected GXBaseCollection<app.SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdr> gxTv_SdtSDTHistoricoReoperadosMaquina_TipoDefecto_Hdrs=null ;
}

