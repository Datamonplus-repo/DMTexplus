package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rst0014copy1", "/app.rst0014copy1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rst0014copy1 extends GXWebObjectStub
{
   public rst0014copy1( )
   {
   }

   public rst0014copy1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rst0014copy1.class ));
   }

   public rst0014copy1( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rst0014copy1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rst0014copy1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Existencias Almacen";
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

