package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ral0002", "/app.ral0002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ral0002 extends GXWebObjectStub
{
   public ral0002( )
   {
   }

   public ral0002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ral0002.class ));
   }

   public ral0002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ral0002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ral0002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO DE MERMAS";
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

