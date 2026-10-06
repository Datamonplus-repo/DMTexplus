package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mtok", "/app.anticipacionerrores.mtok"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtok extends GXWebObjectStub
{
   public mtok( )
   {
   }

   public mtok( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtok.class ));
   }

   public mtok( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtok_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtok_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "M Token para filtros";
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

