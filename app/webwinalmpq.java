package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwinalmpq", "/app.webwinalmpq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwinalmpq extends GXWebObjectStub
{
   public webwinalmpq( )
   {
   }

   public webwinalmpq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwinalmpq.class ));
   }

   public webwinalmpq( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwinalmpq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwinalmpq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Orden de compra en Almacen";
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

