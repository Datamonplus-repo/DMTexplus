package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrparpr", "/app.ingenieria.mrparpr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrparpr extends GXWebObjectStub
{
   public mrparpr( )
   {
   }

   public mrparpr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrparpr.class ));
   }

   public mrparpr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrparpr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrparpr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MRPar Pr";
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

