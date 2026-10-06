package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.particiondehdrs_wp", "/app.formulaciontinte.particiondehdrs_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class particiondehdrs_wp extends GXWebObjectStub
{
   public particiondehdrs_wp( )
   {
   }

   public particiondehdrs_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( particiondehdrs_wp.class ));
   }

   public particiondehdrs_wp( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new particiondehdrs_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new particiondehdrs_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Particion de HDRs";
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

