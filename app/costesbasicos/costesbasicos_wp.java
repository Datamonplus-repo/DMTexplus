package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesbasicos.costesbasicos_wp", "/app.costesbasicos.costesbasicos_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesbasicos_wp extends GXWebObjectStub
{
   public costesbasicos_wp( )
   {
   }

   public costesbasicos_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesbasicos_wp.class ));
   }

   public costesbasicos_wp( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesbasicos_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesbasicos_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Basicos ";
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

