package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tconti1", "/app.formulaciontinte.tconti1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tconti1 extends GXWebObjectStub
{
   public tconti1( )
   {
   }

   public tconti1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tconti1.class ));
   }

   public tconti1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tconti1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tconti1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCONTI1";
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

