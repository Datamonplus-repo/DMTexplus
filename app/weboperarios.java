package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.weboperarios", "/app.weboperarios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class weboperarios extends GXWebObjectStub
{
   public weboperarios( )
   {
   }

   public weboperarios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( weboperarios.class ));
   }

   public weboperarios( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new weboperarios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new weboperarios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " MANTENIMIENTO DE OPERARIOS";
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

