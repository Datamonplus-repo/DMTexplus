package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0019u", "/app.rst0019u"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0019u extends GXWebObjectStub
{
   public rst0019u( )
   {
   }

   public rst0019u( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0019u.class ));
   }

   public rst0019u( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0019u_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0019u_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO PRODUCTOS RECUENTO ORDER UBICACION";
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

