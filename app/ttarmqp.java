package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttarmqp", "/app.ttarmqp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttarmqp extends GXWebObjectStub
{
   public ttarmqp( )
   {
   }

   public ttarmqp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttarmqp.class ));
   }

   public ttarmqp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttarmqp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttarmqp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ASIGNACION MAQUINA F(CTRL)";
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

