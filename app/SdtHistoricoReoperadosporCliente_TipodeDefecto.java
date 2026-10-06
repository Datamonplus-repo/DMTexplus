package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtHistoricoReoperadosporCliente_TipodeDefecto extends GxUserType
{
   public SdtHistoricoReoperadosporCliente_TipodeDefecto( )
   {
      this(  new ModelContext(SdtHistoricoReoperadosporCliente_TipodeDefecto.class));
   }

   public SdtHistoricoReoperadosporCliente_TipodeDefecto( ModelContext context )
   {
      super( context, "SdtHistoricoReoperadosporCliente_TipodeDefecto");
   }

   public SdtHistoricoReoperadosporCliente_TipodeDefecto( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtHistoricoReoperadosporCliente_TipodeDefecto");
   }

   public SdtHistoricoReoperadosporCliente_TipodeDefecto( StructSdtHistoricoReoperadosporCliente_TipodeDefecto struct )
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
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc") )
            {
               gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HDRs") )
            {
               if ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs == null )
               {
                  gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR>(app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR.class, "HistoricoReoperadosporCliente.TipodeDefecto.HDR", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs.readxmlcollection(oReader, "HDRs", "HDR") ;
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
         sName = "HistoricoReoperadosporCliente.TipodeDefecto" ;
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
      oWriter.writeElement("Tipdefcod", GXutil.trim( GXutil.str( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefDsc", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs != null )
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
         gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs.writexmlcollection(oWriter, "HDRs", sNameSpace1, "HDR", sNameSpace1);
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
      AddObjectProperty("Tipdefcod", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod, false, false);
      AddObjectProperty("TipDefDsc", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc, false, false);
      if ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs != null )
      {
         AddObjectProperty("HDRs", gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs, false, false);
      }
   }

   public short getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod( short value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod = value ;
   }

   public String getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc( String value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc = value ;
   }

   public GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs( )
   {
      if ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs == null )
      {
         gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR>(app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR.class, "HistoricoReoperadosporCliente.TipodeDefecto.HDR", "TexplusNET", remoteHandle);
      }
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs( GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> value )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(0) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs = value ;
   }

   public void setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_SetNull( )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N = (byte)(1) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs = null ;
   }

   public boolean getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_IsNull( )
   {
      if ( gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N = (byte)(1) ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc = "" ;
      gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N ;
   }

   public app.SdtHistoricoReoperadosporCliente_TipodeDefecto Clone( )
   {
      return (app.SdtHistoricoReoperadosporCliente_TipodeDefecto)(clone()) ;
   }

   public void setStruct( app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto struct )
   {
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc(struct.getTipdefdsc());
      GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux = new GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR>(app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR.class, "HistoricoReoperadosporCliente.TipodeDefecto.HDR", "TexplusNET", remoteHandle);
      Vector<app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux1 = struct.getHdrs();
      if (gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux1.size(); i++)
         {
            gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux.add(new app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR(gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs(gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto getStruct( )
   {
      app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto struct = new app.StructSdtHistoricoReoperadosporCliente_TipodeDefecto ();
      struct.setTipdefcod(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc());
      struct.setHdrs(getgxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_N ;
   protected byte gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_N ;
   protected short gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Tipdefdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs_aux ;
   protected GXBaseCollection<app.SdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> gxTv_SdtHistoricoReoperadosporCliente_TipodeDefecto_Hdrs=null ;
}

