package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informe_de_mermas_wp", "/app.informe_de_mermas_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informe_de_mermas_wp extends GXWebObjectStub
{
   public informe_de_mermas_wp( )
   {
   }

   public informe_de_mermas_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informe_de_mermas_wp.class ));
   }

   public informe_de_mermas_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informe_de_mermas_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informe_de_mermas_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Mermas";
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

