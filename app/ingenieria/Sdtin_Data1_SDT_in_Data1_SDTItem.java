package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class Sdtin_Data1_SDT_in_Data1_SDTItem extends GxUserType
{
   public Sdtin_Data1_SDT_in_Data1_SDTItem( )
   {
      this(  new ModelContext(Sdtin_Data1_SDT_in_Data1_SDTItem.class));
   }

   public Sdtin_Data1_SDT_in_Data1_SDTItem( ModelContext context )
   {
      super( context, "Sdtin_Data1_SDT_in_Data1_SDTItem");
   }

   public Sdtin_Data1_SDT_in_Data1_SDTItem( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "Sdtin_Data1_SDT_in_Data1_SDTItem");
   }

   public Sdtin_Data1_SDT_in_Data1_SDTItem( StructSdtin_Data1_SDT_in_Data1_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fecha") )
            {
               gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maquina") )
            {
               gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HDR") )
            {
               gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Articulo") )
            {
               gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cliente") )
            {
               gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
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
         sName = "in_Data1_SDT.in_Data1_SDTItem" ;
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
      oWriter.writeElement("Fecha", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Maquina", GXutil.trim( GXutil.str( gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HDR", GXutil.trim( GXutil.str( gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Articulo", GXutil.trim( GXutil.str( gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cliente", GXutil.trim( GXutil.str( gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fase", GXutil.trim( GXutil.str( gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Fecha", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha, false, false);
      AddObjectProperty("Maquina", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina, false, false);
      AddObjectProperty("HDR", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr, false, false);
      AddObjectProperty("Articulo", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo, false, false);
      AddObjectProperty("Cliente", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente, false, false);
      AddObjectProperty("Fase", gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase, false, false);
   }

   public String getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha ;
   }

   public void setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha( String value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha = value ;
   }

   public short getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina ;
   }

   public void setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina = value ;
   }

   public short getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr ;
   }

   public void setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr = value ;
   }

   public short getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo ;
   }

   public void setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo = value ;
   }

   public short getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente ;
   }

   public void setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente = value ;
   }

   public short getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase ;
   }

   public void setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase( short value )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(0) ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha = "" ;
      gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N ;
   }

   public app.ingenieria.Sdtin_Data1_SDT_in_Data1_SDTItem Clone( )
   {
      return (app.ingenieria.Sdtin_Data1_SDT_in_Data1_SDTItem)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtin_Data1_SDT_in_Data1_SDTItem struct )
   {
      setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha(struct.getFecha());
      setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina(struct.getMaquina());
      setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr(struct.getHdr());
      setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo(struct.getArticulo());
      setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente(struct.getCliente());
      setgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase(struct.getFase());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtin_Data1_SDT_in_Data1_SDTItem getStruct( )
   {
      app.ingenieria.StructSdtin_Data1_SDT_in_Data1_SDTItem struct = new app.ingenieria.StructSdtin_Data1_SDT_in_Data1_SDTItem ();
      struct.setFecha(getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha());
      struct.setMaquina(getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina());
      struct.setHdr(getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr());
      struct.setArticulo(getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo());
      struct.setCliente(getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente());
      struct.setFase(getgxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase());
      return struct ;
   }

   protected byte gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_N ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Maquina ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Hdr ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Articulo ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Cliente ;
   protected short gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fase ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_Sdtin_Data1_SDT_in_Data1_SDTItem_Fecha ;
}

