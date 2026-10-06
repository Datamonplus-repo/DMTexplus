package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPasos__SDT_Pasos__SDTItem extends GxUserType
{
   public SdtPasos__SDT_Pasos__SDTItem( )
   {
      this(  new ModelContext(SdtPasos__SDT_Pasos__SDTItem.class));
   }

   public SdtPasos__SDT_Pasos__SDTItem( ModelContext context )
   {
      super( context, "SdtPasos__SDT_Pasos__SDTItem");
   }

   public SdtPasos__SDT_Pasos__SDTItem( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtPasos__SDT_Pasos__SDTItem");
   }

   public SdtPasos__SDT_Pasos__SDTItem( StructSdtPasos__SDT_Pasos__SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Paso") )
            {
               gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Titulo") )
            {
               gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PasoAnterior") )
            {
               gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PasoSiguiente") )
            {
               gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente = oReader.getValue() ;
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
         sName = "Pasos__SDT.Pasos__SDTItem" ;
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
      oWriter.writeElement("Paso", gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Titulo", gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PasoAnterior", gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PasoSiguiente", gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Paso", gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso, false, false);
      AddObjectProperty("Titulo", gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion, false, false);
      AddObjectProperty("PasoAnterior", gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior, false, false);
      AddObjectProperty("PasoSiguiente", gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente, false, false);
   }

   public String getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso ;
   }

   public void setgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso = value ;
   }

   public String getgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo ;
   }

   public void setgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo = value ;
   }

   public String getgxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion ;
   }

   public void setgxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion = value ;
   }

   public String getgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior ;
   }

   public void setgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior = value ;
   }

   public String getgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente ;
   }

   public void setgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente( String value )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(0) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_N = (byte)(1) ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior = "" ;
      gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPasos__SDT_Pasos__SDTItem_N ;
   }

   public app.SdtPasos__SDT_Pasos__SDTItem Clone( )
   {
      return (app.SdtPasos__SDT_Pasos__SDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtPasos__SDT_Pasos__SDTItem struct )
   {
      setgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso(struct.getPaso());
      setgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo(struct.getTitulo());
      setgxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion(struct.getDescripcion());
      setgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior(struct.getPasoanterior());
      setgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente(struct.getPasosiguiente());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtPasos__SDT_Pasos__SDTItem getStruct( )
   {
      app.StructSdtPasos__SDT_Pasos__SDTItem struct = new app.StructSdtPasos__SDT_Pasos__SDTItem ();
      struct.setPaso(getgxTv_SdtPasos__SDT_Pasos__SDTItem_Paso());
      struct.setTitulo(getgxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo());
      struct.setDescripcion(getgxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion());
      struct.setPasoanterior(getgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior());
      struct.setPasosiguiente(getgxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente());
      return struct ;
   }

   protected byte gxTv_SdtPasos__SDT_Pasos__SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Paso ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Titulo ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Descripcion ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasoanterior ;
   protected String gxTv_SdtPasos__SDT_Pasos__SDTItem_Pasosiguiente ;
}

