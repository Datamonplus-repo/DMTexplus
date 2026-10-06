package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpreund", "/app.tpreund"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpreund extends GXWebObjectStub
{
   public tpreund( )
   {
   }

   public tpreund( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpreund.class ));
   }

   public tpreund( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpreund_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpreund_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precio Cliente Articulo p/Unidad";
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

