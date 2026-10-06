package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ral0002r", "/app.ral0002r"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ral0002r extends GXWebObjectStub
{
   public ral0002r( )
   {
   }

   public ral0002r( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ral0002r.class ));
   }

   public ral0002r( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ral0002r_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ral0002r_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO MERMAS RESUMEN";
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

