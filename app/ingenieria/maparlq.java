package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.maparlq", "/app.ingenieria.maparlq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class maparlq extends GXWebObjectStub
{
   public maparlq( )
   {
   }

   public maparlq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( maparlq.class ));
   }

   public maparlq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new maparlq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new maparlq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAParLq Codifica los PLCs";
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

