package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwpalbrec", "/app.webwpalbrec"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwpalbrec extends GXWebObjectStub
{
   public webwpalbrec( )
   {
   }

   public webwpalbrec( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwpalbrec.class ));
   }

   public webwpalbrec( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwpalbrec_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwpalbrec_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Almacen de Tela (con detalle de rollos)";
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

