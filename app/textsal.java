package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.textsal", "/app.textsal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class textsal extends GXWebObjectStub
{
   public textsal( )
   {
   }

   public textsal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( textsal.class ));
   }

   public textsal( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new textsal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new textsal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ORDEN DE TRABAJO EXTERIOR";
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

