package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thhdrsq", "/app.thhdrsq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thhdrsq extends GXWebObjectStub
{
   public thhdrsq( )
   {
   }

   public thhdrsq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thhdrsq.class ));
   }

   public thhdrsq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thhdrsq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thhdrsq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO IGUAL A CC";
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

