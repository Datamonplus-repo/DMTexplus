package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.listadodeformulas_wp", "/app.formulaciontinte.listadodeformulas_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodeformulas_wp extends GXWebObjectStub
{
   public listadodeformulas_wp( )
   {
   }

   public listadodeformulas_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodeformulas_wp.class ));
   }

   public listadodeformulas_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodeformulas_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodeformulas_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Formulas";
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

