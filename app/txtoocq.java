package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txtoocq", "/app.txtoocq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txtoocq extends GXWebObjectStub
{
   public txtoocq( )
   {
   }

   public txtoocq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txtoocq.class ));
   }

   public txtoocq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txtoocq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txtoocq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ord Compra Totvs Cola de Mensa";
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

