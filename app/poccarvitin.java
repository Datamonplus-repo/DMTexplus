package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.poccarvitin", "/app.poccarvitin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class poccarvitin extends GXWebObjectStub
{
   public poccarvitin( )
   {
   }

   public poccarvitin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( poccarvitin.class ));
   }

   public poccarvitin( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new poccarvitin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new poccarvitin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Compra";
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

