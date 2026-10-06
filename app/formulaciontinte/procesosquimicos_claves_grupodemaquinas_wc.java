package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesosquimicos_claves_grupodemaquinas_wc", "/app.formulaciontinte.procesosquimicos_claves_grupodemaquinas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesosquimicos_claves_grupodemaquinas_wc extends GXWebObjectStub
{
   public procesosquimicos_claves_grupodemaquinas_wc( )
   {
   }

   public procesosquimicos_claves_grupodemaquinas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesosquimicos_claves_grupodemaquinas_wc.class ));
   }

   public procesosquimicos_claves_grupodemaquinas_wc( int remoteHandle ,
                                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesosquimicos_claves_grupodemaquinas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesosquimicos_claves_grupodemaquinas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Clave Grupo de Maquinas";
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

