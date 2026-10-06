package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasww", "/app.informemermasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasww extends GXWebObjectStub
{
   public informemermasww( )
   {
   }

   public informemermasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasww.class ));
   }

   public informemermasww( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Mermas";
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

