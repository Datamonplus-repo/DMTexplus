package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.modalentradaensayolaboratorioopciones", "/app.gestionlaboratorio.modalentradaensayolaboratorioopciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class modalentradaensayolaboratorioopciones extends GXWebObjectStub
{
   public modalentradaensayolaboratorioopciones( )
   {
   }

   public modalentradaensayolaboratorioopciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( modalentradaensayolaboratorioopciones.class ));
   }

   public modalentradaensayolaboratorioopciones( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new modalentradaensayolaboratorioopciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new modalentradaensayolaboratorioopciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ensayos, Opciones";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

