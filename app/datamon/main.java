package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.datamon.main", "/app.datamon.main"})
@jakarta.servlet.annotation.MultipartConfig
public final  class main extends GXWebObjectStub
{
   public main( )
   {
   }

   public main( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( main.class ));
   }

   public main( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new main_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new main_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "principal page";
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

