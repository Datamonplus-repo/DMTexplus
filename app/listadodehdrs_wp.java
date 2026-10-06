package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadodehdrs_wp", "/app.listadodehdrs_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodehdrs_wp extends GXWebObjectStub
{
   public listadodehdrs_wp( )
   {
   }

   public listadodehdrs_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodehdrs_wp.class ));
   }

   public listadodehdrs_wp( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodehdrs_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodehdrs_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de HDRs";
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

