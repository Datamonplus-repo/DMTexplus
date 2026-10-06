package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.consumomanual", "/app.stocksquimicos.consumomanual"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumomanual extends GXWebObjectStub
{
   public consumomanual( )
   {
   }

   public consumomanual( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumomanual.class ));
   }

   public consumomanual( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumomanual_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumomanual_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumo Manual";
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

