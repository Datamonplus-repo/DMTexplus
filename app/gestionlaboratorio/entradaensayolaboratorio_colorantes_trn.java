package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn", "/app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaensayolaboratorio_colorantes_trn extends GXWebObjectStub
{
   public entradaensayolaboratorio_colorantes_trn( )
   {
   }

   public entradaensayolaboratorio_colorantes_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaensayolaboratorio_colorantes_trn.class ));
   }

   public entradaensayolaboratorio_colorantes_trn( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaensayolaboratorio_colorantes_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaensayolaboratorio_colorantes_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Ensayo Laboratorio (Colorantes)";
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

