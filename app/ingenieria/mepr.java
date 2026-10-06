package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mepr", "/app.ingenieria.mepr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mepr extends GXWebObjectStub
{
   public mepr( )
   {
   }

   public mepr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mepr.class ));
   }

   public mepr( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mepr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mepr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MEPr";
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

