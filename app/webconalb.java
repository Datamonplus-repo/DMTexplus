package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webconalb", "/app.webconalb"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webconalb extends GXWebObjectStub
{
   public webconalb( )
   {
   }

   public webconalb( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webconalb.class ));
   }

   public webconalb( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webconalb_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webconalb_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Consulta Almacen";
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

