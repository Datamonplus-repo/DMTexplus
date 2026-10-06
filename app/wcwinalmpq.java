package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwinalmpq", "/app.wcwinalmpq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwinalmpq extends GXWebObjectStub
{
   public wcwinalmpq( )
   {
   }

   public wcwinalmpq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwinalmpq.class ));
   }

   public wcwinalmpq( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwinalmpq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwinalmpq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " PEDIDOS PROVEEDORES";
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

