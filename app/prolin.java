package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.prolin", "/app.prolin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class prolin extends GXWebObjectStub
{
   public prolin( )
   {
   }

   public prolin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( prolin.class ));
   }

   public prolin( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prolin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prolin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla PROLIN";
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

