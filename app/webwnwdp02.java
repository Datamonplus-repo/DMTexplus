package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwnwdp02", "/app.webwnwdp02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwnwdp02 extends GXWebObjectStub
{
   public webwnwdp02( )
   {
   }

   public webwnwdp02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwnwdp02.class ));
   }

   public webwnwdp02( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwnwdp02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwnwdp02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Entrada Pedido Cliente";
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

