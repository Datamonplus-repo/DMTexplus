package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tmatice", "/app.formulaciontinte.tmatice"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmatice extends GXWebObjectStub
{
   public tmatice( )
   {
   }

   public tmatice( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmatice.class ));
   }

   public tmatice( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmatice_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmatice_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Matiz";
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

