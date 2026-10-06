package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.particiondehdrs_3_wp", "/app.formulaciontinte.particiondehdrs_3_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class particiondehdrs_3_wp extends GXWebObjectStub
{
   public particiondehdrs_3_wp( )
   {
   }

   public particiondehdrs_3_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( particiondehdrs_3_wp.class ));
   }

   public particiondehdrs_3_wp( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new particiondehdrs_3_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new particiondehdrs_3_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Particion de HDRs ";
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

