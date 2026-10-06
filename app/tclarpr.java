package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclarpr", "/app.tclarpr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclarpr extends GXWebObjectStub
{
   public tclarpr( )
   {
   }

   public tclarpr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclarpr.class ));
   }

   public tclarpr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclarpr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclarpr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLIENTE-ARTIGO-PROCESO-LARG";
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

