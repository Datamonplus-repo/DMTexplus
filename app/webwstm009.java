package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwstm009", "/app.webwstm009"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwstm009 extends GXWebObjectStub
{
   public webwstm009( )
   {
   }

   public webwstm009( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwstm009.class ));
   }

   public webwstm009( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwstm009_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwstm009_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Devoluciones Productos";
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

