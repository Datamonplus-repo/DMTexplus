package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tminacs", "/app.tminacs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminacs extends GXWebObjectStub
{
   public tminacs( )
   {
   }

   public tminacs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminacs.class ));
   }

   public tminacs( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminacs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminacs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Minimos ACS";
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

