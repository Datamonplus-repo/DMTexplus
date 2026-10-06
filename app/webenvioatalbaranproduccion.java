package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webenvioatalbaranproduccion", "/app.webenvioatalbaranproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webenvioatalbaranproduccion extends GXWebObjectStub
{
   public webenvioatalbaranproduccion( )
   {
   }

   public webenvioatalbaranproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webenvioatalbaranproduccion.class ));
   }

   public webenvioatalbaranproduccion( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webenvioatalbaranproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webenvioatalbaranproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio AT Albaran Produccion";
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

