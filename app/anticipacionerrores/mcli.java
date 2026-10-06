package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mcli", "/app.anticipacionerrores.mcli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mcli extends GXWebObjectStub
{
   public mcli( )
   {
   }

   public mcli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mcli.class ));
   }

   public mcli( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mcli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mcli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MCli";
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

