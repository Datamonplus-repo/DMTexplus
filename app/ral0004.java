package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ral0004", "/app.ral0004"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ral0004 extends GXWebObjectStub
{
   public ral0004( )
   {
   }

   public ral0004( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ral0004.class ));
   }

   public ral0004( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ral0004_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ral0004_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO ALBARANES ENTREGADOS,R";
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

