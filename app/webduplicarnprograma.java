package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webduplicarnprograma", "/app.webduplicarnprograma"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webduplicarnprograma extends GXWebObjectStub
{
   public webduplicarnprograma( )
   {
   }

   public webduplicarnprograma( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webduplicarnprograma.class ));
   }

   public webduplicarnprograma( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webduplicarnprograma_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webduplicarnprograma_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Duplicar NPrograma";
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

