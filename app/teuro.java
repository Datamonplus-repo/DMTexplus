package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.teuro", "/app.teuro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class teuro extends GXWebObjectStub
{
   public teuro( )
   {
   }

   public teuro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( teuro.class ));
   }

   public teuro( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new teuro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new teuro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "EURO";
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

