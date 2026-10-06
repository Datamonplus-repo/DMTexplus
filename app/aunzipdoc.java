package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.aunzipdoc", "/app.aunzipdoc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class aunzipdoc extends GXWebObjectStub
{
   public aunzipdoc( )
   {
   }

   public aunzipdoc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( aunzipdoc.class ));
   }

   public aunzipdoc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aunzipdoc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new aunzipdoc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "un Zip Doc";
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

